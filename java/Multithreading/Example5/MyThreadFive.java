
public class MyThreadFive implements Runnable{
	
	private String name;
	private Thread t;
	
	public MyThreadFive(String name) {
		this.name = name;
		
		t = new Thread(this, name);
		t.start();
	}
	
	public Thread getT() {
		return t;
	}

	
	public void run() {
		for(int i =1 ;i<=5;i++) {
			System.out.println(name + "  :: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(name + " exiting.");
	}
}
