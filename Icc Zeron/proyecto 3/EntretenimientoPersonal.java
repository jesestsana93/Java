import java.util.Scanner;
import java.io.*;
/**
 * Clase que permite llevar el control de libros, discos y peliculas que uno posee.
 * @author Jesus Esteban Sanchez Alcantara y Samuel Infante Barrios
 * @version 1.0 8-junio-2012
 */

public class EntretenimientoPersonal{ //Inicia clase
   
    //Atributos
    static String titulo, genero;
    static Contacto [] contactos=new Contacto[10];
	static Contacto [] lista=new Contacto[10];
	static int cont=0;
    static Contacto c;


    public static void main(String []args){//Inicia metodo main

	Scanner in=new Scanner(System.in).useDelimiter("\n");
	FileWriter fw=null;
	byte op;

	//Se muestra en pantalla el menu al usuario.
	System.out.println(" ***  BIEVENIDO AL PROGRAMA ***");
	do { //Inicia ciclo do-while 

	    System.out.println("\nTeclea la opcion entre parentesis de la coleccion que deseas actualizar :");
	    System.out.println("\n\t (-a-l): Actualizar la informacion de un libro.");
	    System.out.println("\t (-a-d): Actualizar la informacion de un disco.");	       
	    System.out.println("\t (-a-p): Actualizar la informacion de una pelicula.");
	    op=in.nextByte();

	    switch(op){ //Inicia el switch

	    case 1: //Actualizar la informacion de un libro.

		System.out.println(" Que opcion deseas llevar a cabo: ");
		System.out.println(" 1.- Consultar los libros escritos por un autor especifico.");
		System.out.println(" 2.- Consultar los libros de un tema particular.");
		System.out.println(" 3.- Consultar los datos completos de un libro por un titulo dado.");
		System.out.println(" 4.- Consultar toda la coleccion.");
		System.out.println(" 5.- Añadir un libro.");
		opc=in.nextByte();

		break;

	    case 2: //Actualizar la informacion de un disco.

		System.out.println(" Que opcion deseas llevar a cabo: ");
		System.out.println(" 1.- Consultar los discos de un mismo interprete dado.");
		System.out.println(" 2.- Consultar todos los interpretes de discos de un mismo genero.");
		System.out.println(" 3.- Consultar los discos que tengan mas de 10 pistas.");
		System.out.println(" 4.- Consultar toda la coleccion.");
		System.out.println(" 5.- Agregar un disco.");
		opc=in.nextByte();

		break;

	    case 3: //Actualizar la informacion de una pelicula.

		System.out.println(" Que opcion deseas llevar a cabo: ");
		System.out.println(" 1.- Consultar los actores o actrices principales de las peliculas cuyo año de filmacion sea un año especifico o posterior.");
		System.out.println(" 2.- Consultar los actores o actrices principales que aparezcan en mas de una pelicula de la coleccion.");
		System.out.println(" 3.- Consultar las peliculas por genero.");
		System.out.println(" 4.- Consultar toda la coleccion. ");
		System.out.println(" 5.- Añadir una pelicula. ");
		opc=in.nextByte();

		break;

	    default:
		System.out.println("Opcion invalida,vuelve a intentarlo");
		break;
	    } //Fin del switch
	}while(op!=3); //Fin del metodo do-while

    }//Fin del metodo main
}//Fin de la clase
