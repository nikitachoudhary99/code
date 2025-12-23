class BankAccount {

    public void AccountDetails(String accountNumber) {
        System.out.println("details for Savings Account" + accountNumber);
    }


    public void AccountDetails(int accountNumber) {
        System.out.println("details for Checking Account " + accountNumber);
    }

    public void AccountDetails(long accountNumber) {
        System.out.println("details for Business Account " + accountNumber);
    }

    
    public void processTransaction(String accountNumber, double amount) {
        System.out.println("Processing withdrawal of " + amount + " from Savings Account: " + accountNumber);
    }
    public void processTransaction(int accountNumber, double amount) {
        System.out.println("Processing withdrawal of " + amount + " from Checking Account: " + accountNumber);
    }

    
    public void processTransaction(long accountNumber, double amount) {
        System.out.println("Processing withdrawal of " + amount + " from Business Account: " + accountNumber);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

       
        account.AccountDetails("SA12345");

        
        account.AccountDetails(12345);

        
        account.AccountDetails(123456789L);

        
        account.processTransaction("SA12345", 500.0);

        
        account.processTransaction(12345, 300.0);

    
        account.processTransaction(123456789L, 1000.0);
    }
}

    

