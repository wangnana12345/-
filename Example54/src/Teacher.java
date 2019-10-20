
 class Teacher extends Thread {
	 private int homework=80;
	 public void run()
	 {
		 while(true)
		 {
			 if(homework>0)
			 {
				 Thread th = Thread.currentThread();
				 String th_name = th.getName();
				 System.out.println(th_name+"正在售发"+homework--+"张票");
			 }
		 }
	 }

}
