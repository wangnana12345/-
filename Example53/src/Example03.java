
public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread myThread = new MyThread();
		Thread thread = new Thread(myThread);
		thread.start();
		for(int i=1; i<=100; i++){
			System.out.println("main ");
		}

	}

}
