package com.telusko.twodarray;

import java.util.Scanner;

public class Regular3Darray {

	public static void main(String[] args) {
		Scanner sc=new java.util.Scanner(System.in);
		int [][][]arr=new int[3][2][4];//regular array
		System.out.println("Enter array Element");
		for(int k=0;k<arr.length;k++) {
		  for(int i=0;i<arr[k].length;i++) {
			for(int j=0;j<arr[k][i].length;j++) {
				System.out.println("Enter "+k+" School "+i+" class "+j+" student marks");
				arr[k][i][j]=sc.nextInt();
			}
		  }
		}
		System.out.println("Display array Element");
		for(int k=0;k<arr.length;k++) {
			System.out.print("[");
			  for(int i=0;i<arr[k].length;i++) {
				  System.out.print("(");
				for(int j=0;j<arr[k][i].length;j++) {
					System.out.print(arr[k][i][j]+" ");				
				}
				System.out.print(")");
			  }
			  System.out.println("]");
			}
	}

}
