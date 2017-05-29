import java.util.Random;

public class CuentaCarasDados {

	public static void main(String[] args) {

		Random aleatorios = new Random();
		int contador=1;
		int[] caras = new int[6];

		while(contador<=500) {
			int tirada=aleatorios.nextInt(6)+1;
			switch (tirada) { 
				case 1:
					caras[0]++;		
					break;
				case 2:
					caras[1]++;
					break;
				case 3:
					caras[2]++;		
					break;
				case 4:
					caras[3]++;
					break;
				case 5:
					caras[4]++;		
					break;
				case 6:
					caras[5]++;
					break;

			}
			contador++;
		}

		System.out.println("Imprimos cuantas veces cayó cada cara del dado");
		for(int i=0; i<caras.length; i++) {
			System.out.println("Cara " + (i+1) + " : "+ caras[i]);
		}

		for(int elem : caras) {
			System.out.println(elem);
		}





	}

}