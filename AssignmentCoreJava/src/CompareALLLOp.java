

import java.util.ArrayList;
import java.util.LinkedList;

public class CompareALLLOp {

	public static void main(String[] args) {
		ArrayList<Integer> alist=new  ArrayList<>();
		long addTimeofAl = System.nanoTime();
		alist.add(2);
		alist.add(44);
		alist.add(88);
		alist.add(66);
		long printTimeofAl=System.nanoTime();
		for(int i=2;i<alist.size();i++) {
			alist.get(i);
		}
	
		long removeTimeofAl=System.nanoTime();
		alist.remove(1);
		alist.remove(2);
		long finishTimeOfAl=System.nanoTime();
		
		LinkedList<Integer> llist=new LinkedList<>();
		long addTimeofLl = System.nanoTime();
		llist.add(2);
		llist.add(44);
		llist.add(88);
		llist.add(66);
		long printTimeofLl=System.nanoTime();
		for(int i=2;i<llist.size();i++) {
			llist.get(i);
		}	
		
		long removeTimeofLl=System.nanoTime();
		llist.remove(1);
		llist.remove(2);
		long finishTimeOfLl=System.nanoTime();
		
		System.out.println("Time Taken by Arraylist to add data "+ (printTimeofAl-addTimeofAl));
		System.out.println("Time Taken by LinkedList to add data "+(printTimeofLl-addTimeofLl));
		
		System.out.println("Time Taken by Arraylist to Retrieve data "+ (removeTimeofAl-printTimeofAl));
		System.out.println("Time Taken by LinkedList to Retrieve data "+ (removeTimeofLl-printTimeofLl));
		
		System.out.println("Time Taken by Arraylist to Remove data "+ (finishTimeOfAl-removeTimeofAl));
		System.out.println("Time Taken by LinkedList to Remove data "+ (finishTimeOfLl-removeTimeofLl));
		
		
	}

}
