
public class CurrentAccount extends BankAccount {
public CurrentAccount(int accountNumber, double balance) {
	super(accountNumber,balance);
}

@Override
public void calculateInterest() {
	System.out.println("No interest for current account");
}
}
