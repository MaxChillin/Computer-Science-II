package lab2_InheritanceWithShapes;

public class Square_Pierce extends Shape_Pierce {
	
	public Square_Pierce(String name, double side){
		this.setName(name);
		this.setSide(side);
		}
	
	public double getArea(){
		double area = this.getSide() * this.getSide();
		return area;
	}
	
	public double getPerimeter(){
		double parameter = this.getSide() * 4;
		return parameter;
	}
	
	public String toString(){
		return "\nShape: " + this.getName() +
				"\nSide: " + this.getSide() +
				"\nParameter: " + this.getPerimeter() +
				"\nArea: " + this.getArea();
	}

}
