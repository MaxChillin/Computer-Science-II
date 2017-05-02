package lab2_InheritanceWithShapes;

import java.util.Scanner;

public class SP15LAB2_Pierce_Geometry {

	public static void main(String[]args){
		boolean menu = true;
		int selection = 0;
		String trash = "";
		Scanner input = new Scanner(System.in);
		
		Shape_Pierce shapeObject = null;
		
		while(true){			
				// This is the Menu for the user to choose what shape they would like to work with
			System.out.println("\n\nSP15LAB2_Pierce_Geometry"+
								"\n\t1: Square" +
								"\n\t2: Triangle" +
								"\n\t3: Circle" +
								"\n\t4: Trapezoid" +
								"\n\t5: Cube" +
								"\n\t6: Cylinder" +
								"\n\t7: Exit" +
								"\n\nPlease Make a Number Selection for the Shape You Would Like to Calculate");
			
			selection = input.nextInt();
			trash = input.nextLine();// this is to catch the enter key after a number is entered
			
			switch(selection){
			case 1:
				System.out.println("\nPlease Enter the length of the Square's side:");
				shapeObject = new Square_Pierce("Square", input.nextDouble());
				trash = input.nextLine();// this is to catch the enter key after a number is entered
				break;
			case 2:
				System.out.println("\nPlease Enter the length of the Triangle's first side:");
				double side1 = input.nextDouble();
				trash = input.nextLine();// this is to catch the enter key after a number is entered
				System.out.println("\nPlease Enter the length of the Triangle's second side:");
				double side2 = input.nextDouble();
				trash = input.nextLine();// this is to catch the enter key after a number is entered
				System.out.println("\nPlease Enter the length of the Triangle's third side:");
				double side3 = input.nextDouble();
				trash = input.nextLine();// this is to catch the enter key after a number is entered
				shapeObject = new Triangle_Pierce("Triangle", side1, side2, side3);
				break;
			case 3:
				System.out.println("\nPlease Enter the radius of the Circle:");
				shapeObject = new Circle_Pierce("Circle", input.nextDouble());
				trash = input.nextLine();// this is to catch the enter key after a number is entered
				break;
			case 4:
				System.out.println("\nPlease Enter the length of the Trapezoid's first parallel side:");
				side1 = input.nextDouble();
				trash = input.nextLine();// this is to catch the enter key after a number is entered
				System.out.println("\nPlease Enter the length of the Trapezoid's second parallel side:");
				side2 = input.nextDouble();
				trash = input.nextLine();// this is to catch the enter key after a number is entered
				System.out.println("\nPlease Enter the length of the Trapezoid's third side:");
				side3 = input.nextDouble();
				trash = input.nextLine();// this is to catch the enter key after a number is entered
				System.out.println("\nPlease Enter the length of the Trapezoid's forth side:");
				double side4 = input.nextDouble();
				trash = input.nextLine();// this is to catch the enter key after a number is entered
				shapeObject = new Trapezoid_Pierce("Trapezoid", side1, side2, side3, side4);	
				break;
			case 5:
				System.out.println("\nPlease Enter the length of the Cube's side:");
				shapeObject = new Cube_Pierce("Cube", input.nextDouble());
				trash = input.nextLine();// this is to catch the enter key after a number is entered
				break;
			case 6:
				System.out.println("\nPlease Enter the radius of the Cylinder:");
				double radius = input.nextDouble();
				trash = input.nextLine();// this is to catch the enter key after a number is entered
				System.out.println("\nPlease Enter the height of the Cylinder:");
				double height = input.nextDouble();
				trash = input.nextLine();// this is to catch the enter key after a number is entered
				shapeObject = new Cylinder_Pierce("Cylinder", radius, height);	
				break;
			case 7:
				System.exit(0);
				default:
			
			}// End of switch
			
			System.out.println(shapeObject);
			
			
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//End of Try/Catch block			
						
		}// End of first while loop
				
	}// End of Main method
	
}// End of class
