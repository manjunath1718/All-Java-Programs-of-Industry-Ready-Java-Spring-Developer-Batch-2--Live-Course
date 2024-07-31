
public class LaunchStatic1 
{

	static int a;
	
	static 
	{
		System.out.println("Static block");
		a=10;
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println(a);
	}

}
