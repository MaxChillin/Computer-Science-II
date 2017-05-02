package lab2_InheritanceWithShapes;

import java.util.Arrays;
import java.util.StringTokenizer;

public class IntegerArraySorting_Pierce {
	
	private int[] unsortedArray;
	
	private int menuSelection = 0;
	
	public IntegerArraySorting_Pierce(int selection, String arrayNumbers) {
		menuSelection = selection;
		setArray(arrayNumbers);
	}// End of Constructor

	public void setArray(String array){
		
		StringTokenizer token = new StringTokenizer(array);
		
		unsortedArray = new int[token.countTokens()];// This creates an array using the number of tokens as the size
		
		for(int x = 0; x < unsortedArray.length; x++ ){
			unsortedArray[x] = Integer.parseInt(token.nextToken());// this cycles through the array and adds the tokens into each index of the array
		}// End of for loop
		
	}// End of setArray method
	
	public int[] getArray(){
		return unsortedArray;
	}
	
	public void printArray(){// this cycles through the array and prints out all the values in each index
		for(int i = 0; i < getArray().length; i++){
			System.out.print("" + unsortedArray[i] + " ");
			}
		System.out.println();
	}
	
	
	public void sortArray(){
		
		//Bubble Sort
		if(menuSelection == 1){
			for(int i = getArray().length -1; i > 1; i--){
				for(int j = 0; j < i; j++){
					if(unsortedArray[j] > unsortedArray[j+1])
						swapArrayValues(j, j+1);
					
				}// End of second for loop
				
			}// End of first for loop
			
		}// End of Bubble Sort
		
		
		//Insertion Sort
		if(menuSelection == 2){
			
		   for (int i = 1; i < getArray().length; i++){
			   int j = i;
			   int valueToSort = unsortedArray[i];
			   
			   while ((j > 0) && (unsortedArray[j-1] > valueToSort)){
				   unsortedArray[j] = unsortedArray[j-1];
				   j--;
				   
				   }// End of while loop
			   
			   unsortedArray[j] = valueToSort;
			   
			   }// End of for loop				

		}// End of Insertion Sort
		
		
		//Selection Sort
		if(menuSelection == 3){
			boolean minimumChanged = false;
			for(int x = 0; x < getArray().length-1; x++){
				int minimum = x;
				for(int y = x; y < getArray().length; y++){
					if(unsortedArray[minimum] > unsortedArray[y]){
						minimum = y;
						minimumChanged = true;
					}// End of if statement
					
				}// End of the second for loop
				
				if(minimumChanged){
					swapArrayValues(x, minimum);
					minimumChanged = false;
				}// End of if Statement
				
			}// End of first for loop
			
		}// End of Selection Sort
		
	}// End of sortArray method

	private void swapArrayValues(int indexOne, int indexTwo) {
		int temp = unsortedArray[indexOne];
		unsortedArray[indexOne] = unsortedArray[indexTwo];
		unsortedArray[indexTwo] = temp;
	}// End of swapArrayValues method
	
	public String toString(){
		String str = "\n\nSorting method: ";
		
		switch(menuSelection){
		case 1:
			str += "BUBBLE SORT";
			break;
		case 2:
			str += "INSERTION SORT";
			break;
		case 3:
			str += "SELECTION SORT";
			break;
		}
		
		str += "\nOriginal list of numbers: " + Arrays.toString(getArray()).replace(",", "").replace("[", "").replace("]", "");// replaces the brackets and commas
		sortArray();
		str += "\nSorted list: " + Arrays.toString(getArray()).replace(",", "").replace("[", "").replace("]", "");// replaces the brackets and commas
		
		return str;
	}

}// End of Class
