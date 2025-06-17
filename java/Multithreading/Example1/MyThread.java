
public class MyThread extends Thread{
	
	private String name;
	
	public void start() {	
		super.start();
	}
	
	public MyThread(String name) {
		super(name);
		this.name = name;
	}
	
	public void run() {
		//Thread t = Thread.currentThread();
		for(int i=1;i<=5;i++)
		{
			//System.out.println(Thread.currentThread().getName()+ "  :: " + i);
			//System.out.println(t + " :: " + t.getName()+ "  :: " + i);
			System.out.println(name + "  :: " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
	}
	
//	public void run(String str) {
//		System.out.println("OVERLOADED METHOD CALLED");
//		Thread t = Thread.currentThread();
//		for(int i=1;i<=5;i++)
//		{
//			//System.out.println(Thread.currentThread().getName()+ "  :: " + i);
//			System.out.println(" Called the overloaded run method :: " + i);
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {				
//				e.printStackTrace();
//			}
//		}
//	}
}
