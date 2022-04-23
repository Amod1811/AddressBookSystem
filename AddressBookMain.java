package com.bridgelabzaddressbook;
/*
 * added new contact details in contact book
 * @mod
 */
import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println(".............Welcome to AddressBook Management System...................");
		Address address = new Address();
		address.getmenu();
		address.addContact();
		address.display();
		address.deleteContact();
		
	}
}
