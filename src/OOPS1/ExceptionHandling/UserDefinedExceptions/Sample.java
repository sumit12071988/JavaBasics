package OOPS1.ExceptionHandling.UserDefinedExceptions;

/**
 * 
 * @author Sumit
 * @implNote : SYNTAX -->  throw new Exception("Custom Exception Name");
 */

public class Sample {

	public static void main(String[] args) throws Exception {

		// throw new Exception("Custom Exception");
		
		try {
		throw new Exception("Sumit Exception");	// invoking parameterized constructor Exception("String") during Exception object creation
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
