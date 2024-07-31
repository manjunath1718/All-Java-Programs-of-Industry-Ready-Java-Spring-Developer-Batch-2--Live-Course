interface Calculator
{
	double pi=3.14;//public static final double pi=3.14;
	int mul();
	int div();
}

//interface Calculator2 implements Calculator
//{
//	int add();
//	int sub();	
//}
interface Calculator2 extends Calculator
{
	int add();
	int sub();
	
//	int mul();
//	int div();
	
}
class Demo
{
	public void disp()
	{
		System.out.println("Disp of demo class");
	}
}

class Cal extends Demo implements Calculator2
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
		
		return 15-1;
	}
	
}


public class LaunchInterface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cal c=new Cal();
		System.out.println(c.add());
		System.out.println(c.sub());
		System.out.println(c.mul());
		System.out.println(c.div());
		
		System.out.println(Calculator.pi);

	}

}
