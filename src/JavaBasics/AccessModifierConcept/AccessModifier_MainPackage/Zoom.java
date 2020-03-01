package JavaBasics.AccessModifierConcept.AccessModifier_MainPackage;

/**
 * 
 * @author Sumit
 * @implNote: WITHIN SAME PACKAGE DIFFERENT CLASS
 */

public class Zoom {
	public static void main(String[] args) {
		Meeting m = new Meeting(450, "test1234");
		System.out.println(m.id); 			// WITHIN PACKAGE accessible since access modifier is PUBLIC
		//System.out.println(m.password);	// WITHIN PACKAGE not accessible since access modifier is PRIVATE
		m.start();							// WITHIN PACKAGE accessible since access modifier is PUBLIC
		//m.chat();							// WITHIN PACKAGE not accessible since access modifier is PRIVATE
		System.out.println(m.studentCount);	// WITHIN CLASS accessible since access modifier is DEFAULT
		System.out.println(m.isRecorded); 	// WITHIN CLASS accessible since access modifier is PROTECTED
	}

}
