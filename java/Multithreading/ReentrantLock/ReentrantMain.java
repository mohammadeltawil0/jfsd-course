
public class ReentrantMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReentrantLockDemoTwo ob1 = new ReentrantLockDemoTwo("THREAD-ONE");
		ReentrantLockDemoTwo ob2 = new ReentrantLockDemoTwo("THREAD-TWO");
		
		ob1.start();
		ob2.start();
		
	}

}
