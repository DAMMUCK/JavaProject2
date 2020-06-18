package sosua;

public class BankAccount {
	private String bankAccount="";
	private int balance=0;
	
	BankAccount(String bankAccount, int balance){
		this.bankAccount=bankAccount;
		this.balance=balance;
	}
	
	public boolean deposit(int amount) {
		balance = balance + amount;
		return true;
	}
	
	public boolean withDraw(int amount) {
		balance = balance-amount;
		return true;
	}
	
	public void printAcount() {
		System.out.println("계좌 : "+this.bankAccount+"    : "+this.balance);
	}
	

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}


	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}
