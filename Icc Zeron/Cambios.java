public class Cambios{

    public static void modifica(int[]x){
	for(int i=0;i<x.length;i++)
	    x[i]*=4;
    }

    public static void modifica(int x){
	    x*=4;
    }

    public static int [] tablaMultiplicar(int n){
	int[]tabla=new int[10];
	for(int i=0;i<tabla.length;i++)
	    tabla[i]=(i+1)*n; //Si n=5 entonces (0+1)*5,(1+1)*5...
	return tabla;
    }
	
    public static void main(String[]args){
	int[]a={0,1,2,3,4,5,6};
	System.out.println();
	modifica(a);  //a={0,4,8,12,16,20,24};
	for(int i=0;i<a.length;i++)
	    System.out.println(a[i]);
	modifica(a[5]);

	System.out.println();
	System.out.println(tablaMultiplicar(5));
	System.out.println("\n");
    }//fin del metodo main

}//fin de la clase