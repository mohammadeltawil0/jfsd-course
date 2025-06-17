public class ArrayThree{
    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 111;
        arr[1] = 222;
        arr[2] = 333;
        arr[3] = 444;
        arr[4] = 555;

        // for(int i=0;i<arr.length;i++)
        //     System.out.println(arr[i]);    
            
        arr[4] = 0;
        arr[1] = 0;
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);    

        System.out.println(arr[arr.length]);

    }
}



