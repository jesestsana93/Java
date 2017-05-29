import java.util.Scanner;
/**
 * Transforma el nombre de una persona
 * de un formato a otro
 * @author Carlos Zeron Martinez
 * @version Febrero 2012
 */
public class ManipuladorNombres{ //Inicio de la clase
    public static void main(String[] args){ //Inicio del metodo main
        Scanner stdin=new Scanner(System.in);

        String nombreCompleto, nombre, apellidos;
        System.out.println("Proporciona el nombre completo de una persona");
        System.out.println("en el formato: nombre,apellidoPaterno,apellidoMaterno");
        nombreCompleto=stdin.nextLine();

        // elimina blancos al final de la linea
        nombreCompleto=nombreCompleto.trim();
         // busca la coma
        int posicionComa=nombreCompleto.indexOf(",");

        // el nombre de la persona esta de las posiciones 0 a la posicionComa-1
        nombre=nombreCompleto.substring(0,posicionComa);

        // ahora vamos a considerar solo la parte que sigue
        // de la coma hasta el final de nombreCompleto.
        // Las posiciones validas de caracteres en la cadena nombreCompleto son de la 0 a
        // la longitud menos uno: nombreCompleto.length()-1
        nombreCompleto=nombreCompleto.substring(posicionComa+1,nombreCompleto.length());

        // busca la siguiente coma
        apellidos=nombreCompleto;
        String nombreNuevo=apellidos+","+nombre;
        System.out.println("El nombre transformado con el formato apellidoPaterno,apellidoMaterno,nombre es \n"+nombreNuevo);

    } //Fin del metodo main

} //Fin de la clase
