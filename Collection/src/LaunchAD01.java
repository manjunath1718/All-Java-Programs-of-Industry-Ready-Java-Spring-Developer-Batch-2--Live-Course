import java.util.ArrayDeque;

public class LaunchAD01 {

	public static void main(String[] args) {
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		System.out.println(ad); //[10, 20, 30]
		ad.addFirst(100);
		ad.addLast(200);
		System.out.println(ad); //[100, 10, 20, 30, 200]
		ad.add(100);
		//ad.add(null);object with null data not allowed as it will lead to NullPointerException
		System.out.println(ad); //[100, 10, 20, 30, 200, 100]
	
		

	}

}
