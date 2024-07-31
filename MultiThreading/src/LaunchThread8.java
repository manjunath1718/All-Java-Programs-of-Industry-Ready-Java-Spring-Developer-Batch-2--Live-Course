import java.util.Scanner;

class Alpha8 implements Runnable{

	@Override
	public void  run() {
		banking();
	}
	
	public  void  banking() {

		System.out.println("Banking Activity Started...");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the account number");
		int ac=scan.nextInt();
		System.out.println("Enter the password");
		int pw=scan.nextInt();
		System.out.println("Collect your cash");
		System.out.println("Banking Activity Ended...");
	}
	
}
class Beta8 implements Runnable{

	@Override
	public void  run() {
		printStar();
	}
	public  void  printStar() {

		System.out.println("Printing STAR Started");
		for(int i=0;i<3;i++) {
			System.out.println("*");
			try {
				Thread.sleep(3000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Printing STAR Ended");
	}

}
class Gamma8 implements Runnable {

	@Override
	public void  run() {
		printQuote();
	}
	
	public  void  printQuote() {

		System.out.println("Printing Quote Started");
		
		for(int i=0;i<3;i++) {
			System.out.println("Focus is Key");
			try {
				Thread.sleep(3000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
		System.out.println("Printing Quote Ended");		
	}

}
public class LaunchThread8 {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Main Thread Started Execution");
		
		Alpha8 alpha=new Alpha8();
		Beta8 beta=new Beta8();
		Gamma8 gamma=new Gamma8();
		
		Thread thread1=new Thread(alpha);
		Thread thread2=new Thread(beta);
		Thread thread3=new Thread(gamma); 
		
		System.out.println(thread1.isAlive());
		System.out.println(thread2.isAlive());
		System.out.println(thread3.isAlive());
		
		thread1.start();		
		thread2.start();
		thread1.join();
		thread2.join();
		thread3.start();
		
//		thread1.join();
//		thread2.join();
		thread3.join();
		
		System.out.println("Main Thread Completed Execution");

	}

}
