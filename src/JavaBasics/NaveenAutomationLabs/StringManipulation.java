package JavaBasics.NaveenAutomationLabs;

/**
 * 
 * @author Sumit
 * @implNote: To understand the concept of String Manipulations
 * 
 */

public class StringManipulation {

	public static void main(String[] args) {
		
		String str = "This is my Java Code and I am so happy"; // 0-37 indexes are available, String Length = 38
		
		System.out.println(str.length());		// O/p: 38

// .charAt(<index No. of a char in a String>) | To identify the CHARACTER AT a particular index in String 
		System.out.println(str.charAt(1));		// O/p: h
		System.out.println(str.charAt(0));		// O/p: t
		System.out.println(str.charAt(37));		// O/p: y
		//System.out.println(str.charAt(38));	// O/p: StringIndexOutOfBoundException
		
		
// .indexOf(<character/ String inside a String>) 		| To find the index of a character or 1st character of a string
// .indexOf(<character/ String inside a String>, <fromIndex>)

		System.out.println(str.indexOf("T"));	// O/p: 0
		System.out.println(str.indexOf("m"));	// O/p: 8
		System.out.println(str.indexOf("Java"));// O/p: 11
		
		System.out.println(str.indexOf("maya"));// O/p: -1
		
		System.out.println(str.indexOf("s")); 	// O/p: 3 i.e 1st occurrence of s
		
		// Finding 2nd Occurrence of s
		
		System.out.println(str.indexOf("s",4));						// Static way of identifying 2nd occurrence of s
		System.out.println(str.indexOf("s", str.indexOf("s")+1)); 	// Dynamic way of identifying 2nd occurrence of s
		
		// Finding 3rd Occurrence of s
		int firstSOccurrence = str.indexOf("s");						// O/p: 3 
		int secondSOccurence = str.indexOf("s", firstSOccurrence+1);	// O/p: 6
		int thirdSOccurence = str.indexOf("s", secondSOccurence+1);		// O/p: 30
		
		System.out.println(thirdSOccurence);
		
		
		
// Example of String Manipulation method
String msg = "Welcome null";
if (msg.indexOf("Admin")>0) {
	System.out.println("PASS");
}
else {
	System.err.println("FAIL");
}

System.out.println(str.indexOf('h'));	//O/p: 1 
		
		
		
// .equals(<SourceString>)			| Compare two strings
// .equalsIgnoreCase(<SourceString>) 
		
		String s1 ="Hello World";
		String s2 ="hello World";
		
		System.out.println(s1.equals(s2));				//O/p: false
		System.out.println(s1.equalsIgnoreCase(s2));	//O/p: true
		
		String p = "          hello World       ";
		
		
		
		
// .trim() | Trims from left and right of string. NOT in between the strings

		System.out.println(p.trim());
		
		
		
// .replace(<SourceKeyword>,<TargetKeyword>) | To remove space b/w "hello World" and making it to "helloWorld"
		System.out.println(p.trim().replace(" ", ""));
			
		String dob = "01-01-1990";	// 01/01/1990
		System.out.println(dob.replace('-', '/'));
		
		
		
// .toUpperCase | .toLowerCase |
		String h1 = "This is Selenium";
		System.out.println(h1.toUpperCase()); 		// THIS IS SELENIUM
		System.out.println(h1.toLowerCase()); 		// this is selenium
		
		
		
// .subString(<starting Index>)
// .subString(<starting Index>, <Ending Index>+1)
		String st = "Transaction id is 1234";
		/*
		 * System.out.println(st.substring(6)); // ction id is 1234
		 * System.out.println(st.substring(0, 11)); // Transaction
		 * System.out.println(st.substring(18)); // 1234
		 */		
		System.out.println(st.substring(st.indexOf("is")+3, st.length()));	// 1234
		System.out.println(st.substring(st.indexOf("1234"), st.length()));	// 1234
		
		
				
// .split(<spliting element>)
		String data = "Tom;25;male;1000;USA";
		String[] ar = data.split(";");
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		
		String test="xXJavaXxXPythonxXRubyxXSelenium";
		String[] val = test.split("xX");
		for (int i = 0; i < val.length; i++) {	// val[0] = " "
			System.out.println(val[i]);			// val[1] = JavaX
		}
		
		
		String name = "Tom Peter Steve"; 	// Notice that there is equal amount of space b/w all the names. thus 
											//	that space can be used as splitting element
		
		String[] arName =name.split(" ");
		
		for (int i = 0; i < arName.length; i++) {
			System.out.println(arName[i]);
		}
		
		
		String credentials="admin;testpassword";
		String username = credentials.split(";")[0];
		String password=  credentials.split(";")[1];		
		
		doLogin(username, password);
	}
	
	public static void doLogin(String un, String pwd) {
		System.out.println("login to app with "+un+" "+pwd	);
	}

}
