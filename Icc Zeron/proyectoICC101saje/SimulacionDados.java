import java.util.Scanner;
import java.util.Random;
/**
 * Proyecto que consiste en la escritura de un programa completo que simule
 * el lanzamiento de dos dados un numero de veces especificado por el usuario
 * y posteriormente imprima en pantalla un histograma del numero de lanza-
 * mientos para cada valor posible que pueda obtenerse con los dos dados.
 * @autor Jesus Esteban Sanchez Alcantara
 * @version 2.0 17-mayo-2012
 */

public class SimulacionDados{ //Inicia clase

    Scanner in = new Scanner(System.in);  //Lee lo que introduzca el usuario
    Random aleatorio = new Random();  //Objeto Random que selecciona aleatoriamente el valor del dado
    private int numero, lanzaAd;  // Declaracion de variables
    private int [] Arreglo;     //Declaracion del arreglo
    
    /**
     * Metodo que inicia una nueva simulacion y le pide al usuario que introduzca el numero
     * de lanzamientos a simular para posteriormente ejecutar la simulacion
     */
    public void nuevaSimulacion(){  //Inicia metodo
	System.out.println(" De cuantos lanzamientos consiste tu simulacion? ");
	numero = in.nextInt();

	Arreglo = new int[numero];
	int num1,num2; 
 
	for(int i = 0;i<Arreglo.length;i++){  //Abre for
	    num1 = 1+aleatorio.nextInt(6); //Caras del dado 1
	    num2 = 1+aleatorio.nextInt(6); //caras del dado 2 
	    Arreglo[i] = num1 + num2;
	}// Cierra for
    }  //Fin del metodo
    
    /**
     * Metodo que cuenta el numero de lanzamientos de la simulacion
     */
    public void Contar(){  //Inicia metodo
	int Frecuencia[] = new int[13];  //Creacion del arreglo frecuencia
	for(int j=0;j<Arreglo.length;j++){//  Abre for
	    for(int k=0;k<Frecuencia.length;k++){ // Abre for anidado
		if(Arreglo[j]==k)
		    Frecuencia[k]++;
	    }// Fin del for anidado
	} //Fin del for
	Imprimir(Frecuencia);
    }  //Fin del metodo

    /**
     * Metodo que imprime los resultados(el histograma en pantalla).
     */
    public void Imprimir(int[] B){  //Inicia metodo
	for(int m=2;m<B.length;m++){  // Abre for
	    System.out.print(m +": ");
	    for (int i = 0; i < B[m]; i++){ //Abre for anidado
		System.out.print("*");
	    }//Fin del for anidado
	    System.out.println();
	}//Fin del for
    } //Fin del metodo

    /**
     * Metodo que permite que el usuario agregue mas lanzamientos para la simulacion actual
     */
    public void lanzamientoAdicional(){  //Inicia metodo
	System.out.println(" Cuantos lanzamientos agregas a tu simulacion?");
	lanzaAd = in.nextInt();

	int [] mom = new int [Arreglo.length + lanzaAd];  
	for(int i = 0; i < Arreglo.length; i++) {  //Abre for
	    mom[i] = Arreglo[i];
	} //Fin del for
	
	int num3,num4;
	for(int i = Arreglo.length; i<mom.length ;i++) {  //Abre for
	    num3 = 1+aleatorio.nextInt(6);
	    num4 = 1+aleatorio.nextInt(6);
		
	    mom[i] = num3 + num4;
	}//Fin del for
	
	Arreglo = new int[mom.length];
	
	for(int i = 0; i<mom.length; i++)
	    Arreglo[i] = mom[i];
	    System.out.println("Tienes que iniciar una simulacion iniciada para agregar lanzamientos adicionales");
    } //Fin del metodo

    /**
     * Metodo que cuenta los elementos dentro del arreglo. 
     * @return int -Arreglo con el numero de elementos dentro de el.
     */
    public int Conteo(){  //Inicia metodo
	return Arreglo.length;
    }  //Fin del metodo

}  //Cierra Clase
