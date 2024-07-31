
public class Launch3 
{

	public static void main(String[] args) 
	{
//		int a=4;
//		a=a+1;
//		System.out.println(a);
		
//		int n=5;
//		n++;
//		System.out.println(n);
		
//		int a=4;
//		int b;
//		b=a++;
//		System.out.println(a);//5
//		System.out.println(b);//4
//		
//		int a=4;
//		int b;
//		b=a++ + ++a;
//		System.out.println(a);//6
//		System.out.println(b);//10
		
		
//		int a=5;
//		int b;
//		b=++a + ++a + a++;
//		System.out.println(a);//8
//		System.out.println(b);//20
		
//		int a=4;
//		int b;
//		b=++a + --a + a++ + a--;
//		System.out.println(a);//4
//		System.out.println(b);//18
		
//		int a=4;
//		int b;
//		b=a++ + --a + --a + a++ + ++a - a--;
//		System.out.println(a);//4
//		System.out.println(b);//14
		
		int a=4;
		int b;
		b=a++ + ++a + a++ - --a + --a + a++ + a--;
		System.out.println(a);//5
		System.out.println(b);//26

	}

}
