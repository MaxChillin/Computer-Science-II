package lab1_SortingTestScores;

import java.util.Scanner;

public class SP15LAB1_Pierce_TestGrade {	
		
	public static void main(String[] args){
		
		boolean firstLoop = true, secondLoop = true;		
		
		Student_Pierce Student1 = new Student_Pierce();
	
		Scanner input = new Scanner(System.in);
		
		while(firstLoop){
			
			System.out.println("Please Enter Your First Name.");
			
			Student1.setFirstName(input.nextLine());
			
			System.out.println("Please Enter Your Last Name.");
			
			Student1.setLastName(input.nextLine());
			
			System.out.println("Please Enter Your First Test Score.");
			
			Student1.setTest1(input.nextDouble());
			
			System.out.println("Please Enter Your Second Test Score.");
			
			Student1.setTest2(input.nextDouble());
			
			System.out.println("Please Enter Your Third Test Score.");
			
			Student1.setTest3(input.nextDouble());
			
			System.out.println(Student1.toString());
			
			// this is to catch the enter key that is not caught with the nextDouble() method
			input.nextLine();
			
			// Second while loop
			while(secondLoop){
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
				String check;
				
				System.out.println("To Continue Press Y to Exit Press N.");
				
				check = input.nextLine();
				
				switch(check){
				case "y":
				case "Y":
					secondLoop = false;
					break;
				case "n":
				case "N":
					System.out.println("GoodBye");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Entry. Please Try Again");
				}// End of switch				
			
			}// End of second while loop
			
			secondLoop = true;// this allows you to reenter then second loop if you press Y
			
		}// End of first while loop
		
	}// End of main

}// End of class

