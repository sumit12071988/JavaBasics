package OOPS1.Encapsulation.Example1;

/**
 * 
 * @author Sumit
 * @implNote To understand Encapsulation and how to use GETTERS and SETTERS
 */

public class EmployeeData {

	public String name;
	public int id;
	public int age;
	public String dept;
	private int salary;		// We want to ensure this variable is not accessible outside of this class.
	
	public EmployeeData(String name, int id, int age, String dept, int salary) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.dept = dept;
		this.salary = salary;
	}

	private void getEmployeeBonus() {
		System.out.println("get emp bonus");
	}

	
	
	// ACCESSING PRIVATE METHODS IN INDIRECT WAY BY CALLING WITHIN PUBLIC METHOD
		public void getEmployeeName() {
			System.out.println("get emp name");
			getEmployeeBonus(); 	// Providing access of private methods to outside classes
		}
	
	
	// ACCESSING PRIVATE VARIABLE SALARY IN INDIRECT WAY USING GETTERS AND SETTERS
		public void setSalary(int salary) {
			this.salary = salary;
		}
		
		public int getSalary() {
			return salary;
		}
	
		
		
	public static void main(String[] args) {
		EmployeeData e1 = new EmployeeData("Tom",1, 25, "IT", 1000);
		System.out.println(e1.name);	//	O/p: Tom
		System.out.println(e1.salary);	// 	O/p: 1000
		
		e1.getEmployeeName();
		e1.getEmployeeBonus();
	}
}
