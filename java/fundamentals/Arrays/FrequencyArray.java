public class FrequencyArray {
 
    //write a progrm to count the frequency/occurence of any given number in an array. 
    //if number doesn't exist give a proper message to the user
    public static void main(String[] args) {
        int[] arr = {5,1,5,1,7,1,8,9,1};
        int search = 1;
        int frequency = 0;
        for(int i=0;i<arr.length;i++)
            if(arr[i]==search)
                frequency++;

        if(frequency>0)
            System.out.println("Frequency of " + search + " = " + frequency);        
        else 
            System.out.println(search + " doesn't exist in the array");
    }
}


//Freuqency of each character in an character array
// char[] arr = {'a','b','c','a','d','e','a'}
/*
a = 3
b = 1
c = 1
d = 1
e = 1
 */
