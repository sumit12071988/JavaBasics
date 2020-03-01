package OOPS1.Encapsulation.Example2;

/**
 * 
 * @author Sumit
 * @implNote Proper implementation of Getters and Setters for class variables
 */

public class Company {
	
	public String name;
	public int totalEmp;
	
	private int budget;
	private String projects;

	
	// ECLISPE AUTO GENERATING GETTERS AND SETTERS FOR CLASS VARIABLES
		// Rt. Click --> Source --> Generate Getters and Setters

// ********************************************************************************************************************************	
	public String getName() {
		return name;							// GETTERS ALWAYS RETURNS CLASS VARIABLES
	}
	public void setName(String name) {			// SETTERS ALWAYS ASSIGNS LOCAL VARIABLE TO CLASS VARIABLE USING "THIS." METHOD
		this.name = name;						
	}
// ********************************************************************************************************************************		
	public int getTotalEmp() {				// GETTERS ALWAYS RETURNS CLASS VARIABLES
		return totalEmp;
	}
	public void setTotalEmp(int totalEmp) {	// SETTERS ALWAYS ASSIGNS LOCAL VARIABLE TO CLASS VARIABLE USING "THIS." METHOD
		this.totalEmp = totalEmp;
	}
// ********************************************************************************************************************************		
	public int getBudget() {					// GETTERS ALWAYS RETURNS CLASS VARIABLES
		return budget;
	}
	public void setBudget(int budget) {		// SETTERS ALWAYS ASSIGNS LOCAL VARIABLE TO CLASS VARIABLE USING "THIS." METHOD
		this.budget = budget;
	}
// ********************************************************************************************************************************	
	public String getProjects() {				// GETTERS ALWAYS RETURNS CLASS VARIABLES
		return projects;
	}
	public void setProjects(String projects) {	// SETTERS ALWAYS ASSIGNS LOCAL VARIABLE TO CLASS VARIABLE USING "THIS." METHOD
		this.projects = projects;
	}
	
}
