package JavaBasics.NaveenAutomationLabs.FinalizeMethod;

/**
 * 
 * @author Sumit
 * @implNote: To understand FINALIZE() method concept
 */

public class Travel {

	public static void main(String[] args) {
		// ConditionalStatements obj = new ConditionalStatements();
		
		Travel obj = new Travel();
		
		obj = null; // Null reference. Object has no name, thus Object will be eligible to be destroyed by Garbage Collector
		
		// Request JVM to call GC;
		System.gc();	// gc() is a STATIC METHOD in SYSTEM class since accessed using Class reference.
		System.out.println("Garbage Collection Done");
	}
	
	@Override					// Current class is OVERRIDING finalize() method of OBJECT class
	public void finalize() {	// This method will only be called when we create an object of current class
		System.out.println("This is my FINALIZE() method");
	}
	
}
