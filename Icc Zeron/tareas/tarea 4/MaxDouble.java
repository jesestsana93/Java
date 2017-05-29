import java.util.Scanner;
/**
 * Programa en el cual el usuario introducira por teclado tres datos de tipo
 * double y desplegara en pantalla el dato que sea el maximo de los tres.
 * @author Jesus Esteban Sanchez Alcantara
 * @version 1.0 6-febrero-2012
 */
public class MaxDouble{//Inicia clase
    public static void main(String []args){//Inicia metodo main
	Scanner sc=new Scanner(System.in); //Lee los datos introducidos por el usuario

	//Atributos
	double mayor;

	//Se piede al usuario que ingrese los datos
	System.out.println("***Bienvenido, escribe tres numeros***");

	System.out.println("Primer numero decimal: ");
	double num1 = sc.nextDouble();      //Se lee el dato del teclado

	System.out.println("Segundo numero decimal: ");
	double num2 = sc.nextDouble();      //Se lee el dato del teclado

	System.out.println("Tercer numero decimal: ");
	double num3 = sc.nextDouble();      //Se lee el dato del teclado

	System.out.println("Los numeros decimales introducidos son : " + num1 + "," + num2 + "," + num3);

	//Se determina cual de los tres numeros es el mayor
	if(num1>num2){
	    mayor=num1;
	}else{
	    mayor=num2;

	}if(mayor<num3){
	    mayor=num3;
	}else{
	    mayor=mayor;
	}

	//Se muestra en pantalla el numero mayor
 
	System.out.println("El mayor numero decimal de los introducidos es: " + mayor);
    }//Fin del metodo main
}//Fin de la clase 
