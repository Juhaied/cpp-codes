package task;

public class DriverClass {

	public static void main(String[] args) {
Employee obj = new Employee() {
			
			
			@Override
			public void setSalary(int jobtype) {
				
				if(jobtype == 1) {
					this.Salary = 40000;
				}
				if(jobtype == 2) {
					this.Salary = 20000;
				}
				
			}
		};
		
		
		
		
		obj.setSSN(123);
		obj.printSSN();
		obj.setSSN(124);
		obj.printSSN();
	
		obj.setSSN(125);
		
		obj.printSSN();
		
		System.out.println();
		obj.setSalary(2);
		System.out.println("Salary for 123 is = " + obj.Salary);
		obj.setSalary(2);
		System.out.println("Salary for 124 is = " + obj.Salary);
		obj.setSalary(1);
		System.out.println("Salary for 125 is = " + obj.Salary);
		
		boolean x = obj.compareEmployees(obj);
		
		System.out.println();
		System.out.println();
		System.out.println("is 123 and 124 are equal "+x);
		
	}

}
