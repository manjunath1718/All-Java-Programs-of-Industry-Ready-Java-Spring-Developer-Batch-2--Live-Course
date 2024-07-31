package exceptionhandling;

import java.util.Scanner;

public class LaunchEH2 
{

	public static void main(String[] args) 
	{
		System.out.println("Application started");
	try
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the numerator to divide");
		int n1=scan.nextInt();
		System.out.println("please enter the denominator to divide");
		int n2=scan.nextInt();
		
		int res=n1/n2;
		
		System.out.println("Result is : "+res);
		
		System.out.println("Please enter the size of an array");
		int size=scan.nextInt();
		int ar[]=new int[size];//4
		
		System.out.println("Kindly enter the element to be inserted");
		int elem=scan.nextInt();
		//12
		System.out.println("Kindly enter pos at which element to be inserted");
		int pos=scan.nextInt();
		//2
		ar[pos]=elem; // ar[2]=12;
		
		System.out.println(elem + " entered at "+ pos + " index Successfully in array");
	}
	
	catch(ArithmeticException e)
	{
		System.out.println("Enter proper denominator");
	}
	
	catch(NegativeArraySizeException e)
	{
		System.out.println("Please be positive for an array");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("be within your limits");
	}
	catch(Exception e)
	{
		System.out.println("Invalid exception");
	}
	
		
		System.out.println("Application terminated smoothly");

	}


}

