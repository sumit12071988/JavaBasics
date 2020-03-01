package OOPS1.Constructors;

/**
 * 
 * @author Sumit
 * @implNote
 * To understand the concept of constructors
 */

public class User {
	
	
	// Class Variables
	String name;
	int age;
	int userId;
	char gender;
	boolean isActive;
	
	static int wheels;
	
	// Constructor means to "construct" an already created object using Class Variables
	// Two types of constructors:
		// 1. Default constructor
		// 2. Parameterized constructor
	
	public User() {		// Default constructor or Zero Parameter constructor
		System.out.println("Default Constructor");
	}
	
	public User(int i) {	// 1 Parameter Constructors
		System.out.println("One Parameter Constructor: "+ i);		
	}
	
	public User(int i, String p) {	// 2 Parameters Constructors
		System.out.println("2 Parameter Constructor: "+i+p);
	}
	
	// CONSTRUCTORS WITH CLASS VARIABLES -- CREATED MANUALLY
	
	public User(String name, int age, int userId, char gender, boolean isActive, int wheels) {	
		// these are local variables. Eventhough these local variables name is as same as Class variables, they are not the same
		// Thus We need to assign the values of the local parameters to class variables using "this" keyword.
		
		this.name =name;			// local variables are being assigned to class variables now
		this.age =age;				// local variables are being assigned to class variables now
		this.userId =userId;		// local variables are being assigned to class variables now
		this.gender =gender;		// local variables are being assigned to class variables now
		this.isActive =isActive;	// local variables are being assigned to class variables now

		this.wheels=wheels;			// Static variables can be used inside a constructor but
									// 	IDE will give warning message that static variables should be accessed in static way.
									// The static variable wheels will be stored inside the CMA [Common Memory Allocation]

		// "this" keyword is used when Local Variables inside the method is named same as Class variables
		// If local variable different from class variables can be assigned directly without using "this" keyword.
		
		//name = name1;						
	
		// Both the ways we can assign local variables data to Class variables. 
		// Problem with 2nd approach i.e. (name = name1) is that if we have to pass 50 different sets of data, we need to create 
		// 50 different sets of local variables like name1, name2, name3 ... name50 which is a BAD PRACTICE and tedious job.
		
		// this.<Class Variable> = <Local Variable>
	}
	
		
	
	/*
	 * // CREATING CONSTRUCTOR WITH CLASS VARIABLES FROM IDE 
	 * 		// RT. CLICK ON EDITOR --> SOURCE --> GENERATE CONSTRUCTOR USING FIELDS
	 * 
	 * public User(String name, int age, int userId, char gender, boolean isActive)
	 * { 
	 * super(); 
	 * this.name = name; 
	 * this.age = age; 
	 * this.userId = userId;
	 * this.gender = gender; 
	 * this.isActive = isActive;
	 * }
	 * 
	 */
	
	//************************************************************************************************************************//	

	public static void main(String[] args) {
		
		// Example of invoking default constructors as well as parameterized constructors
		
		User u1 = new User();			// When the object is created, the default constructor will be invoked By-Default.
		User u2 = new User(10);			// When the object is created, the parameterized constructor will be created
		User u3 = new User(100,"Sumit");// When the object is created, the parameterized constructor will be created
		
		
		// Example of using constructor to assign local variables to class variables
		
		User us1 = new User("Nadeem",25,101,'M',true,10);
		System.out.println(us1.name);		// O/p: null 	if no assignment is done to class variables using "this" keyword
		System.out.println(us1.age);		// O/p: 0		if no assignment is done to class variables using "this" keyword
		System.out.println(us1.userId);		// O/p: 0		if no assignment is done to class variables using "this" keyword
		System.out.println(us1.gender);		// O/p			if no assignment is done to class variables using "this" keyword
		System.out.println(us1.isActive);	// O/p: false	if no assignment is done to class variables using "this" keyword
		
		// this is because the values passed using the object us1 is valid until the method User(String name, int age, int userId, char gender, boolean isActive)
		
		// We need to assign the values of the local parameters to class variables using "This" Keyword.
		
		System.out.println(us1.name);		// O/p: Nadeem	if assignment is done to class variables using "this" keyword
		System.out.println(us1.age);		// O/p: 25		if assignment is done to class variables using "this" keyword
		System.out.println(us1.userId);		// O/p: 101		if assignment is done to class variables using "this" keyword
		System.out.println(us1.gender);		// O/p: M		if assignment is done to class variables using "this" keyword
		System.out.println(us1.isActive);	// O/p: true	if assignment is done to class variables using "this" keyword

		User us2 = new User("Gulnaaz",26,102,'F',true,200);
		User us3 = new User("Sucheta",25,101,'F',false,300);
		User us4 = new User("Sandeep",32,104,'M',false,100);
		
		// In MEMORY, this will create 4 Objects us1,us2,us3,us4 and then 4 times this constructor will be called and the values 
		// will be then given to class variables
		
		System.out.println(us1.name+" "+us1.isActive);
		System.out.println(us4.name+" "+us4.userId+" "+us4.isActive+" "+us4.wheels);
		
		
	}


}
