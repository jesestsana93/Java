import java.util.Random;
/**
 * Clase hija de Equipos que estara especializada
 * en basquetbol.
 * @author Jesus Esteban Sanchez Alcantara y Samuel Infante Barrios
 * @version 1.0 16-mayo-2012
 */

public class Basquet extends Equipos{ //Inicia clase

    //Atributos 
    protected int puntosCanasta;
    protected int puntosTiroTres;
    protected int puntosTiroLibre;
    protected Random rn;
      
    /**
     * Constructor de basquet donde los atributos
     * de basquet seran igual a 0.
     */
    public Basquet(){
	super();
	puntosCanasta = 0;
	puntosTiroTres = 0;
	puntosTiroLibre = 0;
    } ///fin del constructor
    

    /**
     * Metodo de asignacion donde se creara de forma pseudoaleatoria
     * el numero de canastas.
     */
    public void ponPuntosCanasta(){
	rn = new Random();
	int canasta = rn.nextInt(31);
	puntosCanasta = canasta;
    } //Fin del metodo

    /**
     * Metodo que regresa el numero de canastas
     * multiplicado por 2 dadas las reglas del deporte.
     * @return int - numero de canastas.
     */
    public int daPuntosCanasta(){
	return puntosCanasta*2;
    } //Fin del metodo

    /**
     * Metodo de asignacion donde se creara de forma pseudoaleatoria
     * el numero de tiro de 3 puntos. 
     */   
     public void ponPuntosTiroTres(){
	rn = new Random();
	int puntosTT = rn.nextInt(21);
	puntosTiroTres = puntosTT;
    } //Fin del metodo
    
    /**
     * Metodo que regresa el numero de tiro de 3
     * puntos multiplicado por 3 dadas las reglas
     * del deporte.
     * @return int - numero de tiro de 3 puntos.
     */
    public int daPuntosTiroTres(){
	return puntosTiroTres*3;
    }//Fin del metodo
    
    /**
     * Metodo de asignacion donde se creara de forma pseudoaleatoria
     * el numero de tiros libres.
     */
    public void ponPuntosTiroLibre(){
	rn = new Random();
	int puntosTL = rn.nextInt(16);
	puntosTiroLibre = puntosTL;
    } //Fin del metodo

    /**
     * Metodo que regresa el numero de tiros libres
     * con valor de 1 cada tiro dadas las reglas del
     * deporte.
     * @return int - numero de tiros libres.
     */
    public int daPuntosTiroLibre(){
	return puntosTiroLibre;
    }//Fin del metodo

    /**
     * Metodo que da el Marcador como una cadena
     * @return Representacion en cadena del Marcador
     */
    public String Marcador(){
	int ganados=daGanados();
	int empatados= daEmpatados();
	int perdidos= daPerdidos();
	int dos= daPuntosCanasta();
	int triple=daPuntosTiroTres();
	int tiro=daPuntosTiroLibre();
	return " Marcador : "+ganados+ " ganados "+ empatados+ " empatados"+ perdidos+" perdidos" +dos+" Canastas "+triple+" Triples " +tiro+" Tiros Libres";
    } //Fin del metodo

}//fin clase Basquetbol
