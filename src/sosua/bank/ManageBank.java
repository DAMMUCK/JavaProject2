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
		System.out.println("1. ���� ����(�ߺ� �Ұ�!)");
		System.out.println("2. �Ա�");
		System.out.println("3. ���");
		System.out.println("4. �ܾ���ȸ");
		System.out.println("5. ���»���");
		System.out.println("6. ����");
	}
	
	
	public boolean createAccount() {//���»���
		System.out.print("�̸��Է� : ");
		String accountName=scan.next();
		int balance=0;
		for(BankAccount ba : bankList) {
			if(ba.getBankAccount().equals(accountName)) {
				System.out.println("�ߺ��� ���°� �ֽ��ϴ�.");
				return false;
			}
		}
		BankAccount account = new BankAccount(accountName,balance);
		bankList.add(account);
		return true;
	}
	
	public void printAccountList() {//������ ���� ���
		int num=1;
		System.out.println("=========<������ ����>=========");
		for(BankAccount i : bankList) {
			System.out.println(num+" | "+i.getBankAccount()+" | �ܾ� : "+i.getBalance());
			num++;
			
		}
		System.out.println("===============================");
	}
	
	public int selectAccount() {//���¼���
		printAccountList();
		System.out.print("���¼��� : ");
		int num=scan.nextInt();
		if(num-1>=0 && num<=bankList.size()) {
			return num-1;
		}
		System.out.println("����Ʈ�� ���� �����Դϴ�!!  "+bankList.size());
		return 0;
	}
	
	private boolean isPositiveAmount(int amount) {
		if (amount < 0) {
			System.out.println("[����] �ݾ��� ������ �Է��� �� �����ϴ�.");
			return false;
		}
		
		return true;
	}
	
	
	public boolean inputMoney() {//�Ա�
		int index=selectAccount();
		if(index>=0) {
			System.out.print("�Ա��� �ݾ� : ");
			int inputValue= scan.nextInt();
			if(isPositiveAmount(inputValue)) {
				bankList.get(index).deposit(inputValue);
				System.out.println(inputValue+"���� �Ա��߽��ϴ�.");
				return true;
			}
		}
		return false;
	}
	
	private boolean canWithdraw(int amount,int index) {
		if (bankList.get(index).getBalance() - amount < 0) {
			System.out.println("�����޽��� : [����] �ܾ��� �����մϴ�.");
			return false;
		}
		
		return true;
	}
	
	public boolean withDraw() {
		int index = selectAccount();
		if(index>=0) {
			System.out.print("����� �ݾ� : ");
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
			System.out.println("���°� �����Ǿ����ϴ�.");
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
			System.out.print("�Է� : ");
			select=scan.nextInt();
			if(select==1) {//���»���
				createAccount();
			}else if(select==2) {//�Ա�
				if(isAccount()==true) {
					inputMoney();
				}
			}else if(select==3) {//���
				if(isAccount()==true) {
					withDraw();
				}
			}
			else if(select==4) {//�ܾ���ȸ
				if(isAccount()==true) {
					for(BankAccount i : bankList) {
						i.printAcount();
						//System.out.println("---------------------");
					}
				}
			}else if(select==5) {//���»���
				removeAccount();
				
			}else if(select==6) {//����
				System.out.println("�����մϴ� :) ");
				condition=false;
			}
			
		}
	}
}
