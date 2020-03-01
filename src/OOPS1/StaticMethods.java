package OOPS1;

/**
 * 
 * @author Sumit
 * @implNote
 *	Used to understand the concept of Static keywords 
 */
public class StaticMethods {
	
		   String name;							// NON-STATIC VARIABLE

	public void search() {						// NON-STATIC METHODS
				System.out.println("I'm Non Static Method");
	}	
		   
	static String staticName;					// STATIC VARIABLE
	
	private static void getName() {				// STATIC METHODS
		System.out.println("I'm Static Method");
	}



	
	// JAVA MEMORY
	// Divided into two parts: HEAP MEMORY and STACK MEMORY
	// When we create static members (static variables and static methods), a COMMON MEMORY ALLOCATION will happen inside 
	// 	STACK memory which makes them accessible by Objects as well as without Objects.
	
	// During compilation, JIT Compiler will identify static members and store them in STACK MEMORY & identifies non static 
	// 	members and stores them in HEAP MEMORY
 
	// Once an object is created , It is created inside HEAP MEMORY and it will be referred by class variable (object name)
	// Inside the Object, non-static members (non static variables and non static methods) will be stored.
	// Static members (Static variables and Static methods) will NOT be stored inside the object.
	// OBJECT CANNOT HOLD STATIC VARAIBLES AND STATIC METHODS.
	// All objects are created under HEAP MEMORY and holds non-static members.
	
	//Q: How to call static members ?
	//A: Static members can be accessed:
	//   1. By calling them DIRECTLY
	//	 2. Using Class reference.
	
	
	public static void main(String[] args) {
		
		//ACCESSING STATIC MEMBERS
			// 1. DIRECTLY
			staticName="Alex";
			getName();
		
			// 2. USING CLASS REFERENCE
			StaticMethods.staticName="Baldwin";	
			StaticMethods.getName();
		
		//ACCESSING NON-STATIC METHODS
		StaticMethods obj = new StaticMethods();
		obj.name ="Sumit";
		obj.search();
		
		// ACCESSING STATIC MEMBERS USING OBJECT REFERENCE
		obj.staticName ="Text";
		obj.getName();
		
		// getname() and staticName are not part of the Object obj but still Java allows that with a warning because since static
		//	members are COMMON property (COMMON MEMORY ALLOCATION) , they are open to be accessed by any objects

	}
}
