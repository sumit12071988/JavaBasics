package OOPS1.ExceptionHandling.FinallyConcept;

/**
 * 
 * @author Sumit
 * @implNote: To return different values based on Exception or not
 * @implNote: FINALLY block instructions WILL ALWAYS BE EXECUTED whether JVM encounters an exception or not.
 *
 */

public class Sample3 {

	public static int revenue() {
		int p=100;
		int T = p+200;
		
		try {
		int total = T/10;	// If exception occurred here, then line 18 will be skipped. If no exception, then value of total will 
							//		be 300, HOWEVER it will be overridden by finally block
		return total;		// total = 300/10 =30
		}
		
		catch (Exception e) {
			System.err.println(e.getMessage()+" Exception Occured !!");
		}
		
		finally {
			return 0;		// total = 0
		}

	}
	
	
	
	public static void main(String[] args) {
		int s =revenue();
		System.out.println(s);
	}
	
}
