
public class OperacionesMatrices {
	
	public boolean escalonada(int[][] m) {
		boolean respuesta=true;
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				if(i==j) {
					if(!(m[i][j]==1)) {
						respuesta=false;
					}
				}
			}
		}	
		return respuesta;
	} 	

	public int[][] sumaMatrices(int[][] m1, int[][] m2) {
		int[][] suma;
		int renglones=0;
		int columnas=0;
		if(m1.length==m2.length) {
			for(int i=0; i<m1.length; i++) {
				columnas=0;
				for(int j=0; j<m1[i].length; j++) {
					columnas++;
				}
				renglones++;
			}
		}
		/*System.out.println(columnas);
		System.out.println(renglones);*/


		suma = new int[renglones][columnas];
		for(int i=0; i<m1.length; i++) {
			for(int j=0; j<m1[i].length; j++) {
				suma[i][j]=m1[i][j]+m2[i][j];
			}
		}
		return suma;
	}	
	

	/*public int [][] multiescalar (int[][] m1) {  //(int [][] m1, int escalar) {
		int[][] matescal;
		int escalar=56;
		int renglones=0;
		int columnas=0;
		matescal = new int[renglones][columnas];
		for (int i=0; i<m1.length; i++) {
			for (int j=0; j<m1[i].length; j++) {
				matescal[i][j]=escalar*(m1[i][j]);
			}
		}
		return matescal;
	}*/

	public int[][] multiescalar (int[][] m, int e) {
		int[][] resultado= new int[m.length][m[0].length];
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				resultado[i][j]=m[i][j]*e;
			}
		}
		return resultado;
	}

}
