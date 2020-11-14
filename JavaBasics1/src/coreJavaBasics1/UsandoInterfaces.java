package coreJavaBasics1;

public class UsandoInterfaces implements PrimeraInterface, SegundaInterface{

	public static void main(String[] args) {
		
		PrimeraInterface objetoInterface1 = new UsandoInterfaces();
		SegundaInterface objetoInterface2 = new UsandoInterfaces();
		
		objetoInterface1.primerMetodoPi();
		objetoInterface1.segundoMetodoPi();
		objetoInterface1.tercerMetodoPi();
		
		objetoInterface2.primerMetodoSi();
		objetoInterface2.segundoMetodoSi();
		objetoInterface2.tercerMetodoSi();
	}

	@Override
	public void primerMetodoSi() {
		// TODO Auto-generated method stub
		System.out.println("primer metodo Si");
	}

	@Override
	public void segundoMetodoSi() {
		// TODO Auto-generated method stub
		System.out.println("segundo metodo Si");
	}

	@Override
	public void tercerMetodoSi() {
		// TODO Auto-generated method stub
		System.out.println("tercer metodo Si");
	}

	@Override
	public void primerMetodoPi() {
		// TODO Auto-generated method stub
		System.out.println("primer metodo Pi");
	}

	@Override
	public void segundoMetodoPi() {
		// TODO Auto-generated method stub
		System.out.println("segundo metodo Pi");
	}

	@Override
	public void tercerMetodoPi() {
		// TODO Auto-generated method stub
		System.out.println("tercer metodo Pi");
	}

}
