import java.util.ArrayList;
import java.util.Iterator;

public class LaunchFF {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(100);
		list.add(50);
		list.add(150);
		list.add(25);
		list.add(125);
		
		System.out.println(list);
		
		for(Object i:list){
			Integer data=(Integer)i;
			System.out.println(data);
			list.add(44);// if we try to modify ArrayList it will lead to ConcurrentModificationException
		}//Fail Fast 
		
//		for(int i=0;i<list.size();i++)
//		{
//			Integer data=(Integer) list.get(i);
//			System.out.println(data);
//			list.add(44);
//		}
		
//		Iterator itr = list.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//			list.add(44);// if we try to modify ArrayList it will lead to ConcurrentModificationException
//		}//Fail Fast 


	}

}
