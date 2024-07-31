package com.telusko.string;

public class Launch5 {

	public static void main(String[] args) {

		String str="Telusko"+ "Alien";//SCP
		System.out.println(str);

		String str1="Telusko";//SCP
		System.out.println(str1.concat("Alien"));//Heap
		//		
		//		String str2="Telusko";
		//		        str2.concat("Java");
		//		        System.out.println(str2);


		String str2="Telusko";//SCP
		str2=str2.concat("Java");//heap
		String str5=str2.concat("Java");//heap
		System.out.println(str2==str5);//false

		String s3="Alien"+ "telusko"+ "Java";//scp
		System.out.println("s3--> "+ s3);
		String s4=str1+str2+s3;//heap
		System.out.println("s4--> "+ s4);
        String s8="Telusko"+"Telusko"+"Java"+"Alien"+"telusko"+"Java";//scp
        System.out.println(s4==s8);//false
        System.out.println(s4.equals(s8));//true
        
		s3.concat(str2);//heap

		String s5="100"+ 4 + 10;
		System.out.println(s5);

		String s6=100+4+"10";
		System.out.println(s6);

		String s="100"+ (4 + 10);
		System.out.println(s);

		//		
		
		

	}

}
