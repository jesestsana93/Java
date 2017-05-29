/**
 * Practica 7: ultima parte
 * Implementar algunos de los metodos que tienen las listas
 * pero usando arreglos, haciendo una clase que tenga un arreglo 
 * adentro pero queriendo usarlo como lista.
 * @author Jesus Esteban Sanchez Alcantara
 */
public class Listas {

    private Nodo primero;
    private Nodo ultimo;
    private int tamano;


    public Listas() {
        this.primero = null;
        this.ultimo = null;
        this.tamano = 0;
    }//fin del constructor

   //Metodo utilizado para denotar que la lista se encuentra vacia.
    public boolean siVacio() {
        return (this.primero == null);
    }

   //Metodo para agregar al final de la lista.
    public Listas addLast(int dato) {

        if(siVacio()) {
            Nodo nuevo = new Nodo(dato);
            primero = nuevo;
            ultimo = nuevo;
            nuevo.nodoDer = nuevo;
        }else {
            Nodo nuevo = new Nodo(dato);
            nuevo.nodoDer = null;
            ultimo.nodoDer = nuevo;
            ultimo = nuevo;
        }
        this.tamano++;
        return this;

    }//fin del metodo

   //Metodo para borrar al final de la lista.
    public Nodo deleteLast() {

        Nodo eliminar = null;

        if(siVacio()) {
            //JOptionPane.showMessageDialog(null, "La lista se encuentra vacia");
            return null;
        }
        if(primero == ultimo) {
            primero = null;
            ultimo = null;
        }else {
            Nodo actual = primero;
            while(actual.nodoDer != ultimo) {
                actual = actual.nodoDer;
            }
            eliminar = actual.nodoDer;
            actual.nodoDer = null;

            ultimo = actual;
        }
        this.tamano--;
        return eliminar;

    }//fin del metodo

   //Metodo que imprime el tamaño de la lista.
    public void tamano() {
	// JOptionPane.showMessageDialog(null, "El tamaño es:\n " + this.tamano);
    }

   //Metodo que imprime la lista y los valores ingresados.
    public void imprimir() {

        if(tamano != 0) {
            Nodo temp = primero;
            String str = "";
            for(int i = 0; i < this.tamano; i++) {
                str = str + temp.dato + "\n";
                temp = temp.nodoDer;
            }
            //JOptionPane.showMessageDialog(null, str);
        }//cierra if

    }//fin del metodo


}//fin de la clase
