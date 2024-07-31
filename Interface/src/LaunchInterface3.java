
interface Alpha
{
	//marker interface
}

interface Calc1
{
	int add();
	int sub();
	
}

interface Calc2
{
	int mul();
	int div();
}

class MyCalculator implements Calc1, Calc2
{

	
	public int mul() 
	{
		
	
		return 10*20;
	}


	public int div()
	{
		
		return 10/2;
	}

	
	public int add() 
	{
		return 10+2;
	}

	
	public int sub() 
	{
		
		return 10-2;
	}
	
}
public class LaunchInterface3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		MyCalculator cal=new MyCalculator();
//		
//		System.out.println(cal.add());
//		System.out.println(cal.sub());
//		System.out.println(cal.mul());
//		System.out.println(cal.div());
		
		Calc2 cal=new MyCalculator();
		System.out.println(cal.mul());
		System.out.println(cal.div());
		

	}

}
