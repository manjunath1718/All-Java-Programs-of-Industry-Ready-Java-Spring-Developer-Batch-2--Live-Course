package classLevelSynchronisation;

public class HSBCBank {

	static int accountBal=4000;

//	public HSBCBank(int accountBal) {
//		this.accountBal=accountBal;
//	}

	synchronized static public void withDrawal(int withdrawAmt) {

		accountBal=accountBal-withdrawAmt;
	}

	synchronized static public void deposit(int depositAmt) {

		accountBal=accountBal+depositAmt;
	}

	synchronized static public void checkingBalance() {

		 System.out.println("Account Balance is "+accountBal);
	}

}
