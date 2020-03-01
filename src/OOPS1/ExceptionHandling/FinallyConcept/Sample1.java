package OOPS1.ExceptionHandling.FinallyConcept;

/**
 * 
 * @author Sumit
 * @implNote : finally block, just like catch block, will be written after try block. However instructions inside finally block
 * @implNote : will be executed whether exception found in try block or not
 * @implNote : Practical example of using finally: DB connection closure
 * 
 */

public class Sample1 {

	public static void main(String[] args) {
		
		System.out.println("A");
		try {
			int i = 9/0;
		}
		
		catch (Exception e) {
			System.err.println(e.getMessage()+" Exception found !!");
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Run This Line.......");		// this will be executed whether exception found or not.
		}
		
		
		// PRACTICAL example of using FINALLY
		//	Consider a program whereby you need to open a DB connection, do some activity and close the DB connection
		//		If there were some issues in doing activities AFTER DB connection is opened, then JVM will kill the program
		//		and DB connection is not closed properly.
		
		//		FINALLY block will be used in closing the DB connection in such cases.
		//			this way, even if JVM has encountered any exception, JVM will still have to execute instructions mentioned inside
		//			FINALLY block before killing the program
		
	}
}
