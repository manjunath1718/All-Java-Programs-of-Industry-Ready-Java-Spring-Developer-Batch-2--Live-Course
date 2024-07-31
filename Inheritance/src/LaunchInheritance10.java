abstract class AeroPlane1{
	public abstract void takeOff();
	
	public abstract void fly();
	
}

class CargoPlane1 extends AeroPlane1{
	public void takeOff()
	{
		System.out.println("CargoPlane requires longer runway to takeOff");
	}
	public void fly()
	{
		System.out.println("cargoPlane flies at lower height");
	}
}

class FighterPlane1 extends AeroPlane1{
	public void takeOff()
	{
		System.out.println("FighterPlane requires shorter runway to takeOff");
	}
	public void fly()
	{
		System.out.println("FighterPlane flies at high height");
	}
}

class Airport{
	public void permit(AeroPlane1 ref)
	{
		ref.takeOff();
		ref.fly();
	}
}


public class LaunchInheritance10 {

	public static void main(String[] args) 
	{
		CargoPlane1 cp=new CargoPlane1();
		
		FighterPlane1 fp=new FighterPlane1();
		
		Airport a=new Airport();
		a.permit(cp);
		a.permit(fp);
		
		
		
		
		
		
//		AeroPlane1 ref;
//		
//		ref=cp;  //AeroPlane1 ref=new CargoPlane1();
//		
//		ref.takeOff();
//		ref.fly();
//		
//		ref=fp;  //AeroPlane1 ref=new FighterPlane1();
//		
//		ref.takeOff();//1:M
//		ref.fly();

	}

}
