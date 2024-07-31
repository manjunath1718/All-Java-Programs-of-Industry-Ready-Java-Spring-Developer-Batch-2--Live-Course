package com.telusko.twodarray;

public class CloningArr {

	public static void main(String[] args) {
		int arr[]=new int[2];
		arr[0]=1;
		arr[1]=2;
		
		int arr1[]=new int[arr.length];
		arr1=arr.clone();

		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		

	}

}
