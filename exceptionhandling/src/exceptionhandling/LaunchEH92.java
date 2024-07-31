package exceptionhandling;

import java.util.Scanner;

class InvalidCustomerException extends Exception{
	public InvalidCustomerException(String msg){
		super(msg);
	}
}

class Atm{
	int accNo=1111;
	int password=2222;

	int acc;
	int pw;

	public void input(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Kindly enter the account number");
		acc=scan.nextInt();
		System.out.println("Kindly enter the password");
		pw=scan.nextInt();
	}
	public void verify() throws InvalidCustomerException{
		if(accNo==acc && password==pw)
		{
			System.out.println("Credentials matched! You can go further with Transaction");
		}
		else
		{
			InvalidCustomerException ice=new InvalidCustomerException("Invalid Credentials");
			System.out.println(ice.getMessage());
			throw ice;

			//		throw new InvalidCustomerException("Invalid Credentials");

		}
	}	
}
class Bank{
	
	public void initiate(){
		
		Atm atm=new Atm();

		try 
		{
			atm.input();
			atm.verify();
		} 
		catch (InvalidCustomerException e) 
		{



			try 
			{
				atm.input();
				atm.verify();
			} 
			catch (InvalidCustomerException e1)
			{


				try
				{
					atm.input();
					atm.verify();
				} 
				catch (InvalidCustomerException e2) 
				{
					System.out.println("Looks youre a legend! Cant give any more Access BLOCKED! Contact Bank");
				}

			}
		}
	}

}
public class LaunchEH92 {

	public static void main(String[] args) {

		System.out.println("Welcome to Telusko bank!!");
		Bank b=new Bank();
		b.initiate();
	}

}
