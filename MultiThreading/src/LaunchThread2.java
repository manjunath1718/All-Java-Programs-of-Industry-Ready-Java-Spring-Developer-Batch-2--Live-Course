import java.util.Scanner;

class Alpha1 extends Thread{

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
class Beta1 extends Thread{

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
class Gamma1 extends Thread{

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
public class LaunchThread2 {

	public static void main(String[] args) {

		Alpha1 thread1=new Alpha1();
		Beta1 thread2=new Beta1();
		Gamma1 thread3=new Gamma1();
		
		thread1.start();
		thread2.start();
		thread3.start();

	}

}
