
public class AppEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThreadEight thread = new MyThreadEight();
		thread.start();
		try {
			thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread.interrupt();
		System.out.println("Main thread done");
	}

}
