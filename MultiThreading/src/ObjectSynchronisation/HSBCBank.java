package ObjectSynchronisation;

public class HSBCBank {

	int accountBal;

	public HSBCBank(int accountBal) {
		this.accountBal=accountBal;
	}

	synchronized public void withDrawal(int withdrawAmt) {

		if(accountBal<withdrawAmt) {
			
				try {
					wait();//wait releases lock and go to wait state unless it is notified by other thread
//					Thread.sleep(20000);//sleep will not release lock it will go to sleep state for specified time
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			
		}else {
			accountBal=accountBal-withdrawAmt;
		}
		
	}

	synchronized public void deposit(int depositAmt) {

		accountBal=accountBal+depositAmt;
		notify();
	}

	synchronized public void checkingBalance() {

		 System.out.println("Account Balance is "+accountBal);
	}

}
