package lab3_UnsortedOptimizedArrays;

import java.util.Arrays;

public class ItemUnsortedOptimizedArray_Pierce {
	
	private int next;
	private int size;
	
	private Item_Pierce[] item_data;

	public ItemUnsortedOptimizedArray_Pierce() {
		
		next = 0;
		size = 50;
		item_data = new Item_Pierce[size];
	}// End of constructor
	
	public boolean insert(Item_Pierce item){
		if(next == size) return false;
		
		item_data[next++] = item.deepCopy();		
		return true;
	}// End of the insert method
	
	
	public Item_Pierce fetch(String key){
		Item_Pierce node;
		int i = 0;
		while(i < next && !(item_data[i].compareTo(key) == 0)) i++; // This line increments "i" until a match is found or "i" becomes greater than "next"
		if(i == next) return null;// returns null if the item does not exist
		node = item_data[i].deepCopy();
		
		if(i != 0){
			Item_Pierce temp = item_data[i - 1];// move the item fetch up one index unless the item was in the zero index
			item_data[i - 1] = item_data[i];
			item_data[i] = temp;
		}// End of if statement
		return node;
	}// End of fetch method
	
	
	public boolean delete(String key){
		
		int i = 0;
		while(i < next && !(item_data[i].compareTo(key) == 0)) i++; // This line increments "i" until a match is found or "i" becomes greater than "next"
		if(i == next) return false;// returns false if the item does not exist
		item_data[i] = item_data[--next];//swap the last item with the item that was deleted then decrement next
		return true;
	}// End of delete method
	
	
	public boolean update(String key, Item_Pierce item){

		int i = 0;
		while(i < next && !(item_data[i].compareTo(key) == 0)) i++; // This line increments "i" until a match is found or "i" becomes greater than "next"
		if(i == next) return false;// returns false if the item does not exist
		item_data[i] = item_data[--next]; // this line deletes the selected node
		
		if(next == size) return false;
		item_data[next++] = item.deepCopy();// This lines inserts the new updated node

		return true;
	}// End of update method	

}// End of class
