import java.util.Scanner;

public class Contestadora {

	Scanner entrada = new Scanner(System.in);
	Scanner entrada2 = new Scanner(System.in);
	String mensaje;
	String nombrePersona;
	Mensaje[] contestadora = new Mensaje[10];
	
	
	public void menu() {
		int opcion=0;
		
		do {
			System.out.println("1. Escuchar todos los mensajes");
			System.out.println("2. Buscar mensajes por persona");
			System.out.println("3. Borrar un mensaje");
			System.out.println("4. Borrar todos los mensajes");
			System.out.println("5. Grabar mensaje");
			System.out.println("6. Salir");
			opcion=entrada.nextInt();
			leerOpcion(opcion);
		}while(opcion!=6);
	}

	public void leerOpcion(int opcion) {
		switch(opcion) {
				case 1: 
					escucharTodo();
					break;
				case 2:
					System.out.println("Escribe el nombre del remitente");
					nombrePersona=entrada.next();
					buscar(nombrePersona);
					break;
				case 3:
					System.out.println("Escribe el nombre del remitente");
					nombrePersona=entrada.next();
					borrarMensaje(nombrePersona);
					break;
				case 4:
					borrarTodo();
					break;
				case 5:
					System.out.println("Escribe el nombre del remitente");
					nombrePersona=entrada.next();
					System.out.println("Escribe el mensaje");
					mensaje=entrada2.nextLine();
					Mensaje m = new Mensaje(nombrePersona, mensaje);
					grabar(m);
					break;
				case 6:
					System.exit(1);
					break;
				default:
					System.out.println("Opción incorrecta");
					break;
			}
	}




	public void escucharTodo() {
		int contador=0;
		for(int i=0; i<contestadora.length; i++) {
			if(contestadora[i]!= null) {
				System.out.println(contestadora[i]);
			} else {
				contador++;
			}
		}
		if(contador==contestadora.length) {
			System.out.println("No hay mensajes que escuchar, contestadora vacía");
		}

	}


	public void buscar(String nombre) {
		int contador=0;
		for(int i=0; i<contestadora.length; i++) {
			if(contestadora[i]!= null) {
				String n=contestadora[i].nombreRemitente;
				if(n.equals(nombre)) {
					System.out.println(contestadora[i]);

				} else {
					contador++;
				}
			} else {
				contador++;
			}
		}
		if(contador==contestadora.length) {
			System.out.println("No hay mensaje para tu búsqueda");
		}
	}

	public void borrarMensaje(String nombre) {
		int contador=0;
		for(int i=0; i<contestadora.length; i++) {
			if(contestadora[i]!= null) {
				String n=contestadora[i].nombreRemitente;
				if(n.equals(nombre)) {
					contestadora[i]=null;
				} else {
					contador++;
				}
			} else {
				contador++;
			}
		}
		if(contador==contestadora.length) {
			System.out.println("No hay mensaje para tu búsqueda");
		}

	}

	public void borrarTodo() {
		for(int i=0; i<contestadora.length; i++) {
			contestadora[i]=null;
		}
		System.out.println("Mensajes borrados");
	}


	public void grabar(Mensaje nuevo) {

		int contador=0;
		for(int i=0; i<contestadora.length; i++) {
			if(contestadora[i]==null) {
				contestadora[i]=nuevo;
				break;
			} else {
				contador++;
			}
		}
		if(contador==contestadora.length) {
			System.out.println("la contestadora está llena, no se pudo grabar el mensaje");
		}
	}

}

