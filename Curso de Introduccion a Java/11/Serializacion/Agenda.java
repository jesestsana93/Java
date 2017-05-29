
import java.io.*;
import java.util.Scanner;

public class Agenda {

	private String nombreArchivo="";
	Scanner entrada = new Scanner(System.in);
	private Contacto[] contactos;
	
	//Constructor
	public Agenda() {

	}

	//Constructor
	public Agenda(String nombreArchivo) throws RuntimeException{
		this.nombreArchivo=nombreArchivo;
		File archivoContactos= new File(nombreArchivo);
		if(archivoContactos.exists()) {
			if(!archivoContactos.canRead()) {
				throw new RuntimeException("No es posible leer el archivo "+nombreArchivo);
			}
			if(!archivoContactos.canWrite()){
				throw new RuntimeException("No es posible escribir en el archivo "+nombreArchivo);
			}
			contactos=leerContactos();
		}else{
			contactos=new Contacto[100];
		}
	}
	
	/**
	 * Metodo menu
	 * despliega las posibles acciones a realizar con la agenda
	 */
	public void menu() {
		
		Agenda miAgenda=new Agenda("Contactos");

		System.out.println("Bienvenido a tu agenda");
		System.out.println("Selecciona una opción");
		int opcion=0;
		do {
			System.out.println("1. Agregar un contacto");
			System.out.println("2. Consultar toda la agenda");
			System.out.println("3. Borra contacto");
			System.out.println("4. Salir");
			opcion=entrada.nextInt();
			switch(opcion) {
				case 1:
					miAgenda.agregarContacto();
					miAgenda.grabar();
					break;
				case 2:
					miAgenda.muestraTodo();
					break;
				case 3:
					miAgenda.borraContacto();
					break;
				case 4:
					System.out.println("Hasta Pronto");
					break;
				default:
					System.out.println("Selecciona una opción válida");
					break;
			}
		}while(opcion!=4);
		miAgenda.grabar();
	}

	/**
	 * Metodo agregarContacto
	 * agrega contactos a la agenda
	 */
	public void agregarContacto() {
		int contador=0;
		for(int i=0; i<contactos.length; i++) {
			if(contactos[i]==null) {
				System.out.println("Proporciona la siguiente información");
				System.out.println("Nombre");
				String n=entrada.next();
				System.out.println("Apellido");
				String a=entrada.next();
				Contacto c = new Contacto(n,a);
				contactos[i]=c;
				break;
			} else {
				contador++;
			}	
		}
		if(contador==contactos.length) {
			System.out.println("La agenda está llena");
		}
	}
	
	/**
	 * Metodo muestraTodo
	 * despliega la informacion de todos los contactos almacenados en la agenda
	 */
	public void muestraTodo() {
		int contador=0;
		for(int i=0; i<contactos.length;i++) {
			if(contactos[i]!=null) {
				System.out.println(contactos[i]);
			} else {
				contador++;
			}
		}
		if(contador==contactos.length) {
			System.out.println("La agenda está vacía");
		}

	}
	
	/**
	 * Metodo borraContacto
	 * elimina de la agenda a un contacto
	 * dados el nombre y apellido
	 */
	public void borraContacto() {
		int contador=0;
		System.out.println("Escribe el nombre del contacto que quieres borrar");
		String n = entrada.next();
		System.out.println("Escribe el apellido del contacto que quieres eliminar");
		String ape= entrada.next();
		for(int i=0; i<contactos.length; i++){
			if(contactos[i]!=null) {
				if(contactos[i].nombre.equals(n)&&contactos[i].apellido.equals(ape)) {
					contactos[i]=null;
				} else {
					contador++;
				}	
			} else {
				contador++;
			}
		}
		if(contador==contactos.length) {
			System.out.println("El contacto no existe");
		} else {
			System.out.println("Contacto borrado");
		}
	}

	
	/**	
	 * Metodo grabar
	 * envia a un archivo la informacion contenida en la agenda
	 */
	public void grabar(){
		try{
			ObjectOutputStream agenda= new ObjectOutputStream(new FileOutputStream(nombreArchivo));
			agenda.writeObject(contactos);
			agenda.close();
		}
		catch(NotSerializableException e){
			System.out.println("Error en la grabacion: "+e+"Objeto no serializable");
		}
		catch(IOException e){
			System.out.println("Error en la grabacion: "+e);
		}

	}

	/**
	 * Metodo leerContactos
	 * abre el archivo si este existe y carga la informacion
 	 * a la agenda
	 */
	public Contacto[] leerContactos(){
		try{
			ObjectInputStream lector=new ObjectInputStream(new FileInputStream(nombreArchivo));
			Contacto [] contactos=(Contacto []) lector.readObject();
			lector.close();
			this.contactos=contactos;
		}
		catch(IOException e){
			System.out.println("Lectura fallida: "+e);
		}
		catch(ClassNotFoundException e){
			System.out.println("Lectura fallida: "+e);
		}
		return contactos;
	}

}
