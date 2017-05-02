package lab4_StacksAndQueues;

import java.util.Random;

public class Employee_Pierce {
	
	protected String employeeID;
	protected String lastName;
	protected String firstName;
	protected String department;
	protected double salary;
	protected enum FIRSTNAMES { Dan, Bob, Jeff, Mary, Steve, Jennifer, Veronica, Gary, Alyssa, Mike};
	protected enum LASTNAMES { Brown, Smith, Lott, Miller, Lopez, Parks, Stoker, Perez, Milano, Dexter};
	protected enum DEPARTMENT { Sales, Accounting, Marketing, HR, Warehouse, Maintenance, CallService, CustomerService, PR, Janitorial};

	
	// No argument constructor
	public Employee_Pierce(){
		
		employeeID = null;
		lastName = null;
		firstName = null;
		department = null;
		salary = 0;
		
	}// End of No argument constructor
	
	// constructor when only ID is entered
	public Employee_Pierce(String ID){
		
		Random random = new Random();
		// This randomly generates names, departments, and salaries
		employeeID = ID;
		lastName = LASTNAMES.values()[random.nextInt(100)%10].toString();
		firstName = FIRSTNAMES.values()[random.nextInt(100)%10].toString();
		department = DEPARTMENT.values()[random.nextInt(100)%10].toString();
		salary = random.nextInt(80001);
		
	}// End of constructor when only ID is entered
	
	
	// parameter constructor
	public Employee_Pierce(String employeeID, 
						   String lastName, 
						   String firstName,
						   String department, 
						   double salary) {
		
		this.employeeID = employeeID;
		this.lastName = lastName;
		this.firstName = firstName;
		this.department = department;
		this.salary = salary;
	}// End of parameter constructor
	


	public String getEmployeeID() {
		return employeeID;
	}// End of getEmployeeID
	
	
	public String getKey() {
		return employeeID;
	}// End of getKey
	
	
	
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}// End of setEmployeeID
	
	
	
	public String getLastName() {
		return lastName;
	}// End of getLastName
	
	
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}// End of setLastName
	
	
	
	public String getFirstName() {
		return firstName;
	}// End of getFirstName
	
	
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}// End of setFirstName
	
	
	
	public String getDepartment() {
		return department;
	}// End of getDepartment
	
	
	
	public void setDepartment(String department) {
		this.department = department;
	}// End of setDepartment
	
	
	
	public double getSalary() {
		return salary;
	}// End of getSalary
	
	
	
	public void setSalary(double salary) {
		this.salary = salary;
	}// End of setSalary
	
	
	public Employee_Pierce deepCopy(){
		Employee_Pierce deepCopy = new Employee_Pierce(this.employeeID, this.lastName, this.firstName,
				this.department, this.salary);
				
		return deepCopy;
	}// End of deepCopy method
	
	
	public String toFile(){
		String info = firstName + "-" + lastName + "-" + employeeID + "-" + department + "-";
		info += Double.toString(salary);
		return info;
	}


	@Override
	public String toString() {
		return "\n\tEmployeeID: " + employeeID + 
				"\n\tLastName: " + lastName + 
				"\n\tFirstName: " + firstName + 
				"\n\tDepartment: " + department + 
				"\n\tSalary: " + salary;
	}
	
	
	

}// End of class
