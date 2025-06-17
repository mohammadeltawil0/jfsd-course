
public class AppFive {

	public static void main(String[] args)
	{
		MyThreadFive t1 = new MyThreadFive("one");
		MyThreadFive t2 = new MyThreadFive("two");
		MyThreadFive t3 = new MyThreadFive("three");
		MyThreadFive t4 = new MyThreadFive("four");
		MyThreadFive t5 = new MyThreadFive("five");
		
		try {
			System.out.println("main thead is waiting");
			
//			t1.t.join();
//			t2.t.join();
//			t3.t.join();
//			t4.t.join();
//			t5.t.join();
			
			t1.getT().join();
			t2.getT().join();
			t3.getT().join();
			t4.getT().join();
			t5.getT().join();
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main thread exiting");
	}
}
