
public class AppTwo {

	public static void main(String[] args) {
		
		MyThreadTwo mythread = new MyThreadTwo();
		
//		Thread t = new Thread(mythread);
//		t.start();
		
		Thread th = Thread.currentThread();		//return the reference of the thread where is being defined
		th.setName("MAIN-THREAD");
		for(int i=1;i<=5;i++) {
			System.out.println(th+ " :: " +  th.getName() + " :: "+ i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}	

	}

}
