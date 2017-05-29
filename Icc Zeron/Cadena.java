public class Cadena{

    private String cadena;

    public Cadena(String cadena){
	this.cadena=cadena;
	if(cadena.length()<=20)
	    this.cadena=cadena;
	else
	    cadena="";
    }

    public String quitaEspacios(){
	return cadena.trim();
    }

    public char obtenerCaracter(int indice){
	return cadena.charAt(indice);
    }

    public String concatenar(String cadena2){
	if((cadena+cadena2).length()<=20){
	    return cadena + cadena2;
	}else{
	    return cadena;
	}
    }

    public static void main(String[]args){
	Cadena cad=new Cadena("ICC");
	System.out.println(cad.quitaEspacios());
	System.out.println(cad.obtenerCaracter(2));
	System.out.println(cad.concatenar("salon"));
    }//fin delmetodo main

}//fin de la clase