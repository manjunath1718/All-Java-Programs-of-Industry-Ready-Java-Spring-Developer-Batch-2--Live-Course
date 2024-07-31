import java.util.ArrayList;
import java.util.List;

public class LaunchAL01 {

	public static void main(String[] args) {
		
		List al1=new ArrayList();
		al1.add(100);
		al1.add("Telusko");
		al1.add('a');
		al1.add(999.9);
		
		System.out.println(al1);
		al1.add("TShapedSkills");
		System.out.println(al1);
		System.out.println("****************************");
		
		ArrayList al2=new ArrayList();
		al2.add(100);
		al2.add(200);
		al2.add(300);
		System.out.println(al2);
		
		System.out.println("****************************");
		ArrayList al3=new ArrayList();
		al3.add("Telusko");
		al3.add("Java");
		al3.add("TShapedSkills");
		System.out.println(al3);   //[Telusko, Java, TShapedSkills]
		al3.add(1, 44);
		System.out.println(al3);   //[Telusko, 44, Java, TShapedSkills]
		al3.addAll(al2);
		System.out.println(al3);   //[Telusko, 44, Java, TShapedSkills, 100, 200, 300]
		al3.addAll(2, al1);
		System.out.println(al3);   //[Telusko, 44, 100, Telusko, a, 999.9, TShapedSkills, Java, TShapedSkills, 100, 200, 300]
		al3.add(null);
		System.out.println(al3);   //[Telusko, 44, 100, Telusko, a, 999.9, TShapedSkills, Java, TShapedSkills, 100, 200, 300, null]
		System.out.println("*******************************");
		
		Double d=(Double) al1.get(3);
		System.out.println(al1.indexOf(100));  //0

	}

}
