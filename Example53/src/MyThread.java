
class MyThread implements Runnable{
	public void run()
	{
		for(int j=1; j<=50; j++)
		{
			System.out.println("new ");
		}
	}

}
