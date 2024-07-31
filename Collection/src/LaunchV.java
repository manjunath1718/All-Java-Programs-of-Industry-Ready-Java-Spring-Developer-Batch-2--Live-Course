import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class LaunchV {

	public static void main(String[] args) {
		Vector v=new Vector();

		v.add(100);
		v.add(50);
		v.add(150);
		v.add(44);

		System.out.println(v); //[100, 50, 150, 44]
		System.out.println("Iterator");
		Iterator itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		System.out.println("Enumeration");
		Enumeration en = v.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}


	}

}
