package lab3_UnsortedOptimizedArrays;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class SP15LAB3_Pierce_UnsortedOptimizedArrayTester {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		// Declare the Object for the Unsorted Optimized Array
		ItemUnsortedOptimizedArray_Pierce itemList = new ItemUnsortedOptimizedArray_Pierce();
		
		// Declare three Objects from the Item class
		Item_Pierce item1 = new Item_Pierce("Bulb", "15937", "Electrical", "BBR30-06527FLF-12DE26-1U100", 43.99, 15);
		Item_Pierce item2 = new Item_Pierce("Screwdriver", "26048", "Electrical Tool", "35-910", 19.99, 20);
		Item_Pierce item3 = new Item_Pierce("Kitchen sink", "13579", "Kitchen", "KBU22", 429.99, 8);
		
		
		// Test for the insert and fetch methods
		System.out.println("\n*** Test of the insert and fetch method ***");
		System.out.println("Item1 insertion was: " + itemList.insert(item1));
		System.out.println("Item2 insertion was: " + itemList.insert(item2));
		// Fetch Item1
		System.out.print("Attempt to fetch Item1 was: ");	
		System.out.println(itemList.fetch("15937"));
		// Fetch Item3
		System.out.print("Attempt to fetch an item not found in array: ");
		System.out.println(itemList.fetch("13579"));
		// Fetch unknown Item
		System.out.print("Attempt to fetch an item not found in array: ");
		System.out.println(itemList.fetch("11111"));
		
		
		// Test for encapsulation
		System.out.println("\n*** Test of data encapsulation ***");
		item2.setUnitPrice(22.99);// change the price of item2
		System.out.print("Item2 info: ");
		System.out.println(item2);
		Item_Pierce copy = itemList.fetch("26048");// fetch a copy of item2
		System.out.print("Copy of Item2: ");
		System.out.println(copy);
		
		
		// Test for the delete method
		System.out.println("\n*** Test of the delete method ***");
		System.out.print("Attempt to delete an item not found in array: ");
		System.out.println(itemList.delete("14235"));// delete unknown item
		System.out.print("Attempt to delete Item1 was: ");
		System.out.println(itemList.delete("15937"));// delete item1
		System.out.print("Item1 fetch Item1 was: ");
		System.out.println(itemList.fetch("15937"));// fetch item1
		
		
		// Test for the update method
		System.out.println("\n*** Test of the update method ***");
		System.out.print("Attempt to update an item not found in array: ");
		System.out.println(itemList.update("14235", item1));
		System.out.print("Attempt to update Item2 was: ");
		System.out.println(itemList.update("26048", item3));
		System.out.print("Attempt to fetch Item2 was: ");
		System.out.println(itemList.fetch("26048"));
		System.out.print("Attempt to fetch Item3 was: ");
		System.out.println(itemList.fetch("13579"));
		
		// Declare the ArrayList
		ArrayList<Object> anArrayList_Pierce = new ArrayList<Object>(20);
		// Add 3 items to the arrayList
		System.out.print("Attempt to add Item1 to arrayList was: ");
		System.out.println(anArrayList_Pierce.add(item1));
		System.out.print("Attempt to add Item2 to arrayList was: ");
		System.out.println(anArrayList_Pierce.add(item2));
		System.out.print("Attempt to add Item3 to arrayList was: ");
		System.out.println(anArrayList_Pierce.add(item3));
		
		// Add numbers 1 to 100 into the arrayList
		for(int i = 1; i <= 100; i++)
			anArrayList_Pierce.add(i);
		System.out.println("There are " + anArrayList_Pierce.size() + " items in the arrayList");	
		anArrayList_Pierce.remove(item3);// Remove item3
		System.out.println("There are " + anArrayList_Pierce.size() + " items in the arrayList");		
		System.out.println("The value at index 25 is " + anArrayList_Pierce.get(25));// Get value stored at index 25		
		anArrayList_Pierce.set(25, 999);// Set value at index 25 to 999
		System.out.println("The value at index 25 has been changed to " + anArrayList_Pierce.get(25));		
		// This displays a message on the screen
		JOptionPane.showMessageDialog(null, "Congratulations! You are successful on ArrayList with four operations: add, get, remove and set");		
		
	}// End of Main

}// End of Class
