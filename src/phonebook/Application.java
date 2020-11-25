
package phonebook;

import java.util.Scanner;

public class Application extends Person {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {

			int k = 0;
			System.out.println("Please choose an option below:\n");
			System.out.println("(1) - Add a record:  ");
			System.out.println("(2) - Update a record:  ");
			System.out.println("(3) - Search for a record:  ");
			System.out.println("(4) - Delete a record:  ");
			System.out.println("(5) - Print phone numbers");
			System.out.println("(6) - Exit:  ");
			// boolean quit = false;

			System.out.print("Please enter your selection: ");
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
				///////////////////////////////////////////////////////// Scan in Phone number
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
				break;

			/*
			 * case 2: //public static void printPhoneNum(char[] String) { // CountCharacter
			 * //String[] phoneNumbers = { "3145518956", "5513249944", "3145218213",
			 * "9916362541", " ", "0000004"}; //String[] phoneNumbers = {};
			 * 
			 * for (int i = 0; i < phoneNumbers.length; i++) {
			 * System.out.println(phoneNumbers[i]);
			 * System.out.println(phoneNumbers.toString());
			 * 
			 * 
			 * 
			 * } break;
			 * 
			 * case 3: Scanner scan2 = new Scanner(System.in); Person tempEntry = new Person
			 * (); System.out.println("Enter a First Name: "); tempEntry.getFirstName
			 * (scan2.next());//)= in.next(); System.out.println("Enter a Last Name: ");
			 * tempEntry.getLastName (scan2.next());//)= in.next();
			 * 
			 * for (int j = 0; j < phoneBook.length; j++) { if
			 * (phoneBook[j].lastName.equals(lastname)) {}} }
			 * 
			 * return null;
			 * 
			 * }
			 * 
			 * }/////////////////////////////////////////////////////////////////////Close
			 * case 1
			 */
			// }
			}
		}
	}
}
