package lab4_StacksAndQueues;

public class EmployeeStack_Pierce {
	
	private Employee_Pierce[ ] data;
	private int	top;
	private int size;
	
	
	// No argument constructor
	public  EmployeeStack_Pierce() {
		top = -1;
		size = 10;
		data = new Employee_Pierce[size];
	}// End of no argument constructor
	
	
	// parameter constructor
	public  EmployeeStack_Pierce(int size) {
		this.size = size;
		top = -1;// set top to -1
		data = new Employee_Pierce[size];// initialize the stack to the size passed into the method
	}// End of parameter constructor
	
	
	// push method
	public boolean push(Employee_Pierce newNode) {
		if(top == size -1) return false;// check for overflow error
		
		data[++top] = newNode;// increment top by 1 then insert the new node
		return true;
	}// End of push method
	
	
	// pop method
	public Employee_Pierce pop () {
		if(top == -1) return null;// check for underflow error
		
		int topLocation = top--;//store the value of top into a temporary place holder then decrement top by 1
		return data[topLocation];// return the date using the value of the temporary place holder
	}// End of pop method
	
	
	// peek method
	public Employee_Pierce peek() {
		if(top == -1) return null;// check for underflow error
		
		return data[top];// returns the data located at the index of top without changing the value of top
	}// End of peek method
	
	
	// showAll method
	public void showAll() {
		System.out.println("*****List of employees in stack from top to bottom*****");
		for(int i = top; i >= 0; i--)//This loops through the items in the stack and prints them to the screen
			System.out.println(data[i]);
			
		System.out.println("\n*****End of List*****");		
	}// End of showAll method

}// End of class