import java.util.Scanner;

public class Esfera {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int radio;
		boolean ciclo=true;

		do {
			System.out.println("Dame el valor del radio para calcular el volumen de una esfera");
			radio=entrada.nextInt();
			if(radio<=0) {
				System.out.println("Radio inválido");
			} else {
				double volumen=(4*Math.PI*Math.pow(radio,3))/3;
				System.out.println("El volumen de la esfera es " + volumen);
				ciclo=false;
			}
		}while(ciclo);
	}
}