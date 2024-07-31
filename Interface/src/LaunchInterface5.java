interface Beta1
{
	void disp();
}

public class LaunchInterface5 
{

	public static void main(String[] args) 
	{
		//annoymous inner class
		//Lambda expression
		
		
		Beta1 beta=new Beta1() {
			
			public void disp()
			{
				System.out.println("disp method implementation");
			}
			
		};
		
		

	}

}
