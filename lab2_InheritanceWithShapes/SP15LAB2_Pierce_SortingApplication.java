package lab2_InheritanceWithShapes;

import java.io.IOException;
import java.util.Scanner;

public class SP15LAB2_Pierce_SortingApplication {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String arrayNumbers;
		int selection = 0;
		boolean menu = true;

		while (true) {

			while (menu) {//
				System.out.println("\n\nSP15LAB2_Pierce_SortingApplication"+
						"\n\t1: Bubble Sort" + 
						"\n\t2: Insertion Sort" + 
						"\n\t3: Selection Sort" + 
						"\n\t4: Exit"	+ 
						"\n\tPlease Enter the Number of Your Selection");

				selection = input.nextInt();

				switch (selection) {
				case 1:
					menu = false;
					break;
				case 2:
					menu = false;
					break;
				case 3:
					menu = false;
					break;
				case 4:
					System.exit(0);
				default:
					System.out.println("Invalid Input. Please Enter a Number between 1 and 4.");
					break;
				}// End of Switch

			}// End of menu loop
			menu = true;
			
			// this is to catch the enter key that is not caught with the nextInt() method
			input.nextLine();

			System.out.println("Please Enter Any Set of Numbers for the Array");			
			
			arrayNumbers = input.nextLine();
			
			IntegerArraySorting_Pierce firstArray = new IntegerArraySorting_Pierce(selection, arrayNumbers);
			
			System.out.println(firstArray.toString());
			
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}// End of first loop

	}// End of main

}// End of class
