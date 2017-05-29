import java.util.Scanner;
import java.util.InputMismatchException;

public class Promedio {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		int contador=1;

		int calificacion=0;
		int suma=0;
		double promedio;

		do {
			System.out.println("Ingresa la calificacion de alumno " + contador);
			try {
				calificacion=entrada.nextInt();
			} catch(InputMismatchException ime) {
				System.out.println("Calificacion inválida");
				entrada= new Scanner(System.in);
				calificacion=-1;
			}
			if(calificacion!=-1) {
				suma+=calificacion;
				contador++;
			}
			
		}while(contador<=10);
			
		promedio=(double)suma/10;
		System.out.println("El promedio del grupo es " + promedio);
		
	}
}