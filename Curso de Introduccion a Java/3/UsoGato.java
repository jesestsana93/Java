public class UsoGato{

  public static void main(String [] args){
    Gato g = new Gato("bolita", "macho", "gris",48);
    Gato g2 = new Gato("miel","hembra" ,"amarillo",26);
    Gato g3= new Gato("Perlita", "hembra", "blanco",3);
    System.out.println(g);
    System.out.println(g2);
    
    /*
    g.comer();
    g.dormir();
    g.comer();
    g.despertar();
    g.comer();
    g.comportamiento();
    
    g3.cruzar(g2,g3);*/
    
    //System.out.println(g3.cruzar(g,g3));
    Gato nuevo_gatito=g3.cruzar(g,g3);
    System.out.println(nuevo_gatito);
    //nuevo_gatito.comportamiento();
  }
  
}