package com.telusko.StrstegyDesignPattern;

import com.telusko.Service.BlueDart;
import com.telusko.Service.DHL;
import com.telusko.target.FlipKart;

public class LaunchApp {

	public static void main(String[] args) {
		
		FlipKart fk=new FlipKart();//target object
// target class means which class using services of other classes		
		fk.setService(new BlueDart());//dependent object
//dependent object means whichever classes services are being used that class object is called dependent object
		boolean status=fk.intiateDelivery(5000);
		if(status) {
			System.out.println("Product Delivered");
		}
		else {
			System.out.println("Product not Delivered");
		}
		
	}

}
