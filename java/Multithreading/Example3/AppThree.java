
public class AppThree {

	public static void main(String[] args) {
		
		MyThreadThree mtt = new MyThreadThree();
		
		Thread t1 = new Thread();
		
		Thread t2 = new Thread(mtt);
		
		//t1.start();	//it will start the thread and invoke the run() method of Thread class, that has nothing to print
		
		//t1.run();	//run() method of Thread class, that has nothing to print
		
		//t2.start();	//thread created, register with scheduler and run method called implicitly
		//System.out.println("-------------------");
		//t2.run();			//run method will be called ane executed as normal method
		
	//	mtt.start();		//start() is undefined for the MyThreadThree
		
		mtt.run();		//call run method as normal method, it will not behave like a thread method call
		

	}

}
