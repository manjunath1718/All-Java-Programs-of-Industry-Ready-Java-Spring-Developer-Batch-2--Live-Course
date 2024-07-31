import java.util.HashSet;
import java.util.LinkedHashSet;

public class LaunchHS {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		hs.add(100);
		hs.add(50);
		hs.add(150);
		hs.add(25);
		hs.add(75);
		hs.add(125);
		hs.add(175);
	//	hs.add(25);//No duplication
		hs.add(null);//null value is allowed
		System.out.println(hs);//order of insertion is not retained
	
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(100);
		lhs.add(50);
		lhs.add(150);
		lhs.add(25);
		lhs.add(75);
		lhs.add(125);
		lhs.add(175);
	//	lhs.add(25);No duplication
		lhs.add(null);//null value is allowed
		System.out.println(lhs);//order of insertion is maintained 
	

	}

}
