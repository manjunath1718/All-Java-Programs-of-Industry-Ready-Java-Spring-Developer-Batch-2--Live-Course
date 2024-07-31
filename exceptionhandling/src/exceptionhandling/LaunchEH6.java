package exceptionhandling;

class Gamma{
	
	public int getSomeNo(){
		try{
			System.out.println("getSomeNo() called");
			return 45;
		}
		//finally block will get executed even if there is return statement
		finally{
			System.out.println("After return statement--> in finally block");
		}
	}
	public void getSomeNos(){
		try{
			System.out.println("getSomeNo() called");
			System.exit(0);
		}
		//finally block will not execute if System.exit(0) method is present
		finally{
			System.out.println("After return statement--> in finally block");
		}
	}
}
public class LaunchEH6 {

	public static void main(String[] args) {
		Gamma g=new Gamma();
		System.out.println(g.getSomeNo());
		g.getSomeNos();

	}

}
