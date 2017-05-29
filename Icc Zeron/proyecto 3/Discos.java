/**
 * Clase para actualizar la informacion de los discos que posee el usuario.
 * @see Coleccion
 * @author Jesus Esteban Sanchez Alcantara y Samuel Infante Barrios
 * @version 1.0 8-junio-2012
 */
  public class Discos extends Coleccion{//Inicia clase

      //Atributos
      private String interprete;
      private int numPistas;

      /**
       * Constructor que recibe dos parametros
       * @param inter-interprete del disco
       * @param noPis-numero de pistas del disco
       */
      public Discos(String tit, String gen ,String inter, int noPis){
	  super(tit,gen);
	  interprete=inter;
	  numPistas=noPis;
      }//Fin del constructor

      /**
       * Metodo para obtener el titulo del disco
       * @return String-- titulo del disco
       */
      public String obtenerTitulo(){
	  return titulo;	    
      }//Fin del metodo
 	    
      /**
       * Metodo para asignar el titulo del disco
       * @param tit- titulo del disco
       */      
      public void asignarTitulo(String tit){
	  titulo=tit;;
      } //Fin del metodo

      /**
       * Metodo para obtener el genero del disco
       * @return String-- genero del disco
       */
      public String obtenerGenero(){
	  return genero;	    
      }//Fin del metodo
 	    
      /**
       * Metodo para asignar el genero del disco
       * @param gen- genero del disco
       */      
      public void asignarGenero(String gen){
	  genero=gen;;
      } //Fin del metodo

      /**
       * Metodo para obtener el interprete del disco
       * @return String-- interprete del disco
       */
      public String obtenerInterprete(){
	  return interprete;	    
      }//Fin del metodo
 	    
      /**
       * Metodo para asignar el interprete del disco
       * @param inter- interprete el disco
       */      
      public void asignarInterprete(String inter){
	  interprete = inter;
      } //Fin del metodo

      /**
       * Metodo para obtener el numero de pistas del disco
       * @return int-- numero de pistas
       */
      public int obtenerNumPistas(){
	  return numPistas;	    
      }//Fin del metodo
 	          
      /**
       * Metodo para asignar el numero de pistas  del disco
       * @param noPis-- numero de pistas
       */
      public void asignarNumPistas(int noPis){
	  numPistas = noPis;
      } //Fin del metodo
   
    

        public String toString(){
	  return super.toString() + "\t" +genero + "\t" +interprete + "\t" +numPistas ;
      }//Fin del metodo toString

   } //Fin de la clase
