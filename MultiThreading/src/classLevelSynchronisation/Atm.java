package classLevelSynchronisation;

public class Atm extends Thread{

	
	
	public void run(){
		
		System.out.println("Withdraw");
		HSBCBank.withDrawal(4000);
		
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	
}
