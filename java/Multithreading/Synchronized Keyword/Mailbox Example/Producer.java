
public class Producer implements Runnable{

	MailBox mailBox;
	//Thread t;
	
	public Producer(MailBox mailBox) {
		this.mailBox = mailBox;
		//t = new Thread(this, "Producer");
		//t.start();
		
		new Thread(this, "Producer").start();
	}
	
	@Override
	public void run() {
		int count = 0;
		while(true) {
			mailBox.dropMail("Mail " + (++count));
		}
	}
}

//class Abc{
//	public void m1() {
//		Producer ob = new Producer(new MailBox());
//		Thread t = new Thread(ob,"Producer");
//		t.start();
//	}
//}
