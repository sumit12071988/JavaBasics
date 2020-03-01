package OOPS1.ExceptionHandling;

/**
 * 
 * @author Sumit
 * @implNote: To understand the concept of Exceptions, Errors and Handling those	
 */

public class Try_Catch_Block {

	String name = "Sumit";
	
	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		Try_Catch_Block obj = new Try_Catch_Block();
		obj = null; 	// If null is set to the object, then Class reference variable will not be referring to any object. In that case
						//	obj.name if executed, will throw NULL POINTER EXCEPTION
		
		try {
			//System.out.println(obj.name);	// This will throw NULL POINTER EXCEPTION if obj = null is set at Line 19. 
											//	If Line 23 and 25 both are present then Line 25 will be skipped since exception occurred at Line 23
			int i =9/0;					// This will create run time exception and then the program will stop. rest of the code 
			//System.out.println(obj.name);	//   will not be executed if no exception handling is placed here
			}								// Try-Catch block will handle the exception and will skip this part so JVM	can execute			
											//   other part of the code which are OUTSIDE of try-catch BLOCK
											// However it is our responsibility to log an info so that we should know that exception has occurred
											//   thus catch block is used for reporting exception logs						
											
											// Inside Try Block if there are any line of code AFTER the exception, then those codes
											//    WILL BE SKIPPED. Thus we can either put those lines of code BEFORE the error line
											// OR we can put those lines of code OUTSIDE try-catch block
		
		catch (Exception e) {		// creating a method "catch" with i/p parameter as class reference variable for Exception class
									// reporting the exception
			
			//System.out.println("Some exception occurred !! ");
			e.printStackTrace(); 					// printStackTrace() method is a method of Throwable class which print the exception
													// O/p: java.lang.ArithmeticException: / by zero
													//		at OOPS1.ExceptionHandling.Try_Catch_Block.main(Try_Catch_Block.java:25)
			
			System.err.println(e.getMessage() + " Exception has occured !!");	// o/p: / by zero Exception has occurred !!

			
			// If you know the exact exception class you can write the same class. For e.g divide by zero is an Arithmetic Exception
			// thus we can write it like this as well		
		
			//catch (ArithmeticException e) 
			// Throwable --> Exception --> Arithmetic exception
			
			// Since Throwable Parent of Exception which is a Parent of ArithmeticException class, we can write either of the following
				// catch(Throwable e)
				// catch(Exception e)
				// catch(ArithmeticException e)
			
			// If we know the exact exception which will be thrown, then we can write accordingly. HOWEVER if we mention incorrect
			//  exception class under catch() method, then the exception handling will not be able to handle the exception
		}
		
			// We can write multiple try-catch blocks. Basic idea is that if one catch block fails to catch the exception due to 
			//		different exception specified, other catch block can catch it.
		
//				try {
//					
//				}
//				catch(ArithmeticException e) {
//					e.printStackTrace();
//				}
//				catch(NullPointerException e) {
//					e.printStackTrace();
//				}
//				catch(IOException e) {
//					e.printStackTrace();
//				}
		
		
			
		//System.out.println(obj.name);	
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
		
		Try_Catch_Block obj1 = new Try_Catch_Block();
		
		try {					// Example of handling exception at method calling level
		obj1.m1();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void m1() {
		System.out.println("M1 - Method");
		int i =9/0;
	}
	

}
