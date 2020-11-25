
package phonebook;

public class Directory {

	
	Person[] entry = new Person[0];
	
	public void addPerson(Person newPerson) {
		Person[] temp = new Person[entry.length + 1];
		for(int i=0; i< entry.length; i++) {
			temp[i]=entry[i];
		}
	temp[temp.length-1]=newPerson;
	entry=temp;
	}
	
	public Person[] getDirectory() {
		return entry;
	}
	
	public void printDirectory() {
		for(int i=0; i < entry.length; i++) {
			entry[i].getPerson();
		}
	}
	
	/*public Person getByLastName(String lastN) {
		int counter = 0;
		for(int i=0; i < entry.length; i++) {
			if(entry[i].getLastName().equals(lastN)) {
				counter++;
			}
		}
	return null; 
} */

}