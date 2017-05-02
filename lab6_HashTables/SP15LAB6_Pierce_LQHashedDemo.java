package lab6_HashTables;

import java.util.*;

import lab4_StacksAndQueues.Employee_Pierce;

public class SP15LAB6_Pierce_LQHashedDemo {

	public static void main(String[] args) {
		
		String selection;
		Employee_Pierce employee;
		
		LQHashed_Pierce lqHashStructure = new LQHashed_Pierce(5);
		
		Scanner input = new Scanner(System.in);
		
		do{
        	System.out.println("\n\t***************************************************"+
        					"\n\t1: Create A New Employee"+
        					"\n\t2: Continue");
        	System.out.print("\n\tPlease Make A Selection: ");
        	
        	selection = input.nextLine();
        	switch(selection){
        	case "1":
	        	System.out.print("\n\tPlease Enter Employee's ID: ");
	        	employee = new Employee_Pierce(input.nextLine());
	        	lqHashStructure.insert(employee);
	        	break;
        	case "2":
        	break;
        	default:
        		System.out.println("\n\tInvalid Input");
        	}// End of switch
        }while(!selection.equals("2"));
		
		// Show All
		System.out.println("\n\tShowing All");
		lqHashStructure.showAll();
		
		// Fetch
		System.out.println("\n\tFetching...");
		System.out.println(lqHashStructure.fetch("0012345"));
		
		// Update
		System.out.println("\n\tUpdating...");
		employee = lqHashStructure.fetch("0012345");
		employee.setDepartment("Junk Yard");
		lqHashStructure.update("0012345", employee);
		
		// Show All
		System.out.println("\n\tShowing All");
		lqHashStructure.showAll();
		
		// Delete
		System.out.println("\n\tDeleting...");
		lqHashStructure.delete("0012345");
		
		// Show All
		System.out.println("\n\tShowing All");
		lqHashStructure.showAll();

	}// End of main

}// End of class
