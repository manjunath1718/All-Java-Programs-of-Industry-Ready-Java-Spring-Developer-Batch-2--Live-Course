class AeroPlane
{
	int cost;
	
	void fly()
	{
		cost=44444;
		System.out.println("AeroPlane is flying");
	}
	
	void takeOff()
	{
		System.out.println("Aero taling off");
	}
}
//class Dog extends AeroPlane
//{
//	
//}
class PassengerPlane extends AeroPlane
{
	//fly method in child inherited
	
	void takeOff()//overrding method 
	{
		System.out.println("Passeneger plane requires medium sized runway to take off taling off");
	}
	
	void disp()//specialized method
	{
		System.out.println("Cost is "+ cost);
	}
}


public class LaunchInher2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AeroPlane p=new PassengerPlane();//upcasting  ==> Why?Polymophism
		p.fly();//inherited method
		p.takeOff();//overriding method
		((PassengerPlane) p).disp();//down casting
		
		

	}

}
