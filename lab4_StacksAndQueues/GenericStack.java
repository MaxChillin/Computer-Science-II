package lab4_StacksAndQueues;

public class GenericStack<T> {
	
	private T[] data;
	private int top;
	private int size;

	public GenericStack() {
		top = -1;
		size = 100;
		data = (T[]) new Object[100];
	}

	public GenericStack(int n) {
		top = -1;
		size = n;
		data = (T[]) new Object[n];
	}

	public boolean push(T newNode) {
		//GenericNode node = (GenericNode) newNode;
		if (top == size - 1)
			return false;
		else {
			data[++top] = newNode; //(T) node.deepCopy();
			return true;
		}
	}

	public T pop() {
		int topLocation;
		if (top == -1)
			return null;
		else {
			topLocation = top--;
			return data[topLocation];
		}
	}
	
	public T peek() {
		int topLocation;
		if (top == -1)
			return null;
		else {
			topLocation = top;
			return data[topLocation];
		}
	}

	public void showAll() {
		for (int i = top; i >= 0; i--)
			System.out.println(data[i].toString());
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}
	
	/*public boolean isOperation(){
		if(data[top] == '+')
			return true;
	}*/
	
	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}
}
