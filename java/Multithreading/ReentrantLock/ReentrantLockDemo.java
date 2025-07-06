import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {

	static ReentrantLock l = new ReentrantLock();
	
	public static void display(String data) {
		l.lock();
		
		for(int i=1;i<=5;i++) {
			System.out.println(data + " " + i + "times");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		l.unlock();
		
	}
	
	public static void main(String[] args) {
		display("hello");
		display("Java");
	}
}
