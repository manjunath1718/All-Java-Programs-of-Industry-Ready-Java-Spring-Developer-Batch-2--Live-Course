class Alpha{
	
	static int a;
	
	static {
		System.out.println("Static block of Alpha");
	}
	
	static void disp()
	{
		System.out.println("Static method of alpha");
	}
	
	
}

public class LaunchStatic2 {

	public static void main(String[] args)
	{
		Alpha.disp();

		System.out.println("Main method");

	}

}
