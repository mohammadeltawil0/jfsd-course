public class ArrayTwo {
    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 111;
        arr[1] = 222;
        arr[2] = 333;
        arr[3] = 444;
        arr[4] = 555;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        int x = arr[1];
        x = x * 10;
        arr[4] =  x;
        System.out.println("---------------------");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        arr[1] = 101;
        arr[2] = arr[2] * 10 + 1;
        System.out.println("---------------------");
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        
    }
}
