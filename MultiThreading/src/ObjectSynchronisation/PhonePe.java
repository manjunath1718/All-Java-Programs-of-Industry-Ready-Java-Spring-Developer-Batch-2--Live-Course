package ObjectSynchronisation;

public class PhonePe extends Thread{

	HSBCBank bank;

	public PhonePe(HSBCBank bank) {
		this.bank=bank;
	}

	public void run(){
		System.out.println("Deposit");
		bank.deposit(6000);
//		try {
//			Thread.sleep(30000);
//		} catch (InterruptedException e) {
//		
//			e.printStackTrace();
//		}
	}
}
