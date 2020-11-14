package coreJavaBasics1;

public class Firstclass {

	static int a = 4; 
	
	public void getData() {
		System.out.println("Este es el metodo getData de Firstclass");
	}
	
	public static void main(String[] args) {
		
		Firstclass objeto1 = new Firstclass();
		Secondclass objeto2 = new Secondclass();
		
		objeto1.getData();
		objeto2.setData();
		System.out.println("Hello World" + a);
		
	}

}
