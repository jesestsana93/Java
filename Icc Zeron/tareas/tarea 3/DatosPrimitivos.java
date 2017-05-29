/**
 * Programacion con datos primitivos tarea 3 ICC1
 * @author Jesus Esteban Sanchez Alcantara
 * @version 29-Febrero-2012
 */
public class DatosPrimitivos{ //Inicia clase
    public static void main(String[]args){ //Inicia metodo main
      
	//resultadoEntero=0, ent1=18, ent2=55, ent3=9, ent4=25
        int resultadoEntero=0, ent1=18, ent2=55, ent3=9, ent4=25;
  
	boolean bol1, bol2;   //bol1,bol2 (booleanos)

        //resultadoReal, real1=22.0, real2=9.3, real3=5.35
	double resultadoReal, real1=22.0, real2=9.3, real3=5.35;

	final int NUM=25;     //constante entera NUM=25

        System.out.println("Los numeros reales dados son: " + real1 + " , " + real2 + " , " + real3 + " ");
        System.out.println("Los numeros enteros son : " + ent1 + " ; " + ent2 + " , " + ent3 + " , " + ent4 + " "); 

	resultadoEntero = ent4/ent1-ent2;   //resultadoEntero = ent4/ent1-ent2
        System.out.println("El resultado entero es : " + resultadoEntero);

        resultadoReal= ent4/ent1-ent3;     //resultadoReal= ent4/ent1-ent3
        System.out.println("El resultado real es : " + resultadoReal);

        real1 =ent2*ent4+real2;           //real1 =ent2*ent4+real2
        System.out.println("El real1 es : " + real1);

        ent4=(int)(ent2/ent1)+(int)(real1-real2);      //ent4=(int)(ent2/ent1)+(int)(real1-real2)
        System.out.println("El ent4 es : " + ent4);

        ent3 = (int)(real2*real3)-NUM;           //ent3 = (int)(real2*real3)-NUM
        System.out.println("El ent3 es : " + ent3);

        bol1 =(ent3<=ent4)||(ent2==resultadoEntero);    //bol1 =(ent3<=ent4)||(ent2==resultadoEntero)
        System.out.println("El bol1 es : " +bol1);

        bol2 = (real3 > real1) && (real2 != real1);     //bol2 = (real3 > real1) && (real2 != real1) 
        System.out.println("El bol2 es : " + bol2);
 
    } // Fin del metodo main

}  //Fin de la clase
