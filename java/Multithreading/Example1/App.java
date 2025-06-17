
public class App {

	public static void main(String[] args) {
		
		MyThread thread1 = new MyThread("Thread-ONE");
		//thread1.setName("Thread-ONE");
		thread1.start();
		//thread1.run();
		
		//thread1.start();
		
//		MyThread thread2 = new MyThread();
//		thread2.setName("Thread-TWO");
//		thread2.start();
		
		
		Thread t = Thread.currentThread();		//return the reference of the thread where is being defined
		t.setName("MAIN-THREAD");
		for(int i=1;i<=5;i++) {
			System.out.println(t+ " :: " +  t.getName() + " :: "+ i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}		
	}
}


