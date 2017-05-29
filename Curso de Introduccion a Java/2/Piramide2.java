import java.util.Scanner;

public class Piramide2 {
	
	public static void main(String[] args) {

		int n=0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un valor de n para dibujar una pirámide");
		n=entrada.nextInt();

		int renglones=1;
		int columnas=1;
		while(columnas<=n) {
			renglones=1;
			while(renglones<=columnas) {
				System.out.print("*");
				renglones++;
			}
			System.out.println();
			columnas++;
		}

	}


}