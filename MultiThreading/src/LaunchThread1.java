
public class LaunchThread1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Application started");
		
		Thread.sleep(5000);
		
		Thread t1=Thread.currentThread();
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println("*****************************");
		
		t1.setName("Raj");
		t1.setPriority(4);
		
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		
		
		System.out.println("Application ended");

	}

}
