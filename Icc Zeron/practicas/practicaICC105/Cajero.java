import java.util.Scanner;
/**
 * Programa que apoyara a un cajero bancario a realizar sus operaciones.
 * Esta clase Cajero posee un menu de usuario que va ofreciendo las distintas 
 * operaciones que se pueden realizar en cada Cuenta y se le la opcion al usuario de 
 * realizar o no la operacion.
 * @autor Jesus Esteban Sanchez Alcantara
 * @version 1.0 21-marzo-2012
 */
public class Cajero{//Inicia clase
    public static void main(String[]args){ //Inicia metodo main

	Scanner in = new Scanner(System.in);  //lee la cantidad de dinero con la que iniciara la cuenta
	Scanner stdin = new Scanner(System.in); //lee el nombre del usuario

	// Menu que ira ofreciendo las opciones al usuario

	System.out.println("***Bienvenido al cajero, por favor elige la opcion que quieres llevar a cabo***");
	System.out.println("1.-Crear una Cuenta");
        System.out.println("2.-Salir");
	int opcion = in.nextInt(); 

	//Condicional que valora la opcion
	if(opcion==1){

	    System.out.println("Ingrese su nombre: ");
	    String nombre = stdin.nextLine();

	    System.out.println("Ingrese la cantidad de dinero para iniciar su cuenta");
	    double monto = in.nextLong();

	    int numCuenta = 123456789;

	    //Creacion de dicha cuenta

	    Cuenta cta = new Cuenta(nombre,monto,numCuenta);
	    System.out.println("Se ha creado su cuenta exitosamente");

	    //Menu que imprime las opciones para la creacion de la cuenta

	    System.out.println("Elige una opcion:");
	    System.out.println("1.-Retirar dinero de la cuenta");
	    System.out.println("2.-Depositar dinero en la cuenta"); 
	    System.out.println("3.-Mostrar el saldo de la cuenta");
	    System.out.println("4.-Conocer el propietario de la cuenta");                              
	    System.out.println("5.-Conocer su numero de cuenta");
	    System.out.println("6.-Conocer todos los datos de la cuenta");
	    System.out.println("7.-Salir");
	    int op=in.nextInt();

	    //Uso del switch para separar en casos de acuerdo a la opcion que escogio el usuario
	    switch (op){
	    case 1:  //Retirar dinero de la cuenta
		System.out.print("Indique la cantidad que desea retirar: $ ");
		double retiro = in.nextDouble();

		if(retiro>monto){
		    System.out.println("No se puede retirar tal cantidad");
		}else{
		    cta.retirarDinero(retiro);
		}
		break;
 
	    case 2: //Depositar dinero en la cuenta
		System.out.print("Indique la cantidad que desea depositar: $ ");
		double deposito = in.nextDouble();

		cta.depositarDinero(deposito);
		break;

	    case 3: //Mostrar el saldo de la cuenta
		System.out.println("El saldo de la cuenta es de $ " + cta.obtenerSaldo());
		break;

	    case 4: //Conocer el propietario de la cuenta
		System.out.println("El propietario de la cuenta es: "+ cta.propietarioCuenta().toUpperCase());
		break;

	    case 5: //Conocer su numero de cuenta
		System.out.println("Su numero de cuenta es: "+ cta.obtenerNumCuenta());
		break;

	    case 6: //Conocer todos los datos de la cuenta
		System.out.println("Los datos de la cuenta son: " + cta.toString());
		break;

	    case 7: //Salir
		System.out.println("Que tenga un buen dia, esperamos su regreso");
		break;
	    default:
		System.out.println("Opcion invalida");
	    }
	}else{
	    if(opcion==2){
	    System.out.println("Gracias por usar el cajero, regrese pronto.");
	    }else{
		System.out.println("Opcion invalida");	    
	    }
	}
    } // fin del metodo main
} //fin de la clase
