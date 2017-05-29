public class Punto {
	
	int x;
	int y;

	public Punto() {

	}

	public Punto(int x, int y) {
		this.x=x;
		this.y=y;
	}

	public void saludaAlUsuario() {
		System.out.println("Hola usuario, bienvenido al programa de puntos");
	}


	public double calculaDistancia(Punto p) {
		double distancia;
		distancia=Math.sqrt(Math.pow((p.x-this.x),2)+Math.pow((p.y-this.y),2));
		return distancia;
	}

	public Punto puntoMedio(Punto p) {
		int num_x=(int)((p.x+this.x)/2);
		int num_y=(int)((p.y+this.y)/2);
		Punto medio = new Punto(num_x, num_y);
		return medio;
	}

	public String toString() {
		return "( " + x + " , " + y + " )";

	}

}
