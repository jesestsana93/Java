
public class UsoRacional {
	
	public static void main(String[] args) {


		Racional r = new Racional(2,2);
		Racional r2 = new Racional(2,2);
		System.out.println(r);
		if(r.p==r.q) {
			System.out.println("1");
		} else {
			System.out.println(r.multiplicaRacionalesSolito(r2));
			System.out.println(r.multiplicaConDos(r,r2));
		}
		System.out.println("La suma de ");
		System.out.println(r + " con "+ r2 + " es ");
		System.out.println(r.suma(r,r2));
		System.out.println("La división de ");
		System.out.println(r + " con "+ r2 + " es ");
		System.out.println(r.divisionSolito(r2));
		System.out.println(r.divisionConDos(r,r2));
		//r.simplifica();
	}

}