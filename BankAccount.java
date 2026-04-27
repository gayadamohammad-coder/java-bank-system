
public abstract class BankAccount {

	protected int accountNumber;
	protected double balance;
	
	public BankAccount(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance=balance;
	}
	
	public void deposit(double amount) {
		balance+=amount;
	}
	
	public void withdraw(double amount) {
		if (balance>= amount) {
			balance -=amount;
		}else {
			System.out.println("not enough balance!");
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public abstract void calculateInterest();

	
}
