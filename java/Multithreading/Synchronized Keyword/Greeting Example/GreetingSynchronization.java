
public class GreetingSynchronization {

	public static void main(String[] args) {
		
		Greeting greet = new Greeting();
		
		PrintGreeting obj1 = new PrintGreeting(greet, "Hello");
		PrintGreeting obj2 = new PrintGreeting(greet, "Good Morning");
		PrintGreeting obj3 = new PrintGreeting(greet, "Happy Birthday");
		
		
		try {
			obj1.t.join();
			obj2.t.join();
			obj3.t.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
