package exceptionhandling;

import java.util.Scanner;

//class Demo
//{
//	void disp()
//	{
//		disp();
//	}
//}


public class LaunchEH1 
{

	public static void main(String[] args) 
	{
		System.out.println("Application started");
		try
		{
		//int a=10
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the numerator to divide");
		int n1=scan.nextInt();
		System.out.println("please enter the denominator to divide");
		int n2=scan.nextInt();
		
		int res=n1/n2;
		
		
		System.out.println("Result is : "+res);
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			System.out.println("Kindly enter valid input");
		}
		
		
		
		
		System.out.println("Application terminated smoothly");

	}

}
