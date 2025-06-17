public class BankApp {
    public static void main(String[] args) {
        
        Account obj = new Account("Bob", "123", 2000.0);
        
        
        System.out.println("-------------------");
        System.out.println("Account Number :: " + obj.getAccno());
        System.out.println("Name :: " + obj.getName());
        System.out.println("Balance :: $" + obj.getBalance());

        obj.deposit(1000);
        obj.deposit(1000);
        obj.withdrawl(500);
        obj.withdrawl(700);

        // obj = new Account("Ramiya", "789", 5000.0);
        // System.out.println("-------------------");
        //  System.out.println("Account Number :: " + obj.getAccno());
        // System.out.println("Name :: " + obj.getName());
        // System.out.println("Balance :: $" + obj.getBalance());



        // obj.init("", "", 0);
        // System.out.println("Account Number :: " + obj.getAccno());
        // System.out.println("Name :: " + obj.getName());
        // System.out.println("Balance :: $" + obj.getBalance());

    //    Account obj2  = new Account("John", "456", 2000.0);
    //    System.out.println("-------------------");
    //     System.out.println("Account Number :: " + obj2.getAccno());
    //     System.out.println("Name :: " + obj2.getName());
    //     System.out.println("Balance :: $" + obj2.getBalance());

    }
}
