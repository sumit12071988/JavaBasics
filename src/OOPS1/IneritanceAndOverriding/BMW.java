package OOPS1.IneritanceAndOverriding;

public class BMW extends Car {
	
	@Override								// Its a Good practice to mention this annotation which indicates that the below Child method 
	public void start() {					// 		is overriding Parent method
		System.out.println("BMW start");
	}
	
	public void autoAirSuspension() {
		System.out.println("BMW suspension");
	}
	
}
