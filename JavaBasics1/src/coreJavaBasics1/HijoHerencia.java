package coreJavaBasics1;

public class HijoHerencia extends PadreHerencia{
	int a = 20;
	public static void main(String[] args) {
		
		HijoHerencia objeto = new HijoHerencia();
		System.out.println("valor del hijo: " + objeto.a);
		
		PadreHerencia objeto2 = new HijoHerencia();
		System.out.println("valor heredado del padre: " + objeto2.a);
	}

}
