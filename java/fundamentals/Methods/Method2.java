public class MethodTwo {
    public static void main(String[] args) {
        f1();
        System.out.println("Executing after f1's call");
    }

    public static void f1(){
        System.out.println("This is in f1");
        f2();
        System.out.println("Executing after f2's call");
        return;
    }

    public static void f2(){
        System.out.println("This is in f2");
        f3();
        System.out.println("Executing after f3's call");
        return;
    }

    public static void f3(){
        System.out.println("This is in f3");
        return;
    }
}
