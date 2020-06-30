package sosua.bank;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageBank {
	ArrayList<BankAccount> bankList = new ArrayList<BankAccount>();
	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		ManageBank manage = new ManageBank();
		manage.runBank();
	}
	
	public void printMenu() {
		System.out.println("----------------------------------------");
		System.out.println("1. 계좌 생성(중복 불가!)");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 잔액조회");
		System.out.println("5. 계좌삭제");
		System.out.println("6. 종료");
	}
	
	
	public boolean createAccount() {//계좌생성
		System.out.print("이름입력 : ");
		String accountName=scan.next();
		int balance=0;
		for(BankAccount ba : bankList) {
			if(ba.getBankAccount().equals(accountName)) {
				System.out.println("중복된 계좌가 있습니다.");
				return false;
			}
		}
		BankAccount account = new BankAccount(accountName,balance);
		bankList.add(account);
		return true;
	}
	
	public void printAccountList() {//생성된 계좌 출력
		int num=1;
		System.out.println("=========<생성된 계좌>=========");
		for(BankAccount i : bankList) {
			System.out.println(num+" | "+i.getBankAccount()+" | 잔액 : "+i.getBalance());
			num++;
			
		}
		System.out.println("===============================");
	}
	
	public int selectAccount() {//계좌선택
		printAccountList();
		System.out.print("계좌선택 : ");
		int num=scan.nextInt();
		if(num-1>=0 && num<=bankList.size()) {
			return num-1;
		}
		System.out.println("리스트에 없는 계좌입니다!!  "+bankList.size());
		return 0;
	}
	
	private boolean isPositiveAmount(int amount) {
		if (amount < 0) {
			System.out.println("[에러] 금액은 음수를 입력할 수 없습니다.");
			return false;
		}
		
		return true;
	}
	
	
	public boolean inputMoney() {//입금
		int index=selectAccount();
		if(index>=0) {
			System.out.print("입금할 금액 : ");
			int inputValue= scan.nextInt();
			if(isPositiveAmount(inputValue)) {
				bankList.get(index).deposit(inputValue);
				System.out.println(inputValue+"원을 입금했습니다.");
				return true;
			}
		}
		return false;
	}
	
	private boolean canWithdraw(int amount,int index) {
		if (bankList.get(index).getBalance() - amount < 0) {
			System.out.println("에러메시지 : [에러] 잔액이 부족합니다.");
			return false;
		}
		
		return true;
	}
	
	public boolean withDraw() {
		int index = selectAccount();
		if(index>=0) {
			System.out.print("출금할 금액 : ");
			int value = scan.nextInt();
			if(isPositiveAmount(value)) {
				if(canWithdraw(value,index)) {
					bankList.get(index).withDraw(value);
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean removeAccount() {
		int index=  selectAccount();
		if(index>=0) {
			System.out.println("계좌가 삭제되었습니다.");
			bankList.remove(index);
			return true;
		}
		return false;
	}
	
	public boolean isAccount() {
		if(bankList.size()!=0) {
			return true;
		}
		return false;
		
	}
	
	public void runBank() {
		boolean condition=true;
		int select=0;
		while(condition) {
			printMenu();
			System.out.print("입력 : ");
			select=scan.nextInt();
			if(select==1) {//계좌생성
				createAccount();
			}else if(select==2) {//입금
				if(isAccount()==true) {
					inputMoney();
				}
			}else if(select==3) {//출금
				if(isAccount()==true) {
					withDraw();
				}
			}
			else if(select==4) {//잔액조회
				if(isAccount()==true) {
					for(BankAccount i : bankList) {
						i.printAcount();
						//System.out.println("---------------------");
					}
				}
			}else if(select==5) {//계좌삭제
				removeAccount();
				
			}else if(select==6) {//종료
				System.out.println("종료합니다 :) ");
				condition=false;
			}
			
		}
	}
}
