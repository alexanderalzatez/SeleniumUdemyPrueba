package coreJavaBasics1;

public class ExcepcionesManejo {

	public static void main(String[] args) {
		// try-catch
		try {
			int a = 4/0;
			System.out.println("division: " + a);
		} catch (Exception e) {
			System.out.println("manejando el error: " + e.getMessage());
		} 
		
		// try-catch-finally and other specific exceptions
		try {
			int a = 4/0;
			System.out.println("division: " + a);
			
		} catch (ArithmeticException ae) {
			System.out.println(ae);
		} catch (IndexOutOfBoundsException ioobe) {
			System.out.println(ioobe);
		} catch (Exception e) {
			System.out.println("manejando el error: " + e.getMessage());
		} finally{
			System.out.println("bloque finally ejecutandose haya o no haya error");
		}
	}

}
