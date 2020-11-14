package coreJavaBasics1;

public class superKeyWord extends PadreHerencia{
	
	int a = 30;
	
	//Constructor
	public superKeyWord(String nombre) {
		super(); //para ejecutar el constructor de la clase padre
		System.out.println("impmrimiendo inicio de constructor superKeyWord object: " + nombre);
	}
	
	public void displayVariable() {
		super.displayVariable();
		System.out.println("impmrimiendo con super: " + super.a); //10 con super accede a la variable padre osea el nivel superior
		System.out.println("impmrimiendo sin super: " + a); //30
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		superKeyWord object = new superKeyWord("Alex");
		object.displayVariable();
	}

}
