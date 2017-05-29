/**
 * @author gatita tiquita 
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
 
public class Dulces {

    ArrayList<Integer> dulces = new ArrayList<Integer>();
    ArrayList<Integer> cantidades = new ArrayList<Integer>();
    
    public void leeArchivo(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            int elemento = Integer.parseInt(cadena);
            construyeLista(elemento);
        }
        b.close();
        ordenaValores();
    }

    public void construyeLista(int valor) {
        int pos=0;
        int cantidad=0;
        if(!dulces.contains(valor)) {
            dulces.add(valor);
            pos=dulces.indexOf(valor);
            cantidades.add(pos, 1);
        } else {
            pos=dulces.indexOf(valor);
            cantidad=0;
            cantidad=cantidades.get(pos);
            cantidad++;
            cantidades.remove(pos);
            cantidades.add(pos, cantidad);
        }
    }

    public void ordenaValores() {
        dulces.remove(0);
        cantidades.remove(0);
        Object[] copia_cantidades = cantidades.toArray();
        Arrays.sort(copia_cantidades);
        Object[] copia_dulces = dulces.toArray();
        Arrays.sort(copia_dulces);
        int mayor = (int)copia_cantidades[copia_cantidades.length-1];
        imprimeGrafica(mayor, copia_dulces);
    }

    public void imprimeGrafica(int m, Object[] dul) {
        int mayor = m;
        while(mayor>=1) {
            if(mayor%10==mayor) {
                System.out.print("0"+mayor + "|");
            } else {
                System.out.print(mayor + "|");
            }
            for(int i=0; i<dul.length; i++) {
                //Buscamos en la lista el indice del dulce y luego su cantidad
                int pos_dulcecito = dulces.indexOf(dul[i]);
                int cantidad_dulcecitos = cantidades.get(pos_dulcecito);
                if(cantidad_dulcecitos>=mayor) {
                    System.out.print("  *");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
            mayor--;
        }
        //Imprimimos la parte de abajo de la tabla
        System.out.print("   ");
        for(int j=0; j<dul.length; j++) {
            System.out.print(" __");
        } 
        System.out.println();
        System.out.print("    ");
        for(int j=0; j<dul.length; j++) {
            if((int)dul[j]%10==(int)dul[j]) {
                System.out.print("0"+dul[j]+" ");
            } else {
                System.out.print(dul[j]+" ");
            }
        }
        System.out.println();
    }
}