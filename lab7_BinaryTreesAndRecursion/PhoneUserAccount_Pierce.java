package lab7_BinaryTreesAndRecursion;

import java.util.Random;

public class PhoneUserAccount_Pierce {
	
	private String accountID;
	private String name;
	private String phoneNumber;
	private String address;
	protected enum FIRSTNAMES { Dan, Bob, Jeff, Mary, Steve, Jennifer, Veronica, Gary, Alyssa, Mike};
	protected enum LASTNAMES { Brown, Smith, Lott, Miller, Lopez, Parks, Stoker, Perez, Milano, Dexter};
	protected enum STREETNAMES { Hillcrest, Main, Elm, Meadowside, Glenbrook, Lakeside, Willowbend, EchoBluff, Shady, Galaxy};
	protected enum PREFIX { Drive, Street, Road, Way, Lane, Blvd, Run, Trail, Court, Circle};
	
	public PhoneUserAccount_Pierce(){
		this.accountID = null;
		this.name = null;
		this.phoneNumber = null;
		this.address = null;
	}
	
	public PhoneUserAccount_Pierce(String id){
		Random random = new Random();
		// This randomly generates info
		
		String lastName = LASTNAMES.values()[random.nextInt(100)%10].toString();
		String firstName = FIRSTNAMES.values()[random.nextInt(100)%10].toString();
		String street = STREETNAMES.values()[random.nextInt(100)%10].toString();
		String prefix = PREFIX.values()[random.nextInt(100)%10].toString();
		int addressNum = random.nextInt(1000) + 1000;
		this.accountID = id;
		this.name = firstName + " " + lastName;
		this.phoneNumber = "214-" + (random.nextInt(700) + 100) + "-" + (random.nextInt(700) + 100);
		this.address = "" + addressNum + " " + street + " " + prefix;
	}

	public PhoneUserAccount_Pierce(String id, String name, String number, String address) {
		this.accountID = id;
		this.name = name;
		this.phoneNumber = number;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public PhoneUserAccount_Pierce deepCopy(){
		PhoneUserAccount_Pierce deepCopy = new PhoneUserAccount_Pierce(this.accountID, this.name, this.phoneNumber, this.address);
				
		return deepCopy;
	}// End of deepCopy method

	
	public String toString() {
		return "\n\tAccountID: " + accountID + 
				"\n\tName: " + name + 				
				"\n\tPhoneNumber: " + phoneNumber + 
				"\n\tAddress: "	+ address;
	}// End of toString method	
	
}// End of Class
