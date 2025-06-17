public class MethodFour {
    
    public static void main(String[] args) {

        System.out.println(sum(6, 5));
        System.out.println(sum(2.5f, 3.5f));
        System.out.println(sum(5.6, 1.2));
        
    }

    //method to get sum of two integers
    public static int sum(int x, int y) { return x+y; }

    //method to get sum of two floats
    public static float sum(float x, float y) { return x+y; }

    //method to get sum of two doubles
    public static double sum(double x, double y) { return x+y; }

}
