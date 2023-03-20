package JavaBasics.NaveenAutomationLabs.AccessModifierConcept.AccessModifier_OuterPackage;

import JavaBasics.NaveenAutomationLabs.AccessModifierConcept.AccessModifier_MainPackage.Meeting;

/**
 * 
 * @author Sumit
 * @implNote: OUTSIDE PACKAGE BY DIFFERENT CLASS
 */

public class WebExMeeting {
	public static void main(String[] args) {
		Meeting m = new Meeting(12333, "test1234");

		System.out.println(m.id); 				// OUTSIDE PACKAGE BY DIFFERENT CLASS accessible since access modifier is PUBLIC
		//System.out.println(m.password);		// OUTSIDE PACKAGE BY DIFFERENT CLASS non accessible since access modifier is PRIVATE
		m.start();								// OUTSIDE PACKAGE BY DIFFERENT CLASS accessible since access modifier is PUBLIC
		//m.chat();								// OUTSIDE PACKAGE BY DIFFERENT CLASS non accessible since access modifier is PRIVATE
		// System.out.println(m.studentCount); 	// OUTSIDE PACKAGE BY DIFFERENT CLASS non accessible since access modifier is DEFAULT
		// System.out.println(m.isRecorded);	// OUTSIDE PACKAGE BY SUBCLASS non accessible since access modifier is PROTECTED
	}
}
