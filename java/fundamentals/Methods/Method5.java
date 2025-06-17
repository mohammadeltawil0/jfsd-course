public class MethodFive {
    
    public static void main(String[] args) {
        int x = 101;
        float pi = 3.14f;
        double weight = 72.5;
        boolean isMarried = true;
        String name  = "John";
        System.out.println("Inside actual main method");
        System.out.println(x);
        System.out.println(pi);
        System.out.println(weight);
        System.out.println(isMarried);
        System.out.println(name);
    }
    
    public static void main()
    {
        System.out.println("Inside overloaded main method");
    }
}
//Can we overload main method? - YES
