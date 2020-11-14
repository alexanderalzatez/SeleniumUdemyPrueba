package coreJavaBasics1;

public class RecursionMethods {
	
	public static int sumRecursion(int inicio, int fin) {
		if(inicio<=fin)
			return inicio + sumRecursion(inicio+1,fin);
		else
			return 0;
	}
	
	public static void main(String[] args) {

		int k = sumRecursion(5,10); //sumatoria de 5 a 10 --> 5+6+7+8+9+10
		System.out.println(k);
	}

}
