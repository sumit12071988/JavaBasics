package JavaBasics.NaveenAutomationLabs;

/**
 * 
 * @author Sumit
 * To understand looping better
 *
 */
public class LoopsConcept {
	public static void main(String[] args) {
		
		// Two types of loops:
		// 1. While Loop/ Do While Loop/ For Loop
		// 2. Infinite Loop/ Storage of Memory Loop: pitfalls loop in JAVA
		

		/* ***** WHILE LOOP ******************************************************/
		int i=10;
		while(i>0) {
			System.out.println(i);
			i--;	// without increment/ decrement, while loop will go in infinite loop and then after some time, it will give storage of
					// memory loop : pitfalls loop in java.
		}

		
		/* ***** Do...While LOOP ******************************************************/
		 int k=0;	
		 do {		// with Do While Loop, the instruction will happen at least once after which conditions are checked
			System.out.println(k);
			k++;
		} while (k<=10);
		 

		 
		/* ***** FOR LOOP ******************************************************/
		for (int j=1; j<=10;j++) {
			System.out.println(j);
		}
		
		
//		for(;;) {	// O/p: Infinite Loop
//			System.out.println("JavaBasics.AccessModifierConcept.AccessModifier_MainPackage");
//		}
	}
}
