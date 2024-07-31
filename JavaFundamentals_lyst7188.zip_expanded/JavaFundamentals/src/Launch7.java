
public class Launch7 
{

	public static void main(String[] args) 
	{
		
		int n1=30;
		int n2=20;
		
		int res=(n1<n2)? n1+n2 : n1-n2;
		
		
		System.out.println(res);
		
		System.out.println("***************************");
		
		String result=(10<15)? "true":"false";
		
		System.out.println(result);
		
		System.out.println("************************************");
		
		int a=40;
		int b=20;
		int c=30;
		
		int res2=(a<b) ? (a<c? a:c) : (b<c? b:c);
		System.out.println(res2);
		

	}

}
