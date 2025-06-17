public class PatternOne {
    public static void main(String[] args) {
        
        for(int i=1;i<=5;i++)       //i represent row number
        {
            for(int j=1;j<=i;j++)   //j represent column number
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
