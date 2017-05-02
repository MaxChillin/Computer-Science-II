package lab4_StacksAndQueues;

import java.util.Random;

public class TitleEmployee_Pierce extends Employee_Pierce {
	
	private String title;
	private double bonus;
	private enum TITLES {CEO, CFO, President, VicePresident, RegionalManager, GerenalManager, Manager, AssistantManager, HeadOfSales, EmployeeOfTheMonth};
	private enum DEPT {Sales, Financial, Marketing, Distribution, Logistics};
	
	
	public TitleEmployee_Pierce() {
		super();
		title = null;
		bonus = 0;
	}
	
	// constructor when only ID is entered
		public TitleEmployee_Pierce(String ID){
			super(ID);
			Random random = new Random();
			// This randomly generates names, departments, and salaries			
			department = DEPT.values()[random.nextInt(100)%5].toString();
			title = TITLES.values()[random.nextInt(100)%10].toString();
			bonus = random.nextInt(10001);
			
		}// End of constructor when only ID is entered

	public TitleEmployee_Pierce(
			String employeeID, String lastName, String firstName, 
			String title, String department, double salary, double bonus) {
		super(employeeID, lastName, firstName, department, salary);
		this.title = title;
		this.bonus = bonus;
		
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
	public TitleEmployee_Pierce deepCopy(){
		Employee_Pierce deepCopy = new TitleEmployee_Pierce(
				this.employeeID, this.lastName, this.firstName,
				this.title, this.department, this.salary, this.bonus);
				
		return (TitleEmployee_Pierce) deepCopy;
	}// End of deepCopy method
	

	public String toString() {
		return "\n\tEmployeeID: " + employeeID + 
				"\n\tFirstName: " + firstName + 
				"\n\tLastName: " + lastName + 
				"\n\tDepartment: " + department + 
				"\n\tTitle: " + title +
				"\n\tSalary: " + salary +
				"\n\tBonus: " + bonus;
		
	}

}
