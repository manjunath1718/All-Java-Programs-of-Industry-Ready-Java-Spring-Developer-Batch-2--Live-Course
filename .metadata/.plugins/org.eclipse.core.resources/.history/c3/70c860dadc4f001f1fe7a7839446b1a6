import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LaunchItr1 {

	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		list.add(100);
		list.add(50);
		list.add(150);
		list.add(25);
		list.add(125);
		
		System.out.println(list);
	//	Integer i=(Integer) list.get(2);
//		for(int i=0;i<list.size();i++)
//		{
//			Integer data=(Integer) list.get(i);
//			System.out.println(data);
//		}
		
//		for(Object i:list)
//		{
//			System.out.println(i);
//		}
		
		Iterator itr=list.iterator();
		//System.out.println(itr.next());
		while(itr.hasNext())
		{
			//System.out.println(itr.next());
			Integer data=(Integer) itr.next();
			System.out.println(data);
		}
		System.out.println("***************");
		
		ListIterator litr1 = list.listIterator(list.size());
		
		while(litr1.hasPrevious())
		{
			System.out.println(litr1.previous());
		}
		System.out.println("*********************************");
		
		ListIterator litr2 = list.listIterator(list.size()/2);
		
//		while(litr2.hasPrevious())
//		{
//			System.out.println(litr2.previous());
//		}
		while(litr2.hasNext())
		{
			System.out.println(litr2.next());
		}
		

	}

}
