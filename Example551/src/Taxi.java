
class Taxi extends Thread {
	private int guest=100;
	public void run(){
		while(true)
		{
			if(guest>0)
			{
				Thread th = Thread.currentThread();
				String th_name = th.getName();
				System.out.println(th_name+"���ڽ��͵�"+guest--+"λ�˿�");
			}
		}
	}

}