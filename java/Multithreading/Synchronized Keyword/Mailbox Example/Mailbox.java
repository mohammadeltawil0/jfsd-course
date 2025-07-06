
public class MailBox {

	String mail;
	
	boolean isMailDropped = false;
	
	synchronized public void dropMail(String mail) {
		while(isMailDropped) {
			try {
				wait();
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
		this.mail = mail;
		isMailDropped = true;
		System.out.println("Dropped Mail : " + this.mail);
		notify();		
	}
	
	synchronized public String getMail() {
		while(!isMailDropped) {
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Got mail : " + this.mail);
		isMailDropped = false;
		notify();
		return this.mail;
		
	}
	
	
}
