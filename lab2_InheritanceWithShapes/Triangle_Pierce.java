package lab2_InheritanceWithShapes;

public class Triangle_Pierce extends Shape_Pierce {
	
	private double side1, side2, side3;	
	
	public Triangle_Pierce(String name, double side1, double side2, double side3){
		this.setName(name);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		}	

	public double getArea(){
		double p = this.getPerimeter()/2;
		double area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
		return area;
	}
	
	public double getPerimeter(){		
		return side1 + side2 + side3;
	}
	
	public String toString(){
		return "\nShape: " + this.getName() +
				"\nSide1: " + side1 +
				"\nSide2: " + side2 +
				"\nSide3: " + side3 +
				"\nParameter: " + this.getPerimeter() +
				"\nArea: " + this.getArea();
	}

}
