package com.telusko.twodarray;

import java.util.Scanner;

public class Regular2DArr {

	// In java Array is treated as object
	public static void main(String[] args) {
		Scanner sc=new java.util.Scanner(System.in);
		int [][]arr=new int[3][2];//regular array
		System.out.println("Enter array Element");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter "+i+" class "+j+" student marks");
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Display array Element");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
