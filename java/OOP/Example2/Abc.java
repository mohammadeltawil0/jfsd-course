public class Abc {
    
    private int x;
    private int y;

    public Abc(){
        System.out.println("Abc default construtor called");
        x = 101;
    }

    public Abc(int x){
        System.out.println("Abc parameterized construtor called");
        this.x = x;
    }

    public Abc(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void showXnY(){
        System.out.println(x + "  " + y);
    }
}
