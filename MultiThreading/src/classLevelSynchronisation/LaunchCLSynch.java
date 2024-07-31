package classLevelSynchronisation;

public class LaunchCLSynch {

	public static void main(String[] args) {
		
		HSBCBank bank=new HSBCBank();
		
		HSBCBank bank2=new HSBCBank();

		Atm atm=new Atm();
		atm.setName("ATM Thread");
		
		PhonePe pPay=new PhonePe();
		pPay.setName("pPAY Thread");
		
		GooglePay gPay=new GooglePay();
		gPay.setName("gPay Thread");
		
		atm.start();
		pPay.start();
		gPay.start();
		
	}

}
