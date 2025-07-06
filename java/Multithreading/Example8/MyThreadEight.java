
public class MyThreadEight extends Thread{
	
	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("Child thread " + i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
