package coreJavaBasics1;

public class HijoClaseAbstracta extends PadreClaseAbstracta{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HijoClaseAbstracta objeto = new HijoClaseAbstracta();
		objeto.primerMetodoCa();
		objeto.SegundoMetodoCa();
		objeto.metodoAbstracto();
	}

	@Override
	public void metodoAbstracto() {
		// TODO Auto-generated method stub
		System.out.println("este es el metodo abstracto implementando el cuerpo dentro de la clase hijo");
	}

}
