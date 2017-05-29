import java.util.Scanner;
/**
 * Clase para la manipulacion de cadenas
 * @autor Jesus Esteban Sanchez Alcantara
 * @version febrero 2012
 */

public class ManipularCadenas {//Inicia clase
 
    /*
     * Metodo main:operacion principal del programa
     */
    public static void main(String []args){
   
	      // Objeto para poder leer datos del teclado
	      Scanner sc= new Scanner(System.in).useDelimiter("\n");
    
	      System.out.println("*** ICC-1 Practica 3 ***");
   
	      //Captura e impresion de resultados
        //Actividades:

        //1. Solicitar el nombre de una empresa, calle y status (activo, suspensión, clausurado).
	      System.out.print("Ingrese el nombre de la empresa : ");
        String nombre= sc.next(); // se lee la cadena del teclado

        System.out.print("Ingrese la calle de la empresa : ");
        String calle= sc.next(); // se lee la cadena del teclado

        System.out.print("Ingrese el status de la empresa :");
        String status= sc.next(); // se lee la cadena del teclado

        //2. Imprimir en pantalla los datos que componen a la empresa.
        System.out.println("Los datos de la empresa son :" );
        System.out.println("Nombre : " + nombre);
        System.out.println("Calle : " + calle);
        System.out.println("Status : " + status);
       
       //3. Imprimir en pantalla el número de carácteres que conforman el nombre de la empresa.
        System.out.println("El numero de caracteres que conforman el nombre de la empresa es : " + nombre.length());

        //4. Convierte a mayúsculas el nombre de la empresa y muéstralo en pantalla.
        System.out.println("Nombre de la empresa en mayusculas :" + nombre.toUpperCase());

        //5. Convierte a minúsculas el status de la empresa y muéstralo en pantalla.
        System.out.println ("Status de la empresa en minusculas : " + status.toLowerCase());

      //6. Encuentra un método (usando la API de Java) que te permita reemplazar carácteres y haz lo siguiente:
      //a) Reemplazar el carácter en la tercera posición del nombre de la empresa por el carácter '9' y mostrar
      //el resultado en pantalla.

      //b) Reemplazar la primera 'e' del valor de la calle por 'X' y mostrar el resultado en pantalla.
      calle = calle.trim().replace('e','X');
      
      //c) Repetir 6a) para todas las ocurrencias de 'A' en el nombre.


      //d) Repetir 6b) para todas las ocurrencias de 'e' en el nombre de la empresa.


       char t = nombre.charAt(2);
       String nueva = sc.next();
       nombre = nueva.trim().replace('t','9');
       
       
       System.out.println("El intercambio de la tercera posicion del nombre por 9 queda como: " + nueva.replace('t','9'));
       System.out.println("Reemplazar la primera e del valor de la calle por X : " + calle.replace('e','X'));
       
      
      //7. Muestra el resultado de imprimir las iniciales de tu nombre con letras de 9 lineas de altura. Cada
      //letra grande debe estar constituida de simbolos que no sean letras

      System.out.println("Impresion de las iniciales de mi nombre");
	    System.out.println("*********  *********    *******   ********");  
	    System.out.println("*********  *********   ********  ****  ****");        
	    System.out.println("   ***     **           **       ***    ***");
	    System.out.println("   ***     *********     **      **********");  
	    System.out.println("   ***     *********      **     **********");
      System.out.println("   ***     **              **    ***    ***");
      System.out.println("** ***     **               **   ***    ***");   
      System.out.println("******     **********  ********  ***    ***");
      System.out.println("******     **********  *******   ***    ***");   
 
    } //Fin del main
}//Fin de la clase
