import java.util.StringTokenizer;
import java.io.*;
public class LectorNumeros {
    public static void main(String[] args) {
         BufferedReader lector=null;
         // String linea=null;
	 String linea;
         String nombreArchivo="numeros.txt";
         StringTokenizer divisor;
         try{
            lector=new BufferedReader(new FileReader(nombreArchivo));
            linea=lector.readLine();
            while(linea!=null){
                divisor=new StringTokenizer(linea);
                while(divisor.hasMoreTokens()){ // prueba si no hay mas elementos
                    // dentro de este objeto
                    System.out.println(divisor.nextToken());                    
                }
                linea=lector.readLine();
            }
         }
         catch(FileNotFoundException fnf){
            System.out.println("No se encontro el archivo "+nombreArchivo);
        }
        catch(IOException fnf){
            System.out.println(fnf);
        }
        finally{
            try{
                lector.close();
            }
            catch(IOException e){
                System.out.println(e);
            }
        }

    }

}
