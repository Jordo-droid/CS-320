package Test;

import org.junit.jupiter.api.Test;

import Contact.Contact;
import Contact.ContactService;

class ContactServiceTest {

	@Test
	void testAddContact() {
		//Call Constructor
		Contact contactServiceTest = new Contact("00002", "Original", "Test", "8004567891", "445 Contact Service Lane NW");
		Contact contactServiceTest2 = new Contact("00002", "Duplicate", "Test", "8004567891", "223 Contact Service Lane NW");
		
		ContactService.addContact(contactServiceTest);
		
		//Test System to Ensure No Duplicate ID's can Exist
		ContactService.addContact(contactServiceTest2);
		ContactService.searchContact(contactServiceTest);	
	}
	
	@Test
	void testSearchContact() {
		//Call Class Constructors
		Contact contactSearchTest1 = new Contact("001", "Not", "Here", "4049474135", "5454 Not Here Street");
		Contact contactSearchTest2 = new Contact("002", "Try", "Again", "8885552121", "1214 Try Again Lane");
		Contact contactSearchTest3 = new Contact("004", "Once", "More", "9876543322", "9846 Wrong House Road");
		Contact contactSearchTest4 = new Contact("005", "Search", "Test", "2528084422", "354 Contact Lives Here Drive");
		
		//Add Information to populate Contact List
		ContactService.addContact(contactSearchTest1);
		ContactService.addContact(contactSearchTest2);
		ContactService.addContact(contactSearchTest3);
		ContactService.addContact(contactSearchTest4);
		
		ContactService.searchContact(contactSearchTest4);
	}
	
	@Test
	void testDeleteContact() {
		//Call Class Constructors
		Contact contactDeleteTest1 = new Contact("006", "Not", "Me", "4049474135", "123 Don't Delete Me Street");
		Contact contactDeleteTest2 = new Contact("007", "Nor", "I", "7874651234", "4651 Not Me Either Lane");
		Contact contactDeleteTest3 = new Contact("008", "Wrong", "Guy", "9995651212", "1134 Wrong Choice Road");
		Contact contactDeleteTest4 = new Contact("009", "Remove", "This", "8005554422", "569 Delete Me Please Drive");
				
		//Add Information to populate Contact List
		ContactService.addContact(contactDeleteTest1);
		ContactService.addContact(contactDeleteTest2);
		ContactService.addContact(contactDeleteTest3);
		ContactService.addContact(contactDeleteTest4);
		
		//Delete Contact Function Call
		ContactService.deleteContact(contactDeleteTest4);
		//Search to Double Checking Contact is Deleted
		ContactService.searchContact(contactDeleteTest4);
	
	}

	
	@Test
	void testUpdateContact() {
		//Call Class Constructors
		Contact contactUpdateTest1 = new Contact("010", "Don't", "Update", "4445557891", "2323 Don't Update Me Street SW");
		Contact contactUpdateTest2 = new Contact("012", "I'm", "Fine", "3332221234", "4545 Nor I Lane SW");
		Contact contactUpdateTest3 = new Contact("014", "Next", "Contact", "2124045566", "333 Don't Stop On Me Street SE");
		Contact contactUpdateTest4 = new Contact("025", "Needs", "Updating", "3334445678", "111 Update Me Please Lane NW");
		
		Contact contactUpdate = new Contact("25", "Updated", "Info", "8082561213", "9137 Updated Contact Blvd");
						
		//Add Information to populate Contact List
		ContactService.addContact(contactUpdateTest1);
		ContactService.addContact(contactUpdateTest2);
		ContactService.addContact(contactUpdateTest3);
		ContactService.addContact(contactUpdateTest4);
		
		//Update Contact Function Call
		ContactService.updateContact(contactUpdateTest4, contactUpdate);
		//Search to Double Check Contact is Updated
		ContactService.searchContact(contactUpdateTest4);
		
	}
}

