package OOPS1.Interface;

/**
 * 
 * @author Sumit
 * @implNote: To understand the concept of interfaces
 * @implNote: WHO is grand parent INTERFACE with abstract methods
 * @implNote: USMedical is child interface with abstract methods which is INHERITING WHO interface
 * @implNote: UKMedical, IndianMedical are interfaces with abstract methods
 * @implNote: FortisHospital class IMPLEMENTS all the interfaces including WHO interface and defining all the abstract methods by overriding
 * @implNote: testHospital is calling all methods
 * 
 */

public interface B_USMedical_ChildInterface extends A_WHO_GrandParentInterface {
	
	int min_fee=10;
	// static final int min_fee=10; 
	// 		the Line 17 is equivalent to Line 16 by-default inside an interface

	public void orthopedicServices(); 
	
	public void dentalServices();
	
	public void neuroServices();
	
	public void ambulanceServices();
	
	
	
	//RULES: 100% ABSTRACTION.
	// 1. Methods doesn't require access modifier like public, private, protected etc..
	// 2. Methods allowed with body must be either STATIC or DEFAULT
	// 3. Variables are CONSTANTS i.e. STATIC and FINAL by default
	// 4. Cannot create an object of an interface.

	
	
	// We never see WebDriver driver = new WebDriver();
	// Reason is WebDriver is an Interface, and thus we cannot create object of an Interface
	 
	// That's why we write WebDriver driver = new ChromeDriver();
	// Reason is ChromeDriver is the Child Class for WebDriver Interface.
	
	// After JDK 1.8:
	// 1. INTERFACES can have method body using DEFAULT method, which can be OVERRIDDEN in CLASS which IMPLEMENTS the interface
	//		DEFAULT access modifier is used to mention some Default feature of the INTERFACE. This DEFAULT method is not used in SELENIUM
	//		DEFAULT access modifier doesn't affect the intention behind creating INTERFACE.
	//		INTERFACES are created with an intention to set RULES !!
	//					which every class (which intends to IMPLEMENT the INTERFACE) MUST DEFINE THOSE RULES
	//		DEFAULT access modifier is used create to minor methods which we can either override or use it directly
	
	default void services_911() {
		System.out.println("US 911 Services");
	}
	
	// 2. We can have STATIC methods in INTERFACE BUT with method body and those static methods cannot be OVERRIDDEN
	static void billing() {
		System.out.println("US Billing");
	}
	
	// private void test();		//Private access modifier is NOT ALLOWED
}
