
class MaxPriority implements Runnable {
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+"ÕýÔÚÊä³ö£º "+i);
		}
	}

}
