class Beta
{
	static int a;
	
	static
	{
		a=10;
		System.out.println("Static init block");
	}
	
	static void disp()
	{
		System.out.println(a);
	}
	
}

public class LaunchStatic4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beta.disp();
		
		Beta b=new Beta();
		b.disp();

	}

}
