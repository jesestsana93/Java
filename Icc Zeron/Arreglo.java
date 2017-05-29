public class Arreglo{

    public static void main(String[]args){
	/*Se asigna a todas las posciones del arreglo el valor de cero*/
        double[]arr=new double[10];
	for(int i=0;i<10;i++){
	    arr[i]=0;
	}

	/*Suma de los elementos de un arreglo*/
	double suma=0;
	double[]arr2={5.7,1.2,5,6,-3};
	for(int i=0;i<arr2.length;i++){
	    suma +=arr2[i];
	}
	/*Impresion de los elementos del arreglo en orden inverso*/
	double[]arr3={5.5,17.6,-2.3,0,8.8};
	for(int i=arr3.length-1;i>=0;i--){
	    System.out.println(arr3[i]);
	}

	/*Copia los elementos del arreglo a otro en orden correcto*/
	double[]arr4={6.5,17.4,6,3,2.8,1.7};
	double[]copia=new double[arr4.length];
	for(int i=0;i<arr4.length;i++){
	    copia[i]=arr4[i];
	}

	/*Copia los elementos del arreglo a otro en orden inverso*/
	double[]copiaInversa=new double[arr4.length];
	for(int i=0;i<arr4.length;i++){
	    copiaInversa[arr4.length-1-i]=arr4[i];
	}
	
	/*Otra alternativa
	double[]copiaInversa=new double[arr4.length];
	for(int i=arr4.length-1-i;i>=0;i--){
	    copiaInversa[arr4.length-1-i]=arr4[i];
	}*/

	/*Maximo elemento de un arreglo*/
	int[]arr5={5,8,2,3,0,-2};
	int max=arr5[0];
	for(int i=1;i<arr5.length;i++){
	    if(max<arr5[i])
		max=arr5[i];
	}
    }//fin del metodo main

}//fin del metodo main