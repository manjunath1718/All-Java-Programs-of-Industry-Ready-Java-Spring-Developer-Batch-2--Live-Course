
interface Alpha1
{
	void show();
	//from java9 we can have private methods
	private void alien()
	{
		System.out.println("private member of interface");
	}
	
    default void disp()
	{
		System.out.println("Disp of interface");
		alien();
		
	}
	static void gamma()
	{
		
		System.out.println("gamma static method of interface");
	}
}

class Beta implements Alpha1
{
	public void show()
	{
		System.out.println("Show implemented in beta");
	}
	
//     public void disp()
//	{
//		System.out.println("Disp of beta");
//	}
     
//     static void gamma()
// 	{
// 		System.out.println("gamma static method of Beta class");
// 	}
	
}


public class LaunchInterface4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alpha1 a=new Beta();
		a.show();
		a.disp();
		
		Alpha1.gamma();

		
	}

}
