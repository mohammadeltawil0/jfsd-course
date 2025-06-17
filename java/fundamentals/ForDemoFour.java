public class ForDemoFour {
    public static void main(String[] args) {
        
        int sum = 0;
        //sum of all numbers from 1 to 100
        // for(int i=1;i<=100;i++)
        //     sum +=i;

        //sum of all even numbers from 1 to 100 
        for(int i=1;i<=100;i++)
        {
            if(i%2==0)
                sum+=i;
        }
        System.out.println(sum);
    }
}


