public class PatternFive {
    public static void main(String[] args) {
        // for (int i = 1; i <= 5; i++) {            
        //     int value;            
        //     if (i % 2 == 0) {                
        //         value = 0;            
        //     } else {                
        //         value = 1;            
        //     }            
        //     for (int j = 1; j <= i; j++) {                
        //         System.out.print(value + " ");                
        //         value = 1 - value;             
        //     }            
        //     System.out.println();        
        // }   

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++)
                System.out.print((i+j-1)%2);
            System.out.println();
        }
    }
}
