package computeArea;
import java.util.Scanner;

public class SalesTax {

	public static void main(String[] args) {
		
			 Scanner input = new Scanner(System.in); 
			 double purchaseAmount;
			 
			 System.out.print("Enter purchase amount: "); 
			 
			 purchaseAmount = input.nextDouble(); 
			 
			 double tax = purchaseAmount * 0.06; 
			 
			 System.out.println("Sales tax is $" +(int) (tax * 100) / 100.0); 
			 
			


		 }
	}


