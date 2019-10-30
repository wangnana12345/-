class Ticket1 implements Runnable{
	private int tickets=10;
	Object lock=new Object();
	public void run()
	{
		while(true)
		{
			synchronized(lock)
			{
				try{
					Thread.sleep(10);
				}catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				if(tickets>0)
				{
					System.out.println(Thread.currentThread().getName()+"---Âô³öµÄÆ±"+tickets--);
					
				}
				else{
					break;
				}
			}
		}
	}

}
