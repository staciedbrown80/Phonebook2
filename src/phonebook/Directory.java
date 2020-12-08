
package phonebook;


public class Directory extends Person{

	//Directory directory = new Directory();

	Person[] entry = new Person[0];
	//Directory directory = new Directory(entry);////this works//null doesn't work for the argument
	
	public Directory(Person[] entry) {
		// TODO Auto-generated constructor stub
	}
//////////////////////////////////////////////////////////////////////-WORKS
	public Directory(Person tempSearchFName) {
		// TODO Auto-generated constructor stub
	}

	//Add a new person or entry
	public void addPerson(Person newPerson) {
		Person[] temp = new Person[entry.length + 1];
		for(int i=0; i< entry.length; i++) {
			temp[i]=entry[i];
		}
	temp[temp.length-1]=newPerson;
	entry=temp;
	System.out.println(temp);
	}
	///////////////////////////////////////////////////////////////////
	//Delete a new person or entry
	//Search person/entry by the last name then by first name
			public Person [] searchByFullName(String lastName, String firstName) {
				Person[] temp = new Person[0];
				for(int i=0; i<entry.length; i++) {
					Person p= entry[i];
					if(p.getLastName().equals(lastName)) {
						temp=expandArray(temp,p);
						for(int j=0; j<entry.length; j++) {
							Person p2= entry[j];
							if(p2.getFirstName().equals(firstName)) {
								temp=expandArray(temp,p2);
							}
							return temp;
						}
					}
					return temp;
				}
				return temp;
			}

	
	
	//Search person/entry by the first name //TRY MOVING THIS PIECE TO PERSON THEN CALL IT FROM APPLICATION MAIN
	public Person [] searchByFirstName(String firstName) {
		Person[] temp = new Person[0];
		for(int i=0; i<entry.length; i++) {
			Person p= entry[i];
			if(p.getFirstName().equals(firstName)) {
				temp=expandArray(temp,p);
				System.out.println(entry);
				p.printPerson();
				p.toString();
			}
		}
		return temp;
	}
	
	//Search person/entry by the last name
		public Person [] searchByLastName(String lastName) {
			Person[] temp = new Person[0];
			for(int i=0; i<entry.length; i++) {
				Person p= entry[i];
				if(p.getLastName().equals(lastName)) {
					temp=expandArray(temp,p);
				}
			}
			return temp;
		}
	
		public Address [] searchByCity(String city) {
			Address [] listing = new Address[0];
			for(int i=0; i<listing.length; i++) {
				Address a= listing[i];
				if(a.getCity().equals(city)) {
					listing=expandArrayA(listing,a);
				}
			}
			return listing;
		}	
			
	//When adding a new Person or entry, we need to expand the array size by "1"
	public Person[] expandArray(Person [] source, Person newPerson) { 
		Person[] temp = new Person[source.length +1];
		for(int i=0; i<source.length; i++) {
			temp[i]=source[i];
		}
		temp[temp.length-1]=newPerson;
		return temp;
	}
	
	//When deleting new Person or entry, we need decrease the array size by "1"
	public Person[] shrinkArray(Person [] source, Person newPerson) { 
		Person[] temp = new Person[source.length];
		for(int i=0; i<source.length; i++) {
			temp[i]=source[i];
		}
		temp[temp.length-1]=newPerson;
		return temp;
	}
	
	
	//When adding a new Address to array named "adrlist" we need to expand the array size by "1"
	public Address[] expandArrayA(Address [] adrlist, Address newAddress) {
		Address[] temp = new Address[adrlist.length +1];
		for(int i=0; i<adrlist.length; i++) {
			temp[i]=adrlist[i];
		}
		temp[temp.length-1]=newAddress;
		return temp;
	}
	
	
	public Person[] getDirectory() {
		return entry;
	}
	
	public void printDirectory() {
		for(int i=0; i < entry.length; i++) {
			entry[i].getPerson();
		}
	}
	
}