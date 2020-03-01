package JavaBasics;

import java.util.ArrayList;

public class ModernLoopsConcept {
	public static void main(String[] args) {
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Sumit");
		ar.add("Saha");
		ar.add("Rakesh");
		ar.add("Panda");
		
		// TO PRINT ALL VALUES IN THE ARRAYLIST
		//OPTION1:
		for(String a: ar) {
			System.out.println(a);
		}
		
		//OPTION2:		
		ar.forEach(	(b)->	System.out.println(b)); // -> is called LAMBDA EXPRESSION. (var)-> this makes b as a Variable
		

		
		
		//************************************************************************************************************************//
		
		ArrayList<Double> height = new ArrayList<Double>();
		height.add(100.01);
		height.add(100.02);
		height.add(100.03);
		height.add(100.04);
		
		height.forEach( (d)->  System.out.println(d));
	}

}
