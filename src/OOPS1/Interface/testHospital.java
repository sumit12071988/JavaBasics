package OOPS1.Interface;


public class testHospital {

	public static void main(String[] args) {
		
		FortisHospital fs = new FortisHospital(); 
		
		fs.dentalServices();
		fs.orthopedicServices();
		fs.neuroServices();
		fs.ambulanceServices();
		fs.cardioServices();
		fs.emergencySerivces();
		fs.ENTServices();
		fs.medicalInsurance();
		fs.OPTServices();
		fs.pathologySerices();
		fs.physioServies();
		
		//USMedical us = new USMedical();		-- This is not allowed
		
		// -- TOP CASTING
		USMedical us = new FortisHospital();	// Child class Object is being referred by Parent Interface reference variable
		
		// Interface object cannot be created but Interface reference variable creation is possible
		
		us.ambulanceServices();		// Parent Methods call
		us.orthopedicServices();	// Parent Methods call
		us.dentalServices();		// Parent Methods call
		us.neuroServices();			// Parent Methods call
		
		// us.physioServices();	--> this is not accessible since physioServices() is available under UKMedical Interface
		// One Interface reference variable CANNOT access Other Interface methods. Reason: REFERENCE TYPE CHECK
		
		System.out.println(USMedical.min_fee);		// Static Variables in INTERFACE can be accessed from other CLASSES which IMPLEMENTS the INTERFACE using INTERFACE REFERENCE
		System.out.println(us.min_fee);				// This way also can access but its not a way a static variable should be accessed
		
		System.out.println(FortisHospital.min_fee);	// Static Variables in INTERFACE can be accessed by CLASSES which IMPLEMENTS INTERFACE using CLASS REFERENCE
		System.out.println(fs.min_fee);				// This way also can access but its not a way a static variable should be accessed
		
		// USMedical.min_fee=100;	--> this will throw error since VARAIBLES with FINAL Keyword a.k.a CONSTANT'S value cannot be changed once defined
		
		//final int j=10;
		//j=20;				--> This will also throw error since CONSTANTS values cannot be changed at later 
		
		UKMedical uk = new FortisHospital();
		
		// ********DOWN CASTING (with TYPE CASTING to remove issue at compilation)**********
		// FortisHospital fs1 = (FortisHospital)new UKMedical();  --> This will fail even at compile time even though we've done the 
		//		required TYPE CASTING. Reason is: WE'RE TRYING TO CREATE AN OBJECT OF THE INTERFACE which is not allowed.
		
		
		us.services_911(); 		// O/p: US 911 Services IF services_911() has been overridden under FortisHospital class
								// O/p: Fortis 911 Services IF services_911() has been overridden under FortisHospital class
								
		fs.services_911();		// O/p: US 911 Services IF services_911() has been overridden under FortisHospital class
								// O/p: Fortis 911 Services IF services_911() has been overridden under FortisHospital class
								
		
		USMedical.billing(); 	// Accessing Static Method in INTERFACE using INTERFACE REFERENCE
		
		
		
	}
}
