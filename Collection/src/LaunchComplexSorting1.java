import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;

class Cricketer {
	
	Integer id;
	String name;
	Double average;
	public Cricketer(Integer id, String name, Double average) {
		super();
		this.id = id;
		this.name = name;
		this.average = average;
	}
	@Override
	public String toString() {
		return "Cricketer [id=" + id + ", name=" + name + ", average=" + average + "]";
	}

}
class Alpha implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {

		if(((Cricketer)(o1)).average>((Cricketer)(o2)).average){
			return 1;
		}
		else{
			return -1;
		}

	}

}
//class Alpha implements Comparator<Cricketer>{
//
//	@Override
//	public int compare(Cricketer o1, Cricketer o2) {
//
//		if(o1.average>o2.average){
//			return 1;
//		}
//		else{
//			return -1;
//		}
//
//	}
//
//	
//
//}
public class LaunchComplexSorting1 {

	public static void main(String[] args) {
		ArrayList<Cricketer> alist=new ArrayList<>();
		alist.add(new Cricketer(18,"virat", 88.18));
		alist.add(new Cricketer(45,"rohit", 68.48));
		alist.add(new Cricketer(7,"dhoni", 78.78));

		//	Collections.sort(alist); Complile time Error

				System.out.println(alist);
				Alpha a=new Alpha();
				Collections.sort(alist,a);//sort arraylist based on average
				Collections.sort(alist,a.reversed());//sort in reverse order
				System.out.println(alist);
				
//				Consumer con=(Object c)->{
//					System.out.println(c);
//				};
//				alist.forEach(con);
				alist.forEach(s->System.out.println(s));

				
		//		Comparator c=new Comparator(){
		//
		//			@Override
		//			public int compare(Object o1, Object o2) {
		//				
		//				if(((Cricketer)(o1)).average>((Cricketer)(o2)).average)
		//				{
		//					return 1;
		//				}
		//				else
		//				{
		//					return -1;
		//				}
		//				
		//			}
		//		};
		//		System.out.println(alist);
		//		Collections.sort(alist, c);
		//		System.out.println(alist);

		//		Comparator l=(Object o1, Object o2)->{
		//			if(((Cricketer)(o1)).average>((Cricketer)(o2)).average)
		//			{
		//				return 1;
		//			}
		//			else
		//			{
		//				return -1;
		//			}
		//		};
		//		System.out.println(alist);
		//		Collections.sort(alist, l);
		//		System.out.println(alist);

//		Collections.sort(alist, (o1, o2)->{
//			if(((Cricketer)(o1)).average>((Cricketer)(o2)).average)
//			{
//				return 1;
//			}
//			else
//			{
//				return -1;
//			}
//
//		});
//		System.out.println(alist);
		
//		Collections.sort(alist, (o1, o2)-> (int)o1.average.compareTo(o2.average));			
//		System.out.println(alist);


		

	}

}
