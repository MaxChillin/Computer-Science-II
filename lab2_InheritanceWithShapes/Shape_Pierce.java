package lab2_InheritanceWithShapes;

public class Shape_Pierce {
	
	protected double side = 0;
	private String name = "Shape";
	
	protected final void setSide(double side){
		this.side = side;
	}
	
	protected final double getSide(){
		return this.side;
	}
	
	protected final void setName(String name){
		this.name = name;
	}
	
	protected final String getName(){
		return this.name;
	}
	
	public double getArea(){
		double area = 0;
		return area;
	}
	
	public double getPerimeter(){
		double parameter = 0;
		return parameter;
	}
	
	public double getVolume(){
		double volume = 0;		
		return volume;
	}
	
	public String toString(){
		String str = "\nShape: " + name;
		str += "\nSide: " + side;
		return str;
	}

}// End of class
