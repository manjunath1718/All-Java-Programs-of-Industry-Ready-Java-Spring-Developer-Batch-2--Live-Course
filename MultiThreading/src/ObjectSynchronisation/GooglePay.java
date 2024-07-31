package ObjectSynchronisation;

public class GooglePay extends Thread{
	
	HSBCBank bank;

	public GooglePay(HSBCBank bank) {
		this.bank=bank;
	}

	public void run(){
		bank.checkingBalance();
	}

}
