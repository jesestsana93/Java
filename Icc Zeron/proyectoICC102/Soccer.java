import java.util.Random;
/**
 * Subclase o clase hija de Equipos que esta especializada en futbol soccer.
 * @author Jesus Esteban Sanchez Alcantara
 */
public class Soccer extends Equipos{ //Inicia clase  
  
    protected int puntosGol;
    protected int anota;
    protected Random rn;    
    
    /**
     * Constructor por omision que asignara los atributos
     * de soccer igual a 0.
     */
    public Soccer(){
	super();
	puntosGol = 0;
    } //Fin del constructor
        
    /**
     * Metodo de asignacion donde se creara de forma pseudoaleatoria
     * los goles.
     */ 
    public void ponPuntosGol(){
	rn = new Random();
	puntosGol = rn.nextInt(11);
    } //Fin del metodo
    
    /**
     * Metodo que regresara el numero de goles de cada equipo
     * multiplicados por 1 dadas las reglas del deporte.
     * @return int puntosGol : numero de goles del equipo.
     */    
    public int daPuntosGol(){
	return puntosGol;
    }//Fin del metodo

    /**
     *Metodo que regresa el marcador de la simulacion en una cadena
     *@return Representacion en cadena del Marcador
     */
    public String daMarcador(){
	int ganados= daGanados();
	int empatados= daEmpatados();
	int perdidos= daPerdidos();
	int goles= daPuntosGol();
	return " Marcador : "+ganados+ " ganados "+ empatados+ " empatados"+ perdidos+" perdidos" + goles +" goles";
    }   //Fin del metodo
 
}//Fin Clase
