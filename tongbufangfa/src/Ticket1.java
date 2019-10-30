
class Ticket1 implements Runnable {
	private int tickets=10;
	public void run()
	{
		while(true)
		{
			saleTicket();
			if(tickets<=0){
			break;}
		}
	}
	private synchronized void saleTicket(){
		if(tickets>0)
		{
			try{
				Thread.sleep(10);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"---Âô³öµÄÆ±"+tickets--);
		}
	}

}
