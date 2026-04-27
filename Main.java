public class Main {

    public static void main(String[] args) {
    	
    	Bank bank = new Bank();
    	
    	Customer c1=bank.createCustomer("Mohammed");

        BankAccount acc1 = bank.createSavingsAccount(c1, 1000, 0.05);
        BankAccount acc2 = bank.createCurrentAccount(c1,500);

      acc1.deposit(200);
      acc2.withdraw(100);
      
        acc1.calculateInterest();
        acc2.calculateInterest();

       c1.showAccounts();
    }
}