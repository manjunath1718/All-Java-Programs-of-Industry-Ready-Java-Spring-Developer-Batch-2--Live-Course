package exceptionhandling;

import java.util.Scanner;

class Alpha
{
	public void beta() throws ArithmeticException
	{
		
		System.out.println("Application started");

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the numerator to divide");
		int n1=scan.nextInt();
		System.out.println("please enter the denominator to divide");
		int n2=scan.nextInt();
		
		int res=n1/n2;
		
		System.out.println("Result is : "+res);

		System.out.println("Application terminated smoothly");

	}
}

public class LaunchEH4 
{

	public static void main(String[] args) 
	{
		System.out.println("Main method app started");
		
		Alpha a=new Alpha();
		try
		{
			a.beta();
		}
		catch(Exception e)
		{
			System.out.println("Exception caught at main");
		}
		
		
		System.out.println("main method concluded");

	}

}

