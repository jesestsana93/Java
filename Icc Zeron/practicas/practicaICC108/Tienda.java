import java.util.Scanner;
/**
 * Programa que maneja la informacion de clientes de una tienda.
 * Cada cliente esta conformado por:nombre completo,RFC,calle
 * codigo Postal,email y monto total de compras.
 * @autor Jesus Esteban Sanchez Alcantara
 * @version 1.0 24-mayo-2012
 */
public class Tienda{ //Inicia clase
    public static void main(String []args){  //Inicia metodo main
	Scanner io = new Scanner(System.in);
	Scanner in = new Scanner(System.in);
	    
	//Atributos
	String nombre,rfc,calle,email;
	int codp,opc,numc, aux=0;
	double monto;

	DatosCliente[]Cli; 

    /**
     * Metodo estatico que calcula el promedio global de los clientes
     * @param Cli - Arreglo de Clientes
     */
    public static double calcularpromedio(DatosCliente[]Cli){
	double pro=0;
	    for(int i=0;i<Cli.length;i++){
		pro+=Cli[i].obtenermontoTotal();
	    }
	    return pro/Cli.length;
    } //Fin del metodo

	//Se le da la bienvenida al usuario y se le da a escoger una opcion

	System.out.println("***Tienda UNAM BIENVENIDO***");
		
	System.out.println("\nCon cuantos clientes va a trabajar? : ");
	numc = in.nextInt();

	if(numc==0 || numc<0){
	    System.out.println("Ingresa una cantidad mayor a cero de clientes");
	}else{
	    Cli=new DatosCliente[numc];
c
	    do{ //Ciclo do-while
		   
		System.out.println("\n¿Que es lo que desea hacer? \n\t1.-Alta de clientes. \n\t2.-Actualizar el total de compras de cierto cliente.");
		System.out.println("\n3.-Actualizar la direccion de cierto cliente. \n\t4.-Calcular el promedio de compras de todos los clientes.");
		System.out.println("\n\t5.-Imprimir los datos de los clientes cuyas compras estan por arriba del promedio global. \n\t6.-Salir.");
		opc = in.nextInt();

		try{ //Algunas instrucciones
		    switch(opc){
		    case 1: //Informacion del cliente
			int c = 1;
			for(int i=0;i<Cli.length;i++){
			    System.out.println("Cliente " + c);
			    System.out.println("\n\tEscriba el nombre del cliente");
			    nombre=io.nextLine();

			    System.out.println("\tEscriba el RFC del cliente, el formato es : LLLLNNNNNN, donde L = letra y N = numero");
			    rfc=io.nextLine();

			    System.out.println("\tEscriba la direccion del cliente");
			    calle=io.nextLine();

			    System.out.println("\tEscriba el codigo postal del cliente");
			    codp=in.nextInt();

			    System.out.println("\tEscriba el email del cliente");
			    email=io.nextLine();

			    System.out.println("\tEscriba el monto total de compras del cliente");
			    monto=in.nextDouble();

			    Cli[i]=new DatosCliente(nombre,rfc,calle,codp,email,monto);
			    c++;
			    aux++;				    
			}
			break;

		    case 2: //Actualizar total de compras de un cierto cliente
			if(aux==0){
			    System.out.println("No hay ningun cliente registrado, por lo que no se puede realizar una busqueda.");
			}else{
			    System.out.println("\nEscriba el nombre del cliente al que se le actualizara su total de compras");
			    nombre=io.nextLine();

			    for(int i=0;i<Cli.length;i++){
				if(nombre.toLowerCase().equals(Cli[i].obtenerNombre().toLowerCase())){
				    System.out.println("\tEscriba el monto total de compras");
				    monto=in.nextDouble();

				    Cli[i].asignarMonto(monto);
				}else{
				    System.out.println("No existe un cliente con dicho nombre introducido");
				}
			    }
			}
			
			break;
		    
		    case 3: //Actualizar direccion de un cierto cliente
				if(aux==0){
				    System.out.println("No hay ningun cliente registrado, por lo que no se puede realizar una busqueda.");
				}else{
				    System.out.println("\nEscriba el nombre del cliente al que se le actualizara su direccion");
				    nombre=io.nextLine();
				    for(int i=0;i<Cli.length;i++){
					if(nombre.toLowerCase().equals(Cli[i].obtenerNombre().toLowerCase())){
					    System.out.println("\tEscriba la direccion");
					    calle=in.nextLine();
					    Cli[i].asignarCalle(calle);
					}else{
					    System.out.println("No existe un cliente con dicho nombre introducido");
					}
				    }
				}
				break;

		    case 4: //Calcular el promedio de compras de todos los clientes.
			if(aux==0){
			    System.out.println("No hay ningun cliente registrado, por lo que no se puede obtener el promedio");
			}else{
			    double pro=0,p=0;
			    for(int i=0;i<Cli.length;i++){
				pro+=Cli[i].obtenermontoTotal();
			    }
			    p=pro/Cli.length;
			    System.out.println("\nEl promedio global en compras es de: "+ promedio(Cli));
			}
			break;

		    case 5: //Imprimir los datos de los clientes cuyas compras estan por arriba del promedio global
			if(aux==0){
			    System.out.println("No hay ningun cliente registrado, por lo que no se puede imprimir alguna informacion");
			}else{
			    for(int i=0;i<Cli.length;i++){
				if(Cli[i].obtenermontoTotal()>=promedio(Cli)){
				    Cli[i].toString();
				}else{
				    System.out.println("No existe un cliente con dicho total en compras mayor al promedio global");
				}
			    }
			}
			break;

		    case 6: //salir
			System.out.println("Vuelva pronto");
			break;
		    default:
			System.out.println("\tOpcion invalida,intentelo de nuevo");
		    }

		    //Atrapado de excepciones
	    
		}catch(EmptyNameException ene){ //Excepcion del nombre
		    System.out.println(ene);

		}catch(MalformedRFCException mfre){ //Excepcion del RFC
		    System.out.println(mfre);

		}catch(EmptyStreetException ese){ //Excepcion de la calle
		    System.out.println(ese);

		}catch(MalformedPostalCodeException mfpce){ //Excepcion del codigo postal
		    System.out.println(mfpce);

		}catch(MalformedEmailException mfee){ //Excepcion del email
		    System.out.println(mfee);

		}catch(SellNumberException sne){ //Excepcion del total de compras
		    System.out.println(sne);
		}
	    }while(opc!=6); // fin del ciclo do-while
	}
		
		System.out.println("\nFin del programa \n\tVuelva pronto");
    } // Fin del metodo main 


} //fin de la clase
