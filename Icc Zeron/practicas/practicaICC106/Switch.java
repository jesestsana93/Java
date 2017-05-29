/**
 * Programa que tiene como objetivo: 
 * Conocer y trabajar con la estructura condicional switch.
 * Conocer y trabajar con estructuras iterativas. 
 * @autor Jesus Esteban Sanchez Alcantara
 * @version 1.0 09-abril-2012
 */

public class Switch{ //Inicio de la clase
  
    /**
     * Método que toma como entrada una palabra y obtiene como salida.
     * cada carácter de la palabra de entrada en un renglon diferente.
     */
    public String palabra(){

	System.out.print("Introduce una palabra : " );
	String caracter = sc.nextLine();

        for (int x=0;x<caracter.length();x++)
	      System.out.println("Caracter " + caracter + ": " + caracter.charAt(x));

    }//fin del metodo 
 
    /**
     * Metodo que recibe como entrada un numero binario(cadena con ceros y unos).
     * Se debe verificar que la entrada efectivamente corresponda a un numero binario.
     * Si no lo es,se debe enviar un mensaje de error. En caso contrario, el metodo debe
     * contar el numero de ceros y el numero de unos. 
     */
    public int numeroBinario(){

      System.out.println("Introduce el numero binario : " );
      int numbinario = sc.nextInt(); 
      if(numbinario<=1&&numbinario>=0){
         for(int i=0;i<numbinario;i++){

             System.out.println("El numero contiene : " +  + " 1s y " +  + " 0s" );
        }else{
             System.out.println("El numero que ingresaste no es binario, vuelve a intenarlo");
      }
    }//Fin del metodo numeroBinario
 
    /**
     * Metodo que recibe como entrada un numero binario.Verifica que la entrada
     * efectivamente sea un numero binario. El método debe de convertir la entrada
     * a un entero en base 10.
     */
    public int BinarioaDecimal(){

	ConvertirDecimal miObjeto = new ConvertirDecimal();
	int numero;

	System.out.println("Introduce el numero binario : " );
	int numero=sc.nextInt();

	if(numero<=1 && numero>=0){
	    miObjeto.Decimal(numero);
	    System.out.println("El numero en decimal es : " + numero );    
	}else{
	    System.out.println("No es un numero binario, vuelve a intentarlo");
	}
     } //fin del metodo 


} //Fin de la clase

