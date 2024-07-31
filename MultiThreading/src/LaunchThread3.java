import java.util.Scanner;

class Alpha2 implements Runnable{

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
class Beta2// implements Runnable
{

//	@Override
//	public void  run() {
//		printStar();
//	}
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
class Gamma2 implements Runnable {

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
public class LaunchThread3 {

	public static void main(String[] args) {
		
		Alpha2 alpha2=new Alpha2();
		Beta2 beta2=new Beta2();
		Gamma2 gamma2=new Gamma2();
		
		Thread thread1=new Thread(alpha2);
//		Thread thread2=new Thread(beta2);
		Thread thread2=new Thread(()->beta2.printStar());
		Thread thread3=new Thread(gamma2); 
		
		thread1.start();
		thread2.start();		
		thread3.start();


	}

}
