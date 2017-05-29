public class Argumentos{

    public static void main(String[]args){
	System.out.println("Tecleaste " + args.length + " parametros");
	if(args.length>0){
	    System.out.println("Los parametros son: ");
	    for(int i=0;i<args.length;i++){
		System.out.println(args[i]);
	    }
	}
    }//fin del metodo main

}//fin de la clase