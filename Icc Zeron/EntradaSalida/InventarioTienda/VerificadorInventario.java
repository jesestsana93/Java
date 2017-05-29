import java.io.*;
import java.util.StringTokenizer;
/**
 * Clase para leer datos sobre un inventario de tienda de un archivo
 * de texto, crea un arreglo de objetos tipo Articulo y los imprime
 */
public class VerificadorInventario{

    public static void main(String[] args) {
        final int MAX = 100;
        Articulo[] inventario = new Articulo[MAX];
        StringTokenizer divisorCadenas; // objeto para division de la cadena leida en trozos
        String archivoInventario = "inventario.txt";
        BufferedReader buf=null;
        // constructor del flujo que permite leer flujos de caracteres a partir de un flujo del mismo tipo
        // con el fin de almacenar informacion temporalmente
        String lineaLeida=null;
        String nombreArticulo;
        int unidades, cuenta = 0; // unidades del producto y el numero de lineas leidas
        float precio;
        try{
            FileReader fr=new FileReader(archivoInventario); // construccion del flujo de entrada de caracteres
            // a partir de un nombre de archivo (en el mismo directorio que el programa)
            // lanza FileNotFoundException si no encuentra el archivo
            buf=new BufferedReader(fr);
            lineaLeida=buf.readLine();
            while(lineaLeida!=null){
                divisorCadenas=new StringTokenizer(lineaLeida);
                nombreArticulo=divisorCadenas.nextToken(); // el siguiente trozo
                unidades=Integer.parseInt(divisorCadenas.nextToken()); // conversion del token a entero
                precio=Float.parseFloat(divisorCadenas.nextToken()); // conversion del token a flotante
                inventario[cuenta]=new Articulo(nombreArticulo,unidades,precio);
                cuenta++;
                lineaLeida=buf.readLine();                
            }
            System.setOut(new PrintStream("salida.txt"));
            for (int i = 0; i < cuenta; i++){
                System.out.println(inventario[i]);
            }
        }
        catch(NumberFormatException nfe){
            System.out.println("Error de formato en la linea "+lineaLeida);
        }
        catch(FileNotFoundException fnf){
            System.out.println("No se encontro el archivo "+archivoInventario);
        }
        catch(IOException fnf){
            System.out.println(fnf);
        }
        finally{
            try{
                buf.close();
            }
            catch(IOException e){
                System.out.println(e);
            }
        }
    
    }

}
