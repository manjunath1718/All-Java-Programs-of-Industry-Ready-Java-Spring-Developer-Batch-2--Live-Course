
public class LaunchBoxUnBox {

	public static void main(String[] args) {
		//      byte--> Byte
        //      short--> Short
        //		int --> Integer
        //		long --> Long
		//		float--> Float
		//      double--> Double
		//		char--> Character
		//		boolean --> Boolean

		Integer i=new Integer(10);
		System.out.println(i);
		Integer i2=Integer.valueOf(10);
		
		int num=100;

		Integer num2=Integer.valueOf(i2);//Boxing
		Integer num3=num;//AutoBoxing

		Integer n1=Integer.valueOf(44);
		int n2=n1.intValue();//UnBoxing
		int n3=n1;//AutoUnboxing

	}

}
