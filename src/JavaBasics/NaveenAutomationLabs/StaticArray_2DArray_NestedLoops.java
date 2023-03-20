package JavaBasics.NaveenAutomationLabs;

public class StaticArray_2DArray_NestedLoops {
	public static void main(String[] args) {
		
		// 00 01 02 03
		// 10 11 12 13
		// 20 21 22 23
		// 30 31 32 33
		
		int[][] data = new int[10][20];
		data[0][0] = 00;
		data[0][1] = 01;
		data[0][2] = 02;
		data[0][3] = 03;
		
		//OR
		
		int[][] data1 = {{10,20,30}, {40,50,60}, {70,80,90}};
		
		for(int i=0;i<3; i++) {			// Loop for traversing in Column indices of matrix
			for (int j=0; j<3; j++) {	// Loop for traversing in Row indices of matrix
				System.out.print(data1[i][j] +" ");
			}
			System.out.println();
		}		
		
	}

}
