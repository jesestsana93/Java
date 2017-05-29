
public class UsoRacional {
	
	public static void main(String[] args) {


		Racional r = new Racional(2,7);
		Racional r2 = new Racional(1,4);
		System.out.println(r);
		System.out.println(r.multiplicaRacionalesSolito(r2));
		
		System.out.println(r.multiplicaConDos(r,r2));




	}



}