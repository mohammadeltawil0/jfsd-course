public class VariableDemo {
    
    public static void main(String[] args)
    {
        //datatype variablename;
        short x = 32767;     //not initialized      -32768 to 32767
        System.out.println(x);

        short age = 127;

        boolean isMarried = true;
        System.out.println(isMarried);

        //double pi = 3.1415649785987645;
        float pi = 3.1415649785987645F;
        System.out.println(pi);

        char ch = '*';
        System.out.println(ch);


        //Non primitive
        String str = "Hello! how are you? What's up? Are you learning Java language";
        System.out.println(str);
    }
}
