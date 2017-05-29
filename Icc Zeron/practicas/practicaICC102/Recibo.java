/**
 * Programa que tiene como objetivo: conocer los distintos tipos de datos primitivos,
 * elegir el tipo de dato adecuado para cada situación y resolver problemas utilizando
 * operaciones aritméticas sencillas
 * @author Jesus Esteban Sanchez Alcantara
 */

public class Recibo{//Inicia clase
    public static void main(String []args){//Inicia metodo main

	//Declaracion de variables
	int IVA = 16;
    int numLibros = 26;
	double precioUnitario = 35.67;

	double precioTotal = numLibros * precioUnitario;
    double totalConIva = (precioTotal*IVA) + precioTotal; 

	//Impresion de resultados en la pantalla
        System.out.println("Gracias por venir a Libreria Gandhi");
        System.out.println("Numero de libros : " + numLibros);
        System.out.println("Precio unitario : $ " + precioUnitario);
        System.out.println("El precio total de compras es\t"+ precioTotal);
        System.out.println("Porcentaje del IVA : " + IVA + " % ");
        System.out.println("Precio total con IVA incluido $ " + totalConIva);

        System.out.println("-------\'------\"--------\\------------");
        System.out.println("-------\t------\n------------");

        //Declaracion de variables
        byte x = 5;
        boolean mayorEdad = true;
        double num = 34567.236789;
        char and = '&';
        long no = 14506783914322l;
        int y = 100;

        //Impresion de resultados en la pantalla
        System.out.println("1-.El número de lados de una figura geométrica " + x + " lados");
        System.out.println("2-.¿Eres mayor de edad? " + mayorEdad);
        System.out.println("3-.El número " + num );
        System.out.println("4-.El símbolo " + and );
        System.out.println("5-.El número " + no );
        System.out.println("6-.El área de un cuadrado cuya longitud de lado es a lo mucho " + y  + " unidades");

    } //Fin del metodo main
}//Fin de la clase
