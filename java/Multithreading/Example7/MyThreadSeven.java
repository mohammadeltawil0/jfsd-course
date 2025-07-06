
public class MyThreadSeven extends Thread{
	
	//A reference of main thread
	//to join
	static Thread mainThread;
	
	public MyThreadSeven(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
		
		try {
			System.out.println("Child thread started...");
			mainThread.join();
			
			for(int i=1;i<=5;i++)
			{
				System.out.println("Child thread " + i);
				Thread.sleep(1000);
			}	
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
