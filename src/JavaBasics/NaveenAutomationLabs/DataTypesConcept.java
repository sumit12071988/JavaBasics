package JavaBasics.NaveenAutomationLabs;

/**
 * @author Sumit
 * This class is to understand data types in JAVA
 */

public class DataTypesConcept {

	public static void main(String[] args) {
		//primitive data types: int, float, double, char, boolean
		
		//data types:
		//1. int: size: 4 bytes, Range: -2147483648 to 2147483647
		//1 byte = 8 bits
		int i = 10;
		 i = 20;
		 i = 30;
		 System.out.println(i);
		 
		int j = -10;
		System.out.println(j+10);
		int k = 0;
		int age = 25;
		int total = 1000;
		
		
		//2. byte: size: 1 byte, range: -128 to 127
		byte b1 = 10;
		byte age1 = 21;
		byte fl = (byte) (age1-b1);
		System.out.println(fl+"--");		
		
		//3. short: size: 2 bytes, range: -32768 to 32767
		short s1 = 1299;
		
		//4. long: size: 8 bytes, range: 
		long l1 = 100000;
		
		//***********************************************************************//
		
		//5. float: 4 bytes
		float f1 = (float)12.33;
		float f2 = 12.45f;
		
		//6. double: 8 bytes
		double d1 = 12.4555555;
		
		//***********************************************************************//		
		
		//7. char: 2 bytes
		char c1 = 'a';
		char c2 = '@';
		char c3 = '1';
		
		//8. boolean: not defined precisely-- around 1 byte
		boolean b11 = true;
		boolean b2 = false;
		System.out.println(b2);
		
		//9. String: is not a data type...its a class
		String str = "hello world";
		System.out.println(str);
		String str1 = "hi this is naveen here";
		System.out.println(str1);
		
		String str3 = "1000";
	}

}
