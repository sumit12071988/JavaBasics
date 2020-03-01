package JavaBasics;

public class SwitchCase {

	public static void main(String[] args) {
		
		int num=10;
		
		switch (num) {
		case 10:
			System.out.println("10");
			//break;	// If don't write break, it will print next stmt as well.
			
		case 20:
			System.out.println("20");
			break;
			
		default:
			System.out.println("Number not found");			
			break;	// Keyword to come out of switch case
		}
		
		
		
		

	}

}
