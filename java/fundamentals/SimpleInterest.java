public class SimpleInterest {
    
    public static void main(String[] args) {
        // int principal = 156778;  
        // float rate = 5.2f;          
        // float time = 2.5f;          
        
        // float simpleInterest = (principal * rate * time)/100.0f;
    
        // System.out.println("this is a interest : $" + simpleInterest);
        // float x =1f;
        // System.out.println(x);
        double principal = 300;
        double rate = 6;
        double time = 3;
        double simpleInterest=(principal*rate*time)/100;

        System.out.println("Simple intereset for the amount $"+ principal + "  for period of " +
        time + " years with the interest rate " + rate + "% annually = $" + simpleInterest);
    }
}

//Simple intereset for the amount $300 for period of 3 years with the interest rate 6% annualy = $54.0

