package EmloyeeOOP;

public class Employee {

	//Creating all Employee methods 
	
		private int employeeID; 
		private String employeeName; 
		private String employeeAddress; 
		private long employeeContact;
		
		//default constructor 
		public Employee(){}; 
		
		//Non-default constructor  with arguments 
		public Employee(int employeeID, String employeeName, String employeeAddress, long employeeContact) {
			this.employeeID = employeeID;
			this.employeeName = employeeName;
			this.employeeAddress = employeeAddress;
			this.employeeContact = employeeContact;
		}



		//Employee Getter/Setters 
		public int getEmployeeID() {
			return employeeID;
		}
		public void setEmployeeID(int employeeID) {
			this.employeeID = employeeID;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public String getEmployeeAddress() {
			return employeeAddress;
		}
		public void setEmployeeAddress(String employeeAddress) {
			this.employeeAddress = employeeAddress;
		}
		public long getEmployeeContact() {
			return employeeContact;
		}
		public void setEmployeeContact(long employeeContact) {
			this.employeeContact = employeeContact;
		}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
