
public class Matrices {
	
	public static void main(String[] args) {

		//Declaración de una matriz
		int[][] matriz = new int[3][4];
		int[][] matriz2 = {{1,2},{3,4},{6},{7,8,9}};


		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}

		for(int i=0; i<matriz2.length; i++) {
			for(int j=0; j<matriz2[i].length; j++) {
				System.out.print(matriz2[i][j]);
			}
			System.out.println();
		}

		//Instrucción de corto circuito para imprimir elementos en una matriz
		for(int[] elem : matriz) {
			for(int val : elem) {
				System.out.print(val);
			}
			System.out.println();
		}















	}

}

