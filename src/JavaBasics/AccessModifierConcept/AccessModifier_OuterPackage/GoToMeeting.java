package JavaBasics.AccessModifierConcept.AccessModifier_OuterPackage;

import JavaBasics.AccessModifierConcept.AccessModifier_MainPackage.Meeting;

/**
 * 
 * @author Sumit
 * @implNote: OUTSIDE PACKAGE BY SUBCLASS
 *
 */

public class GoToMeeting extends Meeting {
	
	public GoToMeeting(int id, String password) {
		super(id, password); 		// super keyword is used to call Parent Class Constructor 
	}

	public static void main(String[] args) {
		Meeting m = new Meeting(343, "test1234");
		System.out.println(m.id); 				// OUTSIDE PACKAGE BY SUBCLASS accessible since access modifier is PUBLIC
		//System.out.println(m.password);		// OUTSIDE PACKAGE BY SUBCLASS non accessible since access modifier is PRIVATE
		m.start();								// OUTSIDE PACKAGE BY SUBCLASS accessible since access modifier is PUBLIC
		//m.chat();								// OUTSIDE PACKAGE BY SUBCLASS non accessible since access modifier is PRIVATE
		// System.out.println(m.studentCount); 	// OUTSIDE PACKAGE BY SUBCLASS non accessible since access modifier is DEFAULT
		// System.out.println(m.isRecorded);	// OUTSIDE PACKAGE BY SUBCLASS non accessible by Parent Object reference since 
												// 		access modifier is PROTECTED
		
		GoToMeeting obj = new GoToMeeting(455, "123456");
		System.out.println(obj.isRecorded);	 	// OUTSIDE PACKAGE BY SUBCLASS accessible by Child Object Reference since 
												//		access modifier is PROTECTED
		
	}
}
