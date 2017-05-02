package finalProject;

import java.io.*;

public class LibraryDataBase_Pierce {

	public Link header;
	
	
	public LibraryDataBase_Pierce(){
		header = new Link();// Dummy node
		header.book = null;
		header.next = null;
	}// End of no parameter constructor
	

	public boolean addBook(Book_Pierce book){
		Link tempLink = new Link();
		if(tempLink == null) return false; // out of memory

		tempLink.next = header.next;
		header.next = tempLink;
		tempLink.book = book.deepCopy();
		return true;
	}// End of addBook method


	public boolean removeBook(String key){
		Link previousLink = header;
		Link currentLink = header.next;

		while(currentLink != null && !currentLink.book.getTitle().equalsIgnoreCase(key)){
			previousLink = currentLink;
			currentLink = currentLink.next;
		}

		if(currentLink != null){
			previousLink.next = currentLink.next;
			return true;
		}

		return false;
	}// End of removeBook Method


	public Book_Pierce searchByID(String key){

		Link currentLink = header.next;

		while(currentLink != null && !currentLink.book.getId().equalsIgnoreCase(key))
			currentLink = currentLink.next;

		if(currentLink != null) 
			return currentLink.book.deepCopy();

		return null;

	}// End of searchByID method


	public Book_Pierce searchByISBN(String key){

		Link currentLink = header.next;

		while(currentLink != null && !currentLink.book.getIsbn().equalsIgnoreCase(key))
			currentLink = currentLink.next;

		if(currentLink != null) 
			return currentLink.book.deepCopy();

		return null;

	}// End of searchByISBN method


	public Book_Pierce searchByTitle(String key){

		Link currentLink = header.next;

		while(currentLink != null && !currentLink.book.getTitle().equalsIgnoreCase(key))
			currentLink = currentLink.next;

		if(currentLink != null) 
			return currentLink.book.deepCopy();

		return null;

	}// End of searchByTitle method


	public void searchByWriter(String key){

		Link currentLink = header.next;

		while(currentLink != null){ 
			if(currentLink.book.getWriter().equalsIgnoreCase(key))
				System.out.println(currentLink.book);			
			currentLink = currentLink.next;
		}
	}// End of searchByWriter method


	public void searchByPublisher(String key){

		Link currentLink = header.next;

		while(currentLink != null){ 
			if(currentLink.book.getPublisher().equalsIgnoreCase(key))
				System.out.println(currentLink.book);			
			currentLink = currentLink.next;
		}
	}// End of searchByPublisher method
	
	
	public void writeToFile(File file){
		PrintWriter printWriter = makePrintWriter(file);
		Link currentLink = header.next;
		while(currentLink != null){ 
			printWriter.println(currentLink.book.toFile());			
			currentLink = currentLink.next;
		}	
		printWriter.close();
	}// End of writeToFile method
	
	
	public static PrintWriter makePrintWriter(File file){
    	PrintWriter printWriter = null;
    	try {
    		 printWriter = new PrintWriter(
    				new BufferedWriter(new FileWriter(file)));
    	} catch (IOException e) {
    		System.out.println("Could Not Write to File");
    		System.exit(0);			
    	}
    	return printWriter;
    }// End of makePrintWriter method	


	public class Link{
		private Book_Pierce book;
		private Link next;

		// Link no parameter Constructor
		public Link(){

		}// End of Link no parameter Constructor
	}//End of Inner Class

}// End of LibraryDataBase class
