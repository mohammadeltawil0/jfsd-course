public class Factorial {
    public static void main(String[] args) {
            int factorial = 1;        
            for (int i = 5; i > 0; i--) {            
                factorial *= i;            
            }    
            System.out.println(factorial);

            int fac = 1;        
            for (int i = 1; i <= 5; i++) {            
                fac *= i;        
            }        
            System.out.println(fac); 
    }
}
