package lab7_BinaryTreesAndRecursion;

import java.util.*;

public class SP15LAB7_Pierce_PhoneService {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String selection, id, address;
		
		BinarySearchTree_Pierce tree = new BinarySearchTree_Pierce();
		PhoneUserAccount_Pierce customer;
		
		do{
			
			System.out.println( "\n\t1: Insert New Listing" +
								"\n\t2: Search For A Listing" +
								"\n\t3: Delete A Listing" +
								"\n\t4: Update A Listing" +
								"\n\t5: Show All Listings" +
								"\n\t6: Exit ");
			System.out.print("\n\tPlease Make A Selection:");
			
			selection = input.nextLine();
			
			switch(selection){
			case "1":
				System.out.print("\n\tPlease Enter the Account ID of the New Listing");
				customer = new PhoneUserAccount_Pierce(input.nextLine());
				tree.insert(customer);
				break;
			case "2":
				System.out.print("\n\tPlease Enter the Account ID of the Listing to Search for");
				System.out.println(tree.fetch(input.nextLine()));
				break;
			case "3":
				System.out.print("\n\tPlease Enter the Account ID of the Listing to Delete");
				id = input.nextLine();
				System.out.println(tree.fetch(id) + "\n\n\tThis Listing Was Deleted");
				tree.delete(id);
				break;
			case "4":
				System.out.print("\n\tPlease Enter the Account ID of the Listing to Update");
				id = input.nextLine();
				customer = tree.fetch(id);
				System.out.print("\n\tPlease Enter the New Address of the Listing to Update");
				customer.setAddress(input.nextLine());
				System.out.println(tree.update(id, customer));
				System.out.println(tree.fetch(id));
				break;
			case "5":
				tree.showAll();
				break;
			case "6":
				System.exit(0);
				default:
					System.out.println("\n\tInvalid Input");
			}// End of switch
			
		}while(true);

	}

}
