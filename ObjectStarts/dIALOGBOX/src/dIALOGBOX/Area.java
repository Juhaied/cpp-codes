package dIALOGBOX;


public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;     // To hold String input.
	      int    length;    // To hold length.
	      int    width;     // To hold width.
	      int    area;      // To hold area.

	      // Prompt user to input length.
	      input = JOptionPane.showInputDialog("Enter Length");

	      // Convert the String input to an int.
	      length = Integer.parseInt(input);

	      // Prompt user to input width.
	      input = JOptionPane.showInputDialog("Enter Width");

	      // Convert the String input to an int.
	      width = Integer.parseInt(input);

	      // Calculate area of rectangle.
	      area = length * width;

	      // Display area of rectangle.
	      JOptionPane.showMessageDialog(null,
	                                    "Area of rectangle is " + area);
	   }
	}


