package OOPS1.Interface;


public class F_TestHospital {

	public static void main(String[] args) {
		
		E_FortisHospital_ChildClassImplementingAllInterfaces fs = new E_FortisHospital_ChildClassImplementingAllInterfaces(); 
		
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
		B_USMedical_ChildInterface us = new E_FortisHospital_ChildClassImplementingAllInterfaces();	// Child class Object is being referred by Parent Interface reference variable
		
		// Interface object cannot be created but Interface reference variable creation is possible
		
		us.ambulanceServices();		// Fortis Hospital -- Ambulance Services
		us.orthopedicServices();	// Fortis Hospital -- Ortho Services
		us.dentalServices();		// Fortis Hospital -- Dental Services
		us.neuroServices();			// Fortis Hospital -- Neuro Services
		
		// us.physioServices();	--> this is not accessible since physioServices() is available under UKMedical Interface
		// One Interface reference variable CANNOT access Other Interface methods. Reason: REFERENCE TYPE CHECK
		
		System.out.println(B_USMedical_ChildInterface.min_fee);		// Static Variables in INTERFACE can be accessed from other CLASSES which IMPLEMENTS the INTERFACE using INTERFACE REFERENCE
		System.out.println(us.min_fee);				// This way also can access but its not a way a static variable should be accessed
		
		System.out.println(E_FortisHospital_ChildClassImplementingAllInterfaces.min_fee);	// Static Variables in INTERFACE can be accessed by CLASSES which IMPLEMENTS INTERFACE using CLASS REFERENCE
		System.out.println(fs.min_fee);				// This way also can access but its not a way a static variable should be accessed
		
		// USMedical.min_fee=100;	--> this will throw error since VARAIBLES with FINAL Keyword a.k.a CONSTANT'S value cannot be changed once defined
		
		//final int j=10;
		//j=20;				--> This will also throw error since CONSTANTS values cannot be changed at later 
		
		C_UKMedical_ChildInterfaceWithAbstractMethods uk = new E_FortisHospital_ChildClassImplementingAllInterfaces();
		
		// ********DOWN CASTING (with TYPE CASTING to remove issue at compilation)**********
		// FortisHospital fs1 = (FortisHospital)new UKMedical();  --> This will fail even at compile time even though we've done the 
		//		required TYPE CASTING. Reason is: WE'RE TRYING TO CREATE AN OBJECT OF THE INTERFACE which is not allowed.
		
		
		us.services_911(); 		// O/p: US 911 Services IF services_911() has NOT been overridden under FortisHospital class
								// O/p: Fortis 911 Services IF services_911() has been overridden under FortisHospital class
								
		fs.services_911();		// O/p: US 911 Services IF services_911() has NOT been overridden under FortisHospital class
								// O/p: Fortis 911 Services IF services_911() has been overridden under FortisHospital class
								
		
		B_USMedical_ChildInterface.billing(); 	// Accessing Static Method in INTERFACE using INTERFACE REFERENCE
		
		
		
	}
}
