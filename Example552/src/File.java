
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
				 System.out.println(th_name+"正在下载第"+paragraph--+"段内容");
			 }
		 }
	 }

}
