package JavaBasics;

/**
 * 
 * @author Sumit
 * @implNote: Using toString() method to print object content as per our preference
 */

public class ToStringUsages {

	String name;
	String course;
	String time;
	
	public ToStringUsages() {
		
	}
	
	public ToStringUsages(String name, String course, String time) {
		this.name = name;
		this.course = course;
		this.time = time;
	}
	
// ------------------ PRINTING AN OBJECT ---------------------

	// Rt. click on IDE --> Source --> Generate toString()... --> Select all the fields and click "Generate"
	//  This will override toString() method.
	//		The toString() method is actually defined under Object class
	//		Object class is PARENT of all the classes we create
	//		All classes we write are actually CHILD class.
	
	
	@Override
	public String toString() {
		return "Training [name=" + name + ", course=" + course + ", time=" + time + "]";	// can change as per our preference
	}
	
	
	public static void main(String[] args) {
		//Training tr = new Training();
		//System.out.println(tr);				// JavaBasics.Training@15db9742	 | 15db9742 is the memory address of the object
		//System.out.println(tr.toString());	// JavaBasics.Training@15db9742
		
		// toString() returns a STRING REPRESENTATION OF AN OBJECT
		
		ToStringUsages tr = new ToStringUsages("Naveen", "Java", "7AM IST");
		System.out.println(tr.toString());		// Training [name=Naveen, course=Java, time=7AM IST]
												// JavaBasics.Training@15db9742 IF Overridden toString() method is not specified in this class
		
		// Printing an Object WITHOUT overriding toString() in class, will print memory allocation of the object
		// Printing an Object WITH overriding toString() in class, will print the Object in readable format which can be changed accordingly
		
		System.out.println(tr.name); 	// Naveen
		System.out.println(tr.course); 	// Java
		System.out.println(tr.time); 	// 7AM IST
		
		
		
	}
}
