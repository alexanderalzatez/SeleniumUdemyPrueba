package coreJavaBasics1;

public class RomboLoops {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		java.util.Scanner entrada = new java.util.Scanner(System.in);
		System.out.println("ingrese numero: ");
		int limite = entrada.nextInt();
		
		for(int i = limite;i >=1; i--) {
			
			for(int j = i-1; j>= 1; j--) {
				System.out.print("- ");
			}
			for(int j = i; j<= limite; j++) {
				System.out.print("* ");
			}
			for(int j = i+1; j<= limite; j++) {
				System.out.print("* ");
			}
			for(int j = i-1; j>= 1; j--) {
				System.out.print("- ");
			}
			System.out.println();
		}
		
		
		for(int i = limite-1;i >=1; i--) {
			for(int j = i+1; j<= limite; j++) {
				System.out.print("- ");
			}
			for(int j = i-1; j>= 1; j--) {
				System.out.print("* ");
			}
			for(int j = i; j>= 1; j--) {
				System.out.print("* ");
			}
			for(int j = i; j<= limite-1; j++) {
				System.out.print("- ");
			}
			System.out.println();
			
		}
		
		//condición: Para solo número de filas impares
		if(limite%2 == 0) {
			limite++;
		}
		System.out.println("numero de filas: " + limite);
		int contAux=0;
		int contAux2=1;
		for(int i=1; i<=limite/2+1; i++) { //número de filas es la variable que ingresen como limite
			for(int j=1;j<=(limite/2)+contAux;j++) {
				System.out.print("-");
			}
			for(int j=1;j<=(2*i)-1;j++){
				System.out.print("*");
			}
			
			for(int j=1;j<=(limite/2)+contAux;j++) {
				System.out.print("-");
			}
			System.out.println();
			contAux--;
		}
		for(int i=1; i<=limite/2; i++) {
			for(int j=1;j<=contAux2;j++){
				System.out.print("-");
			}
			for(int j=limite;j>=(2*i)+1;j--){
				System.out.print("*");
			}
			for(int j=1;j<=contAux2;j++){
				System.out.print("-");
			}
			System.out.println();
			contAux2++;
		}
		
	}

}
