package Basics;

public class LaunchThread2 implements Runnable
{

	public static void main(String[] args) {
//		LaunchThread2 lt=new LaunchThread2();
		
//		Thread thread1=new Thread("MyOwnThread");
		Thread thread1=new Thread(new LaunchThread2());
		thread1.setName("MyOwnThread1");
		thread1.start();//Thread-0
		
		Runnable r=()->System.out.println("Task for thread2");
		Thread thread2=new Thread(r);
		thread2.start();		
		
		Thread thread3=new Thread(()->System.out.println("task for Thread3"));
		thread3.start();

	}

	@Override
	public void run() {
		
		System.out.println("task for my new threads");
		
	}

}

