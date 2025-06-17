public class ArrayFour {
    //write a program to define an integer of size 10 , store the value form 11 to 20 and later 
    //increase the value by 5 
    public static void main(String[] args) {
        int[] numArr = new int[10];		
		for (int i = 0; i <numArr.length; i++) {
			numArr[i] = 11+i;
		}		
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] += 5;			
		}
        for (int i = 0; i < numArr.length; i++) {
            System.out.println(numArr[i]);
    }

    int[] arr =  {2,5,1,7,8,6};

    System.out.println(arr.length);
    //  int arr [] = new int[10];      
            
    //    for (int i = 0; i < arr.length; i++)
    //     arr[i] += 5;    

    }
}

//program to find maximum element from an array
