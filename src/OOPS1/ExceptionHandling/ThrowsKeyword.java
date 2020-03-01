package OOPS1.ExceptionHandling;

/**
 * 
 * @author Sumit
 * @implNote: Throws Keyword used after any method is used to throw the EXCEPTION to calling method which called this method
 */

public class ThrowsKeyword {
	
	public static void main(String[] args) {
	
		ThrowsKeyword obj = new ThrowsKeyword();
		
		try {
			obj.launchBrowser();
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}		
		
	}
	
	public void launchBrowser() throws Exception {	// this will throw the exception which occurred at line 31 to its calling method
		System.out.println("launchBrowser");		// which is main()
		launchURL();
	}
	
	public void launchURL() throws Exception  { 	// this will throw the exception which occurred at line 31 to its calling method
		System.out.println("launchURL");		// which is launchBrowser()
		login();
	}
	
	public void login() throws Exception {	// Basically login() method is throwing the exception since Line 31 is written inside the login()
		System.out.println("login");		//  We can use keyword "THROWS" after method name
		int i = 9/0;						// using "throws" keyword will make the method to throw the exception to the calling method
		System.out.println("abc");			// in this case, its not performing any exception handling, its transferring its own
											// exception to calling method which is launchURL()
	}
}
	// Using "throws" keyword, no exception handling occurs, only exception is THROWS BACK to CALLING method.
	// In this case, JVM will perform exception handling
	// using "throws" keyword is NOT the right way of handling the exception since this is just METHOD CHAINING i.e we're just THROWING 
	// the exception from called method to calling method. 
	
	// the moment exception is identified at Line 37, Line 38 will be skipped, and exception is thrown at main method via Method chaining
	// thus instead of throwing the exception at main method, we SHOULD use TRY-CATCH block in the calling method.

	// Problem with using "throws" keyword is that we're not handling the flow of the application properly i.e we're not reaching Line 38
	// Another problem is that we're not giving any reporting i.e we're not doing any custom report. JVM will throw the exception.
	
	// Good programmers never use "throws" keyword. They always use "try-catch" blocks. We'll be using try-catch block while creating
	// generic utilities, generic functions etc.. in Selenium Framework. 