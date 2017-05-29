public class Sumas {
		
	public boolean compara(int a, int b, int c) {
		boolean cumple=false;
		if(a==b+c) {
			cumple=true;
			System.out.println("El primero es la suma de los otros dos");
		} else if (b==a+c) {
			cumple=true;
			System.out.println("El segundo es la suma de los otros dos");
		} else if(c==a+b) {
			cumple=true;
			System.out.println("El tercero es la suma de los otros dos");
		}
		return cumple;
	}

}