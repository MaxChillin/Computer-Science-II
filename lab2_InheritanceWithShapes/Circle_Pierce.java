package lab2_InheritanceWithShapes;

public class Circle_Pierce extends Shape_Pierce {
	
	private double radius = 0;
	
	public Circle_Pierce(String name, double radius){
		this.setName(name);
		this.radius = radius;
	}
	
	public double getArea(){
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double getPerimeter(){
		return Math.PI * radius * 2;
	}
	
	public String toString(){
		return "\nShape: " + this.getName() +
				"\nRadius: " + radius +
				"\nParameter: " + this.getPerimeter() +
				"\nArea: " + this.getArea();
	}

}
