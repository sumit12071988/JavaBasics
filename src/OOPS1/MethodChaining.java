package OOPS1;

/**
 * 
 * @author Sumit
 * @implNote : To understand method chaining and method accessibility in static and non-static methods
 * 	1. NON-STATIC methods can call NON-STATIC method within a class WITHOUT OBJECT REFERENCE.
 *  2. NON-STATIC methods can call STATIC method WITHOUT OBJECT REFERENCE
 *	2. STATIC methods can call STATIC method within a class WITHOUT CLASS REFERENCE.
 *	3. STATIC methods can call NON-STATIC method within a class ONLY using OBJECT REFERENCE
 */

public class MethodChaining {

// ********** STATIC METHODS ********************************************************************************************	
	public static void m1() {
		m2();							// Accessing static methods from static methods
		new MethodChaining().NS1();		// Accessing non static methods from inside static methods. ONLY POSSIBLE USING OBJECT REFERENCE
	}									
	
	public static void m2() {
		m3();							// Accessing static methods from static methods
	}	
	
	public static void m3() {
		System.out.println("BYE");
	}
	
// ********** NON STATIC METHODS ********************************************************************************************	
	
	public void NS1() {
		NS2();							// Accessing non static methods from another non static methods without object reference
		m3();
	}
	
	public void NS2() {
		this.NS3();						// Accessing non static methods from another non static methods without object reference
	}	
	
	public void NS3() {
		NS4();							// Accessing non static methods from another non static methods without object reference
	}
	
	public void NS4() {
		System.out.println("Hey");
	}	
	
	public static void main(String[] args) {
		m1();		
	 	new MethodChaining().NS1();
	}
}
