import java.util.ArrayList;

class Employee
{
	int id;
	String name;
	int age;
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}


}
public class LaunchGenerics {

	public static void main(String[] args) {
		//typesafety
		int ar[]=new int[3];
		ar[0]=10;
		ar[1]=44;
		//ar[2]="Alien";

		int data=ar[1];

		//typesafety
		String s[]=new String[3];
		s[0]="Telusko";
		s[1]="Alien";
		s[2]="TShapedSkills";

		String info=s[0];


		//No TypeSafety
		ArrayList al=new ArrayList();

		al.add("Telusko");
		al.add("TShaped Skills");
		al.add("Java");
		al.add(44);

		String s1=(String) al.get(0);
		s1=s1.toLowerCase();
		System.out.println(s1);

		String s2=(String) al.get(1);
		s2=s2.toLowerCase();
		System.out.println(s2);

		String s3=(String) al.get(2);
		s3=s3.toLowerCase();
		System.out.println(s3);

//	    String s4=(String) al.get(3);
//		s4=s4.toLowerCase();
//		System.out.println(s4);
		System.out.println("***************************");

		//Type Safety
		ArrayList<String> list=new ArrayList<>();
		list.add("Java");
		list.add("Spring");
		list.add("Hibernate");
		//list.add(44);

		String str=list.get(0);
		System.out.println(str);
		String str2=list.get(1);
		System.out.println(str2);
		String str3=list.get(2);
		System.out.println(str3);


		ArrayList<Employee> employeeList=new ArrayList<>();

		employeeList.add(new Employee(1, "Rohan", 18));

		Employee e2=new Employee(2, "Rohit", 18);
		employeeList.add(e2);

		//	employeeList.add(44);
		System.out.println(employeeList);

		//	ArrayList<int> ls=new ArrayList<>();//primitive is not allowed

		//	ArrayList<Object> ls=new ArrayList<String>();

		ArrayList<Integer> ls=new ArrayList<>();

		



	}

}
