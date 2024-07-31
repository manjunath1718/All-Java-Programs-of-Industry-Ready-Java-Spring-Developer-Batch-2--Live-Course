
public class LaunchStr7 
{

	public static void main(String[] args) 
	{
		StringBuilder sb1=new StringBuilder();
		System.out.println(sb1.capacity());//16
		sb1.append("Sachin Tendulkar");//16
		System.out.println(sb1.capacity());
		sb1.append(" India");
		System.out.println(sb1);
		System.out.println(sb1.capacity());//34--> old capacity *2 + 2-> 16*2+2--> 34
		sb1.append(" and he is finest batsman in india");
		System.out.println(sb1.capacity());//70 old capacity *2 + 2
		
		StringBuilder sb2=new StringBuilder("Java");
		System.out.println(sb2.capacity());//20
		sb2.trimToSize();
		System.out.println(sb2.capacity());//4
		sb2.deleteCharAt(2);
		System.out.println(sb2);
		System.out.println(sb2.reverse());
		

	}

}
