/**
 * Representa un articulo para el inventario de una tienda
 */
public class Articulo {
    private String nombre;
    private int unidades;
    private float precioUnitario;

    public Articulo(String name,int units,float price){
        nombre=name;
        unidades=units;
        precioUnitario=price;
    }

    public String toString(){
        return nombre+ ": " + unidades + " unidades a $" + precioUnitario + " por unidad";
    }
}
