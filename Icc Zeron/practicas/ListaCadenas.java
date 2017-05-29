/**
 * Programa que tiene como objetivo: 
 * @autor Jesus Esteban Sanchez Alcantara
 */
public class ListaCadenas{

    	private Nodo cabeza;  //La cabeza de la lista ligada
	private Nodo siguiente;

	/* Constructor por omision */
    	public ListaCadenas(){
		cabeza = null;          //Se podria omitir
    	}

	/**
	 * Podemos omitir el constructor y el valor inicial de los atributos
         * que sean referencias es null.
	 * Enteros y reales a veces se asigna 0 y 0.0 respectivamente.
	 * Booleanos se asigna a falso.
	 * Char se asigna a cero.
	 */

	//Metodo que imprime todas las cadenas de la lista

	public void imprimeElementos(){
		Nodo corredor = cabeza;
	    	while(corredor != null){ //si corredor es diferente de null llama al metodo
			System.out.println(corredor.daElemento()); //daElemento y lo imprime
			corredor = corredor.daSiguiente();
	    	}  //Fin del ciclo
	} //Fin del metodo

	/**
	 * Metodo que pone el siguiente nodo
	 * @param sig - nodo siguiente
	 */
        public void ponSiguiente(Nodo sig){
        	siguiente = sig;
        }//fin del metodo

	/**
	 * Metodo que busca la cadena que le pasan y devuelve un valor booleano indicando 
	 * si esa cadena esta o no en la lista.
	 * @param cad- la cadena a buscar
	 * @return boolean true si cad esta en la lista ligada y false en otro caso
	 */
	public boolean busca(String cad){
		Nodo corredor = cabeza;
	    	while(corredor != null){
			if(corredor.daElemento().equals(cad))
		    		return true;
			corredor = corredor.daSiguiente();
	    	} //Fin del ciclo
	    	return false;
	}  //Fin del metodo

        /**
	 * Metodo que elimina el nodo de la lista que tenga como contenido la cadena que le pasan y devuelve
	 * un valor booleano que indica si se pudo eliminar o no.
	 * @param cad- la cadena a eliminar.
	 * @return boolean-true si se pudo eliminar a cad y false en cualquier otro caso
	 */
	public boolean elimina(String cad){
		if(cabeza == null)
			return false;
	    	else if(cabeza.daElemento().equals(cad)){
			cabeza = cabeza.daSiguiente();
			return true;
	    	}else{
			Nodo previo;         //El anterior al que quiero borrar
			Nodo actual;         //el que quiero borrar  
			previo = cabeza;  //igualo el anterior al que quiero borrar como el que quiero borrar
			actual = cabeza.daSiguiente();
			while(actual != null && cad.compareTo(actual.daElemento())>0){
		    		previo = actual;
		    		actual = actual.daSiguiente();
			}//cierra while
			if(actual == null)
				return false;
			else if(cad.equals(actual.daElemento())){
				previo = ponSiguiente(actual.daSiguiente());
				return true;
			}else{
				return false;
			}	
		}
	} //Fin del metodo

	/**
	 * Inserta la cadena cad en la lista respetando el orden alfabetico
	 * @param cad-la cadena a insertar
	 */
	public void inserta(String cad){
		Nodo nuevo= new Nodo(cad);//Construyo un nodo que recibe como parametro la cadena
 	    	if(cabeza == null)
			cabeza = nuevo;      //cad queda en primer lugar
	   	 else if (cabeza.daElemento().compareTo(cad)>=0){
			nuevo.ponSiguiente(cabeza);
			cabeza = nuevo;
	    	}else{
			Nodo previo, actual;
			previo = cabeza;             //previo es el primero
			actual = cabeza.daSiguiente();    //Actual es el segundo
			while(actual != null && actual.daElemento().compareTo(cad)>0){
		    		previo = actual;
				actual = actual.daSiguiente();
	    		}//cierra while
	   		nuevo.ponSiguiente(actual);
	    		previo.ponSiguiente(nuevo);
          	}
	}//fin del metodo
	
	/**
	 * "Convierte" la lista ligada a un arreglo y lo devuelve 
	 * @return String[] el arreglo con los elementos de la lista
	 */
	public String [] daArreglo(){
		int cuantos = 0;
		Nodo actual = cabeza;
		String [] arreglo;
	    	//Contamos cuantas cadenas hay en la lista
		while(actual != null){
			cuantos ++;
			actual = actual.daSiguiente();
		}//cierra while
		    
	    	// Ahora llenamos el arreglo
		arreglo = new String[cuantos];
		actual = cabeza;
		cuantos = 0;
		while(actual !=null){
			arreglo[cuantos]= actual.daElemento();
			cuantos ++;     //Siguiente posicion del arreglo
			actual = actual.daSiguiente();
		}//cierra while
		return arreglo;
	} //Fin del metodo daArreglo
	     
} //Fin de la clase ListaCadenas
