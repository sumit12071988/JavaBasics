package OOPS1.ExceptionHandling.UserDefinedExceptions;

/**
 * 
 * @author Sumit
 * @implNote : SYNTAX -->  throw new Exception("Custom Exception Name");
 */

public class ThrowKeyword {
	
	// THROW Keyword is useful whenever you want to throw custom user-defined exceptions
	
	public static void main(String[] args) {
		
	
		// practical use of throwing own exception:
		
		
		String username = "sumit@gmail.com";	// consider u are reading an excel with column "Username". If "" or null, it will throw
												//  our custom built exception
		
		if (username.equals("")|| username.equals(null)) {
			
			try {
			throw new Exception("Cell is either blank or null. Please check");	// enclose this with try-catch block
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("logging with --"+ username);
		}	
		
		ThrowKeyword obj = new ThrowKeyword();
		obj.launchUrl(null);
		
		// You can make the method launchUrl as non static and create object to use access the method
		// OR make the method launchUrl as static and access it directly or using class.method
	}
	
	
	public void launchUrl(String url) {
		
		try {
		if(url.equals("") || url.equals(null) || url.isEmpty()) {
			
			try {
			throw new Exception("Blank URL exception");
			}
			catch (Exception e) {
				e.printStackTrace();
				System.err.println("URL value is blank or null. Please pass correct value of URL");
			}
		}
		
		else {
			System.out.println("URL is --> "+url);
			}
		}
		
		
		catch (Exception e) {
			System.err.println("URL value is blank or null. Please pass correct value of URL");
		}
	}
	
	
	
	
}
