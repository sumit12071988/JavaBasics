package OOPS1;

import java.util.ArrayList;

public class NonStaticMethodsTypes {

	//Class Methods == Class Functions == Class Properties 
	
	//1. no i/p and no returns
		// void --> method with void when called, is not expected to return any data.
	
	public void test() {
		System.out.println("method with no i/p and no returns");
	}
	
	public String[] getWeekDayNames() {
		String[] day = new String[7];
		day[0] = "Monday";
		day[1] = "Tuesday";
		day[2] = "Wednesday";
		day[3] = "Thursday";
		day[4] = "Friday";
		day[5] = "Saturday";
		day[6] = "Sunday";
		
		return day;
		
	}
	
	
	//2. no i/p and with return	
	public int add() {		// return type = int
		System.out.println("method with no i/p and with returns");
		int a=10,b=20;
		int c =a+b;
		return c;
	}
	
	public String getTrainerName() {			// return type = String
		System.out.println("Get Trainer Name");
		String name = "Sumit";
		return name;
	}
	
	//3 With i/p and with return
	
	public float div(int a,int b) {
		float c = a/b;
		return c;		
	}
	
	public String getCapitalName(String countryName) {
		if (countryName.equalsIgnoreCase("India")){
			return "New Delhi";
		}
		else if(countryName.equalsIgnoreCase("US")) {
			return "Washington DC";
		}	
		
		else if(countryName.equalsIgnoreCase("JAPAN")) {
			return "Tokyo";
		}
		else
			return "Captial Not Found";
	}
	
	
	// returning multiple values
	
	public ArrayList<String> getStudentList(String batch) {
		
		ArrayList<String> studentList=new ArrayList<String>();

		if(batch.equalsIgnoreCase("Sep")) {
			studentList.add("Gulnaaz");
			studentList.add("Nagi");
			studentList.add("Rakesh");
			studentList.add("Mukesh");
		}
		
		else if(batch.equalsIgnoreCase("Aug")) {
			studentList.add("Tom");
			studentList.add("Anushya");
		}
		
		return studentList;
	}
	
	public String getHODName(String deptName) {
		if(deptName.equalsIgnoreCase("CSE")) {
			return "Naveen";
		}
		else if(deptName.equalsIgnoreCase("EEE")) {
			return "Tom";
		}
		
		else
		return null;		// null will be considered of String Datatype
	}
	
	
	
	

	public static void main(String[] args) {
	NonStaticMethodsTypes obj = new NonStaticMethodsTypes();
	
	obj.test();
	
	int sum= obj.add();
	System.out.println(sum);
	
	String n1 = obj.getTrainerName();
	System.out.println(n1 + " From India");
	
	String[] days = obj.getWeekDayNames();
	for (int i = 0; i < days.length; i++) {
		System.out.println(days[i]);
	}
	
	float div1 = obj.div(40, 20);
	System.out.println(div1);
	
	float div2 = obj.div(80, 21);
	System.out.println(div2);
	
	String getCap = obj.getCapitalName("India");
	System.out.println(getCap);

	String getCap1 = obj.getCapitalName("Japan");
	System.out.println(getCap1);
	
	System.out.println(obj.getCapitalName("Srilanka"));
	
	ArrayList<String> arrayList = obj.getStudentList("Sep");
	for (int i = 0; i < arrayList.size(); i++) {
		System.out.println(arrayList.get(i));
	}
	
	String hodName = obj.getHODName("XXX");
	System.out.println(hodName);
	
	}
}
