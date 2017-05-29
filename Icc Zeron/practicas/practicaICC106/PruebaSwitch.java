import java.util.Scanner;
/**
 * Programa que prueba los metodos de la clase switch, haciendo un menu
 * iterativo cuyas tres opciones,correspondientes al uso de cada metodo,
 * son controladas por un switch. Debe haber una opcion de terminacion.
 * Si el usuario pone una opcion invalida, el programa debe seguir pidiendo
 * una opcion al usuario hasta que sea valida.
 * @autor Jesus Esteban Sanchez Alcantara
 */

public class PruebaSwitch{ //Inicio de la clase
    public static void main(String []args){ //Inicio del metodo main
	Scanner sc = new Scanner(System.in);

	//Atributos
	String nom;
	byte opcion,salir=1;
        
	//Se le muestra el menu al usuario para que escoja una opcion
	System.out.println("***Bienvenido al programa***");
	System.out.print("Cual es tu nombre?: ");
	nom=in.nextLine();
	System.out.println();
	System.out.println(nom +",seleciona la opcion que deseas realizar");
	System.out.println();
	while(salir==1){
	    System.out.println(" 1-. Separar la palabra en caracter por renglon");
	    System.out.println(" 2-. Validar un numero en binario y contar los ceros y unos que tiene ");
	    System.out.println(" 3-. Validar un numero en binario y convertirlo a decimal");
	    System.out.println(" 4-. Salir");
	    opcion= sc.nextByte();

	switch(opcion){

	case 1:  //Separar palabra en caracter por renglon


	    break;
 
	case 2:  //Valida numero en binario y cuenta ceros y unos


	    break;

	case 3:  // Valida numero en binario y convierte a decimal
System.out.println ("Introducir número entero para convertir en binario");
N = Leer.nextInt();
convertir (N);

	    break;

	case 4:  // Salir

	    break;

	default:
	    System.out.println(nom + ", opcion incorrecta, vuelve a inentarlo.");
	}//Cierra switch
      
	if(salir==1){
		System.out.println();
		System.out.println();
		System.out.println("Para salir presiona 0");
		System.out.println("Para volver a correr el programa presiona 1");
		salir=in.nextByte();	
	}
	}

    } //fin del metodo main 
} //fin de la clase



boolean continua=true;
case i=='1';
.
.
.
    break;
case i=='2';
,,,
case i=='4';
continua=false;

}(continua);

 
	System.out.println(Integer.toBinaryString(num));


  


 
    

