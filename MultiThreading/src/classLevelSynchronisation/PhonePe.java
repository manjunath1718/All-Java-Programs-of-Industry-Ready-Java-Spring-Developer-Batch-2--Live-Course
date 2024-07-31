package classLevelSynchronisation;

public class PhonePe extends Thread{



	public void run(){
		System.out.println("Deposit");
		HSBCBank.deposit(6000);
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}
}
