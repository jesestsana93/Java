
public class Squirtle extends Pokemon {
	
	public Squirtle(String n, String t, int e) {
		super(n,t,e);
	}


	public int burbuja() {
		System.out.println("Squirtle ha ejecutado el ataque de burbuja");
		return 20;
	}


	public int giroRapido() {
		System.out.println("Squirtle ha ejecutado el ataque giro rápido");
		return 7;
	}

	public void imprimeListaAtaques() {
		System.out.println("1. Burbuja");
		System.out.println("2. Giro rápido");
	}

	public int seleccionaAtaque(int a, Pokemon p) {
		int fuerzaAtaque=0;
		if(a==1) {
			if(p.tipo=="roca") {
				fuerzaAtaque=burbuja();
				fuerzaAtaque*=4;	
			} else {
				fuerzaAtaque=burbuja();
			}
		} else if(a==2) {
			if(p.tipo=="roca") {
				fuerzaAtaque=giroRapido();
				fuerzaAtaque*=2;	
			} else {
				fuerzaAtaque=giroRapido();
			}
		}
		return fuerzaAtaque;
	}


	public String toString() {
		return "Squirtle " + " energía " + super.energia;
	}

}
