import java.util.Scanner;

public class Launch5 
{

	public static void main(String[] args) 
	{
//		int num1=10;
//		int num2=15;
		
//		if(num1<num2)
//		{
//			//addition
//			int res=num1+num2;
////			System.out.println("Addition result "+ res);
//		}
//		else
//		{
//			//subtraction
//			int res=num1-num2;
//			System.out.println("Subtraction result "+res);
//		}
		
//		if(num1<num2)
//			System.out.println("Addition result ");
//		else
//			System.out.println("Subtraction result ");
		
//		int num1=10;
//		int num2=5;
//		
//		if(num1<num2)//
//		{
//			//addition
//			int res=num1+num2;
//			System.out.println("Addition result "+ res);
//		}
//		else if(num1<=num2)//
//		{
//			//subtraction
//			int res=num1-num2;
//			System.out.println("Subtraction result "+res);
//		}
//		else if(num1>num2)
//		{
//			//div
//			int res=num1/num2;
//			System.out.println("Division result "+ res);
//		}
//		else
//		{
//			int res=num1*num2;
//			System.out.println("Multiplication Result "+ res);
//		}
			
		
		int num1=10;
		int num2=15;
		//true && true ==> true
		if(num1<num2 && num1<=num2)  //false && false ==> false   %%%%%  //false && true ==> false
		{
			if(num1<num2)
			{
				//subtraction
				int res=num1-num2;
				System.out.println("Subtraction result "+res);
			}
			else
			{
				int res=num1+num2;
				System.out.println("Addition result "+ res);
			}
			
		}
		else if(num1>num2)
		{
			//div
			int res=num1/num2;
			System.out.println("Division result "+ res);
			
		}
		else
		{
			int res=num1*num2;
			System.out.println("Multiplication Result "+ res);
		}
		
		
		

	}

}
