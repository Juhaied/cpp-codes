package task;

public class Animal {

	private int legs;
	
	public Animal(int legs) {
		this.legs = legs;
	
	}
	public void sleep() {
		String name = getClass().getSimpleName();
		System.out.println(name + " sleeping.......Dont disturb");
	}
}
