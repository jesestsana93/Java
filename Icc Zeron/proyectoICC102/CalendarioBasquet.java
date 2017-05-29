/**
 * Clase que creara el calendario del torneo
 * para los equipos de basquetbol.
 * @author Jesus Esteban Sanchez Alcantara 
 */

public class CalendarioBasquet{ //Inicia clase

    //Atributos
    int rondas;
    int partidos;
    int idEquipo1, idEquipo2;
    String nombreEquipo1, nombreEquipo2;
    int canastasEquipo1, canastasEquipo2;
    int tiroTresEquipo1, tiroTresEquipo2;
    int tiroLibreEquipo1,tiroLibreEquipo2;
    int ganador1,ganador2;
    int perdidos1,perdidos2;
    int empatados1,empatados2;
    

    /**
     * Constructor que contendra dos equipos de futbol.
     * @param id1, id2 - identificador del equipo 1 y del equipo 2.
     * @param nomE1,nomE2 - nombre del equipo 1 y del equipo 2.
     * @param canasta1, canasta2 - canastas del equipo 1 y del equipo 2.
     * @param tres1, tres2 - tiros de tres puntos del equipo 1 y del equipo2.
     * @param libre1, libre2 - tiros libres del equipo 1 y del equipo 2.
     * @param gana1, gana2 - numero de veces ganadas por el equipo 1 y el equipo2.
     * @param pierde1,pierde2 - numero de veces perdidas por el equipo 1 y el equipo 2.
     * @param emp1, emp2 - numero de veces empatadas por el equipo 1 y el equipo 2.
     */
    public CalendarioBasquet(int id1, int id2, String nomE1, String nomE2, int canasta1, int canasta2,
			     int tres1, int tres2, int libre1, int libre2,int gana1, int gana2, 
			     int pierde1, int pierde2, int emp1, int emp2){
	idEquipo1 = id1;
	idEquipo2 = id2;
	nombreEquipo1 = nomE1;
	nombreEquipo2 = nomE2;
	canastasEquipo1 = canasta1;
	canastasEquipo2 = canasta2;
	tiroTresEquipo1 = tres1;
	tiroTresEquipo2 = tres2;
	tiroLibreEquipo1 = libre1;
	tiroLibreEquipo2 = libre2;
	ganador1 = gana1;
	ganador2 = gana2;
	perdidos1 = pierde1;
	perdidos2 = pierde2;
	empatados1 =  emp1;
	empatados2 = emp2;
    }//Fin del metodo

    /**
     * Metodo que regresara el nombre del equipo 1.
     * @return String - nombre del equipo 1. 
     */
    public String daNombreEquipo1(){
	return nombreEquipo1;
    }//Fin del metodo

    /**
     * Metodo que regresara el nombre del equipo 2.
     * @return String - nombre del equipo 2. 
     */
    public String daNombreEquipo2(){
	return nombreEquipo2;
    }//Fin del metodo

    /**
     * Metodo que regresara el numero de canastas del equipo 1.
     * @return int - numero de canastas del equipo 1.
     */
    public int daCanastaEquipo1(){
	return canastasEquipo1;
    }//Fin del metodo

    /**
     * Metodo que regresara el numero de canastas del equipo 2.
     * @return int - numero de goles del equipo 2.
     */
    public int daCanastaEquipo2(){
	return canastasEquipo2;
    }//Fin del metodo

    /**
     * Metodo que regresara el numero de tiros de tres
     * puntos del equipo 1.
     * @return int - numero de tiros de tres puntos
     * del equipo 1.
     */
    public int daTiroTresEquipo1(){
	return tiroTresEquipo1;
    }//Fin del metodo

    /**
     * Metodo que regresara el numero de tiros de tres
     * puntos del equipo 2.
     * @return int - numero de tiros de tres puntos
     * del equipo 2.
     */
    public int daTiroTresEquipo2(){
	return tiroTresEquipo2;
    }//Fin del metodo
    
    /**
     * Metodo que regresara el numero de tiros libres
     * del equipo 1.
     * @return int - numero de tiros libre del equipo 1.
     */

    public int daTiroLibreEquipo1(){
	return tiroLibreEquipo1;
    }//Fin del metodo

    /**
     * Metodo que regresara el numero de tiros libres
     * del equipo 2.
     * @return int - numero de tiros libre del equipo 2.
     */

    public int daTiroLibreEquipo2(){
	return tiroLibreEquipo2;
    }//Fin del metodo

    /**
     * Metodo que asignara el numero de rondas, que recibe el
     * numero de equipos, y los asigna si el numero es par o impar.
     * @param numEquipos - numero de equipos.
     */
    public void ponRondas(int numEquipos){
	if((numEquipos % 2) == 0){
	    rondas = numEquipos - 1;
	}else{
	    rondas = numEquipos ;
	}
    }//Fin del metodo

    /**
     * Metodo que regresara el numero de rondas.
     * @return int - rondas totales.
     */
    public int daRondas(){
	return rondas;
    }//Fin del metodo

