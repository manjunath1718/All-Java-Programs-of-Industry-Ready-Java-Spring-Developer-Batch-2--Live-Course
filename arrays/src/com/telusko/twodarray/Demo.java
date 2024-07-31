package com.telusko.twodarray;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		int[] arr=new int[] {4,5,6 };

		System.out.println(arr[1]);
	//	arr[2].
		String[] strarr=new String[] {"aaa","bbb","ccc" };

		System.out.println(strarr[1]);
		System.out.println(strarr[1].hashCode());
		
		long[] lngarr=new long[] {444444444,55555555,66666666 };
		System.out.println(lngarr);
		Integer i=10;
		
		int[] arr2=new int[] {4,5,6 };
		System.out.println(Arrays.compare(arr, arr2));//0
	}

}
