
public class Example09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new YieldThread("�߳� A");
		Thread t2 = new YieldThread("�߳� B");
		t1.start();
		t2.start();

	}

}
