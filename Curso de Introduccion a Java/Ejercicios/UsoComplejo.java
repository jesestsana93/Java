import java.util.Scanner;
/**
 *Esta clase prueba la clase Complejo
 * @author Jesus Esteban Sanchez Alcantara
 */
public class UsoComplejo{
	
	public static void main(String []args){

        //Complejo c = new Complejo(4,5);
        //System.out.println(c);

        Scanner teclado = new Scanner (System.in);

        Complejo complejo1,complejo2,resultado;
        int real,imag;     
		int opcion;

        do{ 
            System.out.println("\n***************NUMEROS COMPLEJOS****************\n");
            System.out.println("Elige una de las siguientes operaciones a realizar\n");
            System.out.println("1)SUMAR");
            System.out.println("2)RESTAR");
            System.out.println("3)MULTIPLICAR");
            System.out.println("4)SALIR \n");
            System.out.print("OPCION: ");
            opcion = teclado.nextInt();        
        
        	switch(opcion){
        		case 1: //Suma
                	System.out.print("\nEscribe el primer real: ");
        			real = teclado.nextInt();
        			System.out.print("Escribe el primer imaginario: ");
        			imag = teclado.nextInt();                    
        			System.out.println(complejo1 = new Complejo (real, imag));    
        
        			System.out.print("\nEscribe el segundo real: ");
        			real = teclado.nextInt();
        			System.out.print("Escribe el segundo imaginario: ");
        			imag = teclado.nextInt();                    
        			System.out.println(complejo2 = new Complejo (real, imag)); 

        			resultado = complejo1.sumaComplejos(complejo1, complejo2);
			        if (resultado.getImaginario() < 0)
			            System.out.println("La suma de los numeros complejos es: " + resultado.getReal() + "-" + -resultado.getImaginario() + "i");
        			else
            			System.out.println("La suma de los numeros complejos es: " + resultado.getReal() + "+" + resultado.getImaginario() + "i");
            	break;

            	case 2://Resta
            		System.out.print("\nEscribe el primer real: ");
        			real = teclado.nextInt();
        			System.out.print("Escribe el primer imaginario: ");
        			imag = teclado.nextInt();                    
        			System.out.println(complejo1 = new Complejo (real, imag));    
        
        			System.out.print("\nEscribe el segundo real: ");
        			real = teclado.nextInt();
        			System.out.print("Escribe el segundo imaginario: ");
        			imag = teclado.nextInt();                    
        			System.out.println(complejo2 = new Complejo (real, imag)); 

        			resultado = complejo1.restaComplejos(complejo1, complejo2);
			        if (resultado.getImaginario() < 0)
			            System.out.println("La resta de los numeros complejos es: " + resultado.getReal() + "-" + -resultado.getImaginario() + "i");
        			else
            			System.out.println("La resta de los numeros complejos es: " + resultado.getReal() + "+" + resultado.getImaginario() + "i");
            	break;

            	case 3: //Multiplicacion
            	    System.out.print("\nEscribe el primer real: ");
        			real = teclado.nextInt();
        			System.out.print("Escribe el primer imaginario: ");
        			imag = teclado.nextInt();                    
        			System.out.println(complejo1 = new Complejo (real, imag));    
        
        			System.out.print("\nEscribe el segundo real: ");
        			real = teclado.nextInt();
        			System.out.print("Escribe el segundo imaginario: ");
        			imag = teclado.nextInt();                    
        			System.out.println(complejo2 = new Complejo (real, imag)); 

        			resultado = complejo1.multiplicaComplejos(complejo1, complejo2);
			        if (resultado.getImaginario() < 0)
			            System.out.println("La multiplicacion de los numeros complejos es: " + resultado.getReal() + "-" + -resultado.getImaginario() + "i");
        			else
            			System.out.println("La multiplicacion de los numeros complejos es: " + resultado.getReal() + "+" + resultado.getImaginario() + "i");
            	break;
  
  				case 4:
                    System.out.println("Hasta pronto!");
                break;
                
                default: 
                	System.out.println("Opcion incorrecta. Debes elegir alguna de las 4 opciones del menu.");
                    break;
        	}

        }while(opcion!=4);
    }

}