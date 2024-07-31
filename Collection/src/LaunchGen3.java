import java.util.ArrayList;
import java.util.List;

class Human{
	int age;
	void disp() {
		System.out.println("Humans are best creatures");
	}
}
class Student extends Human{
	
}
class Emp{
	
}
public class LaunchGen3 {

	public static void main(String[] args) {
		
		Human h=new Human();
		Student s=new Student();
		h=s;
	//	s=h //Compile time Error(CE)
		
		ArrayList<Human> hlist=new ArrayList<>();
		ArrayList<Student> slist=new ArrayList<>();
	//	hlist=slist;//CE
		
		ArrayList<?> hlist1=new ArrayList<>();//? --> unknown --> wildcard
		ArrayList<Student> slist1=new ArrayList<>();
		hlist1=slist1;
		
		ArrayList<? extends Human> hslist2=new ArrayList<>(); //upperbound
		ArrayList<Human> hlist2=new ArrayList<>();
		ArrayList<Student> slist2=new ArrayList<>();
		ArrayList<Emp> elist2=new ArrayList<>();
		ArrayList<Object> olist2=new ArrayList<>();
		hslist2=hlist2; //--> human collection
		hslist2=slist2; //--> Student collection
	//	hslist2=elist2; //CE
	//	hslist2=olist2; //CE
		
		ArrayList<? super Human> hslist3=new ArrayList<>(); //lowerbound
		ArrayList<Student> slist3=new ArrayList<>();
		ArrayList<Human> hlist3=new ArrayList<>();
		ArrayList<Emp> elist3=new ArrayList<>();
		ArrayList<Object> olist3=new ArrayList<>();
		
		hslist3=hlist3;//--> Human collection
		hslist3=olist3;//-->Object Collection
	//	hslist3=elist3;//ce
	//	hslist3=slist3;//ce
		
		ArrayList<Human> hlist4=new ArrayList<>();
		hlist4.add(new Human());
		hlist4.add(new Human());
		hlist4.add(new Human());
		invockDisp(hlist4);
		System.out.println("**************************************************");
		ArrayList<Student> slist4=new ArrayList<>();
		slist4.add(new Student());
		slist4.add(new Student());
		slist4.add(new Student());
		
		invockDisp(slist4);

	}
//	public static void invockDisp(List<Human> list)
	public static void invockDisp(List<? extends Human> list)
	{
		for(Human h:list)
		{
			h.disp();
		}
	}

}
