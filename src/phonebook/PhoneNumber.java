package phonebook;

public class PhoneNumber {


		private String phoneNumber;

		// DEFAULT CONSTRUCTOR
		public PhoneNumber() {
		}

		// PARAMETERIZED CONSTRUCTOR
		public PhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
		// GETTER
		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		// MY toSTRING CODE
		public String toString() {
			return ("Phone Number=  " + phoneNumber);
		}

		//public void printPhoneNumber() {
			//System.out.println(getPhoneNumber());
		//}

		
		/////MY PRINT PHONE NUMBER METHOD
		public void printPhoneNum(char[] String) { // CountCharacter
			//String[] phoneNumbers = { "3145518956", "5513249944", "3145218213", "9916362541", " ", "0000004"};
			String[] phoneNumbers = { };

			for (int i = 0; i < phoneNumbers.length; i++) {
					System.out.println(phoneNumbers[i]);
			}
		}
		
	}


