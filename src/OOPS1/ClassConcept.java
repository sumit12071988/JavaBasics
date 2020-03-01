package OOPS1;

/**
 * 
 * @author Sumit
 * @implNote:
 * To understand the concepts of Class, Objects and GARBAGE COLLECTION
 */
public class ClassConcept {

	// Data Members | Class members
	// 1. Class Variables
	// 2. Class Methods
	
	String name;
	int age;
	char gender;
	boolean isPermanent;
	
	public static void main(String[] args) {
		
		ClassConcept e1; 			// e1 is the class variable | Object Reference | Object Name
		e1 = new ClassConcept();	// new Employee() is the object
		
		// Once a class object is created, the object gains access of all Data Members of the class
		// Cannot create multiple objects with same Object name| Class Variable
		
		e1.name="Tom";
		e1.age=25;
		e1.gender='M';
		e1.isPermanent=true;
		
		ClassConcept e2 = new ClassConcept();
		e2.name ="Nadeem";
		e2.age=28;
		e2.gender='M';
		e2.isPermanent=false;
		
		ClassConcept e3 = new ClassConcept();
		e3.name ="Anushya";
		e3.age=30;
		e3.gender='F';
		e3.isPermanent=false;		

		
		System.out.println(e1.name+" "+e1.age+" "+e1.gender+" "+e1.isPermanent);
		System.out.println(e2.name+" "+e2.age+" "+e2.gender+" "+e2.isPermanent);
		System.out.println(e3.name+" "+e3.age+" "+e3.gender+" "+e3.isPermanent);
		
		new ClassConcept(); // A new object is created with all access to data members HOWEVER it cannot be accessed directly.
		
		new ClassConcept().name = "Blank Name";
		new ClassConcept().age = 10;
		new ClassConcept().gender='m';
		new ClassConcept().isPermanent=false;
		
		// we can write as above but this is not a good practice since we cannot create multiple instances (objects). This is also
		// called as "CREATING OBJECT WITHOUT REFERENCE"
		// In this case, JVM will order GARBAGE COLLECTOR to scan and identify all the objects without REFERENCE NAME and DESTROY
		// those objects without REFERENCE NAMES to make space in the memory.
		// A Programmer can call Garbage Collector to do Garbage Collection instead of relying on JVM to call
		
		// System.gc(); // Command used by programmers to run the GARBAGE COLLECTOR. Calling GARBAGE COLLECTOR suggests that JVM expend
						// efforts towards recycling unused objects in order to clear the memory which is currently occupied
						// Calling GARBAGE COLLECTOR manually, there is not guarantee that GARBAGE COLLECTOR will follow your instructions
						// once the method is invoked, GARBAGE COLLECTOR check with JVM if he can go inside the memory and destroy unused
						// memory. Once JVM confirms, then only GARBAGE COLLECTOR will come inside the memory
		
		//e3=null;		// This is called NULL REFERENCE OBJECTS. I'm nullifying the reference.
						// JVM GC will search OBJECTS WITH NO REFERENCE NAME and NULL REFERENCE OBJECTS and will destroy them to reclaim memory
		
		e1=e2; 		// One object reference can be assigned to another Object Reference. 
					// In this case, e1 will lose old reference and start referring to new reference.
					// Then the object which e1 was referring to previously will be destroyed by JVM GC.
		
		System.out.println(e1.name); 	// This will print Nadeem instead of Tom.
		System.out.println(e2.name);	// both class variables e1 and e2 are referring to same Object. Thus this will print Nadeem. 
		
		e2=e3;							// Then e2 and e3 will point to same object and lose old object reference.
		System.out.println(e2.name);	// O/p: Anushya
		System.out.println(e3.name);	// O/p: Anushya
		
		e3=e1;
		System.out.println(e3.name);	// O/p: Nadeem
		System.out.println(e1.name);	// O/p: Nadeem
		
	}
}
