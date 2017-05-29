public class UsoPunto {
	
	public static void main(String[] args) {

		Punto p = new Punto(4,5);
		Punto p2 = new Punto(-4,0);
		Punto p3 = new Punto();
		p.saludaAlUsuario();
		System.out.println(p);
		double d = p.calculaDistancia(p2);
		System.out.println(d);
		p3=p.puntoMedio(p2);
		System.out.println("El punto medio es");
		System.out.println(p3);


	}

}