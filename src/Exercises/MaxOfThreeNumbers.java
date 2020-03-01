package Exercises;

public class MaxOfThreeNumbers {
	
	public static void main(String[] args) {
		int x=100, y=100, z=100;
		
		if(x>y && x>z) {
			System.out.println("x is greater of all");
		}
		
		else if(y>x && y>z) {
			System.out.println("y is greater of all");
		}
		
		else if(z>x && z>y) {
			System.out.println("z is greater of all");
		}
		
		else
			System.out.println("All are equal");
		
	}

}
