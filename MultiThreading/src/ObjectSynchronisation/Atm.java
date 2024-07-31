package ObjectSynchronisation;

public class Atm extends Thread{

	HSBCBank bank;
	
	public Atm(HSBCBank bank) {
		this.bank=bank;
	}
	
	public void run(){
		
		System.out.println("Withdraw");
		bank.withDrawal(8000);
		
//		try {
//			Thread.sleep(30000);
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
		
	}
	
}
