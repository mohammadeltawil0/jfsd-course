
public class AppFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);

		MyThreadFour th1 = new MyThreadFour("ONE");
		th1.setPriority(Thread.MAX_PRIORITY);
		th1.start();
//		MyThreadFour th2 = new MyThreadFour("TWO");
//		th2.setPriority(Thread.MIN_PRIORITY);
//		th2.start();
//		MyThreadFour th3 = new MyThreadFour("THREE");
//		th3.setPriority(Thread.MIN_PRIORITY+2);
//		th3.start();
//		MyThreadFour th4 = new MyThreadFour("FOUR");
//		th4.setPriority(Thread.MIN_PRIORITY+1);
//		th4.start();
		
		
		
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread() + "  :: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
