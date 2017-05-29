import java.util.ArrayList;
import java.util.Scanner;

public class Listas {
	
	ArrayList<Integer> l = new ArrayList<Integer>();
	Scanner entrada = new Scanner(System.in);
	
	public void menu() {
		int opcion=0;
		do {
			System.out.println("1. Agregar elemento a la lista");
			System.out.println("2. Eliminar elemento de la lista");
			System.out.println("3. Salir");
			opcion=entrada.nextInt();
			switch(opcion) {
				case 1:
					agregaElemento();
					break;
				case 2:
					borraElemento();
					break;
				case 3:
					System.out.println("Gracias por participar");
					break;
			}
		}while(opcion!=3);
	}

	public void agregaElemento() {
		System.out.println("Dame el valor que quieres agregar a la lista");
		int elem=entrada.nextInt();
		l.add(elem);
		imprimeLista();
		
	}


	public void borraElemento() {
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		System.out.println("Dame el valor que quieres borrar de la lista");
		int elem=entrada.nextInt();
		for(int i=0; i<l.size(); i++) {
			if(!(elem==l.get(i))) {
				l2.add(l.get(i));
			} 
		}
		l=l2;
		imprimeLista();
		
	}


	public void imprimeLista() {
		System.out.print("{");
		for(int i=0; i<l.size(); i++) {
			System.out.print(l.get(i) + " ");
		}
		System.out.println("}");
	}

}