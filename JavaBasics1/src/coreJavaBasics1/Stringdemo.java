package coreJavaBasics1;

public class Stringdemo {
	
	public static int sumRecursion(int inicio, int fin) {
		
		if(inicio<=fin)
			return inicio + sumRecursion(inicio+1,fin);
		else
			return 0;
	}

	public static void main(String[] args) {
		//Strings:
		// son una clase precompilada de Java por eso es que no es necesario hacer la creación del 
		// objeto extrictamente asi, aunque sería valido:
		// String a = new String("Hello");
		
		String a = "Hello";
		String b = "Hello";
		String c = "Te amo Susana María "; 
		
		System.out.print(a+"\n"+b);
		
		//Metodos más usados con Strings
		System.out.println(c.charAt(2));
		System.out.println(c.indexOf("a"));
		System.out.println(c.substring(3,6));
		System.out.println(c.concat(" att Alex"));
		System.out.println(c.length());
		System.out.println(c.trim());				 //Quitar los espacios al inicio o final de la cadena
		System.out.println(c.toUpperCase());
		System.out.println(c.toLowerCase());
		String arrayString[] = c.split(" ");			 //Separar en arreglo por cada espacio en este caso
		System.out.println(arrayString[0]);
		System.out.println(c.replace("María", "sddghskf"));
		
		
		//Averiguar si una palabra es palindrome -> igual de derecha a izquierda y de izquierda a derecha
		String palindrome = "madam";
		String aux = "";
		
		for(int i=palindrome.length()-1; i>=0; i--) {
			aux+=palindrome.charAt(i);
		}
		//if(aux == palindrome) // no funciona; comparar los strings con el metodo equals
		if(aux.equalsIgnoreCase(palindrome)) //cuando es una sola linea no es necesario {}
			System.out.println(palindrome + " es palindrome " + aux);
		else
			System.out.println(palindrome + " no es palindrome " + aux);
		
		int k = sumRecursion(5,10);
		System.out.println("Sumatoria con recursión" + k);
	}

}
