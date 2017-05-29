
public class UsoEjemplo {
	
	public static void main(String[] args) {

		Ejemplo e = new Ejemplo();
		try {
			e.divide(5,1);
		} catch(MiExcepcion me) {
			System.out.println("Lanzamos nuestra excepción");
			System.out.println(me);
		}
		

	}

}
