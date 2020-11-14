package coreJavaBasics1;


public class Loops {

	public static void main(String[] args) {
		
		int limite = 10;
		int contAux = 1;	
		for(int i = 1; i <= limite; i++){
			for(int j = contAux; j <= contAux+limite-i; j++) {
				System.out.print(j + "\t");
			}
			contAux += limite - i + 1;
			System.out.println();
		}
		System.out.println();
		limite = 5;
		int cont=1;
		for(int i=limite; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(cont + "\t");
				cont++;
			}
			System.out.println();
		}
		System.out.println();
		int cont3 = 3;
		for(int i=1; i<=limite; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(cont3 + "\t");
				cont3+=3;
			}
			System.out.println();
		}
		
		@SuppressWarnings("resource")
		java.util.Scanner entrada = new java.util.Scanner(System.in);
		System.out.println("ingrese el numero de filas: ");
		int filas = entrada.nextInt();
		
		System.out.println("ingrese el numero de columnas: ");
		int columnas = entrada.nextInt();
		
		System.out.println("filas: " + filas);
		System.out.println("columnas: " + columnas);
		
		cont=1;
		int[][] arreglo = new int[filas][columnas];
		for(int i=0; i < arreglo.length; i++) {
			for(int j=0; j < arreglo[i].length;j++) {
				arreglo[i][j] = cont;
				cont++;
			}
		}
		
		for(int i=0; i < arreglo.length; i++) {
			for(int j=0; j < arreglo[i].length;j++) {
				System.out.print(arreglo[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
