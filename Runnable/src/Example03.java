
public class Example03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread myThread = new MyThread();//����MyThread��ʵ������
		Thread thread = new Thread(myThread);//�����̶߳���
        thread.start();//�����̣߳�ִ���߳��е�run����
		while(true)
		{
			System.out.println("main()����������");
		}

	}

}
