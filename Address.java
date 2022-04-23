package com.bridgelabzaddressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Address book controller program
 */
public class Address {
	Contact contact;
	Scanner sc = new Scanner(System.in);
			
			public void getmenu() {
				Scanner sc = new Scanner(System.in);
				 System.out.println("menu of AddressBook");
				 boolean Check = false;
				 do {
					 System.out.println("Enter your choice\n 1.Add Contact\n 2.Edit contact\n 3.display\n 4.Exit");
					 int option = sc.nextInt();
					 switch(option) {
					 case 1 : addContact();
					 System.out.println("Contact added successfully");
					 break;
					 case 2 : editContact();
					 System.out.println("Contact edit successfully");
					 break;
					 case 3 : display();
					 break;
					 case 4 : Check =true;
					 default : System.out.println("Please a choose valid option");
					 break;
					 }
				 System.out.println("==========================");
				 }
				 while(!Check);
			 }


			
			 public void addContact() {
			        contact = new  Contact();

			        System.out.println("Enter the first name : ");
			        String firstName = this.sc.nextLine();
			        System.out.println("Enter the last name : ");
			        String lastName = this.sc.nextLine();
			        System.out.println("Enter the address : ");
			        String address = this.sc.nextLine();
			        System.out.println("Enter the city : ");
			        String city = this.sc.nextLine();
			        System.out.println("Enter the state : ");
			        String state = this.sc.nextLine();
			        System.out.println("Enter the phoneNumber : ");
			        String phoneNumber = this.sc.nextLine();
			        System.out.println("Enter Email id : ");
			        String email = this.sc.nextLine();

			        contact.setFirstName(firstName);
			        contact.setLastName(lastName);
			        contact.setCity(city);
			        contact.setState(state);
			        contact.setPhoneNumber(phoneNumber);
			        contact.setEmail(email);
			        System.out.println(contact);
			        System.out.println();
			    }
			 
			 public void display() {
			        String firstName1 = contact.getFirstName();
			        System.out.println("First Name : " + firstName1);
			        String lastName1 = contact.getLastName();
			        System.out.println("Last Name : " + lastName1);
			        String city1 = contact.getCity();
			        System.out.println("City : " + city1);
			        String state1 = contact.getState();
			        System.out.println("State : " + state1);
			        String phoneNumber1 = contact.getPhoneNumber();
			        System.out.println("PhoneNumber :" + phoneNumber1);
			        String email1 = contact.getEmail();
			        System.out.println("Email :" + email1);
			        System.out.println();
			 }

			        
			 public void editContact() {
			        System.out.println("Please Enter original first name to edit : ");
			        String editName = sc.nextLine();

			        if (editName.equalsIgnoreCase(contact.getFirstName())) {
			            addContact();
			        } else {
			            System.out.println("Invalid first name");
			            System.out.println("Please Enter valid first name");
			            System.out.println();
			            editContact();
			        }
			    }
			 
			 
			
}

