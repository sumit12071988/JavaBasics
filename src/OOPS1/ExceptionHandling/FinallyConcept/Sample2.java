package OOPS1.ExceptionHandling.FinallyConcept;

public class Sample2 {
	public static void main(String[] args) {
		int p=20;
		
		try {
			System.out.println("in try block");
			int t = p/0;
		} 
		
		catch (NullPointerException e) {			// Writing incorrect exception class will make JVM ignore the exception handling
			System.err.println("in catch block");	//		and will kill the program abruptly.
			System.err.println("NUll Pointer exception is coming");
		}
		
		finally {
			System.out.println("in finally block");	// this will be executed no matter what
		}
		
	}
}
