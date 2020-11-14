package coreJavaBasics1;

public class Arrays {

	public static void main(String[] args) {
		// una manera de declarar arreglos 
		int[] arrA = new int[5];
		arrA[0] = 1;
		arrA[1] = 2;
		arrA[2] = 3;
		arrA[3] = 4;
		arrA[4] = 5;
		
		// otra manera de declarar arreglos
		int[] arrB = {1,2,3,4,5};
		
		// imprimir arreglo
		for(int i=0;i<arrA.length;i++) {
			System.out.print(arrA[i]);
		}
		System.out.println("\narreglo b: ");
		for(int i=0;i<arrB.length;i++) {
			System.out.print(arrB[i]);
		}
		
		//Arreglos multidimensionales
		System.out.println("\narreglo multidimensional b: ");
		int[][] arrMultA = {{1,2,3},{4,5,6}};
		for(int i=0; i<arrMultA.length;i++) {
			for(int j=0; j<arrMultA[i].length; j++) {
				System.out.print(arrMultA[i][j]+"\t");
				
			}
			System.out.println();
		}
	}

}
