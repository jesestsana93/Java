import java.util.Scanner;

public class Login{

  public static void main(String []args){
    Scanner entrada = new Scanner(System.in);
    String persona="Jesus";
    String otraPersona;
    System.out.println("Escribe tu nombre para ingresar");
    otraPersona=entrada.next();
    if(otraPersona.equals(persona)){
      System.out.println("Ingreso correcto, bienvenido");
    }else{
      System.out.println("Datos incorrectos");
    }

  }

}