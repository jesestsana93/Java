/**
 *Clase Liga que contiene un arreglo de Equipos con un tamaño dado por el usuario y se usa dependiendo el deporte a Simular
 *@author Jesus Esteban Sanchez Alcantara y
 */
public class Liga{

    protected Equipos[] arregloEquipos;
    protected char deporte;

    /**
     * Metodo constructor que creara el arreglo a partir del numero de equipos
     * que brinde el usuario.
     *@param dep - caracter que introduce en consola el usuario y verifica si es de Soccer o Basquetbol la Simulacion
     * @param numEquipos - numero de equipos que tecleara el usuario.
     */
    public Liga(char dep,int numEquipos){
	deporte = dep;
	arregloEquipos = new Equipos[numEquipos];
	for(int i = 0; i < arregloEquipos.length; i++){
	    System.out.println("Ingrese el equipo " + (i+1) + ": ");
	    switch(dep){
	    case 's':
	    arregloEquipos[i]= new Soccer();
		break;
	    case 'b':
	    arregloEquipos[i]= new Basquet();
		break;   	
	    }
	}//fin for
	
    }//constructor
    

    /**
     * Metodo que regresa el equipo, dado el identificador del equipo.
     * @param id - identificador del equipo.
     * @return Equipos - equipo segun el identificador.
     */
    public Equipos daEquipos(int id){
	return arregloEquipos[id];
    }//constructor
} 
