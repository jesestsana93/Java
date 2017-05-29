public class Ejemplo {
	
	public void divide(int a, int b) throws MiExcepcion {
		if(b==1) {
			throw new MiExcepcion("No tiene caso la división");
		} else {
			System.out.println("Se puede hacer la división");
		}
	}

}