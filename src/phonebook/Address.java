package phonebook;

public class Address {

		private String streetNum;
		private String streetName;
		private String city;
		private String state;
		private String zipCode;
		
		
		public Address() {
			super();
		}
		
		public Address(String streetNum, String streetName, String city, String state, String zipCode) {
			this.streetNum = streetNum;
			this.streetName = streetName;
			this.city = city;
			this.state=state;
			this.zipCode=zipCode;
		}

		// MY toSTRING CODE
		public String toString() {
			return ("Address=  " + streetNum + " " + streetName + ", " + city + ", " + state + ", " + zipCode);
		}
		
		
		public void printAddress() {
			System.out.println(streetNum + " "+streetName + " "+city + " "+state + " "+zipCode);
		}

		public String getStreetNum() {
			return streetNum;
		}

		public void setStreetNum(String streetNum) {
			this.streetNum = streetNum;
		}

		public String getStreetName() {
			return streetName;
		}

		public void setStreetName(String streetName) {
			this.streetName = streetName;
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

		public String getZipCode() {
			return zipCode;
		}

		public void setZipCode(String zipCode) {
			this.zipCode = zipCode;
		}
		
	}