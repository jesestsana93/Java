import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * En esta clase se lee mediante el teclado los valores de la anchura y altura de un rectangulo.
 * Despues, imprime ese rectangulo con asteriscos pero solamente en las orillas, no en el relleno.
 * @author Jesus Esteban Sanchez Alcantara
 */
public class Rectangulo {
	
	public static void main(String[] args) {

		int altura=0;
		int anchura=0;
		int contador=1;

		Scanner entrada = new Scanner(System.in);

		do {
			try{ 
				System.out.print("\nEscribe la altura(renglones) que va a tener el rectangulo:");
				altura=entrada.nextInt();

				System.out.print("Escribe la anchura(columnas) que va a tener el rectangulo:");
				anchura=entrada.nextInt();
	    		System.out.println();

				int columnas=1;
				int renglones=1;

				if(anchura>0 && altura>0) {
					while(renglones<=altura) {
						columnas=1;
						while(columnas<=anchura) {
							if(columnas==1 || columnas==anchura || renglones==1 || renglones==altura){
								System.out.print("* ");
							}else{
								System.out.print("  ");
							}
							columnas++;
						}
						System.out.println();
						renglones++;
					}

		/* Esta es otra opcion con un for
		for(int renglones=1;renglones<=altura;renglones++){
			for(int columnas=1;columnas<=anchura;columnas++){
				if(columnas==1 || columnas==anchura || renglones==1 || renglones==altura){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}*/

				} else {
					System.out.println("No se puede generar la figura, debes introducir valores mayores a cero.");
				}		

			} catch(InputMismatchException ime) {
				System.out.println("\nOPCION INVALIDA, debes de ingresar un numero positivo. Intenta de nuevo");
				entrada= new Scanner(System.in);
				contador++;
			}
		}while(contador<=10);

	}

}