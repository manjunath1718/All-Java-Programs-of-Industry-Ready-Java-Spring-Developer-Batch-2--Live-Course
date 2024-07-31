class AutoMobile
{
	
}
class Car extends AutoMobile
{
	
}


class Parent
{
	public void eat()
	{
		System.out.println("Parent eat food usually");
	}
	
	protected void cry(int cost)
	{
		System.out.println("Parent cry silently ");
	}
	
	public double height()
	{
		System.out.println("Logic to calculate height");
		return 5.10;
	}
	
	public AutoMobile asset()
	{
		System.out.println("specifiying which vehicle we have");
		AutoMobile m=new AutoMobile();
		return m;
	}

}

class Child extends Parent
{
	//override
	public void eat()
	{
		System.out.println("Children takes lot of time to eat");
		
	}
	
	public void cry()
	{
		System.out.println("child cry loudly ");
	}
	
//	protected void cry(int cost)
//	{
//		System.out.println("Parent cry silently ");
//	}
	
//	public int height()
//	{
//		System.out.println("Logic to calculate height");
//		return 5;
//	}
	
	public Car asset()
	{
		System.out.println("specifiying which vehicle we have");
		Car c=new Car();
		return c;
	}

}

public class LaunchInheritnace9 
{

	public static void main(String[] args) 
	{
		Parent c=new Child();
		c.eat();

	}

}
