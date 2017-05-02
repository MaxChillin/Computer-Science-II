package lab4_StacksAndQueues;

import java.util.Scanner;

public class SP15LAB4_Pierce_RestrictedStructureWithEmployee {
	int d = 34;
	
	public static void main(String[] args){
		
		Employee_Pierce employee;		
		
		EmployeeQueue_Pierce testQueue = new EmployeeQueue_Pierce();
		EmployeeStack_Pierce testStack = new EmployeeStack_Pierce();
		
		Scanner input = new Scanner(System.in);
		
		int employeeCount;
		int selection;
		
		while(true){
			
			System.out.print("\n\tWhich would you like to use?" +
								"\n\t1: Stack" +
								"\n\t2: Queue" +
								"\n\t3: Exit" +
								"\n\tPlease Make a Selection.");
			
			selection = input.nextInt();			
			input.nextLine();// this is to catch the enter key
			
			// Main Menu switch
			switch(selection){
			case 1:
				employeeCount = 0;
				
				// employee input loop
				while(employeeCount < 5){
				System.out.print("\n\tWould you like to use an Employee or a Title " +
						"Employee for selection " + (employeeCount + 1) + "?" +
						"\n\t1: Employee" +
						"\n\t2: Title Employee");
				
				selection = input.nextInt();			
				input.nextLine();// this is to catch the enter key
				
				if(selection == 1){
					employee = new Employee_Pierce();
					
					System.out.println("\n\tPlease Enter Employee ID");
					employee.setEmployeeID(input.nextLine());
					input.nextLine();// To Catch the Enter
					
					System.out.println("\n\tPlease Enter Employee First Name");
					employee.setFirstName(input.nextLine());
					
					System.out.println("\n\tPlease Enter Employee Last Name");
					employee.setLastName(input.nextLine());
					
					System.out.println("\n\tPlease Enter Employee Department");
					employee.setDepartment(input.nextLine());
					
					System.out.println("\n\tPlease Enter Employee Salary");
					employee.setSalary(input.nextDouble());
					input.nextLine();// To Catch the Enter
					
					testStack.push(employee);
					employeeCount++;
					
				}// End of first if statement
				
				if(selection == 2){
					employee = new TitleEmployee_Pierce();
					
					System.out.println("\n\tPlease Enter Employee ID");
					employee.setEmployeeID(input.nextLine());
					input.nextLine();// To Catch the Enter
					
					System.out.println("\n\tPlease Enter Employee First Name");
					employee.setFirstName(input.nextLine());
					
					System.out.println("\n\tPlease Enter Employee Last Name");
					employee.setLastName(input.nextLine());
					
					System.out.println("\n\tPlease Enter Employee Title");
					((TitleEmployee_Pierce) employee).setTitle(input.nextLine());
					
					System.out.println("\n\tPlease Enter Employee Department");
					employee.setDepartment(input.nextLine());
					
					System.out.println("\n\tPlease Enter Employee Salary");
					employee.setSalary(input.nextDouble());
					input.nextLine();// To Catch the Enter
					
					System.out.println("\n\tPlease Enter Employee Bonus");
					((TitleEmployee_Pierce) employee).setBonus(input.nextDouble());
					input.nextLine();// To Catch the Enter
					
					testStack.push(employee);
					employeeCount++;
					
				}// End of second if statement
				
				if(selection > 2 || selection < 1) continue;
				
				}// End of employee input loop
				
				testStack.showAll();// Displays everything in the stack
				
				// This allows the user to view the info briefly before moving on
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {					
					e.printStackTrace();
				}
				
				testStack.pop();// Removes the 5th employee
				testStack.pop();// Removes the 4th employee
				System.out.println("\n" + testStack.peek());// Displays the top of the stack
				
				// This allows the user to view the info briefly before moving on
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {					
					e.printStackTrace();
				}
				
				
				break;
			case 2:
				employeeCount = 0;
				
				// employee input loop
				while(employeeCount < 5){
				System.out.println("\n\tWould you like to use an Employee or a Title " +
						"Employee for selection " + (employeeCount + 1) + "?" +
						"\n\t1: Employee" +
						"\n\t2: Title Employee");
				
				selection = input.nextInt();			
				input.nextLine();// this is to catch the enter key
				
				if(selection == 1){
					employee = new Employee_Pierce();
					
					System.out.println("\n\tPlease Enter Employee ID");
					employee.setEmployeeID(input.nextLine());
					input.nextLine();// To Catch the Enter
					
					System.out.println("\n\tPlease Enter Employee First Name");
					employee.setFirstName(input.nextLine());
					
					System.out.println("\n\tPlease Enter Employee Last Name");
					employee.setLastName(input.nextLine());
					
					System.out.println("\n\tPlease Enter Employee Department");
					employee.setDepartment(input.nextLine());
					
					System.out.println("\n\tPlease Enter Employee Salary");
					employee.setSalary(input.nextDouble());
					input.nextLine();// To Catch the Enter
					
					testQueue.enqueue(employee);
					employeeCount++;
					
				}// End of first if statement
				
				if(selection == 2){
					employee = new TitleEmployee_Pierce();
					
					System.out.println("\n\tPlease Enter Employee ID");
					employee.setEmployeeID(input.nextLine());
					input.nextLine();// To Catch the Enter
					
					System.out.println("\n\tPlease Enter Employee First Name");
					employee.setFirstName(input.nextLine());
					
					System.out.println("\n\tPlease Enter Employee Last Name");
					employee.setLastName(input.nextLine());
					
					System.out.println("\n\tPlease Enter Employee Title");
					((TitleEmployee_Pierce) employee).setTitle(input.nextLine());
					
					System.out.println("\n\tPlease Enter Employee Department");
					employee.setDepartment(input.nextLine());
					
					System.out.println("\n\tPlease Enter Employee Salary");
					employee.setSalary(input.nextDouble());
					input.nextLine();// To Catch the Enter
					
					System.out.println("\n\tPlease Enter Employee Bonus");
					((TitleEmployee_Pierce) employee).setBonus(input.nextDouble());
					input.nextLine();// To Catch the Enter
					
					testQueue.enqueue(employee);
					employeeCount++;
					
				}// End of second if statement
				
				if(selection > 2 || selection < 1) continue;
				
				}// End of employee input loop
				
				testQueue.showAll();
				
				// This allows the user to view the info briefly before moving on
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {					
					e.printStackTrace();
				}
				
				testQueue.dequeue();// Removes the 1st employee
				testQueue.dequeue();// Removes the 2nd employee
				System.out.println("\n" + testQueue.peek());// Displays the front of the Queue
				
				// This allows the user to view the info briefly before moving on
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {					
					e.printStackTrace();
				}
				
				break;
			case 3:
				System.exit(0);				
				default:
					continue;
			}// End of Main Menu switch
			
		}// End of while loop
		
	}// End of main	

}// End of class
