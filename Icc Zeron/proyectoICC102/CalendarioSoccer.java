/**
 * Clase que se encargara de hacer el calendario de futbol soccer.
 * @author Jesus Esteban Sanchez Alcantara
 */
public class CalendarioSoccer{ //Inicia clase

    //Atributos
    int rondas, partidos;
    int idEquipo1,idEquipo2;
    String nombreEquipo1,nombreEquipo2;
    int golesEquipo1, golesEquipo2;
    int ganador1, ganador2;
    int perdidos1, perdidos2;
    int empatados1, empatados2;
    
    /**
     * Constructor que contendra dos equipos de futbol.
     * @param id1, id2 - identificador del equipo 1 y equipo 2.
     * @param nomE1, nomE2- nombre del equipo 1 y equipo 2.
     * @param gol1 , gol2 - goles del equipo 1 y 2.
     * @param gana1, gana2 - numero de veces ganadas del equipo 1 y equipo 2.
     * @param pierde1, pierde2 - numero de veces perdidas del equipo 1 y equipo 2.
     * @param emp1, emp2 - numero de veces empatadas del equipo 1 y equipo 2.
     */
    public CalendarioSoccer(int id1, int id2, String nomE1, String nomE2, int gol1, int gol2,
			    int gana1, int gana2, int pierde1, int pierde2, int emp1, int emp2){
	idEquipo1 = id1;
	idEquipo2 = id2;
	nombreEquipo1 = nomE1;
	nombreEquipo2 = nomE2;
	golesEquipo1 = gol1;
	golesEquipo2 = gol2;
	ganador1 = gana1;
	ganador2 = gana2;
	perdidos1 = pierde1;
	perdidos2 = pierde2;
	empatados1 =  emp1;
	empatados2 = emp2;
    } //Fin del constructor

    /**
     * Metodo para obtener el nombre del equipo 1.
     * @return String - nombre del equipo 1. 
     */
    public String daNombreEquipo1(){
	return nombreEquipo1;
    } //Fin del metodo

    /**
     * Metodo para obtener el nombre del equipo 2.
     * @return String - nombre del equipo 2.
     */
    public String daNombreEquipo2(){
	return nombreEquipo2;
    } //Fin del metodo

    /**
     * Metodo para obtener el numero de goles del equipo 1.
     * @return int - numero de goles del equipo 1.
     */
    public int daGolEquipo1(){
	return golesEquipo1;
    } //Fin del metodo

    /**
     * Metodo para obtener el numero de goles del equipo 2.
     * @return int - numero de goles del equipo 2.
     */
    public int daGolEquipo2(){
	return golesEquipo2;
    } //Fin del metodo
    
    /**
     * Metodo que asignara el numero de rondas que recibe cada equipo,
     * y los asigna de acuerdo a si el numero es par o impar segun el usuario.
     * @param numEquipos - Numero de equipos.
     */
    public void ponRondas(int numEquipos){
	if((numEquipos % 2) == 0){
	    rondas = numEquipos - 1;
	}else{
	    rondas = numEquipos ;
	}
    }//Fin del metodo

    /**
     * Metodo para obtener el numero de rondas.
     * @return int - Rondas totales.
     */
    public int daRondas(){
	return rondas;
    }//Fin del metodo

    /**
     * Metodo que asignara el numero de partidos de acuerdo
     * al numero de equipos ya sean par o impar.
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
     * Metodo para obtener el numero de partidos.
     * @return int - partidos totales.
     */
    public int daPartidos(){
	return partidos;
    }//Fin del metodo

    /**
     * Metodo que asignara el identificador del equipo 1.
     * @param numEquipos - numero de equipos que dara el usuario.
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
     * Metodo para obtener el identificador del equipo 1.
     * @return - identificador del equipo 1.
     */
    public int daIdEquipo1(){
	return idEquipo1;
    }//Fin del metodo

    /**
     * Metodo que asignara el identificador del equipo 2.
     * @param numEquipos - numero de equipos que dara el usuario.
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
     * Metodo para obtener el identificador del equipo 2.
     * @return int - identificador del equipo2.
     */
    public int daIdEquipo2(){
	return idEquipo2;
    }//Fin del metodo

    /**
     * Metodo para obtener el total de puntos ganados, dadas 
     * las reglas del torneo, por el equipo 1.
     * @param anotaciones1 - total de anotaciones del equipo 1.
     * @param anotaciones2 - total de anotaciones del equipo 2.
     * @return int - puntos ganados.
     */
    public int daGanador1(int anotaciones1, int anotaciones2){
	int anotaciones = anotaciones1 - anotaciones2;
	if(anotaciones > 0 )
	    return 3;
	else
	    return 0;
    }//Fin del metodo
    
    /**
     * Metodo para obtener el total de puntos ganados, dadas 
     * las reglas del torneo, por el equipo 2.
     * @param anotaciones1 - total de anotaciones del equipo 1.
     * @param anotaciones2 - total de anotaciones del equipo 2.
     * @return int - puntos ganados.
     */
    public int daGanador2(int anotaciones1, int anotaciones2){
	int anotaciones = anotaciones1 - anotaciones2;
	if(anotaciones > 0 )
	    return 3;	    
	else
	return 0;
	
    }//Fin del metodo

    /**
     * Metodo para obtener el total de puntos perdidos por el equipo 1.
     * @param anotaciones1 - total de anotaciones del equipo 1.
     * @param anotaciones2 - total de anotaciones del equipo 2.
     * @return int - puntos perdidos.
     */
    public int daPerdedor1(int anotaciones1, int anotaciones2){
	int anotaciones= anotaciones1 -  anotaciones2;
	if(anotaciones < 0)
	    return 1;
	else
	    return 0;
   }//Fin del metodo    

    /**
     * Metodo para obtener el total de puntos perdidos por el equipo 1.
     * @param anotaciones1 - total de anotaciones del equipo 1.
     * @param anotaciones2 - total de anotaciones del equipo 2.
     * @return int - puntos perdidos.
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
     * @return int - puntos empatados.
     */
    public int daEmpate1(int anotaciones1, int anotaciones2){
	int anotaciones= anotaciones1 - anotaciones2;
	if(anotaciones == 0){
	    return 1;
	}else
	return 0;
    }//Fin del metodo

    /**
     * Metodo para obtener el total de puntos empatados, dadas 
     * las reglas del torneo, por el equipo 1.
     * @param anotaciones1 - total de anotaciones del equipo 1.
     * @param anotaciones2 - total de anotaciones del equipo 2.
     * @return int - puntos empatados.
     */
    public int daEmpate2(int anotaciones1, int anotaciones2){
	int anotaciones= anotaciones1 - anotaciones2;
	if(anotaciones == 0){
	    return 1;
	}else
	    return 0;
    } //Fin del metodo
    
}//fin clase CalendarioSoccer
