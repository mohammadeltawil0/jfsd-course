import java.util.concurrent.Callable;

public class CallableDemoOne implements Callable{

	@Override
	public Object call() throws Exception {
		
		System.out.println("Call method is being called");
		
		Thread.sleep(1000);
		
		return "Hello! Java";
	}
}
