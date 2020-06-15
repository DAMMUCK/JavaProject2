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
		System.out.println("1. ���� ����(1���� ����!)");
		System.out.println("2. �Ա�");
		System.out.println("3. ���");
		System.out.println("4. �ܾ���ȸ");
		System.out.println("5. ����");
	}
	
	public int inputMoney() {
		int inputValue=0;
		System.out.print("�Ա� : ");
		inputValue = scan.nextInt();
		if(isItNegative(inputValue)==true) {
			return balance + inputValue;
		}else {
			return balance;
		}
		
	}
	
	public int withdrawMoney() {
		int withdrawValue =0;
		System.out.print("��� : ");
		withdrawValue = scan.nextInt();
		if (isItNegative(withdrawValue)==true && possibleWithdraw(withdrawValue)==true) {
			return balance - withdrawValue;
		}else {
			return balance;
		}
	}
	
	public boolean isItNegative(int money) {
		if(money<0) {
			System.out.println("������ �Է��� �� �����ϴ�.");
			return false;
		}else {
			return true;
		}
	}
	
	public boolean possibleWithdraw(int withdraw) {
		if(balance>=withdraw) {
			return true;
		}else {
			System.out.println("��ݰ��ɱݾ��� �ƴմϴ�.");
			return false;
		}
	}
	
	public boolean isAccount() {
		if(checkAccount==0) {
			System.out.println("���¸� �������ּ���.");
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
			System.out.print("�Է� : ");
			select=scan.nextInt();
			if(select==1) {
				if(isAccount()==false) {
				System.out.println("���¸� ���� �߽��ϴ�.");
				System.out.println("���� 123-456789-11 (������ : �Ҽ���)");
				checkAccount+=1;
				}else {
					System.out.println("���´� 1���� ���������մϴ�.");
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
				System.out.println("�ܾ� "+balance+"��");
			}else if(select==5) {
				System.out.println("�����մϴ� :) ");
				condition=false;
			}
			
		}
	}
}
