public class ExcepcionDivZero {
	
	public static void main(String[] args) {

		try {
			
			int res=2/0;
			System.out.println(res);
		} catch(ArithmeticException ae) {
			System.out.println("No es posible dividir entre cero ");
		}

		
		System.out.println("Hola, esta es la siguiente línea");



	}

}
