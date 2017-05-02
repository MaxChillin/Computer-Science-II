package lab2_InheritanceWithShapes;

public class Cylinder_Pierce extends Shape_Pierce {
	
	private double radius = 0;
	private double height = 0;
	
	// Constructor
	public Cylinder_Pierce(String name, double radius, double height){
		this.setName(name);
		this.radius = radius;
		this.height = height;
	}// End of Constructor
	
	
	public double getArea(){
		return (Math.PI * radius * 2 * height) + (2 * Math.pow(radius, 2) * Math.PI);
	}
	
	public double getVolume(){
		return Math.PI * Math.pow(radius, 2) * height;
	}
	
	//toString Method
	public String toString(){
		return "\nShape: " + this.getName() +
				"\nRadius: " + radius +
				"\nHeight: " + height +
				"\nVolume: " + this.getVolume() +
				"\nArea: " + this.getArea();
	}// End of toString method

}// End of class
