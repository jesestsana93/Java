public class UsoSumas {
	
	public static void main(String[] args) {

		Sumas s = new Sumas();
		boolean res=s.compara(10,2,12);
		if(res) {
			System.out.println("Se cumple que dos de ellos son la suma del otro");
		} else {
			System.out.println("Ninguno de los números me da la suma del otro");	
		}

	}





}