
public class Example13 {
	public static void main(String[] args)
	{
		Ticket1 ticket = new Ticket1();
		new Thread(ticket,"线程一").start();
		new Thread(ticket,"线程二").start();
		new Thread(ticket,"线程三").start();
		new Thread(ticket,"线程四").start();
		
	}
}
