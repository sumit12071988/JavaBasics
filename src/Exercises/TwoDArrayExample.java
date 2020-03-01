package Exercises;

public class TwoDArrayExample {

	public static void main(String[] args) {
		
		// TO PRINT
		// 00 01 02 03 04
		// 10 11 12 13 14
		// 20 21 22 23 24
		// 30 31 32 33 34
		// 40 41 42 43 44
		
		for(int i=0; i<=4; i++) {
			for(int j=0; j<=4; j++) {
				System.out.print(i+""+j);		// i+j will add the data, but i+""+j will not add it.
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
