
public class Box {
	//creating instance variables
	
	double width;
	double height;
	double depth;
	

	double volume() {
		
		return width * height * depth ;
	}
	public void setDim(double w,double h,double d) {
		width = w;
		height = h;
		depth = d;
	}

}
