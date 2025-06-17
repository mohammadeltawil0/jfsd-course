public class MethodThree {
    public static void main(String[] args) {
        // printDashLine(11);
        // printDashLine(20);
        // printDashLine(50);
        // printDashLine(101);

        //int result = sum(5,6);
        //System.out.println(result);

        //System.out.println(sum(5,6));
        //System.out.println(power(2, 3));
        boolean result = isPrime(134);
        if(result)
            System.out.println("Number is prime");
        else 
            System.out.println("Number is non-prime");
    }


     public static boolean isPrime(int num) {
		if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0) {
			return false;
		}
		return true;
	}

    public static void printDashLine(int length)
    {
        for(int i=1;i<=length;i++)
            System.out.print("-");
        
        System.out.println();
    }


    public static int sum(int x, int y)
    {
        // int z = x+y;
        // return z;

        return x+y;
    }

    public static int power(int num, int powerValue) {
		int originalNum = num;
		while (powerValue != 1) {
			num = num * originalNum;
			powerValue--;
		}
		return num;
	}

   
}

//write a method to check a given argument number is prime number or a non prime number.
//if the argument is prime, method will return true otherwise false

/*
 * Write a methods 
 * a method to receive two integer parameters and return the sum
 * a method to receive two float parameters and return the sum
 * a method to receive two double parameters and return the sum
 * 
 */
