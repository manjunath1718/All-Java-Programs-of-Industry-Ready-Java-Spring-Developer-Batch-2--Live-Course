class Demo1
{
	int a,b;
	
	Demo1()
	{
		System.out.println("Zero Param Constructor of Demo1 P");
		a=10;
		b=20;
	}
	
	Demo1(int a, int b)
	{
		System.out.println("Param Constructor demo1 P");
		this.a=a;
		this.b=b;
	}
}
class Demo2 extends Demo1
{
	int x,y;
	
	Demo2()
	{
		this(1,2);
		x=10;
		y=20;
		System.out.println("Zero Param Constructor Demo2 C ");
	}
	
	Demo2(int x, int y)
	{
		
		this.x=x;
		this.y=y;
		System.out.println("Param Constructor Demo2 C ");
	}
	void disp()
	{
		System.out.println(a + " "+ b + " "+ x+ " "+ y);
	}
}
public class LaunchInher6 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Demo2 d=new Demo2();
		d.disp();

	}

}
