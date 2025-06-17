
public class MyThreadTwo implements Runnable {

	Thread t;
	
	public MyThreadTwo() {
		t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		for(int i=1;i<=5;i++)
		{
			System.out.println(t + " :: " + t.getName()+ "  :: " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}		
	}	
}
