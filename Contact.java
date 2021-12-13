package Contact;


public class Contact{
	//Variables for Use
	protected String id;
	protected String firstName;
	protected String lastName;
	protected String phone;
	protected String address;
	
	//Default Constructor
	public Contact() {
		id = "No Id";
		firstName = "No Name";
		lastName = "No Name";
		phone = "No Phone";
		address = "No Address";
		
	}
	
	//Constructor
	public Contact(String id, String firstName, String lastName, String phone, String address) {
		//If statements to throw exceptions for invalid parameter inputs
		if(id == null || id.length()>10) {
			throw new IllegalArgumentException("Invalid id");
		}
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		if(phone == null || phone.length()!=10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		if(id == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;	
		
	}

		//Accessors
		public String getId() {
			return id;
		}
		public String getFirstName() {
			return firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public String getPhone() {
			return phone;
		}
		public String getAddress() {
			return address;
		}
		
		
}

