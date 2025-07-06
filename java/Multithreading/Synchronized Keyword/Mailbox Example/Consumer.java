
public class Consumer implements Runnable{
	
	MailBox mailBox;
	
	public Consumer(MailBox mailBox) {
		this.mailBox = mailBox;
		new Thread(this, "Consumer").start();
	}
	
	@Override
	public void run() {
		while(true) {
			String mail = mailBox.getMail();		
		}
	}

}
