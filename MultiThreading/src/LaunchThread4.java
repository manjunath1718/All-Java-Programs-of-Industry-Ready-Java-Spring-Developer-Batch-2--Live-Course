import java.util.Scanner;

class Alpha4 implements Runnable{

	
	@Override
    public void run() {
		
		Thread thread = Thread.currentThread();
		if(thread.getName().equals("BANK")) {
			banking();
		}
		else if(thread.getName().equals("STAR")) {
			printStar();
		}
		else {
			printQuote();
		}
		
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
	
	public  void  printQuote() {

		System.out.println("Printing Quote Started");
		
		for(int i=0;i<3;i++) {
			System.out.println("Focus is Key to Learn any Skills");
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
public class LaunchThread4 {

	public static void main(String[] args) {
		
		Alpha4 alpha4=new Alpha4();
		
		Thread thread1=new Thread(alpha4,"BANK");
		Thread thread2=new Thread(alpha4,"STAR");
		Thread thread3=new Thread(alpha4,"QUOTE");
		
//		thread1.setName("BANK");
//		thread2.setName("STAR");
//		thread3.setName("QUOTE");
		
		thread1.start();
		thread2.start();		
		thread3.start();
		

	}

}
