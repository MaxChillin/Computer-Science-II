package lab4_StacksAndQueues;

public class GenericStack_Pierce <T> {
	
	private T[] data;
	private int top;
	private int size;
	
	
	public GenericStack_Pierce() {
		top = -1;
		size = 100;
		data = (T[]) new Object[100];
	}
	
	public GenericStack_Pierce(int size) {
		top = -1;
		this.size = size;
		data = (T[]) new Object[size];
	}
	
	public boolean push(T newNode){
		if(top == size -1) return false;
		
		data[++top] = newNode;
		return true;
	}
	
	public T pop(){
		if(top == -1) return null;
		
		int topLocation = top--;
		return data[topLocation];
	}
	
	public T peek(){
		if(top == -1) return null;		
		
		return data[top];
	}
	
	public boolean isEmpty(){
		if(top == -1) return true;
		
		return false;
	}
	

}// End of class
