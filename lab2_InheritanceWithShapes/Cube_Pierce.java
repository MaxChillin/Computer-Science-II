package lab2_InheritanceWithShapes;

public class Cube_Pierce extends Shape_Pierce {
	
	public Cube_Pierce(String name, double side){
		this.setName(name);
		this.setSide(side);
	}
	
	public double getArea(){
		return Math.pow(this.getSide(), 2) * 6;
	}
	
	public double getVolume(){
		return Math.pow(this.getSide(), 3);
	}
	
	public String toString(){
		return "\nShape: " + this.getName() +
				"\nSide: " + this.getSide() +
				"\nVolume: " + this.getVolume() +
				"\nArea: " + this.getArea();
	}

}
