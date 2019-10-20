
public class Example08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fi = new File();
		new Thread(fi,"线程1").start();
		new Thread(fi,"线程2").start();
		new Thread(fi,"线程3").start();
		new Thread(fi,"线程4").start();
		new Thread(fi,"线程5").start();
		new Thread(fi,"线程6").start();
		
	}

}
