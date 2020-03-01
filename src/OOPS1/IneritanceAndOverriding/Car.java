package OOPS1.IneritanceAndOverriding;

/**
 * 
 * @author Sumit
 * @implNote
 * To understand PARENT, CHILD INHERITANCE and METHOD OVERRIDING.
 */

public class Car extends Vehicle {

	public void start() {
		System.out.println("Car Start");
	}
	
	
	public void stop() {
		System.out.println("Car Stop");
	}
	
	
	public void refuel() {
		System.out.println("Car Refuel");
	}
}
