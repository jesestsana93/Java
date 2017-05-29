
public class Racional {
	
	int p;
	int q;


	public Racional() {

	}

	public Racional(int p, int q) {
		if(q==0) {
			this.p=p;
			this.q=1;
		} else {
			this.p=p;
			this.q=q;
		}
		
	}

	public Racional simplifica(Racional r) {
		int x=r.p;
		int y=r.q;
		int mcd=calculaMCD(x,y);
		if(mcd!=1) {
			x=x/mcd;
			y=y/mcd;
		}
		Racional simplificado = new Racional(x,y);
		return simplificado;
	}


	public Racional multiplicaRacionalesSolito(Racional r) {
		int num=r.p*this.p;
		int den=r.q*this.q;
		Racional resultado = new Racional(num, den);
		Racional respuesta = new Racional();
		respuesta=simplifica(resultado);
		return respuesta;
	}

	public Racional multiplicaConDos(Racional r1, Racional r2) {
		int num=r1.p*r2.p;
		int den =r1.q*r2.q;
		Racional resultado = new Racional(num, den);
		Racional respuesta = new Racional();
		respuesta=simplifica(resultado);
		return respuesta;
	}

	public Racional suma(Racional r1, Racional r2) {
		int num=(r1.p*r2.q)+(r2.p*r1.q);
		int den=r1.q*r2.q;
		Racional resultado = new Racional(num, den);
		Racional respuesta = new Racional();
		respuesta=simplifica(resultado);
		return respuesta;
	}

	public Racional divisionSolito(Racional r) {
		int num=this.p*r.q;
		int den=this.q*r.p;
		Racional resultado = new Racional(num, den);
		Racional respuesta = new Racional();
		respuesta=simplifica(resultado);
		return respuesta;
	}

	public Racional divisionConDos(Racional r1, Racional r2) {
		int num=r1.p*r2.q;
		int den=r1.q*r2.p;
		Racional resultado = new Racional(num, den);
		Racional respuesta = new Racional();
		respuesta=simplifica(resultado);
		return respuesta;
	}

	
	public int calculaMCD(int a, int b) {
		int c=0;
		int r=0;
		if(a<b) {
			c=a;
			a=b;
			b=c;
		} 
		while(b!=0) {
			r=a%b;
			a=b;
			b=r;
		}
		return a;
	}


	public String toString() {
		return p + "/" + q;

	}


}
