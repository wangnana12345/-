
public class Example11 {
public static void main(String[] args)
{
	SaleThread saleThread=new SaleThread();
	new Thread(saleThread,"�߳�һ").start();
	new Thread(saleThread,"�̶߳�").start();
	new Thread(saleThread,"�߳���").start();
	new Thread(saleThread,"�߳���").start();
	
}

}
