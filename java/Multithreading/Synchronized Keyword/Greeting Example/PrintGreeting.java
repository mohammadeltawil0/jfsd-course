
public class PrintGreeting implements Runnable{
	
	String message;
	Greeting greeting;
	Thread t;
	
	public PrintGreeting(Greeting greeting, String message) {
		this.greeting = greeting;
		this.message = message;
		t = new Thread(this);
		t.start();
	}
	
	public void run() {
		greeting.greet(message);
	}
}
