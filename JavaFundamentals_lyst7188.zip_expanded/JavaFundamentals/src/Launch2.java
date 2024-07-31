
public class Launch2 
{
	
	public static void main(String[] args) 
	{
		int a=45;
		
		
		double b;
		b=a;  //implicit typecasting// Numeric type promotion
		System.out.println(b);
		System.out.println(a);
		
		System.out.println("********************************");
		
		double n1=45.5;
		int n2;
	//	n2=n1; //ce
		
		n2=(int)n1;// explicit type casting
		System.out.println(n1);
		System.out.println(n2);// possible loss of precision
		
		int num1=45;
		
		byte num2=(byte)num1;
		
		System.out.println("**********************************************");
		
		int n3 = 129;
        byte n4 = (byte)n3;
        System.out.println(n4);

	}

}
