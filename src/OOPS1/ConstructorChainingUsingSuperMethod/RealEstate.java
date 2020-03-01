package OOPS1.ConstructorChainingUsingSuperMethod;

/**
 * 
 * @author Sumit
 * @implNote: Child Class
 */

public class RealEstate extends Business {
	
	public RealEstate() {
		// Parent Class Default Class Constructor will be called IMPLICITLY
		super(); // super keyword will call PARENT CLASS CONSTRUCTOR (In this case, calls Default constructor) EXPLICITLY.
		System.out.println("Real Estate Default Constructor");
		// super(); // Compiler throws error since super keyword should be the 1st line inside a constructor
	}

	public RealEstate(String type, int revenue, String branches) {
		super(type, revenue, branches);	// super keyword will call PARENT CLASS CONSTRUCTOR. (In this case, calls param. constructor)
		System.out.println("Real Estate Parameterized Constructor");
		// super(type, revenue, branches);  // Compiler throws error since super keyword should be the 1st line inside a constructor
	}
	


	public static void main(String[] args) {
		RealEstate rs = new RealEstate("RealEstate", 1000, "Bangalore");
		System.out.println(rs.type);
		
		RealEstate rs1 = new RealEstate(); 	// throw error since parameterized constructor is created, then default constructor 
											//		MUST be EXPLICITLY created.
											// once DEFAULT Constructor is EXPLICITLY created, then during object creation, JVM will 
											// 		1st call PARENT's DEFAULT Constructor IMPLICITLY then, it calls CHILD's DEFAULT Constructor.
	}

}
