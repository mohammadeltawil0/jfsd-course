public class PrintReverseNumber {
    public static void main(String[] args) {
        int num = 1234561;

        // for(;;){
        //     System.out.print(num%10);
        //     num=num/10;
        //     if(num==0)
        //         break;
        // }

        //entry loop
        int sum=0;
        while(num!=0){
            //System.out.print(num%10);
            sum += num%10;
            num /= 10;
        }
        System.out.println("num = " + num);
        System.out.println("sum = " + sum);
    }
}
