
public class LaunchStr8 
{

	public static void main(String[] args){
		
//		StringBuffer sb1=new StringBuffer("Telusko");
//		System.out.println(sb1);
//		
//		StringBuffer sb2=new StringBuffer("Telusko");
//		System.out.println(sb2);
//		System.out.println(sb1==sb2);
//		System.out.println(sb1.equals(sb2));
		
		StringBuilder sb1=new StringBuilder("Java");
		
		StringBuilder sb2=new StringBuilder("Java");
		
		System.out.println(sb1==sb2);//false
		System.out.println(sb1.equals(sb2));//false
		
	}

}
