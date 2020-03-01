package JavaBasics;

/**
 * 
 * @author Sumit
 * To understand the concept of Array
 *
 */
public class StaticArray_1DArray {

	public static void main(String[] args) {
		
		//int array
		int[] arr_int = new int[4];					// This will create array with 4 slots and keep data which is the default datatype
												// For integer array, all slots will have 0, for String it should be null
//		for(int i=0; i< arr.length; i++) {
//			System.out.println(arr[i]);			//O/p: 10,20,30,40
//		}
		
		arr_int[0] = 10;							 
		arr_int[1] = 20;
		arr_int[2] = 30;
		arr_int[3] = 40;
		
		// To Print a specific value from an index
		System.out.println(arr_int[2]);				//O/p: 30
		System.out.println(arr_int[0]);				//O/p: 10
		System.out.println(arr_int[0] + arr_int[2]);	//O/p: 10+30 = 40
		
		//System.out.println(arr[4]); 			//O/p: ArrayIndexOutOfBoundException since i[4] doesn't exist
		//System.out.println(arr[-1]); 			//O/p: ArrayIndexOutOfBoundException since i[-1] doesn't exist
		
		// To Print length of an array
		System.out.println(arr_int.length);			//O/p: 4
		
		//To Print all the values of an array
		for(int i=0; i< arr_int.length; i++) {
			System.out.println(arr_int[i]);			//O/p: 10,20,30,40
		}
		
		//double array
		double[] arr_dbl = new double[2];
		arr_dbl[0]=10.11;
		arr_dbl[1]=11.13;
		
		//String array
		String[] arr_str = new String[4];
		
		for(int j=0;j<arr_str.length;j++) {
			System.out.println(arr_str[j]);	//O/p: null,null,null,null
		}
		
		arr_str[0]="Sumit";
		arr_str[1]="10.23";
//		arr_str[2]="100";
//		arr_str[3]="true";

		for(int j=0;j<arr_str.length;j++) {
			System.out.println(arr_str[j]);	//O/p: Sumit,100,null,null
		}
		
	       //OBJECT ARRAY
	       Object[] emp=new Object[6];
	       emp[0]="Tom";
	       emp[1]=25;
	       emp[2]=12.33;
	       emp[3]=true;
	       emp[4]='M';
	       emp[5]="06-Nov-2019";

	       for(int a=0; a < emp.length; a++ ){
	    	   System.out.println(emp[a]);		
	       }
}
}

