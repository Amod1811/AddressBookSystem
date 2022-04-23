package com.bridgelabzaddressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Address book controller program
 */
public class Address {
	Contact contact;
	Scanner sc = new  Scanner(System.in);
	//method for add the new contact
		public void addContact() {
			//contact = new Contact();
			System.out.println("Enter the first name");
			String firstName = sc.next();
			System.out.println("Enter the last name");
			String lastName = sc.next();
			System.out.println("Enter the phone no");
			String PhoneNo = sc.next();
			System.out.println("Enter the city");
			String City = sc.next();
			System.out.println("Enter the state");
			String State = sc.next();
			contact.setFirstName(firstName);
			contact.setLastName(lastName);
			contact.setPhoneNumber(PhoneNo);
			contact.setCity(City);
			contact.setState(State);
			System.out.println(contact);
			}
			public void display() {
				String str = contact.getFirstName();
				System.out.println("Str =" + str);
}
}

