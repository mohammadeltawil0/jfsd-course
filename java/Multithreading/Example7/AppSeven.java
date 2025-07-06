public class AppSeven {

	public static void main(String[] args) {
		
		//System.out.println(Thread.currentThread().getName());
		
		MyThreadSeven.mainThread = Thread.currentThread();
		
		MyThreadSeven obj = new MyThreadSeven("Thread-ONE");
		obj.start();
		
		try {
			for(int i=1;i<=5;i++)
			{
				System.out.println("Main thread " + i);
				Thread.sleep(1000);
			}	
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
