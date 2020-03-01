package OOPS1.AbstractConcept;

public class LoginPage extends Page {

	public LoginPage() {
	 System.out.println("LP - Const....");
	}
	
	@Override
	public void header() {
		System.out.println("LP - Header");		
	}

	@Override
	public void title() {
		System.out.println("LP - Title");		
	}

	public HomePage login(String un, String pwd) {
		System.out.println("LP - Login");
		System.out.println("LP - Login with "+un+" and "+pwd);
		
		return new HomePage();	// A method can return any class object
	}
	
	
	/*
	 * @Override 
	 * public void logout() { 
	 * System.out.println("LP - Logout"); // To avoid overriding, we make the method as FINAL in parent class
	 * }
	 */
	
	
	public static void signUp() {
		System.out.println("LoginPage - SignUp"); 	// signup() method is available in both child class as well Parent class
	}
		
}
