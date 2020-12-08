
package phonebook;
import java.util.Scanner;

//import inheritance.Book;


public class Application {

	public static void main(String[] args) {
		
		//For the BOOK Class
		Person person = new Person();
		Person p1 = new Person();
		p1.setFirstName("Tori");
		p1.setLastName("Donaldson");
		p1.setFullName("Tori Donaldson");
		p1.addAddress("7777", "Grand", "Kirkwood", "Missouri", "63122");
		p1.addPhoneNumber("3145550202");////////????????????????????????????????????????
		System.out.println(p1.toString());
		
		//////////////////////////////////////////////////////////////////////////////////////
		Person p2 = new Person();
		p2.setFirstName("Sheila");
		p2.setLastName("Baker");
		p2.setFullName("Sheila Baker");
		p2.addAddress("1111", "Tucker", "Maplewood", "Missouri", "63140");
		p2.addPhoneNumber("3145550101");
		System.out.println(p2.toString());

		////////////////////////////////////////////////////////////////////////////////////////
		
		Person p3 = new Person();
		p3.setFirstName("Derrick");
		p3.setLastName("Smith");
		p3.setFullName("Derrick Smith");
		p3.addAddress("2222", "Crosby", "Brentwood", "Missouri", "63143");
		p3.addPhoneNumber("3145550303");
		System.out.println(p3.toString());

		Person p4 = new Person();
		p4.setFirstName("Tori");
		p4.setLastName("Jackson");
		p4.setFullName("Tori Jackson");
		p4.addAddress("8888", "Lafayette", "Greendale", "Missouri", "63121");
		p4.addPhoneNumber("3145550202");////////????????????????????????????????????????
		System.out.println(p4.toString());
		System.out.println("*********************************************************TESTING toString output*************\n");

				
		try (Scanner in = new Scanner(System.in)) {

			int k = 0;
			System.out.println("Please choose an option below:\n");
			System.out.println("(1) - Add a record:  ");
			System.out.println("(2) - Search by First Name: ");
			System.out.println("(3) - Search by Last Name: ");
			System.out.println("(4) - Search by Full Name: ");
			System.out.println("(5) - Search by City: ");
			System.out.println("(6) - Search by State: ");
			System.out.println("(7) - Search by Phone Number: ");
			System.out.println("(8) - Delete a record by Phone Number: ");
			System.out.println("(9) - Update a record by Phone Number: ");
			System.out.println("(10) - Show records in Ascending order: ");
			System.out.println("(11) - To Exit, type the word exit: ");
		
			
			System.out.print("\n\nPlease enter your selection: ");
			k = in.nextInt();
			System.out.println();

			switch (k) {
			case 1:
				////////////////////////////////////////////////////// Scan in Person properties
				Person tempPerson = new Person();
				System.out.println("Enter a First Name: ");
				tempPerson.setFirstName(in.next());
				System.out.println("Enter a Last Name: ");
				tempPerson.setLastName(in.next());
				/////////////////////////////////////////////////////// Scan in Address
				Scanner in1 = new Scanner(System.in);
				Address tempAddress = new Address();
				System.out.println("Enter the Street Number: ");
				tempAddress.setStreetNum(in1.next());
				System.out.println("Enter the Street Name: ");
				tempAddress.setStreetName(in1.next());
				System.out.println("\nEnter the City: ");
				tempAddress.setCity(in1.next());
				/////////////////////////////////////////////////////// Change scanner to "in2"
				Scanner in2 = new Scanner(System.in);
				System.out.println("\nEnter the State: ");
				tempAddress.setState(in2.next());
				System.out.println("\nEnter the Zip Code: ");
				tempAddress.setZipCode(in2.next());
				///////////////////////////////////////////////////////// 
				Scanner scan = new Scanner(System.in);
				PhoneNumber tempPhone = new PhoneNumber();
				System.out.println("Enter your Phone Number: ");
				tempPhone.setPhoneNumber(scan.next());// )= in.next();
				///////////////////////////////////////////////////////// Print Person, Phone#,
				System.out.println(tempPerson.toString());
				System.out.println(tempAddress.toString());
				System.out.println(tempPhone.toString());
				///////////////////////////////////////////////////////// Close the scanners
				in.close();
				in1.close();
				in2.close();
				scan.close();
				//////////////////////////////////////////////////////////

				break;
			
			case 2:
				////////////////////////////////////////////////////////////////DON'T UNDERSTAND HOW TO CALL "searchByFirstName" from DIRECTORY, here.
				Scanner scan2 = new Scanner(System.in);
				Person tempSearchFName = new Person();
				Directory dListing = new Directory(tempSearchFName);
				System.out.println("\nEnter a First Name: ");
				tempSearchFName.setFirstName(scan2.next());
				//call the directory method
				
				dListing.searchByFirstName(null);
				//tempSearchFName.printPerson();
				dListing.printPerson();
			    System.out.println("Original entry: " + tempSearchFName.toString()); 

				scan2.close();
				break;
				//tempSearchFName.equals(dListing) ; // )= in.next();
				////////Directory.searchByFirstName(tempSearchFName.setFirstName(firstName););
				//Person.class.getClass(Directory.searchByFirstName(tempSearchFName));
				
							
			case 3://Search by Last Name
				Scanner scan3 = new Scanner(System.in);
				Person tempSearchFName2 = new Person();
				Directory dListing2 = new Directory(tempSearchFName2);
				System.out.println("\nEnter a Last Name: ");
				tempSearchFName2.setLastName(scan3.next());
				//call the directory method
				
				//dListing2.searchByLastName(null);
				//tempSearchFName.printPerson();
				dListing2.printPerson();
				
				scan3.close();
				break;
								
				
			case 4://Search by Full Name
								
				
				
			case 5://Search by City		
				
				
			case 6://Search by State
				
				
			
			case 7://Search by Phone Number
				
				
			
			case 8://Delete 
				Scanner scan8 = new Scanner(System.in);
				Person tempSearchFName7 = new Person();
				Directory dListing7 = new Directory(tempSearchFName7);
				System.out.println("\nEnter a Last Name: ");
				tempSearchFName7.setLastName(scan8.next());
				//call the directory method
				
				//dListing2.searchByLastName(null);
				//tempSearchFName.printPerson();
				dListing7.printPerson();
				
				scan8.close();
				break;
				
				
			case 9://Update
				
				
			case 10://Show records in Ascending order
				
				
				
				break;
				
			
				
			}
		}
	}
}
