package lab2_InheritanceWithShapes;

public class Trapezoid_Pierce extends Shape_Pierce {
	
	private double parallelSide1, parallelSide2, side3, side4;

	public Trapezoid_Pierce(String name, double parallelSide1, double parallelSide2, double side3, double side4) {
		this.setName(name);
		this.parallelSide1 = parallelSide1;
		this.parallelSide2 = parallelSide2;
		this.side3 = side3;
		this.side4 = side4;
	}
	
	public double getPerimeter(){		 
		return parallelSide1 + parallelSide2 + side3 + side4;
	}
	
	public double getArea(){
		double s = this.getPerimeter()/2;
		double area = (parallelSide1 + parallelSide2) / 
				(Math.abs(parallelSide2 - parallelSide1)) * 
				Math.sqrt((s - parallelSide1) * (s - parallelSide2) * 
						(s - side3 - parallelSide2) * (s - side4 - parallelSide2));
		return area;
	}
	
	public String toString(){
		return "\nShape: " + this.getName() +
				"\nParallel Side 1: " + parallelSide1 +
				"\nParallel Side 2: " + parallelSide2 +
				"\nSide 3: " + side3 +
				"\nSide 4: " + side4 +
				"\nParameter: " + this.getPerimeter() +
				"\nArea: " + this.getArea();
	}

}
