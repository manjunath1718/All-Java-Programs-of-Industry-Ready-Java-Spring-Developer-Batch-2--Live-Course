import java.util.ArrayList;
import java.util.Collections;

public class LaunchCollections1 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(100);
		list.add(50);
		list.add(150);
		list.add(25);
		list.add(125);
		System.out.println(list);//[100, 50, 150, 25, 125]
		Collections.sort(list);		
		System.out.println(list);//[25, 50, 100, 125, 150]
		
		System.out.println("*********************************");
		
		ArrayList<String> list2=new ArrayList<>();
		list2.add("Java");
		list2.add("TShaped Skills");
		list2.add("Alien");
		list2.add("Spring");	
		System.out.println(list2);//[Java, TShaped Skills, Alien, Spring]
		Collections.sort(list2);
		System.out.println(list2);//[Alien, Java, Spring, TShaped Skills]
	}

}
