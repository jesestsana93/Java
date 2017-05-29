public class UsoPalindromas {
	
	public static void main(String[] args) {

		Palindromas p = new Palindromas();
		String c1="oso";
		String c2="osa";
		boolean resultado=p.sonPalindromas(c1,c2);
		if(resultado) {
			System.out.println("LAS CADENAS SON PALINDROMAS");
		} else {
			System.out.println("LAS CADENAS NO SON PALINDROMAS");
		}



	}



}