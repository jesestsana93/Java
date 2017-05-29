public class Pikachu extends Pokemon {
	
	public Pikachu(String n, String t, int e) {
		super(n,t,e);
	}


	public int atackTrueno() {
		System.out.println("Pikachu ha ejecutado el ataque attack trueno");
		return 10;
	}


	public int electroBall() {
		System.out.println("Pikachu ha ejecutado el ataque electro ball");
		return 5;
	}

	public void imprimeListaAtaques() {
		System.out.println("1. Attack trueno");
		System.out.println("2. Electro ball");
	}

	public int seleccionaAtaque(int a, Pokemon p) {
		int fuerzaAtaque=0;
		if(a==1) {
			if(p.tipo=="agua") {
				fuerzaAtaque=atackTrueno();
				fuerzaAtaque*=2;	
			} else {
				fuerzaAtaque=atackTrueno();
			}
		} else if(a==2) {
			if(p.tipo=="agua") {
				fuerzaAtaque=electroBall();
				fuerzaAtaque*=3;	
			} else {
				fuerzaAtaque=electroBall();
			}
		}
		return fuerzaAtaque;
	}

	public String toString() {
		return "Pikachu " + " energía " + super.energia;
	}

}
