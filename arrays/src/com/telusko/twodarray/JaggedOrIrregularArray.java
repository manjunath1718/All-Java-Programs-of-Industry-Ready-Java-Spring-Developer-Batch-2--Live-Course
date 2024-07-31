package com.telusko.twodarray;

import java.util.Scanner;

public class JaggedOrIrregularArray {

	public static void main(String[] args) {
		Scanner sc=new java.util.Scanner(System.in);
		int [][]arr=new int[3][];//Irregular array OR Jagged Array
		arr[0]=new int[2];
		arr[1]=new int[3];
		arr[2]=new int[4];
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
