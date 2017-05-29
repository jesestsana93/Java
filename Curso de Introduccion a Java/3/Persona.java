public class Persona{

  //Atributos
  String nombre;
  String apellido_paterno;
  int edad;

  
  public Persona(){
  
  }
  
  public Persona(String n, String ap, int e){
    nombre=n;
    apellido_paterno=ap;
    edad=e;
  }

  public String toString(){
    return "La persona se llama " + nombre + " " + apellido_paterno + " y tiene " + edad  + " años de edad";
  }
  
  public void setNombre(String n){
    nombre=n;
  }
  
  public void setApellidoPaterno(String ap){
    apellido_paterno=ap;
  }
  
  public void setEdad(int e){
    edad=e;
  }
  
  public String getNombre(){
    return nombre;
  }
  
    public String getApellidoPAterno(){
     return apellido_paterno;
  }
  
  public int getEdad(){
    return edad;
  }

}