public class MaximumDemo {
 
    public static void main(String[] args)
    {
        int x=151;
        int y=611;
        int z=1111;

        //find maximum among these three values
        // if (x>y && x>z)
        // {

        // }

        // if(x>y)
        //     if(x>z)
        //         System.out.println("x is maximum");
        //     else 
        //         System.out.println("z is maximum");
        // else
        //     if(y>z)
        //         System.out.println("y is maximum");
        //     else 
        //         System.out.println("z is maximum");

        if(x>y && x>z)
            System.out.println("x is maximum");
        else if(y>z)
            System.out.println("y is maximum");
        else 
            System.out.println("z is maximum");
    }
}


