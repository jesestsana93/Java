public class Hola{

  public static void main(String []args){
   //variables
    int x=5;
    int y=1;
    String despedida="Adios";
    int suma=0;
    suma=x+y;
  
    //System.out.println("Hola mundo");
    /*System.out.println("Bienvenidos al curso de Java");
    
    System.out.println("El valor de x es igual a " + x);
    System.out.println(despedida);*/
    
    /**
     * Comentario de javadoc	
     */
    
    System.out.println("La suma de x con y es " + suma);
    
    //Instrucciones de control
    if(suma>10){
      System.out.println("La suma es mayor a 10");
    }
    if(suma != 0){
      System.out.println("la suma es diferente de cero");
    }
    
    int calificacion=12;
      
    
    if(calificacion>=0 && calificacion<=10){
      if(calificacion == 10){
	System.out.println("Excelente");
      }else if(calificacion == 9){
	System.out.println("Muy bien");
      }else if(calificacion == 8 || calificacion == 7){
	System.out.println("Aceptable");
      }else if(calificacion == 6){
	System.out.println("Pasaste");
      }else{
	System.out.println("Reprobado");
      }
    }else{
      System.out.println("La calificacion es incorrecta, revisa tus datos");
    }
    
    String nombre="Hugo";
    if(nombre.equals("Paco")){//compara el valor de una cadena
      System.out.println("¿Te llamas Paco?");
    }else{
      System.out.println("¿Quien eres?");
    }
    
  }

}	