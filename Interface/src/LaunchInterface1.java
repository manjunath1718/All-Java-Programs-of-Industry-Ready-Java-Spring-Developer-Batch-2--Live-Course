import java.util.Scanner;

interface Calc
{
	void add();//public abstract void add();
    void sub();//public abstract void sub();
}

class MyCalc1 implements Calc
{
	//public abstract void add();
	
	public void add()
	{
		int a=10;
		int b=20;
		int res=a+b;
		System.out.println(res);
	}
	
   //public abstract void sub();
	
	public void sub()
	{
		int a=10;
		int b=20;
		int res=a-b;
		System.out.println(res);
	}
	public void mul()
	{
		int a=10;
		int b=20;
		int res=a*b;
		System.out.println(res);
	}
	
}

class MyCalc2 implements Calc
{
	//public abstract void add();
	
		public void add()
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Kindly enter 1st number to add");
			int a=scan.nextInt();
			System.out.println("Kindly enter 2nd number to add");
			int b=scan.nextInt();
			int res=a+b;
			System.out.println(res);
		}
		
	   //public abstract void sub();
		
		public void sub()
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Kindly enter 1st number to subtract");
			int a=scan.nextInt();
			System.out.println("Kindly enter 2nd number to subtract");
			int b=scan.nextInt();
			int res=a-b;
			
			System.out.println(res);
		}
}

public class LaunchInterface1 {

	public static void main(String[] args) {
		System.out.println("Result of first implementation");
		Calc cal1= new MyCalc1();
		cal1.add();
		cal1.sub();
		((MyCalc1) cal1).mul();
		
		System.out.println();
		System.out.println("Result of 2nd implementation");
		Calc cal2= new MyCalc2();
		cal2.add();
		cal2.sub();
		
		//Calc c= new Calc();
		
		

	}

}
