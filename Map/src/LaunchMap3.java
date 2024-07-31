import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class Passport{
	private String name;
	private String city;
	public Passport(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Passport [name=" + name + ", city=" + city + "]";
	}	
	
}
public class LaunchMap3 {

	public static void main(String[] args) {
		
		Passport p1=new Passport("Rohan", "Bengaluru");
		Passport p2=new Passport("Rohit", "Mumbai");
		Passport p3=new Passport("Ramesh", "Chennai");
		
		Integer i1=Integer.valueOf(101);
		Integer i2=Integer.valueOf(102);
		Integer i3=Integer.valueOf(103);
		
		HashMap<Integer, Passport> hm=new HashMap<>();
		hm.put(i1, p1);
		hm.put(i2, p2);
		hm.put(i3, p3);
	//	System.out.println(hm);
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Kindly Enter your Passport Number");
		Integer uid=scan.nextInt();
		
		Set set=hm.entrySet();
		Boolean flag=false;
		Iterator itr = set.iterator();
		while(itr.hasNext()){
			Map.Entry keyValue=(Entry) itr.next();
			Integer dbid=(Integer) keyValue.getKey();
			if(uid==dbid){
				System.out.println("Please find your details below: ");
				System.out.println(keyValue.getValue());
//				System.out.println(hm.get(keyValue.getKey()));
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("No details present with given passport id");
		}

	}

}
