//import java.sql.Date;

import java.util.Date;

public class LaunchDate1 {

	public static void main(String[] args) {
		//Date --> util , sql package

		//Java 8 --> joda.org  --> joda api --> new date time api --> time package

		Date datetime=new Date();
		System.out.println(datetime);// Date class of util package would return Current Date Time and zone
		
		int year=datetime.getYear();
		System.out.println(year);
		long timeinMs=datetime.getTime();
		System.out.println(timeinMs);

	/*
	 * we can't able to create object without passing arguments bcz 
	 * we don't have zero parameter constructor in Date class of sql package
	 */
//		long timeinMs=1716729140821L;
//		Date date=new Date(124,5,21);//Date class of sql package
//		Date date=new Date(timeinMs);//Date class of sql package
//		System.out.println(date);// It would return only Date
		
	}

}
