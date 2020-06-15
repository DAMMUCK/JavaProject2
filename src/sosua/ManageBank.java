package sosua;

import java.util.Scanner;

public class ManageBank {
	Scanner scan = new Scanner(System.in);
	int balance=0;
	int checkAccount=0;
	public static void main(String[] args) {
		ManageBank manage = new ManageBank();
		manage.runBank();
	}
	public void printMenu() {
		System.out.println("----------------------------------------");
		System.out.println("1. 계좌 생성(1번만 가능!)");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 잔액조회");
		System.out.println("5. 종료");
	}
	
	public int inputMoney() {
		int inputValue=0;
		System.out.print("입금 : ");
		inputValue = scan.nextInt();
		if(isItNegative(inputValue)==true) {
			return balance + inputValue;
		}else {
			return balance;
		}
		
	}
	
	public int withdrawMoney() {
		int withdrawValue =0;
		System.out.print("출금 : ");
		withdrawValue = scan.nextInt();
		if (isItNegative(withdrawValue)==true && possibleWithdraw(withdrawValue)==true) {
			return balance - withdrawValue;
		}else {
			return balance;
		}
	}
	
	public boolean isItNegative(int money) {
		if(money<0) {
			System.out.println("음수는 입력할 수 없습니다.");
			return false;
		}else {
			return true;
		}
	}
	
	public boolean possibleWithdraw(int withdraw) {
		if(balance>=withdraw) {
			return true;
		}else {
			System.out.println("출금가능금액이 아닙니다.");
			return false;
		}
	}
	
	public boolean isAccount() {
		if(checkAccount==0) {
			System.out.println("계좌를 생성해주세요.");
			return false;
		}else {
			return true;
		}
	}
	 
	public void runBank() {
		boolean condition=true;
		int select=0;
		while(condition) {
			printMenu();
			System.out.print("입력 : ");
			select=scan.nextInt();
			if(select==1) {
				if(isAccount()==false) {
				System.out.println("계좌를 생성 했습니다.");
				System.out.println("계좌 123-456789-11 (예금주 : 소수아)");
				checkAccount+=1;
				}else {
					System.out.println("계좌는 1개만 생성가능합니다.");
				}
			}else if(select==2) {
				if(isAccount()==true) {
					balance = inputMoney();
				}
			}else if(select==3) {
				if(isAccount()==true) {
					balance = withdrawMoney();
				}
			}
			else if(select==4) {
				System.out.println("잔액 "+balance+"원");
			}else if(select==5) {
				System.out.println("종료합니다 :) ");
				condition=false;
			}
			
		}
	}
}