    /**
     * Metodo que asignara el numero de partidos
     * dado el numero de equipos, sea par o impar.
     * @param numEquipos - numero de equipos.
     */
    public void ponPartidos(int numEquipos){
	if((numEquipos % 2) == 0){
	    partidos = (numEquipos+1)/2;
	}else{
	    partidos = (numEquipos)/2;
	}
    }//Fin del metodo
    
    /**
     * Metodo que regresara el numero de rondas.
     * @return int - partidos totales.
     */
    public int daPartidos(){
	return partidos;
    }//Fin del metodo

    /**
     * Metodo que asignara el identificador del equipo 1.
     * @param numEquipos - numero de equipos dados por el usuario.
     * @param rondas - numero de rondas.
     * @param partidos - numero de partidos.
     */
    public void ponIdEquipo1(int numEquipos, int rondas, int partidos){
	if((numEquipos % 2) == 0)
	    idEquipo1 = (rondas + partidos) % (numEquipos-1);
	else
	    idEquipo1 = (rondas + partidos) % numEquipos;
    }//Fin del metodo

    /**
     * Metodo que regresara el identificador del equipo 1.
     * @return - identificador del equipo 1.
     */

    public int daIdEquipo1(){
	return idEquipo1;
    }//Fin del metodo

    /**
     * Metodo que asignara el identificador del equipo 2.
     * @param numEquipos - numero de equipos dados por el usuario.
     * @param rondas - numero de rondas.
     * @param partidos - numero de partidos.
     */
    public void ponIdEquipo2(int numEquipos, int rondas, int partidos){
	if((numEquipos % 2) == 0)
	    idEquipo2 = (rondas + ((numEquipos-1) - partidos)) % (numEquipos-1);
	else
	    idEquipo2 = (rondas + (numEquipos - partidos)) % numEquipos;
    }//Fin del metodo

    /**
     * Metodo que regresara el identificador del equipo 2.
     * @return - identificador del equipo 2.
     */
    public int daIdEquipo2(){
	return idEquipo2;
    }//Fin del metodo

    /**
     * Metodo que regresara el total de puntos ganados, dadas 
     * las reglas del torneo, por el equipo 1.
     * @param anotaciones1 - total de anotaciones del equipo 1.
     * @param anotaciones2 - total de anotaciones del equipo 2.
     * @return ganador - puntos ganados.
     */
    public int daGanador1(int anotaciones1, int anotaciones2){
	int anotaciones = anotaciones1 - anotaciones2;
	if(anotaciones > 0 )
	    return 3;
	else
	return 0;
	
    }//Fin del metodo
    
    /**
     * Metodo que regresara el total de puntos ganados, dadas 
     * las reglas del torneo, por el equipo 2.
     * @param anotaciones1 - total de anotaciones del equipo 1.
     * @param anotaciones2 - total de anotaciones del equipo 2.
     * @return ganador - puntos ganados.
     */
    public int daGanador2(int anotaciones1, int anotaciones2){
	int anotaciones = anotaciones1 - anotaciones2;
	if(anotaciones > 0 )
	    return 3;
	else
	return 0;
	
    }//Fin del metodo

    /**
     * Metodo que regresara el total de puntos perdidos, dadas 
     * las reglas del torneo, por el equipo 1.
     * @param anotaciones1 - total de anotaciones del equipo 1.
     * @param anotaciones2 - total de anotaciones del equipo 2.
     * @return ganador - puntos perdidos.
     */
    public int daPerdedor1(int anotaciones1, int anotaciones2){
	int anotaciones= anotaciones1 -  anotaciones2;
	if(anotaciones < 0)
	    return 1;
	else
	return 0;
    }//Fin del metodo
    
    /**
     * Metodo que regresara el total de puntos perdidos, dadas 
     * las reglas del torneo, por el equipo 2.
     * @param anotaciones1 - total de anotaciones del equipo 1.
     * @param anotaciones2 - total de anotaciones del equipo 2.
     * @return ganador - puntos perdidos.
     */
    public int daPerdedor2(int anotaciones1, int anotaciones2){
	int anotaciones= anotaciones1 -  anotaciones2;
	if(anotaciones < 0)
	    return 1;
	else
	    return 0;
    }//Fin del metodo

    /**
     * Metodo que regresara el total de puntos empatados, dadas 
     * las reglas del torneo, por el equipo 1.
     * @param anotaciones1 - total de anotaciones del equipo 1.
     * @param anotaciones2 - total de anotaciones del equipo 2.
     * @return ganador - puntos empatados.
     */
    public int daEmpate1(int anotaciones1, int anotaciones2){
	int anotaciones= anotaciones1 - anotaciones2;
	if(anotaciones == 0)
	    return 1;
	else
	    return 0;
    }//Fin del metodo

    /**
     * Metodo que regresara el total de puntos empatados, dadas 
     * las reglas del torneo, por el equipo 2.
     * @param anotaciones1 - total de anotaciones del equipo 1.
     * @param anotaciones2 - total de anotaciones del equipo 2.
     * @return ganador - puntos empatados.
     */
    public int daEmpate2(int anotaciones1, int anotaciones2){
	int anotaciones= anotaciones1 - anotaciones2;
	if(anotaciones == 0)
	    return 1;
	else
	    return 0;

    } //Fin del metodo

}//fin clase CalendarioBasquet
