
public class Example08 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		new Thread (new SleepThread()).start();
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				Thread.sleep(2000);
			}
			System.out.println("���߳���������� "+i);
			Thread.sleep(500);
		}

	}

}
