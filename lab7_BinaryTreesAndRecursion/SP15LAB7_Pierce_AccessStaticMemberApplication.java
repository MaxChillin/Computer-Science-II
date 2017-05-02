package lab7_BinaryTreesAndRecursion;

import java.util.*;

public class SP15LAB7_Pierce_AccessStaticMemberApplication {
	
	/**
	 * 
	 * @param args
	 */	
	public static void main(String[] args){
		
		int temp = 0, num1 = 0, num2 = 0;
		
		Scanner input = new Scanner(System.in);
		String selection;
		
		
		
		do{
			System.out.println( "\n\t1: n!" +
								"\n\t2: a^n" +
								"\n\t3: Sum(n)" +
								"\n\t4: Sum(m,n)" +
								"\n\t5: Fn" +
								"\n\t6: GCD(n,m)" +
								"\n\t7: Exit");
			System.out.print("\n\tPlease Make a Selection: ");
			
			selection = input.nextLine();
			
			switch(selection){
			case "1":
				System.out.print("\n\tPlease Enter the Number for the Factorial: ");
				num1 = input.nextInt();
				input.nextLine();
				temp = RecursionStaticMethods_Pierce.factorial(num1);
				break;
			case "2":
				System.out.print("\n\tPlease Enter the Number of the Base: ");
				num1 = input.nextInt();
				input.nextLine();
				System.out.print("\n\tPlease Enter the Number of the Exponent: ");
				num2 = input.nextInt();
				input.nextLine();
				temp = RecursionStaticMethods_Pierce.powerOf(num1, num2);
				break;
			case "3":
				System.out.print("\n\tPlease Enter the Number for the Sum: ");
				num1 = input.nextInt();
				input.nextLine();
				temp = RecursionStaticMethods_Pierce.sum(num1);
				break;
			case "4":
				System.out.print("\n\tPlease Enter the First Number for the Sum: ");
				num1 = input.nextInt();
				input.nextLine();
				System.out.print("\n\tPlease Enter the Second Number for the Sum: ");
				num2 = input.nextInt();
				input.nextLine();
				temp = RecursionStaticMethods_Pierce.sum(num1, num2);
				break;
			case "5":
				System.out.print("\n\tPlease Enter the Number for the Fibonacci Series: ");
				num1 = input.nextInt();
				input.nextLine();
				temp = RecursionStaticMethods_Pierce.fibonacci(num1);
				break;
			case "6":
				System.out.print("\n\tPlease Enter the Larger Number for the GCD: ");
				num1 = input.nextInt();
				input.nextLine();
				System.out.print("\n\tPlease Enter the Smaller Number for the GCD: ");
				num2 = input.nextInt();
				input.nextLine();
				temp = RecursionStaticMethods_Pierce.GCD(num1, num2);
				break;
			case "7":
				System.exit(0);
				default:
					System.out.println("\n\tInvalid Input");
			}// End of switch
			
			System.out.println("\n\t" + temp);
			System.out.println("Recursion happened " + RecursionStaticMethods_Pierce.recursion + " times");
			
		}while(true);
		
		
		
		
	}// End of Main

}// End of class
