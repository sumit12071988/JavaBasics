package OOPS1.AbstractConcept;


/**
 * 
 * @author Sumit
 * @implNote: TO understand ABSTRACT CLASS
 */

public abstract class Page {

	//abstract methods and non abstract methods
	// CANNOT create OBJECT for abstract class
	// CAN create CONSTRUCTOR for abstract class
	// Abstract Class CONSTRUCTOR can be created but will be called with child class object creation
	// If Abstract Parent Class has constructor and child class also has a constructor (defined), Then when child class object is created,
	//		1st Parent class constructor will be called then Child class constructor will be called
	// If Child class constructor is not defined then during child class object creation, only parent class constructor will be only called.
	// CAN OVERRIDE abstract methods as well as non abstract methods
	// CANNOT OVERRIDE static methods
	
	
	
	public Page() {
		System.out.println("Page Class Const....");
	}	
	
	public abstract void header();
	public abstract void title();
	
	// logout() method is created as non abstract method since logout is not applicable for LoginPage, but applicable for HomePage
	
	public final void logout() {
		System.out.println("user logged out");
	}
	
	// To avoid any overriding, we make a method as FINAL, this way the method cannot be overridden by any one
	
	public static void signUp() {
		System.out.println("Page - SignUp");
	}
}
