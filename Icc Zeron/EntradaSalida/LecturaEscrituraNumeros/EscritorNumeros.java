import java.util.Random;
import java.io.*;
public class EscritorNumeros {
    public static void main(String[] args) {
        final int MAX=5;
        int valor;
        String nombreArchivo="numeros.txt";
        Random generador=new Random();
        PrintWriter escritor=null; // Representa un flujo que proporciona formato para
        // salida de caracteres
        try{
            FileWriter flujoArchivo=new FileWriter(nombreArchivo);
            // representa un archivo de texto de salida
            // Lanza IOException si el archivo no existe y no pudo ser creado o no pudo ser abierto
            // por alguna otra razon
            escritor=new PrintWriter(flujoArchivo); // no lanza excepcion
            for(int i=1;i<=MAX;i++){
                for(int j=1;j<=MAX;j++){
                    valor=generador.nextInt(100);
                    escritor.print(valor + " ");
                }
                escritor.println();
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
        finally{
            escritor.close();
            System.out.println("Se ha escrito el archivo "+nombreArchivo);
        }
    }

}
