package OOPS1.ConstructorChainingUsingSuperMethod;

/**
 * 
 * @author Sumit
 * @implNote: Parent Class
 */

public class Business {
	
	String type;
	int revenue;
	String branches;
	

	public Business() { // If made PRIVATE, it will not be VISIBLE to child class constructors using super() method
		System.out.println("Default Business Class Constructor");
	}
	
	public Business(String name, int revenue, String branches) {  	// If made PRIVATE, it will not be VISIBLE to child class constructors 
		this.type = name;											//		using super(<var1>,<var2>....) method
		this.revenue = revenue;
		this.branches = branches;
		System.out.println("Parameterized Business Class Constructor");
	}

}
