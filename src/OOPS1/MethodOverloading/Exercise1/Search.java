package OOPS1.MethodOverloading.Exercise1;

public class Search {
	
	public static void main(String[] args) {
		Search obj = new Search();
		obj.search("Apple Mac Book");
		int finalPrice = obj.search("Apple Mac Book",50000);
		 
		System.out.println("final price is: "+finalPrice);
	}
	
	public void search(String name) {
		System.out.println("Search is done by: "+name);
	}
	
	public int search(String name, int price) {
		System.out.println("Search is done by: "+name);
		System.out.println("Search is done by: "+price);
		
		int totalPrice = price-100;
		return totalPrice;
	}
}
