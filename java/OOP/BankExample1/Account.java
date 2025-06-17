public class Account {
    
    private String name;
    private String accno;
    private double balance;

    public Account(String name, String accno, double balance){
        this.name = name;
        this.accno = accno;
        this.balance = balance;
    }

    public String getName(){ return this.name;  }
    public String getAccno(){ return this.accno; }
    public double getBalance() { return this.balance; }

    public void withdrawl(double amount){
        if (balance-amount<500){
            System.out.println("Withdrawl cannot be done, due to insfficient balance after transaction");
        }else{
            double balanceBeforeTransaction = balance;
            balance -= amount;
            displayTransactionDetails("Withdrawal", amount, balanceBeforeTransaction);
        }
    }

    public void deposit(double amount){
        double balanceBeforeTransaction = balance;
        balance += amount;
        displayTransactionDetails("Deposit", amount, balanceBeforeTransaction);
    }
    public void displayTransactionDetails(String transaction, double amount, double balanceBeforeTransaction){
        System.out.println("\n---------------------------------------------------------");
        System.out.println("Transaction :: " + transaction);
        System.out.println("Transaction Amount :: " + amount);        
        System.out.println("Balance before Transaction  :: " + balanceBeforeTransaction);
        System.out.println("Balance After Transaction  :: " + balance);
        System.out.println("---------------------------------------------------------\n");
    }
}
