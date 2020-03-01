package OOPS1.ExceptionHandling;

public class MultipleTryCatchBlocks {

	String name= "Tom";
	
	
	public static void main(String[] args) {
		
		MultipleTryCatchBlocks obj = new MultipleTryCatchBlocks();
		
		obj=null;	// here we're removing the association of reference variable obj with the object new MultipleTryCatchBlocks().
					//		thus obj will not be able to access any data members of the class. If obj attempts to access any data
					//		members, then JVM will throw NULL POINTER EXCEPTION
		try {
		System.out.println(obj.name);	// If line 20 throws error then line 22 will never be executed SINCE line 22 is inside 
										//		try block. Once JVM CATCHES any exception inside TRY block, it will move to CATCH
		int i = 9/0;					//		BLOCK directly and rest of the lines of code inside TRY block will be skipped.
		}								// If we comment line 12, then JVM will throw Arithmetic exception at line 18.
		
		
		
		catch (ArithmeticException e) {
			System.err.println(e.getMessage()+ " Exception has occured");
			e.printStackTrace();
		}
		
		catch (NumberFormatException e) {
			System.err.println(e.getMessage()+ " Exception has occured");
			e.printStackTrace();
		}
		
		catch (NullPointerException e) {
			System.err.println(e.getMessage()+ " Exception has occured");
			e.printStackTrace();
		}
		
		// Note: In multiple catch blocks, we need to ensure not to include Parent Exception Class with Child Exception blocks
		//	For SINGLE CATCH block, we can use EXCEPTION/ THROWABLE class reference
		
		//	E.g: If we're mentioning one catch block with Exception class reference and another catch block with Arithmetic exception
		//	reference, We'll get compilation error since all the exceptions will be taken care by Parent class reference and Child 
		//	exception will not be reachable anymore
	
		
	
	}
	

}
