package lab4_StacksAndQueues;

public class EmployeeQueue_Pierce {
	
	private Employee_Pierce[ ] data;
	private int	numOfNodes;
	private int size;
	private int front;
	private int rear;
	
	// No argument constructor
	public EmployeeQueue_Pierce() {		
		
		numOfNodes = 0;
		size = 10;
		front = 0;
		rear = 0;
		
		data = new Employee_Pierce[size];
	}// End of No argument constructor
	
	// parameter constructor
	public EmployeeQueue_Pierce(int size) {		
		
		numOfNodes = 0;
		this.size = size;
		front = 0;
		rear = 0;
		
		data = new Employee_Pierce[size];
	}// End of parameter constructor
	
	
	public boolean enqueue(Employee_Pierce newNode){
		if(numOfNodes == size) return false;
		
		data[rear] = newNode;
		rear = (rear + 1) % size;
		numOfNodes++;
		return true;
	}
	
	public Employee_Pierce dequeue(){
		if(numOfNodes == 0) return null;
		
		front %= size;
		Employee_Pierce temp = data[front];		
		data[front++] = null;
		numOfNodes--;
		return temp;
	}
	
	
	public Employee_Pierce peek(){
		if(numOfNodes == 0) return null;
		
		return data[front];
	}
	
	
	public void showAll() {
		System.out.println("*****List of employees in queue from front to rear*****");
		for(int i = front; i < front + numOfNodes; i++)//This loops through the items in the queue and prints them to the screen
			System.out.println(data[i]);
			
		System.out.println("\n*****End of List*****");		
	}// End of showAll method

}// End of class
