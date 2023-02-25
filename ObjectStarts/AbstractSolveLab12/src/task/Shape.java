package task;

public abstract class Shape {

	private double dimension1;
	private double dimension2;
	
	public Shape(double d1, double d2) {
		dimension1 = d1;
		dimension2 = d2;
	}
	public void setDimension1(double d1) {
		this.dimension1 = d1;
	}
	public void setDimension2(double d2) {
		this.dimension2 = d2;
	}
	public double getDimension1() {
		return dimension1;
	}
	public double getDimension2() {
		return dimension2;
	}
	public String getName() {
		return "Shape";
	}
	public  abstract double getArea();
	
	public String toString() {
		return "Shape[ Dimension1 = " +dimension1 + " Dimension2 = "+dimension2 + "]";
	}
}
