
 class File implements Runnable {
	 private int paragraph=100;
	 public void run()
	 {
		 while(true)
		 {
			 if(paragraph>0)
			 {
				 Thread th = Thread.currentThread();
				 String th_name=th.getName();
				 System.out.println(th_name+"�������ص�"+paragraph--+"������");
			 }
		 }
	 }

}
