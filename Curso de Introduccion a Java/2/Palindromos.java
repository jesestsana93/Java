public class Palindromos{

    public boolean sonPalindromos(String cadena1, String cadena2){
      boolean cumplen = false;
      String palabra = " ";
      
      for(int i=cadena1.length()-1; i>=0; i--){
	     char car = cadena1.charAt(i);
	     String cad = Character.toString(car);
	     palabra+=cad; //es lo mismo que poner palabra = palabra + cad;
      }
      if(palabra.equals(cadena2)){
	     cumplen=true;
      }
      return cumplen;
    }


}