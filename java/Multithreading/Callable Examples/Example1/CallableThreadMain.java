import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableThreadMain {

	public static void main(String[] args) {
		
		CallableDemoOne obj = new CallableDemoOne();
		
		FutureTask<String> futureTask = new FutureTask<>(obj);
		
		Thread th = new Thread(futureTask);
		
		th.start();
		
		try {
			String str = futureTask.get();
			System.out.println(str);
			
		}catch(InterruptedException | ExecutionException e) {
			e.printStackTrace();
		} 
		
		
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
