package phonebook;


//PROPERTIES OR ATTRIBUTES
public class Person{

	private String firstName;
	private String lastName;
	private String fullName;
	//protected PhoneNumber[] phoneNumber = {}; ////WORKS OK TOO
	private PhoneNumber[] phoneNumber = {};/////TRY THIS
	//private String phoneNumber;//added this then changed line 35
	Address myAddress; // use this instead which is the Address Class.
	public String setStreetNum; //this is what the system suggested...delete if it doesn't work.
	public String setStreetName;
	public String setCity;
	public String setState;
	public String setZipCode;
	Directory myDirectory;
	
	
	// DEFAULT CONSTRUCTOR
	public Person() {
		super();
	}

	// PARAMETERIZED CONSTRUCTOR
	public Person(String fName, String lName, String streetNum, String streetName, String city, String state, String zipCode, PhoneNumber[] pNumber) {
		this.firstName = fName;
		this.lastName = lName;
		this.setStreetNum=streetNum;
		this.setStreetName=streetName;
		this.setCity=city;
		this.setState=state;
		this.setZipCode=zipCode;
		this.phoneNumber=pNumber;
	}

	// MY toSTRING CODE
	public String toString() {
		return (firstName + " "  + lastName + " " + phoneNumber);
	}	
	
	public Directory getMyDirectory() {
		return myDirectory;
	}

	public void setMyDirectory(Directory myDirectory) {
		this.myDirectory = myDirectory;
	}

	// THE "toString()" METHOD FOR PERSON
	/*public String toString() {
		return ("First Name=" + " " + firstName + " " + "\nLast name=" + " " + lastName);
	} */

	// GETTERS ONLY
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFullName() {
		return fullName;
	}
	public Address getMyAddress() {
		return myAddress;
	}

	public PhoneNumber[] getPhoneNumber() {
		return phoneNumber;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	// SETTERS
	public void setPhoneNumber(PhoneNumber[] phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setMyAddress(Address myAddress) {
		this.myAddress = myAddress;
	}
	//public void setStreetName(Address myAddress) {
		//this.myAddress = myAddress;
	//}

	public void addPhoneNumber(PhoneNumber newPhoneNumber) {
		PhoneNumber[] temp = new PhoneNumber[phoneNumber.length + 1];
		for (int i = 0; i < phoneNumber.length; i++) {
			temp[i] = phoneNumber[i];
			
		}
		temp[temp.length - 1] = newPhoneNumber;
		phoneNumber = temp;
	}

//DENISH ADDED THIS, addAddress- MISSING PIECE
	public void addAddress(String streetNum, String streetName, String city, String state, String zipCode) {
		Address tempAddress = new Address(streetNum, streetName, city, state, zipCode);
		myAddress = tempAddress;
	}

	// DENISH ADDED THIS, "printAddress"
	public void printAddress(String streetNum, String streetName, String city, String state, String zipCode) {
		Address tempAddress = new Address(streetNum, streetName, city, state, zipCode);
		myAddress = tempAddress;
	}

	public void printPerson() {
		System.out.println(getFirstName() + getLastName());
		//myAddress.printAddress();

		for (int i = 0; i < phoneNumber.length; i++) {
			System.out.println("Phone Number: ");
			phoneNumber[i].printPhoneNum(null);
			System.out.println("\n");
		}

	}
	
	
	public void setStreetNum(String next) {
			
	}

	public void getPerson() {
		
	}

	public void addPhoneNumber(String string) {
		// TODO Auto-generated method stub
	}	
	
}
