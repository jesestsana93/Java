
public class Racional {
	
	int p;
	int q;

	public Racional(int p, int q) {
		if(q==0) {
			this.p=p;
			this.q=1;
		} else {
			this.p=p;
			this.q=q;
		}
		
	}

	public Racional multiplicaRacionalesSolito(Racional r) {
		int num=r.p*this.p;
		int den=r.q*this.q;
		Racional resultado = new Racional(num, den);
		return resultado;
	}

	public Racional multiplicaConDos(Racional r1, Racional r2) {
		int num=r1.p*r2.p;
		int den =r1.q*r2.q;
		Racional resultado = new Racional(num, den);
		return resultado;
	}


	public String toString() {
		return p + "/" + q;
	}

}
