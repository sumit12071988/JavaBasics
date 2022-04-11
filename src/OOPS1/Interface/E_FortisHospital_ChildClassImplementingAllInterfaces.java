package OOPS1.Interface;

/**
 * 
 * @author Sumit
 * @implNote To explain how to IMPLEMENT INTERFACES for a CLASS
 */

public class E_FortisHospital_ChildClassImplementingAllInterfaces implements B_USMedical_ChildInterface, C_UKMedical_ChildInterfaceWithAbstractMethods, D_IndianMedical_ChildInterfaceWithAbstractMethods {

	// whenever a class is IMPLEMENTing any INTERFACE, we MUST DEFINE the METHOD BODY of all METHODS of the interface
	
	@Override
	public void orthopedicServices() {
		// TODO Auto-generated method stub
		System.out.println("Fortis Hospital -- Ortho Services");
	}

	@Override
	public void dentalServices() {
		// TODO Auto-generated method stub
		System.out.println("Fortis Hospital -- Dental Services");
	}

	@Override
	public void neuroServices() {
		// TODO Auto-generated method stub
		System.out.println("Fortis Hospital -- Neuro Services");
	}

	@Override
	public void ambulanceServices() {
		// TODO Auto-generated method stub
		System.out.println("Fortis Hospital -- Ambulance Services");
	}

	@Override
	public void pediatricServices() {
		// TODO Auto-generated method stub
		System.out.println("Fortis Hospital -- Pediatric Services");
	}

	@Override
	public void physioServies() {
		// TODO Auto-generated method stub
		System.out.println("Fortis Hospital -- Physio Services");		
	}

	@Override
	public void ENTServices() {
		// TODO Auto-generated method stub
		System.out.println("Fortis Hospital -- ENT Services");
	}

	@Override
	public void emergencySerivces() {
		// TODO Auto-generated method stub
		System.out.println("Fortis Hospital -- Emergency Services");
	}

	@Override
	public void cardioServices() {
		// TODO Auto-generated method stub
		System.out.println("Fortis Hospital -- Cardio Services");
	}

	@Override
	public void OPTServices() {
		// TODO Auto-generated method stub
		System.out.println("Fortis Hospital -- OPT Services");
	}
	
	
	// Fortis specific methods which are NON OVERRIDDEN
	public void	medicalInsurance() {
		System.out.println("FortisHospital -- medicalInsurance");
	}
	
	// @Override --> We cannot mention "@Override" for non-overridden method as IDE will throw compilation error.
	public void pathologySerices() {
		System.out.println();
	}
	
	/*
	 * @Override public void services_911() {
	 * System.out.println("Fortis 911 Services"); }
	 */
	
	@Override
	public void polio() {
		System.out.println("FortisHospital -- WHO");
	}
}
