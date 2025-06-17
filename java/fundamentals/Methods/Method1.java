public class MethodOne {
    //main is a method
    public static void main(String[] args) {
        
        printDashLine();        //method call
        
        System.out.println("\nHello");

        printDashLine();         //method call

        System.out.println("\nJava");
        
        printDashLine();        //method call
    }

    //method definition
    //printDashLine is a method
    public static void printDashLine() {       //method 
        for(int i=1;i<=11;i++)
            System.out.print("-");
    }
}
