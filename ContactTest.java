package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Contact.Contact;

class ContactTest {

	//Test for Basic Contact Construction
	@Test
	void testContactClass() {
		Contact testContact = new Contact("2001", "Harry", "Potter", "5554142323", "184 Diagon Alley");
		assertTrue(testContact.getId().equals("2001"));
		assertTrue(testContact.getFirstName().equals("Harry"));
		assertTrue(testContact.getLastName().equals("Potter"));
		assertTrue(testContact.getPhone().equals("5554142323"));
		assertTrue(testContact.getAddress().equals("184 Diagon Alley"));
	}
	
	//Test for Invalid Id Input
	@Test
	void testContactClassIdInvalid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("test0111111", "TestNameF", "TestNameL", "1234567890", "Test Address 1 East");
		});
	}
	
	//Test for Invalid First Name Input
	@Test
	void testContactClassFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("test02", "VeryLongFirstName", "TestNameL", "1234567890", "Test Address 1 East");
		});
	}
	
	//Test for Invalid Last Name Input
	@Test
	void testContactClassLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("test03", "TestNameF", "VeryLongLastName", "1234567890", "Test Address 1 East");
		});
	}
	
	//Test for Invalid Phone Input
	@Test
	void testContactClassPhoneInvalid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("test04", "TestNameF", "TestNameL", "12345678901", "Test Address 1 East");
		});
	}
	
	//Test for Invalid Address Input
	@Test
	void testContactClassAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("test05", "TestNameF", "TestNameL", "1234567890", "5754 Test Address Long East Lane");
		});
	}

}
