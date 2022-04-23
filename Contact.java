package com.bridgelabzaddressbook;

public class Contact {
	public String firstName;
    public String lastName ;
    public String phoneNumber; 
    public String city ;
    public String state ;
    
    
    public Contact(String firstName, String lastName, String phoneNumber, String city, String state) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.city = city;
		this.state = state;
	}


//	public Contact() {
//    	this.firstName = firstName;
//    	this.lastName = lastName;
//    	this.phoneNumber = phoneNumber;
//    	this.city = city;
//    	this.state = state;
//    }
//    
    
    @Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber
				 + ", city=" + city + ", state=" + state + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
	

}
