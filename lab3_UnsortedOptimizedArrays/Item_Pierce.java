package lab3_UnsortedOptimizedArrays;

public class Item_Pierce {
	
	private String name; 	 		
	private String itemID;  
	private String productType; 
	private String model;
	private double unitPrice; 
	private int count;	
	
	// No Argument Constructor
	public Item_Pierce() {
		
	}// End of No Argument Constructor
	
	// Parameter Constructor
	public Item_Pierce(String name, String itemID, String productType,
						String model, double unitPrice, int count) {
		
		this.name = name;
		this.itemID = itemID;
		this.productType = productType;
		this.model = model;
		this.unitPrice = unitPrice;
		this.count = count;
	}// End of Parameter Constructor
	
	
	// Copy Constructor
	public Item_Pierce(Item_Pierce copy) {
		
		this.name = copy.name;
		this.itemID = copy.itemID;
		this.productType = copy.productType;
		this.model = copy.model;
		this.unitPrice = copy.unitPrice;
		this.count = copy.count;
	}// End of Copy Constructor

	
	public String getName() {
		return name;
	}// End of getName method

	
	public void setName(String name) {
		this.name = name;
	}// End of setName method
	

	public String getItemID() {
		return itemID;
	}// End of getItemID method
	

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}// End of setItemID method
	

	public String getProductType() {
		return productType;
	}// End of getProductType method
	

	public void setProductType(String productType) {
		this.productType = productType;
	}// End of setProductType method
	

	public String getModel() {
		return model;
	}// End of getModel method
	

	public void setModel(String model) {
		this.model = model;
	}// End of setModel method
	

	public double getUnitPrice() {
		return unitPrice;
	}// End of getUnitPrice method
	

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}// End of setUnitPrice method
	

	public int getCount() {
		return count;
	}// End of getCount method
	

	public void setCount(int count) {
		this.count = count;
	}// End of setCount method
	
	
	public Item_Pierce deepCopy(){
		Item_Pierce deepCopy = new Item_Pierce(this.name, this.itemID, this.productType, this.model, this.unitPrice, this.count);
				
		return deepCopy;
	}// End of deepCopy method
	
	
	public int compareTo(String targetKey){
		return itemID.compareTo(targetKey);
	}// End of compareTo method
	

	@Override
	public String toString() {
		return "\n\tItem name: " + name + "\n\tItem ID: " + itemID
				+ "\n\tproductType: " + productType + "\n\tmodel: " + model
				+ "\n\tunitPrice: " + unitPrice + "\n\tcount: " + count;
	}// End of toString method
}// End of Class
