package JavaBasics.NaveenAutomationLabs.AccessModifierConcept.AccessModifier_MainPackage;

/**
 * 
 * @author Sumit
 * @implNote: WITHIN SAME PACKAGE SAME CLASS
 */


public class Meeting {

	public int id;
	private String password;
	
	int studentCount = 100; 	// Data Member without any access modifier has DEFAULT as access modifier 
	
	protected boolean isRecorded = true;
	
	public Meeting(int id, String password) {
		this.id=id;
		this.password=password;
	}
	
	public void start() {
		System.out.println("meeting start");
	}
	
	private void chat() {
		System.out.println("meeting chat");
	}
	
	void defaultMethod() {
		System.out.println("default method");
	}
	
	protected void protectedMethod() {
		System.out.println("protected method");
	}
	
	
	public static void main(String[] args) {
		Meeting m = new Meeting(123,"test123");
		System.out.println(m.id); 			// WITHIN CLASS accessible since access modifier is PUBLIC
		System.out.println(m.password);		// WITHIN CLASS accessible since access modifier is PRIVATE
		m.start();							// WITHIN CLASS accessible since access modifier is PUBLIC
		m.chat();							// WITHIN CLASS accessible since access modifier is PRIVATE
		System.out.println(m.studentCount);	// WITHIN CLASS accessible since access modifier is DEFAULT
		System.out.println(m.isRecorded); 	// WITHIN CLASS accessible since access modifier is PROTECTED
	}
	
}
