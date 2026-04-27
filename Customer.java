import java.util.ArrayList;
public class Customer {
private String name;
private ArrayList<BankAccount>accounts;

public Customer(String name) {
	this.name = name;
	this.accounts=new ArrayList<>();
}

public void addAccount(BankAccount account) {
	accounts.add(account);
}

public void showAccounts() {
	for(BankAccount acc: accounts) {
		System.out.println("Balance:"+acc.getBalance());
	}
}

public String getName() {
	return name;
}
}
