package com.telusko.javafundamentals;

import java.util.ArrayList;

public class SmallestArr {
	
	public static void main(String[] args) {
		
		int smallestNo;
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(3);
		list.add(8);
		list.add(2);
		list.add(9);
		
		
		smallestNo=list.get(0);
		
		for(int i=0;i<list.size();i++) {
			
			if(list.get(i)<smallestNo) {
				smallestNo=list.get(i);
			}
		}
		
		System.out.println("smallest no in arraylist "+smallestNo);
	}

}
