package lab7_BinaryTreesAndRecursion;

public class BinarySearchTree_Pierce {
	
	TreeNode root;
	static int level = 0;
	
	public BinarySearchTree_Pierce(){
		root = null;
	}
	
	
	// ************ INSERT *********************
	public boolean insert(PhoneUserAccount_Pierce customer){
		TreeNodeWrapper parent = new TreeNodeWrapper();
		TreeNodeWrapper child = new TreeNodeWrapper();
		TreeNode node = new TreeNode();
		if(node == null) return false; // OUT OF MEMORY
		else{
			node.node = customer.deepCopy();
			node.leftChild = null;
			node.rightChild = null;
			
			if(root == null) root = node;
			else{
				findNode(customer.getAccountID(), parent, child);
				if(customer.getAccountID().compareTo(parent.get().node.getAccountID()) < 0)
					parent.get().leftChild = node;
				else
					parent.get().rightChild = node;
			}			
			return true;			
		}
		
	}// End of insert method
	
	
	//************ FETCH *********************
	public PhoneUserAccount_Pierce fetch(String key){
		
		boolean found;
		TreeNodeWrapper parent = new TreeNodeWrapper();
		TreeNodeWrapper child = new TreeNodeWrapper();
		found = findNode(key, parent, child);
		
		if(found) return child.get().node.deepCopy();
		else{
			System.out.println("\n\tTree is Empty");
			return null;
		}
	}// End of fetch method
	
	
	//************ DELETE *********************
	public boolean delete(String key){
		
		boolean found;
		TreeNodeWrapper parent = new TreeNodeWrapper();
		TreeNodeWrapper child = new TreeNodeWrapper();		
		TreeNode nextLargest, largest, top;
		found = findNode(key, parent, child);
		
		if(!found) return false;
		else{
			if(parent.get() == child.get()){
				top = root;
				if(parent.get().leftChild != null){
					child.set(child.get().leftChild);
					while(child.get().rightChild != null){
						parent.set(child.get());
						child.set(child.get().rightChild);
						//System.out.println("\tParent: " + parent.get().node.getAccountID());
						//System.out.println("\tChild: " + child.get().node.getAccountID());
					}
					
					if(child.get().leftChild != null)
						parent.get().rightChild = child.get().leftChild;
					else
						parent.get().rightChild = null;
					
						
					root = child.get();
					child.get().leftChild = top.leftChild;
					child.get().rightChild = top.rightChild;
				}		
				else{
					while(child.get().rightChild != null){
						parent.set(child.get());
						child.set(child.get().rightChild);
						//System.out.println("\tParent: " + parent.get().node.getAccountID());
						//System.out.println("\tChild: " + child.get().node.getAccountID());
					}
					
					if(child.get().leftChild != null)
						parent.get().rightChild = child.get().leftChild;
					else
						parent.get().rightChild = null;
					
						
					root = child.get();
					child.get().leftChild = top.leftChild;
					child.get().rightChild = top.rightChild;
				}
				return true;
			}
			// ***** Case 1 *****
			if(child.get().leftChild == null && child.get().rightChild == null){
				if(parent.get().leftChild == child.get())
					parent.get().leftChild = null;
				else
					parent.get().rightChild = null;
				return true;
				}// End of Case 1
			else // ***** Case 2 *****
				if(child.get().leftChild == null || child.get().rightChild == null){
					if(parent.get().leftChild == child.get()){
						if(child.get().leftChild != null)
							parent.get().leftChild = child.get().leftChild;
						else
							parent.get().leftChild = child.get().rightChild;
					}
					else{
						if(child.get().leftChild != null)
							parent.get().rightChild = child.get().leftChild;
						else
							parent.get().rightChild = child.get().rightChild;
					}
					return true;
				}// End of Case 2
				else { // ***** Case 3 *****
					nextLargest = child.get().leftChild;
					largest = nextLargest.rightChild;
					if(largest != null){
						while(largest.rightChild != null){
							nextLargest = largest;
							largest = largest.rightChild;
						}// End of while loop
						child.get().node = largest.node;
						nextLargest.rightChild = largest.leftChild;
					}
					else {
						nextLargest.rightChild = child.get().rightChild;
						if(parent.get().leftChild == child.get())
							parent.get().leftChild = nextLargest;
						else
							parent.get().rightChild = nextLargest;
					}						
				}// End of Case 3
			return true;			
		}		
	}// End of delete method
	
	
	//************ UPDATE *********************
	public boolean update(String key, PhoneUserAccount_Pierce customer){
		
		if(delete(key) == false) return false;
		if(insert(customer) == false) return false;
		
		return true;
		
	}// End of update method
	
	
	private boolean findNode(String key, TreeNodeWrapper parent, TreeNodeWrapper child){
		
		parent.set(root);
		child.set(root);
		if(root == null) return false;
		
		while(child.get() != null){
			if(child.get().node.getAccountID().equals(key)) return true;
			else{
				parent.set(child.get());
				if(key.compareTo(child.get().node.getAccountID()) < 0)
					child.set(child.get().leftChild);
				else
					child.set(child.get().rightChild);
			}
				
		}// End of while loop
		
		return false;
		
	}// End of findNode method
	
	
	public void LNROutput(TreeNode root){
		
		if(root.leftChild != null){
			level++;
			LNROutput(root.leftChild);
			level--;
		}
		
		System.out.println("\n\n\tLevel: " + level);
		System.out.print(root.node);
		if(root.leftChild != null)
			System.out.print("\n\tLC: " + root.leftChild.node.getAccountID());
		else
			System.out.print("\n\tLC: Null");
		if(root.rightChild != null)
			System.out.println("\n\tRC: " + root.rightChild.node.getAccountID());
		else
			System.out.println("\n\tRC: Null");
		
		if(root.rightChild != null){
			level++;
			LNROutput(root.rightChild);
			level--;
		}
		
		
	}// End of LNROutput method
	
	
	public void showAll(){
		if(root == null)
			System.out.println("\n\tTree is Empty");
		else
			LNROutput(root);
	}// End of showAll method
	
	
	//************ INNER CLASS ************
	public class TreeNode{
		
		private PhoneUserAccount_Pierce node;
		private TreeNode leftChild;
		private TreeNode rightChild;
		
	}// End of TreeNode Class
	
	
	//************ INNER CLASS ************
	public class TreeNodeWrapper{
		
		TreeNode treeRef = null;
		
		
		public TreeNode get(){
			return treeRef;
		}// End of get
		
		
		public void set(TreeNode node){
			treeRef = node;
		}// End of set
		
	}// End of TreeNodeWrapper Class
	
}// End of BinarySearchTree Class
