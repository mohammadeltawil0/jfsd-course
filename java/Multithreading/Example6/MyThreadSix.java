
public class MyThreadSix implements Runnable {

	private String name;
	private Thread t;		//a reference variable of Thread type
	private String[] arr = {"Class & Objects", "Abstract class & Interfaces", "Packages", "Exeption Handling"};
	
	public MyThreadSix(String name) {
		this.name = name;
		//creat the thread, send the Runnable reference to thread with name of thread
		//Thread(Runnable obj, String name)
		t = new Thread(this, name); 
		t.start();
	}
	
	
	@Override
	public void run() {
		try {
			
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
				Thread.sleep(1000);
			}
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}


//class Abc{
//	
//	public void f1() {
//		MyThreadSix ob = new MyThreadSix("one");
//		
//		Thread t = new Thread(ob);
//		t.start();
//		
//	}
//}
