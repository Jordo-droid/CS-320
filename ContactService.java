package Contact;

import java.util.ArrayList;
import java.util.*;

public class ContactService extends Contact{
	
	//Array List to Collect and Store Contacts
	static List<Contact> contactList = new ArrayList<Contact>();
	
	//Function to add Contact
	public static void addContact(Contact newContact) {
		
		//Iterator to Search Contact List for Entered Id
		Boolean done = false;
		ListIterator<Contact> i = contactList.listIterator();
		//While Loop for Iterator cycling
		while(i.hasNext() && !done) {
			Contact current = i.next();
				//Ends While Loop if Contact Id Matches (Prevents Duplicate Id's)
				if(current.getId() == newContact.getId()) {
					System.out.println("Contact Id Already Exists...");
					done = true;
				}
		}
		//Adds Contact to Contact List if No Duplicates are Found
		if(!done) {
			contactList.add(newContact);
		}
}	
	
	
	//Search Function of Use in Delete and Update Functions
	public static void searchContact(Contact searchContact) {
		//Iterator to Search Contact List
		Boolean found = false;
		Iterator<Contact> i = contactList.iterator();
		//While Loop for Iterator cycling
		while(i.hasNext()) {
			Contact current = i.next();
				//Prints Contact if Found in List
				if(current.getId() == searchContact.getId()) {
					System.out.println("Contact Found: " + current.getId() + " " + current.getFirstName() +
							" " + current.getLastName()+  " " + current.getPhone() +  " " + current.getAddress());
					found = true;
				}
		}
		//Message for Contact Not Found
		if(!found) {
			System.out.println("Contact Not Found...");
		}
	}
	
	
	//Delete Function
	public static void deleteContact(Contact searchContact) {
		//Iterator to Search Contact List
		Boolean found = false;
		Iterator<Contact> i = contactList.iterator();
		//While Loop for Iterator cycling
		while(i.hasNext()) {
			Contact current = i.next();
				//Deletes Contact if Found in List	
				if(current.getId() == searchContact.getId()) {
					i.remove();
					System.out.println("Contact Deleted...");
					found = true;
				}
		}
		//Message for Contact Not Found
		if(!found) {
			System.out.println("Contact Not Found...");
		}
	}
	
	
	//Update Function
	public static void updateContact(Contact searchContact, Contact updatedContact) {
		//Iterator to Search Contact List
		Boolean found = false;
		ListIterator<Contact> li = contactList.listIterator();
		//While Loop for Iterator cycling
		while(li.hasNext()) {
			Contact current = li.next();
				//Updates Contact if Found in List
				if(current.getId() == searchContact.getId()) {	
					li.set(new Contact(searchContact.getId(), updatedContact.getFirstName(), updatedContact.getLastName(), 
							updatedContact.getPhone(), updatedContact.getAddress()));
					//Prints Updated Contact Information
					System.out.println("Contact Updated to Successfully!");
					found = true;
				}
		}
		//Message for Contact Not Found
		if(!found) {
			System.out.println("Contact Not Found...");
		}
	}
}

