
public class Snivy extends Pokemon {
	
	public Snivy(String n, String t, int e) {
		super(n,t,e);
	}


	public int leafStorm() {
		System.out.println("Snivy ha ejecutado el ataque leafStorm");
		return 5;
	}


	public int tacleada() {
		System.out.println("Snivy ha ejecutado el ataque tacleada");
		return 8;
	}

	public void imprimeListaAtaques() {
		System.out.println("1. leafStorm");
		System.out.println("2. tacleada");
	}

	public int seleccionaAtaque(int a, Pokemon p) {
		int fuerzaAtaque=0;
		if(a==1) {
			if(p.tipo=="agua") {
				fuerzaAtaque=leafStorm();
				fuerzaAtaque*=3;	
			} else {
				fuerzaAtaque=leafStorm();
			}
		} else if(a==2) {
			if(p.tipo=="agua") {
				fuerzaAtaque=tacleada();
				fuerzaAtaque*=2;	
			} else {
				fuerzaAtaque=tacleada();
			}
		}
		return fuerzaAtaque;
	}


	public String toString() {
		return "Snivy " + " energía " + super.energia;
	}

}