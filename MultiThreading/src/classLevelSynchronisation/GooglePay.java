package classLevelSynchronisation;

public class GooglePay extends Thread{
	


	public void run(){
		HSBCBank.checkingBalance();
	}

}
