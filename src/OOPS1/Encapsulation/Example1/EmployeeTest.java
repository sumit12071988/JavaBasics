package OOPS1.Encapsulation.Example1;

public class EmployeeTest {

	public static void main(String[] args) {
		EmployeeData e1 = new EmployeeData("Steve", 2, 25, "Admin", 2000);
		System.out.println(e1.name); 	// O/p: Steve
	  //System.out.println(e1.salary);	// This is not accessible since variable salary is defined as PRIVATE
		
		e1.getEmployeeName(); 			// O/p: get emp name
	  //e1.getEmployeeBonus();			// This is not accessible since variable salary is defined as PRIVATE
		
		//After creating getSalary and setSalary methods to access private variables
		e1.setSalary(2000);
		System.out.println(e1.getSalary()); // O/p: 2000
		
	}
}
