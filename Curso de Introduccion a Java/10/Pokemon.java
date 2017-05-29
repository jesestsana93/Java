public class Pokemon {

	String nombre;
	String tipo;
	int energia;

	public Pokemon() {
		
	}

	public Pokemon(String n, String t, int e) {
		nombre=n;
		tipo=t;
		energia=e;
	}

	public void hablar(String s) {
		System.out.println(s);
	}

	public void imprimeListaAtaques() {
		System.out.println("Lista de ataques del pokemon");
	}

	public int seleccionaAtaque(int a, Pokemon p) {
		return 0;

	}



}

