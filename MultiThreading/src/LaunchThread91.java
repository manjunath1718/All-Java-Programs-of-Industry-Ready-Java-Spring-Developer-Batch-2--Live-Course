class Library implements Runnable {

	String res1="CoreJava";
	String res2="Hibernate";
	String res3="Spring";

		@Override
		public void run() {
			String name=Thread.currentThread().getName();
			try {
				if(name.equals("STUDENT1")){
					synchronized (res1) {
						System.out.println(name+" got "+res1);
						Thread.sleep(3000);
						
						synchronized (res2) {
							System.out.println(name+" got "+res2);
							Thread.sleep(3000);
							
							synchronized (res3) {
								System.out.println(name+" got "+res3);
								Thread.sleep(3000);
								
							}
						}
						
					}
					
					

				}
				else {
					synchronized (res3) {
						System.out.println(name+" got "+res3);
						Thread.sleep(3000);
						
						synchronized (res2) {
							System.out.println(name+" got "+res2);
							Thread.sleep(3000);
							//DeadLock due to mutual dependency of resources
//multiple threads permanently stuck in block state due to mutual dependency of resources is called dead lock						
							synchronized (res1) {
								System.out.println(name+" got "+res1);
								Thread.sleep(3000);
								
							}
							
						}
						
					}
//					synchronized (res1) {
//						System.out.println(name+" got "+res1);
//						Thread.sleep(3000);
//						
//						synchronized (res2) {
//							System.out.println(name+" got "+res2);
//							Thread.sleep(3000);
//							
//							synchronized (res3) {
//								System.out.println(name+" got "+res3);
//								Thread.sleep(3000);
//								
//							}
//							
//						}
//						
//					}
					
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
}

public class LaunchThread91 {

	public static void main(String[] args) {
		Library lib=new Library();

		Thread t1=new Thread(lib);
		Thread t2=new Thread(lib);

		t1.setName("STUDENT1");
		t2.setName("STUDENT2");

		t1.start();
		t2.start();



	}

}
