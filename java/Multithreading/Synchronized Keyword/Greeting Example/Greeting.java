
public class Greeting {

	synchronized void greet(String message) {
		System.out.print("(");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print(message);
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(")");
	}
}
