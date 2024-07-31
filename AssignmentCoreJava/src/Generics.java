import java.util.ArrayList;
import java.util.List;

class CustomeList<T>{
	
    List<T> list ;
    
	public CustomeList(List<T> list) {
		
		this.list = list;
	}
	public  void add(T ref) {
		
		list.add(ref);
		System.out.println("data Added to List");
	}
	public void get(int index) {

		System.out.println(list.get(index));
	}
	public void display() {
        list.forEach(s->System.out.println(s));
	}

}
public class Generics {

	public static void main(String[] args) {
		CustomeList<String> cL=new CustomeList<String>(new ArrayList<String>());

		cL.add("Java");
		cL.add("Golang");
		cL.add("Python");
		System.out.println("*************************");
		
		cL.get(2);
		System.out.println("*************************");
		
		cL.display();



	}

}
