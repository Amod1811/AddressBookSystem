package bl.com.addressbookprogram;
/*
call the option method
 */
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    Contact contact;
    ArrayList<Contact> contactArrayList = new ArrayList<Contact>();
// To take choice of operation
    public void getusermenu(AddressBook Addressbook) {
        System.out.println("Menu of Address Book");
        boolean check = false;
        do {
            System.out.println("Menu of Address Book Operation:");
            System.out.println("Enter Your Choice \n 1.Add Contact \n 2.Edit Contact \n 3.Delete Contact \n 5.Display \n 5.Exit");
            String option = sc.next();
            System.out.println();
            switch (option) {
                case "1":
                    addContact();
                    break;
                case "2":
                    editContact();
                    break;
                case "3":
                    deleteContact();
                    break;
                case "4":
                    displayContact();
                    break;
                case "5":
                    check = true;
                    System.out.println("Thank You");
                    break;
                default:
                    System.out.println("Please enter a valid option");
                    break;
            }
            System.out.println("...............");
        } while (!check);

    }

    //Taking input from console to add contact in address book
    public void addContact() {
        System.out.println("Enter the  first name :");
        String firstName = this.sc.next();
        System.out.println("Enter the last name :");
        String lastName = this.sc.next();
        System.out.println("Enter the Address");
        String address = this.sc.next();
        System.out.println("Enter the City name");
        String city = this.sc.next();
        System.out.println("Enter the state");
        String state = sc.next();
        System.out.println("Enter the Pincode:");
        String pincode = sc.next();
        System.out.println("Enter the mobile Number:");
        String mobileNumber = sc.next();
        System.out.println("Enter email id :");
        String emailId = this.sc.next();

        contactArrayList.add(new Contact(firstName, lastName, address, city, state, pincode, mobileNumber, emailId));
        System.out.println();
        System.out.println(contactArrayList);
        System.out.println();
        System.out.println("contact added successfully");
        System.out.println();


    }

    //method to display contact
    public void displayContact() {
        System.out.println("Number of Contacts:" + contactArrayList.size());
        if (contactArrayList.isEmpty()) {
            System.out.println("There is no Contact");
        } else {
            for (int i = 0; i < contactArrayList.size(); i++) {
                System.out.println(contactArrayList.get(i));
                System.out.println();
            }
        }
    }

    //method for edit the contact
    public void editContact() {
        System.out.println("Enter the first contact name to edit  contact ");
        String editName = sc.next();
        if (contactArrayList.isEmpty()) {
            System.out.println("Contact list is Empty");
        } else {
            for (int i = 0; i < contactArrayList.size(); i++) {
                String name = contactArrayList.get(i).getFirstName();

                if (name.equalsIgnoreCase(editName)) {
                    System.out.println("Enter the  first name :");
                    String firstName = this.sc.next();
                    System.out.println("Enter the last name :");
                    String lastName = this.sc.next();
                    System.out.println("Enter the Address");
                    String address = this.sc.next();
                    System.out.println("Enter the City name");
                    String city = this.sc.next();
                    System.out.println("Enter the state");
                    String state = sc.next();
                    System.out.println("Enter the Pincode:");
                    String pincode = sc.next();
                    System.out.println("Enter the mobile Number:");
                    String mobileNumber = sc.next();
                    System.out.println("Enter email id :");
                    String emailId = this.sc.next();

                    System.out.println();
                    System.out.println(contactArrayList.get(i));
                    System.out.println("Contact Edited Successfully");
                    System.out.println();
                } else {
                    System.out.println("Invalid first name");
                    System.out.println("Please Enter valid first name");
                    System.out.println();
                }
            }
        }
    }

    //method for delete the contact
    public void deleteContact() {
        System.out.println("Enter the first name for contact");
        String deleteName = sc.next();

        if (contactArrayList.isEmpty()) {
            System.out.println("Contact List is Empty");
        } else {
            for (int i = 0; i < contactArrayList.size(); i++) {
                String name = contactArrayList.get(i).getFirstName();
                if (deleteName.equalsIgnoreCase(name)) {
                    contactArrayList.remove(i);
                    System.out.println("Contact deleted Successfully");
                    System.out.println();
                    System.out.println("Updated contact successfully");
                    System.out.println(contactArrayList);
                } else {
                    System.out.println("Invalid first Name");
                    System.out.println("Please Enter valid first name");
                }
            }
        }
    }
}