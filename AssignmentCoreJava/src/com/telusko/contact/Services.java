package com.telusko.contact;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashMap;

import java.util.Scanner;

public class Services {

	HashMap<Long,ContactInfo> hm=new HashMap<Long,ContactInfo>();
	Scanner sc=new Scanner(System.in);
	Collection<ContactInfo> list;
	public void addContacts() {

		System.out.println("Enter Name");
		String name=sc.next();
		System.out.println("Enter Phone Number");
		long no=sc.nextLong();
		System.out.println("Enter Email Id");
		String email = sc.next();

		hm.put(no, new ContactInfo(name, no, email));

		System.out.println("Contact saved successful!");
	}
	public void retrieveDetailsByName() {

		System.out.println("Enter Name of contact to get details");
		String name=sc.next();

		list = hm.values();

		for(ContactInfo c:list) {
			if(c.getName().equalsIgnoreCase(name)) {
				System.out.println(c);
			}
		}
	}

	public void removeContacts() {
		try {
			System.out.println("Enter Name  of contact to Remove");
			String name=sc.next();

			list = hm.values();


			for(ContactInfo c:list) {
				if(c.getName().equalsIgnoreCase(name)) {
					hm.remove(c.getPhoneNo());
				}
			}

			System.out.println("Contact deleted successful!");

		}catch(ConcurrentModificationException  e) {
			e.printStackTrace();
		}
	}

}
