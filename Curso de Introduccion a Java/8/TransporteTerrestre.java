//Super clase 

public class TransporteTerrestre {

	String tamanio;
	int numeroRuedas;

	public TransporteTerrestre(String tam, int nr) {
		tamanio=tam;
		numeroRuedas=nr;
	}

	public void transportaPersonas(int n) {
		if(n>0 && n<=5) {
			System.out.println("Transporta pocas personas");
		} else if(n>5 && n<=20) {
			System.out.println("Transporta un grupo mediano de personas");
		} else if(n>20 && n<=50) {
			System.out.println("Transporta un grupo grande de personas");
		} else if(n>50) {
			System.out.println("Transporte masivo de gente");
		} else {
			System.out.println("Error en la cantidad de personas");
		}
	}

}
