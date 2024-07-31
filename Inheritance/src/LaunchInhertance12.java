//final class AutoMobile1
//{
//	public void engineInfo()
//	{
//		
//		System.out.println("Logic which has generic details about engine");
//	}
//
//}

 class AutoMobile1
{
	 
	 final int engineNum=45;
	 
//	 AutoMobile1()
//	 {
//		 engineNum=44;
//		 
//	 }
	final public void engineInfo()
	{
		//engineNum=4545;
		
		System.out.println("Logic which has generic details about engine");
	}

}

class Bike extends AutoMobile1 
{
//	public void engineInfo()
//	{
//		
//		System.out.println("Logic which has specific bike engine details ");
//	}
}


public class LaunchInhertance12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AutoMobile1 auto=new Bike();
		auto.engineInfo();

	}

}
