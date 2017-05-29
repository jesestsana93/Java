public class UsoCuadrado {
	
	public static void main(String[] args) {

		ImplementacionCuadrado c = new ImplementacionCuadrado();
		Cuadrado cuadradito = new Cuadrado(2.5);

		System.out.println("Area de un cuadrado de lado " + cuadradito.lado + " = " + c.calculaArea(cuadradito));
		System.out.println("Perímetro de un cuadrado de lado " + cuadradito.lado + " = " + c.calculaPerimetro(cuadradito));


	}


}