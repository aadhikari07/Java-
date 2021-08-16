package InheritanceIntro;

public class PersonalDetails {
	
	private String lastName; 
	private String address; 
	private long contactno; 
	private String emailID;
	
	
	//Default Constructor to initialize variables 
	public PersonalDetails() {
		
		lastName = "N/A";
		address = "N/A"; 
		emailID = "N/A"; 
	}
	
	
	

	public PersonalDetails(String lastName, String address, long contactno, String emailID) {
		//super();
		this.lastName = lastName;
		this.address = address;
		this.contactno = contactno;
		this.emailID = emailID;
	}




	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getContactno() {
		return contactno;
	}

	public void setContactno(long contactno) {
		this.contactno = contactno;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}




	@Override
	public String toString() {
		return "PersonalDetails [lastName=" + lastName + ", address=" + address + ", contactno=" + contactno
				+ ", emailID=" + emailID + "]";
	} 
	
	
	
	
	
	
	
	
	
	

}
