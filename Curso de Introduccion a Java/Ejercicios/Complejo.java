/**
 * Clase en la cual se modelan numeros complejos
 * @author Jesus Esteban Sanchez Alcantara
 */
public class Complejo{

    int real = 0;
    int imaginario = 0;
    
    public Complejo(){
    }
    
    public Complejo (int real, int imaginario){
        this.real = real;
        this.imaginario = imaginario;
    }

    public void getComplejo(int r, int i){
        real = r;
        imaginario = i;
    }

    public int getReal(){
        return real;
    }

    public int getImaginario(){
        return imaginario;
    }

    public void setReal(int numeroReal){
        real = numeroReal;
    }

    public void setImaginario(int numeroImaginario){
        imaginario = numeroImaginario;
    }


    public Complejo sumaComplejos(Complejo c1,Complejo c2){
        Complejo resultado = new Complejo();         
        resultado.setReal(this.real + c2.getReal());         
        resultado.setImaginario(this.imaginario + c2.getImaginario());      
        return resultado;
    }


    public Complejo restaComplejos(Complejo c1, Complejo c2){
        Complejo resultado = new Complejo();         
        resultado.setReal(this.real - c2.getReal());         
        resultado.setImaginario(this.imaginario - c2.getImaginario());         
        return resultado;
    }


    public Complejo multiplicaComplejos(Complejo c1, Complejo c2){
        Complejo resultado = new Complejo();         
        resultado.getComplejo(((this.real * c2.getReal())- (this.imaginario * c2.getImaginario())),
            ((this.real * c2.getImaginario() ) +  (this.imaginario * c2.getReal())));
        return resultado;
    }

    public String toString() {
        return "(" + real +  "+" + imaginario + "i)";
    }
    
}