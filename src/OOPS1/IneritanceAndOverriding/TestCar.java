package OOPS1.IneritanceAndOverriding;

/**
 * 
 * @author Sumit
 * @implNote
 * To understand PARENT, CHILD INHERITANCE and METHOD OVERRIDING.
 */

public class TestCar {

	public static void main(String[] args) {
		Car a = new Car();
		a.start(); 				// O/p: Car Start. Compiler will see that start() method already found in PARENT class thus not need
								// to check further
		a.stop(); 				// O/p: Car Stop
		a.refuel(); 			// O/p: Car Refuel
	  //a.autoAirSuspension();	// It will fail since Parent cannot access Child class specific properties
		a.engine(); 			// O/p: Vehicle Engine
		
		// ******************************************************************************************************
		
		BMW b = new BMW();
		b.start(); 				// O/p: BMW Start		| This is called Method Overriding
								// During compilation, JIT compiler will notice Parent and Child both have same methods and gets 
								// confused and will leave the decision to be taken at runtime
								// During Runtime, it will be decided by JVM to call the overridden method inside child class
								// That is why METHOD OVERRIDING is called as RUN TIME POLYMORPHISM.
		
		b.stop(); 				// O/p: Car Stop
		b.refuel(); 			// O/p: Car Refuel
		b.autoAirSuspension();	// O/p: BMW suspension
		b.engine();  			// O/p: Vehicle Engine	// accessing grand parent members

		// ******************************************************************************************************
		
		new BMW(); 				// An object without any class reference will be created but later destroyed by GC (Garbage Collector)

		
		//********* TOP CASTING	| Casting Child object to be referred by Parent class REFERENCE VARIABLE ***********
		Car c = new BMW(); 		// Child class OBJECT (new BMW()) is being referred by Parent CLASS VARIABLE
		c.start(); 				// O/p: BMW Start. 
		
		// Compiler will see that start() method is there in child of the object. thus JVM will invoke this instead of the method in Parent
		// With Line 41, an Object will be created for BMW class which is referred by Car Class reference variable
		// BMW class has start(), autoAirSusension() methods as well as copy of stop() and refuel() methods from parent class.
		
		// When the Class variable "c" will try to access start(), it will always refer to OVERRIDDEN METHOD of child. 
		// Thus BMW's overridden method	will be called instead of Parent class's start method.
		
		// TOP CASTING PARENT REFERENCE VARAIBLE can ONLY ACCESS PARENT METHODS AND OVERRIDDEN CHILD METHODS 
		// 	AND NOT CHILD METHODS which are not overridden

		c.stop();				// O/p: Car Stop
		c.refuel();				// O/p: Car Refuel
		c.engine(); 			// O/p: Vehicle Engine
	  
		//c.autoAirSuspension(); 	// It will fail since PARENT CLASS REFERENCE VARIABLE CANNOT ACCESS CHILD CLASS MEMBERS
		
		// ********** MECHANICS OF JAVA METHOD ACCESSIBILITY | REFERENCE TYPE SECURITY CHECK ************ 
		//		For any methods (in this case autoAirSuspension()), JAVA CREATES A SECURITY LAYER DURING RUNTIME
		// 		If a BMW CLASS REFERENCE VARIABLE is trying to access its own method, then the security layer will check its signature 
		//		a.k.a reference type, It will give its reference type as BMW, so compiler will allow the class reference variable to access
		// 		But if PARENT CAR CLASS REFERENCE VARIABLE tries to access autoAirSuspension(), security layer will check for its
		//		reference type and come to know that its reference type is not BMW but CAR, access will be RESTRICTED

		Vehicle v1 = new Car();		// TOP CASTING ALLOWED	-- v1 can access Car class overridden members and Vehicle class data members 
		Vehicle v2 = new BMW();		// TOP CASTING ALLOWED  -- v1 can access BMW class overridden members and Vehicle class data members
		
		//v2.autoAirSuspension();		// It will fail since Parent cannot access Child class specific properties
		
//********  DOWN CASTING | Casting Parent object to be referred by Child class REFERENCE VARIABLE ***********

		//BMW obj = new Car(); 	// O/p is compilation error
				//	Direct DOWN CASTING is not possible, 
				// Reason: All Cars can be BMW, but all BMW cannot be a CAR.
				// To solve the issue, Java provides a workaround, Java will try to shrink CAR class in the size of BMW
				// by converting it into BMW class. The Object of CAR class will behave like the object of BMW. this is called
				//  TYPE CASTING
	
		// Example of TYPE CASTING:
		
		//BMW d = (BMW)new Car();
				// During compilation, compiler will get confused that we've SHRINKED the object of CAR class (a PARENT class) and we're
				// trying to store the CAR Object inside the BMW class. In this case compiler gets confused and stops giving compilation
				// error. However during runtime, we'll get exception "ClassCastException" which says CAR cannot be cast to BMW
		
		// Overridden methods can be accessed by child class variables as well as parent class variables
		
		//PROBLEM WITH INHERITANCE:
		// Multiple Inheritance is not allowed i.e. child cannot inherit from two different parents 
		// a.k.a DIAMOND PROBLEM in java
		 
		//Solution of DIAMOND PROBLEM | Multiple Inheritance is INTERFACE
		
	}
}
