import java.util.TreeSet;

public class LaunchTS {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
	//	ts.add(25); duplicates are not allowed
	//	ts.add(null); object with null data not allowed as it will lead to NullPointerException
		System.out.println(ts);
		
		System.out.println(ts.ceiling(85));//100
		System.out.println(ts.higher(85));//100
		
		System.out.println(ts.ceiling(75));//75
		System.out.println(ts.higher(75));//100
		
		System.out.println(ts.floor(75));//75
		System.out.println(ts.lower(75));//50
		
		System.out.println(ts.floor(65));//50
		System.out.println(ts.lower(65));//50
		
		System.out.println(ts.tailSet(75));//[75, 100, 125, 150, 175]
		System.out.println(ts.headSet(75));//[25, 50]


	}

}
