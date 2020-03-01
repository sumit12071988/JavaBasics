package JavaBasics;

/**
 * 
 * @author Sumit
 *	To Check Conditional Statements like If, Nested If's, Multiple If's, DEAD CODE
 */

public class ConditionalStatements {

	public static void main(String[] args) {
		
		int a=10, b=20;
		
		if(a>b) {
			System.out.println("A is greater than B");
		}
		
		else {	// If condition can work without ELSE statement
			System.out.println("B is greater than A");
		}
		
		
//************** NESTED IF's *******************************************
		int num=5;
		
		if(num<20) {
			System.out.println("Number is lesser than 20");
			if (num<18) {													
				System.out.println("Number is lesser than 18");
				if(num<16) {
					System.out.println("Number is lesser than 16");
				}
				else {
					System.out.println("Number is greater than 16");
				}
			}
		}
		
//************** MULTIPLE IF's | LADDER IF's *******************************************
		int num1=20;
		if(num1==10) {
			System.out.println("num1 is 10");
		}
		else if(num1==15) {
			System.out.println("num1 is 15");
		}
		else if(num1==18) {
			System.out.println("num1 is 18");
		}
		else {
			System.out.println("num1 is 20");
		}

//*************** COMPARING TWO STRINGS USING equals and equalsIgnoreCase **************
		String str1 ="Hello";
		String str2 ="Hello";
		
		if(str1.equals(str2)){
			System.out.println("Both Strings are equal");
		}
		else {
			System.out.println("Both Strings are not equal");
		}
		
		
		String str3="Hello";
		String str4="hElLo";
		if(str3.equalsIgnoreCase(str4)) {
			System.out.println("Both Strings are equal");
		}
		else {
			System.out.println("Both Strings are not equal");			
		}
		
//******************************************************************************//
		String browser="test";
		
		if(browser.equalsIgnoreCase("chrome")){
			System.out.println("Browser is chrome");
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			System.out.println("Browser is firefox");
		}
		else {
			System.out.println("Browser is not in the list");
		}

//****************** DEAD CODE | UNREACHABLE CODE *********************************
		if(true) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FALSE");
		}
		
	}

}
