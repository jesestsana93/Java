public class UsoPersona{

  public static void main(String [] args){
    Persona p = new Persona("Carlos", "Rios", 22);
    Persona otraP = new Persona();
    System.out.println(p);
    otraP.setNombre("Juan");
    otraP.setApellidoPaterno("Lopez");
    otraP.setEdad(55);
    System.out.println(otraP);
    p.setNombre("Anastasio");
    System.out.println(p);
    System.out.println("La edad de p es");
    System.out.println(p.getEdad());
    }
    
}
