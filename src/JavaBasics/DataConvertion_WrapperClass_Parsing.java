package JavaBasics;

/**
 * 
 * @author Sumit
 * @implNote: Converting String to Integer or Double using WrapperClasses (Integer, Double etc..) and static methods: 
 * @implNote: parseInt(String), parseDouble(String)
 * @implNote: Converting anything to String using String.valueOf(Integer or Double).
 */

public class DataConvertion_WrapperClass_Parsing {
	
	public static void main(String[] args) {
		String x="100";
		System.out.println(x+20); 		// 10020
		
// -------------PARSING STRING TO INTEGER ---------------------------------------
		int i = Integer.parseInt(x); 	// "100" to 100
		System.out.println(i+20); 		// 120
		
		String y ="12.33";
		System.out.println(y+100); 		// 12.33100

// -------------PARSING STRING TO DOUBLE ---------------------------------------		
		Double d = Double.parseDouble(y);
		System.out.println(d+100); 		// 112.33
		
		String p = "100A";
		System.out.println(p+100); 		// 100A100
		
		/*
		 * int k = Integer.parseInt(p); System.out.println(k+200); // Exception:
		 * NumberFormatException since 100A is not an integer
		 */		
		
		int m = 100;
		System.out.println(m+20); 		// 120

// -------------PARSING INTEGER TO STRING ---------------------------------------
		String n = String.valueOf(m); 				// "100"
		System.out.println(n+20);					//  10020
		
		
		
	}

}
