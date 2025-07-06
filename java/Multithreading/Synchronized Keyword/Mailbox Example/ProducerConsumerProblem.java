
public class ProducerConsumerProblem {

	public static void main(String[] args) {
		
		MailBox mailBox = new MailBox();
		
		new Producer(mailBox);
		new Consumer(mailBox);

	}
}
