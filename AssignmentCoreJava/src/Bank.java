import java.util.Scanner;

abstract class BankAccount{

	double balance;

	public BankAccount() {

	}
	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}
	Scanner sc=new Scanner(System.in);

	public  abstract void deposit();
	public  abstract void withDraw();
	public void checkBalance() {
		System.out.println("Total Balance in your account "+balance);

	}
}
class SavingsAccount extends BankAccount{


	@Override
	public void deposit() {
		System.out.println("Enter Amount to deposit");
		double dAmt=sc.nextDouble();
		balance=balance+dAmt;
		System.out.println("Rs"+dAmt+"/- credited to your account");
		checkBalance();
	}

	@Override
	public void withDraw() {
		System.out.println("Enter Amount to withdraw");
		double wAmt=sc.nextDouble();
		if(wAmt<balance) {
			balance=balance-wAmt;
			System.out.println("Rs"+wAmt+"/- debited from your account");
		}
		else {
			System.out.println("Insufficient Balance in your Account");
		}

		checkBalance();

	}


}
class CheckingAccount extends BankAccount{

	static double minBalance = 5000.0;
	public CheckingAccount() {
		super(minBalance);
	}


	@Override
	public void deposit() {

		System.out.println("Enter Amount to deposit");
		double dAmt=sc.nextDouble();
		balance=balance+dAmt;
		System.out.println("Rs"+dAmt+"/- credited to your account.");
		checkBalance();

	}

	@Override
	public void withDraw() {
		System.out.println("Enter Amount to withdraw");
		double wAmt=sc.nextDouble();
		if(wAmt<balance-minBalance) {
			balance=balance-wAmt;
			System.out.println("Rs"+wAmt+"/- debited from your account.");
		}
		else {
			System.out.println("Insufficient Balance in your Account");
		}

		checkBalance();

	}



}

public class Bank {

	static BankAccount account;
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("Enter Account Type");
			System.out.println("1:Press 1 for Savings Account");
			System.out.println("2:Press 2 to Checking Account");
			int accountchoice=sc.nextInt();
			switch(accountchoice) {

			case 1->account =new SavingsAccount();
			case 2->account=new CheckingAccount();		
			case 3->System.exit(0);
			default->{
				System.out.println("Invalid Choice");
				continue;
			    }
			}
					
			while(true) {

				System.out.println("=========================================");
				System.out.println("1:Press 1 to Deposit");
				System.out.println("2:Press 2 to Withdraw");
				System.out.println("3:Press 3 to Check Balance");			
				System.out.println(":Press 4 to Exit");

				System.out.println("Enter Choice");
				int choice=sc.nextInt();
				System.out.println("=========================================");



				switch(choice) {

				case 1->account.deposit();
				case 2->account.withDraw();
				case 3->account.checkBalance();
				case 4->System.exit(0);			
				default->System.out.println("Invalid Choice");

				}

			}


		}
	}
}
