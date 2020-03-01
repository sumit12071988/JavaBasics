package JavaBasics.ArrayList;

import java.util.ArrayList;

public class DynamicArray_ArrayList {
	
	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		
		
		
		// Q&A: JAVA Memory reserves a VIRTUAL CAPACITY of 10 for our Arraylist although no values are inside. This is 
		// called DEFAULT CAPACITY or VIRTUAL CAPACITY
		// VIRTUAL CAPACITY is not an actual memory allocation. Java will not give any memory address.
		// For PHYSICAL CAPACOTY, JAVA will allocate memory address.
		
		
		System.out.println(ar.size()); 		// O/p: 0		

		
		
		ar.add(100);	// Index 0	Arraylist stores the data in a sequence of orders
		ar.add(200);	// Index 1		
						// After this, the PHYSICAL CAPACITY becomes 2, VIRTUAL CAPACITY becomes 8
		
		//******************** to check the ArrayList SIZE ********************************
		System.out.println(ar.size()); 	//O/p: 2
		
		
		
		
		//******************** To ADD values in an Arraylist ********************************
		ar.add(300);	// Index 2
		ar.add(400);	// Index 3
						// After this, the PHYSICAL CAPACITY becomes 4, VIRTUAL CAPACITY becomes 6		
		System.out.println(ar.size());	//O/p: 4		
		ar.add(500);	// Index 4
		ar.add(600);	// Index 5		
		System.out.println(ar.size()); 	// O/p: 6		
		
		// once all the VIRTUAL CAPACITY is replaced by PHYSICAL CAPACITY, PHYSICAL CAPACITY = 10, VIRTUAL CAPACTY =0
		// once adding Data a new element, again VIRTUAL CAPACITY of 10 will be allocated to the ArrayList
		// This on adding 11th element, PHYSICAL CAPACITY = 11, VIRTUAL CAPACITY = 9
		
		
		
		// ******************** To GET values from an Arraylist ********************************
		System.out.println(ar.get(3));	// O/p: 400
		//System.out.println(ar.get(6));	//O/p: IndexOutOfBoundException
		
		
		
		
		// ******************** To REMOVE values from an Arraylist ********************************
		System.out.println(ar.remove(4));	// O/p: the data form index 4 will be removed and the values from next index will take its place.
		System.out.println(ar.get(4));	 	// O/p: 600
		//System.out.println(ar.get(5));  	// O/p: IndexOutOfBoundException
		
		// Advantage: Memory allocation is automatically getting adjusted (Increased/ Decreased)
		
		ar.add("test");
		ar.add(12.33);
		
		// Without defining the Datatype of ArrayList, Arraylist will behave as RAW TYPE i.e Arraylist can store data of any datatype inside.
		// JAVA insists to create Arraylist with a particular DataType called GENERICS.
		
		
		// ARRAYLIST TO ADD EMPLOYEE NAMES
		ArrayList<String> names = new ArrayList<String>();
		//names.add(100);		// This is not allowed now since String GENERICS are accepted since its mentioned while defining the arraylist
		names.add("Sumit");
		names.add("Saha");
		names.add("Rakesh");
		names.add("Panda");
		
		System.out.println(names.size()); 		//O/p: 4

		// ARRAYLIST TO ADD EMPLOYEE AGE
		ArrayList<Integer> empAge = new ArrayList<Integer>();	// Integer is a WRAPPER CLASS
		empAge.add(23);
		empAge.add(24);
		empAge.add(30);
		
		System.out.println(names.get(0)+" age is: "+ empAge.get(2));		//O/p: Sumit age is: 30
		System.out.println(names.get(2)+" age is: "+ empAge.get(0));		//O/p: Rakesh age is: 23
		
		// To Print all the values from arraylist
		for(int i=0; i< ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		for(int i=0; i< names.size();i++) {
			System.out.println(names.get(i));
		}
		
		
		// ******************** TRAVERSING INSIDE ARRAYLIST USING FOR (<Datatype> dt: <ArrayList>) ********************************		
		for(String n: names) {		// n is a counter for ArrayList "names" which is pointing to 1st String in the Arraylist
			System.out.println(n);	// this means, for all Strings inside the Arraylist "names", print those strings
		}
		
		
		// ******************** TRAVERSING INSIDE ARRAYLIST USING forEach ((dt)-><Actions to be performed>) ********************************		
		names.forEach((a)->System.out.println(a));
		
		
	}

}
