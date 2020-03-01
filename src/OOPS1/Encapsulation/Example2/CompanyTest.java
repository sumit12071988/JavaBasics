package OOPS1.Encapsulation.Example2;

public class CompanyTest {
	public static void main(String[] args) {
	
		Company obj = new Company();
		
		obj.setName("IBM");
		obj.setTotalEmp(5000);		
		obj.setBudget(10000);			// private variable
		obj.setProjects("AI-ROBOTICS");	// private methods
		
		System.out.println(obj.getName());
		System.out.println(obj.getTotalEmp());		
		System.out.println(obj.getBudget());
		System.out.println(obj.getProjects());
	}
}
