public class UsoOperacionesMatriz {
	
	public static void main(String[] args) {

		OperacionesMatrices op = new OperacionesMatrices();

		int[][] prueba = {{1,0,0},{0,8,0},{5,0,1}};

		int[][] matriz1 = {{1,2,3},{1,1,1},{4,5,6}};
		int[][] matriz2 = {{5,0,0},{2,3,5},{0,0,0}};

		System.out.println("Suma de matrices");

		int[][] s = op.sumaMatrices(matriz1,matriz2);
		for(int[] arr: s ) {
			for(int num: arr) {
				System.out.print(num + " ");
			}
			System.out.println();
		}

		System.out.println("Multiplicacion por escalar");
		int[][] me = op.multiescalar(prueba, 2);
		for(int[] arr: me ) {
			for(int num: arr) {
				System.out.print(num + " ");
			}
			System.out.println();
		}


		

		/*System.out.println ("Multiplicacion de un escalar a una matriz");
		int [][] me =op.multiescalar(matriz1);
		for(int[] arr: me ) {
			for(int num: arr) {
				System.out.print(num + " ");
			}
			System.out.println();
		}*/
		
		/*boolean r = op.escalonada(prueba);
		System.out.println(r);*/
		/*int[][] pruebaIndices;
		System.out.println(pruebaIndices[6][7]); */




	}

}