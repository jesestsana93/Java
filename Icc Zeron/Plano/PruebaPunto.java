/**
 *  Clase para probar la clase Punto completa
 * @author Carlos Zeron Martinez
 * @version 1.2 Marzo 2012
 */
public class PruebaPunto {    

    public static void main(String [] args) {	
	  Punto inicial=new Punto(3,-1);
        Punto fin=new Punto(4,5);
        Punto otro=new Punto();// se invoca el constructor por omision
        Punto copia=new Punto(fin); // se invoca el constructor de copia
        System.out.println("Los cuatro puntos son: \n"+inicial+"\n"+fin+"\n"+otro+"\n"+copia);
        System.out.println("La distancia entre los puntos "+inicial+" y "+fin+" es: "+inicial.distancia(fin));
        System.out.print("Los primeros tres puntos ");
        boolean estanAlineados=inicial.estanAlineados(fin, otro);
        if(estanAlineados)
            System.out.print("si");
        else
            System.out.print("no");
        System.out.println(" estan alineados");
        System.out.print("Los puntos"+copia+" y "+fin+" son iguales? ");
        if(copia.equals(fin)){
            System.out.println("si");
        }
        else{
            System.out.println("no");
        }
        otro.asignarX(3.5);
        System.out.println("El otro punto tiene coordenada x="+otro.obtenerX());
        otro.asignarY(5);
        System.out.println("El otro punto tiene coordenada y="+otro.obtenerY());
        
    }
}
