
public class MyThreadFour extends Thread{
	
	public MyThreadFour(String name) {
		super(name);
	}
	
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread()+ "  :: " + i);
			
			if(i==3)
				Thread.yield();
			
	
			}
	}

}
