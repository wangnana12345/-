
public class Example03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread myThread = new MyThread();//创建MyThread的实例对象
		Thread thread = new Thread(myThread);//创建线程对象
        thread.start();//开启线程，执行线程中的run方法
		while(true)
		{
			System.out.println("main()方法在运行");
		}

	}

}
