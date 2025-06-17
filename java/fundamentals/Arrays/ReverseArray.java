//import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        //Write a program to reverse the elements of array
       /* int[] arr = {1, 2, 3, 4, 1};
        int L = 0;
        int R = arr.length - 1;
 
        while (L < R) {
            int temp = arr[L];
            arr[L] = arr[R];
            arr[R] = temp;
            L++;
            R--;
        }
 
        System.out.println(Arrays.toString(arr));*/

        int[] arr2 = {1, 2, 3, 4, 5};
	    for (int i = arr2.length-1; i >=0; i--) {
		int temp = arr2[i];
		arr2[i] = arr2[arr2.length - 1 - i];
		arr2[arr2.length - 1 - i] = temp;
       
	}
     for(int j=0;j<arr2.length;j++)
            System.out.print(arr2[j]+" ");
    }
}

