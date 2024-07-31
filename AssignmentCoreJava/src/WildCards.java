
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class WildCards {
	
	public static  void display(List<?> l) {
		for(Object list:l) {
			System.out.println(list);
		}
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> alist=new  ArrayList<>();
		alist.add(2);
		alist.add(44);
		alist.add(88);
		alist.add(66);
		display(alist);
		System.out.println("*************");
		
		ArrayList<Double> list=new  ArrayList<>();
		list.add(2.2);
		list.add(44.2);
		list.add(88.0);
		list.add(66.6);
		display(list);
		System.out.println("*************");
		
		LinkedList<String> llist=new LinkedList<>();
		llist.add("sql");
		llist.add("java");
		llist.add("hibernate");
		llist.add("SpringBoot");
		display(llist);

	}

}
