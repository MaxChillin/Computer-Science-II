package lab1_SortingTestScores;

import java.text.DecimalFormat;

public class Student_Pierce {
	private String firstName;
	private String lastName;
	private double test1, test2, test3;
	
	
	
	// No argument constructor
	public Student_Pierce(){
		
	} // End of No Argument constructor
	
	// parameter constructor
	public Student_Pierce(String firstName, String lastName, double test1, double test2, double test3){
		setFirstName(firstName);
		setLastName(lastName);
		setTest1(test1);
		setTest2(test2);
		setTest3(test3);
	} // End of parameter constructor

	// method to set the first name
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	} // End of setter method for the first name

	// method to get the first name
	public String getFirstName() {
		return firstName;
	} // End of getter method for first name

	// method to set the first name
	public void setLastName(String lastName) {
		this.lastName = lastName;
	} // End of setter method for the first name

	// method to get the last name
	public String getLastName() {
		return lastName;
	} // End of getter method for the last name
	
	// method to set test1
	public void setTest1(double test1){
		this.test1 = test1;
	} // End of setter method for test1
	
	// method to get test1
	public double getTest1(){
		return test1;
	} //End of getter method for test1
	
	// method to set test2
	public void setTest2(double test2){
		this.test2 = test2;
	} // End of setter method for test2
	
	// method to get test2
	public double getTest2(){
		return test2;
	} //End of getter method for test2
	
	// method to set test1
	public void setTest3(double test3){
		this.test3 = test3;
	} // End of setter method for test3
	
	// method to get test3
	public double getTest3(){
		return test3;
	} //End of getter method for test3
	
	// method to calculate the average of 3 test scores
	public double calcAverage(double test1, double test2, double test3){
		double average;
		average = (test1 + test2 + test3) / 3;
		return average;
	} // End of calcAverage method
	
	// method to determine the students grade
	public char determineGrade(){
		char grade;
		
		switch((int) calcAverage(test1, test2, test3) / 10){
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
			default:
				grade = 'F';
				break;
		} // End of switch
		return grade;
	} // End of determineGrade method
	
	
	// toString method to print out the info for that class
	public String toString(){
		DecimalFormat decimalFormat = new DecimalFormat("##.#");
		
		String info = "";
		info += "---------------------------------------------------" +
		"\nStudent: " + lastName + " " + firstName +
		"\nTest 1: " + test1 +
		"\nTest 2: " + test2 +
		"\nTest 3: " + test3 +
		"\nAverage Score: " + decimalFormat.format(calcAverage(test1, test2, test3)) +
		"\nGrade: " + determineGrade() +
		"\n---------------------------------------------------";
				
		return info;
	}// End of toString method

}// End of class