
public class Example07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread minPriority = new Thread(new MinPriority(),"���ȼ��ϵ͵��߳�");
		Thread maxPriority = new Thread(new MaxPriority(),"���ȼ��ϸߵ��߳�");
		minPriority.setPriority(Thread.MIN_PRIORITY);
		maxPriority.setPriority(10);//�����̵߳����ȼ�Ϊ10
		//���������߳�
		maxPriority.start();
		minPriority.start();
		

	}

}
