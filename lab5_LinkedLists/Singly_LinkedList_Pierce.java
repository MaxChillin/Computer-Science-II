package lab5_LinkedLists;

import lab4_StacksAndQueues.Employee_Pierce;

public class Singly_LinkedList_Pierce {

	private Link header;
	
	public Singly_LinkedList_Pierce(){
		header = new Link();// Dummy node
		header.listing = null;
		header.next = null;
	}// End of no parameter constructor
	
	
	@SuppressWarnings("unused")
	public boolean insert(Employee_Pierce newEmployee){
		Link tempLink = new Link();
		if(tempLink == null) return false; // out of memory
		
		tempLink.next = header.next;
		header.next = tempLink;
		tempLink.listing = newEmployee.deepCopy();
		return true;
	}// End of insert method
	
	
	public Employee_Pierce fetch(String targetKey){
		Link currentLink = header.next;
		
		while(currentLink != null && !currentLink.listing.getEmployeeID().equals(targetKey))
			currentLink = currentLink.next;
		
		if(currentLink != null) 
			return currentLink.listing.deepCopy();
		 
		return null;
	}// End of fetch method
	
	
	public boolean delete(String targetKey){
		Link previousLink = header;
		Link currentLink = header.next;
		
		while(currentLink != null && !currentLink.listing.getEmployeeID().equals(targetKey)){
			previousLink = currentLink;
			currentLink = currentLink.next;
		}
		
		if(currentLink != null){
			previousLink.next = currentLink.next;
			return true;
		}
		
		return false;
	}// End of delete method
	
	
	public boolean update(String targetKey, Employee_Pierce newEmployee){
		if(delete(targetKey) == false)
			return false;
		if(insert(newEmployee) == false)
			return false;
		
		return true;		
	}// End of update method
	
	
	public void showAll(){
		Link link = header.next;
		
		while(link != null){
			System.out.println(link.listing.toString());
			link = link.next;
		}
	}// End of showAll method
	
	
	// Inner class
	public class Link{
		private Employee_Pierce listing;
		private Link next;
		
		// Link no parameter Constructor
		public Link(){
			
		}// End of Link no parameter Constructor
	}//End of Inner Class

}// End of Class
