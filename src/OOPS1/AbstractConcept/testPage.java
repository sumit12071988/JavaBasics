package OOPS1.AbstractConcept;

public class testPage {

	public static void main(String[] args) {
		
		Page.signUp(); // referring static method from abstract class
		
		LoginPage lp = new LoginPage();	// Since LoginPage() constructor is not defined but its parent class Page() constructor is 
										// defined, then Page() constructor will be called
		lp.header();
		lp.title();
		LoginPage.signUp(); // referring static method from Child class
		
		HomePage hp = lp.login("admin", "admin"); 	// login method is returning object of Homepage class. That object is being assigned
													// to Homepage class reference variable
													// Since HomePage() constructor is not defined but its parent class Page() 
													// constructor is defined, then Page() constructor will be called
		hp.header();
		hp.title();
		hp.userDetails();
		
		hp.logout();
		
		// Page p = new Page();
		Page p = new LoginPage();	// Top casting is allowed with abstract class ref. variable
		Page p1 = new HomePage();	// Top casting is allowed with abstract class ref. variable
		
		p.header();	// O/p: overridden method o/p = LP - Header
		p.title();	// O/p: overridden method o/p = LP - Title
		
		p1.header();// O/p: overridden method o/p = HP - Header
		p1.title();	// O/p: overridden method o/p = HP - Header
	
		//p.login(); 	// won't work as parent reference variable cannot access child specific methods. Only can access child overridden methods
					// That is called REFERENCE TYPE SECURITY CHECK
		
		
	}
}
