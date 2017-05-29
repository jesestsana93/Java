//import java.util.Scanner;

public class Rectangulo {
	
	public static void main(String[] args) {

		/*int n=0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un valor de n para dibujar una pirámide");
		n=entrada.nextInt();*/

		int base=-1;
		int altura=2;

		int columnas=1;
		int renglones=1;

		if(base>0 && altura>0) {
			while(renglones<=altura) {
				columnas=1;
				while(columnas<=base) {
					System.out.print("* ");
					columnas++;
				}
				System.out.println();
				renglones++;
			}
		} else {
			System.out.println("No se puede generar la figura");
		}


		

	}


}