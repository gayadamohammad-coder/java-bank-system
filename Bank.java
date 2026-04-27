import java.util.ArrayList;
public class Bank {
private static int nextAccountNumber = 1;
private ArrayList<Customer> customers;

public Bank() {
	customers =new ArrayList<>();
	
}

public Customer createCustomer(String name) {
	Customer customer = new Customer(name);
	customers.add(customer);
	return customer;
}

public BankAccount createSavingsAccount(Customer customer, double balance,double interestRate) {
	BankAccount acc = new SavingsAccount(nextAccountNumber++,balance,interestRate);
	customer.addAccount(acc);
	return acc;
}

public BankAccount createCurrentAccount(Customer customer,double balance) {
	BankAccount acc = new CurrentAccount(nextAccountNumber++,balance);
	customer.addAccount(acc);
	return acc;
}


}
