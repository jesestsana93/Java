/**
 * Clase Cliente
 * @author: Cinthia Rodriguez
 */

import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion=0;
		try {
			Socket cliente = new Socket("localhost", 4500);
			/***** ESCRIBIMOS ****/
			//Mandamos saludo al servidor
			DataOutputStream mensaje = new DataOutputStream(cliente.getOutputStream());
			mensaje.writeUTF("Hola servidor");
			/*** LEEMOS ***/				
			//Aqui el cliente lee el menu de operaciones
			DataInputStream entrada = new DataInputStream(cliente.getInputStream());
			String mensaje2 = entrada.readUTF();
			System.out.println(mensaje2);
			/**** ESCRIBIMOS ****/		
			//seleccionamos la operacion deseada y decimos al servidor que opcion queremos
			opcion=teclado.nextInt();
			mensaje.writeInt(opcion);
			hazOp(opcion, cliente, mensaje);
			
		} catch(IOException ex) {
			Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
		} 
	}

	public static void hazOp(int opcion, Socket cliente, DataOutputStream mensaje) {
		Scanner teclado = new Scanner(System.in);
		int val1=0;
		int val2=0;
		try {
                    System.out.println("La opcion actual es:"+opcion);
			if(opcion==4) {
				cliente.close();
				System.out.println("Conexion cerrada");
			} else {
				//Hacemos una suma
				if(opcion==1) {
					/**** LEEMOS ***/			
					//Aqui el cliente lee en su terminal que se le solicita primer digito
					DataInputStream entradaPDS = new DataInputStream(cliente.getInputStream());
					String mensajeDeSolicitarPDS = (String)entradaPDS.readUTF();
					System.out.println(mensajeDeSolicitarPDS);

					/**** ESCRIBIMOS ****/	
					//Escribimos el primer valor de la operacion
					val1=teclado.nextInt();
					mensaje.writeInt(val1);

					/**** LEEMOS ***/			
					//Aqui el cliente lee en su terminal que se le solicita segundo digito
					DataInputStream entradaSDS = new DataInputStream(cliente.getInputStream());
					String mensajeDeSolicitarSDS = entradaSDS.readUTF();
					System.out.println(mensajeDeSolicitarSDS);
	
					/**** ESCRIBIMOS ****/	
					//Escribimos el segundo valor de la operacion
					val2=teclado.nextInt();
					mensaje.writeInt(val2);
	
					/**** LEEMOS ***/			
					//El cliente lee el resulta de su operacion
					DataInputStream entrada4 = new DataInputStream(cliente.getInputStream());
					String respSuma = (String)entrada4.readUTF();
					System.out.println(respSuma);
					
					//VOLVEMOS A CARGAR DATOS	
					/***** ESCRIBIMOS ****/
					//Mandamos saludo al servidor
					DataOutputStream mensajeNS = new DataOutputStream(cliente.getOutputStream());
					mensajeNS.writeUTF("Hola servidor");
			
					/*** LEEMOS ***/				
					//Aqui el cliente lee el menu de operaciones
					DataInputStream entradaNS = new DataInputStream(cliente.getInputStream());
					String mensaje2NS = (String)entradaNS.readUTF();
					System.out.println(mensaje2NS);
		
					/**** ESCRIBIMOS ****/		
					//seleccionamos la operacion deseada y decimos al servidor que opcion queremos
					int op=teclado.nextInt();
					mensaje.writeInt(op);

					hazOp(op, cliente, mensajeNS);
				}
				//Hacemos una resta
				if(opcion==2) {
					/**** LEEMOS ***/			
					//Aqui el cliente lee en su terminal que se le solicita primer digito
					DataInputStream entradaPDR = new DataInputStream(cliente.getInputStream());
					String mensajeDeSolicitarPDR = (String)entradaPDR.readUTF();
					System.out.println(mensajeDeSolicitarPDR);

					/**** ESCRIBIMOS ****/	
					//Escribimos el primer valor de la operacion
					val1=teclado.nextInt();
					mensaje.writeInt(val1);

					/**** LEEMOS ***/			
					//Aqui el cliente lee en su terminal que se le solicita segundo digito
					DataInputStream entrada5 = new DataInputStream(cliente.getInputStream());
					String mensajeDeSolicitarNumsR = (String)entrada5.readUTF();
					System.out.println(mensajeDeSolicitarNumsR);
	
					/**** ESCRIBIMOS ****/	
					//Escribimos el segundo valor de la operacion
					val2=teclado.nextInt();
					mensaje.writeInt(val2);
	
					/**** LEEMOS ***/			
					//El cliente lee el resulta de su operacion
					DataInputStream entrada = new DataInputStream(cliente.getInputStream());
					String respSuma = (String)entrada.readUTF();
					System.out.println(respSuma);
					
					//VOLVEMOS A CARGAR DATOS	
					/***** ESCRIBIMOS ****/
					//Mandamos saludo al servidor
					DataOutputStream mensajeNR = new DataOutputStream(cliente.getOutputStream());
					mensajeNR.writeUTF("Hola servidor");
			
					/*** LEEMOS ***/				
					//Aqui el cliente lee el menu de operaciones
					DataInputStream entradaNR = new DataInputStream(cliente.getInputStream());
					String mensaje2NR = (String)entradaNR.readUTF();
					System.out.println(mensaje2NR);
		
					/**** ESCRIBIMOS ****/		
					//seleccionamos la operacion deseada y decimos al servidor que opcion queremos
					int op2=teclado.nextInt();
					mensajeNR.writeInt(op2);
					hazOp(op2, cliente, mensajeNR);
				}
				if(opcion==3) {
					/**** LEEMOS ***/			
					//Aqui el cliente lee en su terminal que se le solicita primer digito
					DataInputStream entradaPDM = new DataInputStream(cliente.getInputStream());
					String mensajeDeSolicitarPDM = (String)entradaPDM.readUTF();
					System.out.println(mensajeDeSolicitarPDM);

					/**** ESCRIBIMOS ****/	
					//Escribimos el primer valor de la operacion
					val1=teclado.nextInt();
					mensaje.writeInt(val1);

					/**** LEEMOS ***/			
					//Aqui el cliente lee en su terminal que se le solicita segundo digito
					DataInputStream entrada6 = new DataInputStream(cliente.getInputStream());
					String mensajeDeSolicitarNums2 = (String)entrada6.readUTF();
					System.out.println(mensajeDeSolicitarNums2);
	
					/**** ESCRIBIMOS ****/	
					//Escribimos el segundo valor de la operacion
					val2=teclado.nextInt();
					mensaje.writeInt(val2);
	
					/**** LEEMOS ***/			
					//El cliente lee el resulta de su operacion
					DataInputStream entrada7 = new DataInputStream(cliente.getInputStream());
					String respSuma = (String)entrada7.readUTF();
					System.out.println(respSuma);
					
					//VOLVEMOS A CARGAR DATOS	
					/***** ESCRIBIMOS ****/
					//Mandamos saludo al servidor
					DataOutputStream mensajeNM = new DataOutputStream(cliente.getOutputStream());
					mensajeNM.writeUTF("Hola servidor");
			
					/*** LEEMOS ***/				
					//Aqui el cliente lee el menu de operaciones
					DataInputStream entradaNM = new DataInputStream(cliente.getInputStream());
					String mensaje2NM = (String)entradaNM.readUTF();
					System.out.println(mensaje2NM);
		
					/**** ESCRIBIMOS ****/		
					//seleccionamos la operacion deseada y decimos al servidor que opcion queremos
					int op3=teclado.nextInt();
					mensajeNM.writeInt(op3);
					hazOp(op3, cliente, mensajeNM);
				}
			}
				
		} catch(IOException ex) {
			Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
		} 	
	}
}

