//Subclase

public class Tren extends TransporteTerrestre {
	
	int numeroVagones;

	public Tren(String tamanito, int numruedas, int nv) {
		super(tamanito, numruedas);
		numeroVagones=nv;
	}


	public void transportaPersonas(int n) {
		System.out.println("Transporto " + n + " personas");

	}


	public void generarSonido() {
		System.out.println("CHU CHUU");
	}


	public String toString() {
		return "Tren de tamanio " + super.tamanio + " de " + super.numeroRuedas + " ruedas " + " y con " + numeroVagones + " vagones";
	}

}