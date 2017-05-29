
public class Charmander  extends Pokemon{
	
	public Charmander(String n, String t, int e) {
		super(n,t,e);
	}


	public int megaPunio() {
		System.out.println("Charmander ha ejecutado el ataque megaPunio");
		return 8;
	}


	public int lanzaLlamas() {
		System.out.println("Charmander ha ejecutado el ataque lanza llamas");
		return 12;
	}

	public void imprimeListaAtaques() {
		System.out.println("1. megaPunio");
		System.out.println("2. lanzaLlamas");
	}

	public int seleccionaAtaque(int a, Pokemon p) {
		int fuerzaAtaque=0;
		if(a==1) {
			if(p.tipo=="hierba") {
				fuerzaAtaque=megaPunio();
				fuerzaAtaque*=3;	
			} else {
				fuerzaAtaque=megaPunio();
			}
		} else if(a==2) {
			if(p.tipo=="hierba") {
				fuerzaAtaque=lanzaLlamas();
				fuerzaAtaque*=2;	
			} else {
				fuerzaAtaque=lanzaLlamas();
			}
		}
		return fuerzaAtaque;
	}


	public String toString() {
		return "Charmander " + " energía " + super.energia;
	}



}








