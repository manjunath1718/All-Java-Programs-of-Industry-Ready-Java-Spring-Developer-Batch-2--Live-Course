package ObjectSynchronisation;

//import java.util.concurrent.Callable;

public class LaunchOLSynch {

	//Callable c;//Explore Callable interface
	public static void main(String[] args) {
		
		HSBCBank bank=new HSBCBank(4000);
		
//		HSBCBank bank2=new HSBCBank(8000);

		Atm atm=new Atm(bank);
		atm.setName("ATM Thread");
		
		PhonePe pPay=new PhonePe(bank);
		pPay.setName("pPAY Thread");
		
//		GooglePay gPay=new GooglePay(bank2);
		GooglePay gPay=new GooglePay(bank);
		gPay.setName("gPay Thread");
		
		atm.start();
		pPay.start();
		gPay.start();
		
	}

}
