import java.util.concurrent.locks.ReentrantLock;

public class ReentrantDemoOne {

	public static void main(String[] args) {
		
		
		ReentrantLock l = new ReentrantLock();
		l.lock();
		l.lock();
		
		System.out.println(l.isLocked());
		System.out.println(l.getHoldCount());
		System.out.println("--------------------");
		
		l.unlock();
		System.out.println(l.isLocked());
		System.out.println(l.getHoldCount());
		System.out.println("--------------------");
		
		l.unlock();
		System.out.println(l.isLocked());
		System.out.println(l.getHoldCount());

	}

}
