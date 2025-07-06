import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemoTwo extends Thread{
	
	static ReentrantLock rl = new ReentrantLock();

	
	public ReentrantLockDemoTwo(String name) {
		super(name);
	}
	
	public void run() {
		do {
			System.out.println(Thread.currentThread().getName() + " before try block doing some job");
			try {
				if(rl.tryLock(1000, TimeUnit.MICROSECONDS)) {
					System.out.println(Thread.currentThread().getName() + " acquired the lock");
					
					//code to perform task
					System.out.println("Done some thread realted task");
					
					
					Thread.sleep(500);
					
					System.out.println(Thread.currentThread().getName() + " release the lock");
					rl.unlock();
					break;
				} else {
					System.out.println(Thread.currentThread().getName() + " didn't get the lock, "
							+ "but doing something else as alternative task");
				}
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}while(true);
	}
}
