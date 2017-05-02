package lab5_LinkedLists;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import lab4_StacksAndQueues.Employee_Pierce;
import lab4_StacksAndQueues.TitleEmployee_Pierce;

public class SP15LAB5_Pierce_LinkedListDataStructure {

	public static void main(String[] args){
		

		Scanner input = new Scanner(System.in);

		Singly_LinkedList_Pierce list1 = null;
		Singly_LinkedList_WithIterator_Pierce list2 = null;
		LinkedList<Employee_Pierce> list3 = null;		
		Employee_Pierce employee = null;

		String selection;
		String id;


		while(true){

			System.out.println("\n\tWhich Type of Linked List Would You Like to Use:"+
					"\n\t1: Singly Linked List"+
					"\n\t2: Singly Linked List With Iterator"+
					"\n\t3: Java Linked List With Iterator"+
					"\n\t4: Exit");
			System.out.print("\tPlease Make A Selection: ");			

			selection = input.nextLine();			

			switch(selection){
			case "1"://************************************ FIRST LIST ****************
				list1 = new Singly_LinkedList_Pierce();
				System.out.println("\n\tYou Selected Singly Linked List");

				do{
					System.out.println("\n\t1: Employee" +
							"\n\t2: Title Employee" +
							"\n\t3: Finish");
					System.out.print("\n\tPlease Make A Selection:");
					selection = input.nextLine();
					switch(selection){
					case "1":// *********************** EMPLOYEE ****************
						System.out.println("\n\tYou Selected Create Regular Employee");

						System.out.println("\n\tPlease Enter Employee ID Number");
						id = input.nextLine();		
						employee = new Employee_Pierce(id);						
						break;
					case "2":// ************************* TITLE EMPLOYEE **************
						System.out.println("\n\tYou Selected Create Title Employee");

						System.out.println("\n\tPlease Enter Employee ID Number");
						id = input.nextLine();		
						employee = new TitleEmployee_Pierce(id);
						break;
					case "3":
						break;
					default:
						System.out.println("Invalid Input");
					}// End of switch

					list1.insert(employee);
				}while(!selection.equals("3"));
				
				
				System.out.println("Showing All");
				list1.showAll();
				//*************************************** FETCH ***************
				System.out.println("Fetching...");
				System.out.println(list1.fetch("1234567"));
				//*************************************** UPDATE ***************				
				System.out.println("Updating...");
				employee = list1.fetch("1234567");
				employee.setDepartment("Junk Yard");
				System.out.println(list1.update("1234567", employee));
				
				System.out.println("Showing All");
				list1.showAll();
				//*************************************** DELETE ***************
				System.out.println("Deleting...");
				list1.delete("1234567");
				
				System.out.println("Showing All");
				list1.showAll();

				break;
			case "2"://************************************* SECOND LIST ***************
				list2 = new Singly_LinkedList_WithIterator_Pierce();
				System.out.println("\n\tYou Selected Singly Linked List With Iterator");
				do{
					System.out.println("\n\t1: Employee" +
							"\n\t2: Title Employee" +
							"\n\t3: Finish");
					System.out.print("\n\tPlease Make A Selection:");
					selection = input.nextLine();
					switch(selection){
					case "1":// *********************** EMPLOYEE ****************
						System.out.println("\n\tYou Selected Create Regular Employee");

						System.out.println("\n\tPlease Enter Employee ID Number");
						id = input.nextLine();									
						employee = new Employee_Pierce(id);						
						break;
					case "2":// ************************* TITLE EMPLOYEE **************
						System.out.println("\n\tYou Selected Create Title Employee");

						System.out.println("\n\tPlease Enter Employee ID Number");
						id = input.nextLine();			
						employee = new TitleEmployee_Pierce(id);
						break;
					case "3":
						break;
					default:
						System.out.println("Invalid Input");
					}// End of switch
					list2.insert(employee);
				}while(!selection.equals("3"));
				
				
				System.out.println("Showing All");
				list2.showAll();
				//*************************************** FETCH ***************
				System.out.println("Fetching...");
				System.out.println(list2.iteration.next());
				System.out.println(list2.iteration.next());
				//************************************** UPDATE ***************
				System.out.println("Updating...");
				list2.iteration.reset();
				while(list2.iteration.hasNext()){
					employee = list2.iteration.next();													
					employee.setEmployeeID("A" + employee.getEmployeeID());					
					list2.iteration.set(employee);
				}
				
				System.out.println("Showing All");
				list2.showAll();
				//************************************** DELETE ***************
				System.out.println("Deleting...");
				list2.iteration.reset();
				for(int i = 0; i<2;i++)
					list2.iteration.next();
				System.out.println(list2.delete(list2.iteration.next().getEmployeeID()));
				
				System.out.println("Showing All");
				list2.showAll();
				
				break;
			case "3"://************************************* JAVA LIST *****************
				System.out.println("\n\tYou Selected Java Linked List With Iterator");
				list3 = new LinkedList<Employee_Pierce>();
				ListIterator<Employee_Pierce> l = list3.listIterator();
				
				do{
					System.out.println("\n\t1: Employee" +
							"\n\t2: Title Employee" +
							"\n\t3: Finish");
					System.out.print("\n\tPlease Make A Selection:");
					selection = input.nextLine();
					switch(selection){
					case "1":// *********************** EMPLOYEE ****************
						System.out.println("\n\tYou Selected Create Regular Employee");

						System.out.println("\n\tPlease Enter Employee ID Number");
						id = input.nextLine();			
						employee = new Employee_Pierce(id);
						l.add(employee);
						break;
					case "2":// ************************* TITLE EMPLOYEE **************
						System.out.println("\n\tYou Selected Create Title Employee");

						System.out.println("\n\tPlease Enter Employee ID Number");
						id = input.nextLine();		
						employee = new TitleEmployee_Pierce(id);
						l.add(employee);
						break;
					case "3":
						break;
					default:
						System.out.println("Invalid Input");
					}// End of switch

				}while(!selection.equals("3"));
				
				
				System.out.println("Showing All");
				while(l.hasNext()){
					System.out.println(l.next());
				}
				while(l.hasPrevious()){
					l.previous();
				}
				//*************************************** FETCH ***************
				System.out.println("Fetching...");				
					System.out.println(l.next());
					System.out.println(l.next());
				//************************************** UPDATE ***************
				System.out.println("Updating...");
				while(l.hasPrevious()){
					l.previous();
				}
				l.next();
				employee = l.next();
				employee.setDepartment("Junk Yard");
				l.set(employee);
				
				System.out.println("Showing All");
				while(l.hasPrevious()){
					l.previous();
				}
				while(l.hasNext()){
					System.out.println(l.next());
				}
				//************************************** DELETE ***************
				System.out.println("Deleting...");
				while(l.hasPrevious()){
					l.previous();
				}
				l.next();
				l.next();
				l.next();
				l.remove();
				
				System.out.println("Showing All");
				while(l.hasPrevious()){
					l.previous();
				}
				while(l.hasNext()){
					System.out.println(l.next());
				}

				break;
			case "4":
				System.exit(0);
			default:
				System.out.println("\n\tInvalid input");
			}// End of switch

		}// End of primary while loop		
		
	}// End of main method

}// End of class
