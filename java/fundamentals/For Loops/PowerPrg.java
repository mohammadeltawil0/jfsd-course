public class PowerPrg {
    public static void main(String[] args) {
            int num = 2;       
            int power = 3;        
            int result = 1;        
            for (int i = 1; i <= power; i++) {            
                result *= num;        
            }        
            System.out.println(num + "^" + power + " =  " + result);   
    }
}
