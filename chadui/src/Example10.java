
public class Example10 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Thread t=new Thread(new EmergencyThread(),"�߳�һ");
		t.start();
		for(int j=1;j<6;j++)
		{
			System.out.println(Thread.currentThread().getName()+"����:"+j);
			if(j==2)
			{
				t.join();
			}
			Thread.sleep(500);
		}

	}

}
