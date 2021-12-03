
package Modelo;

public class Producto {
    
    private String nombre;
    private int ID;
    private double precio;
    private int cantidad;
    
    
    public Producto(String nombre, int ID, double precio, int cantidad){
        this.nombre = nombre;
        this.ID = ID;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    //Metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto:" + 
                "\nNombre=" + getNombre() +
                "\nID=" + getID() +
                "\nPrecio=" + getPrecio() +
                "\nCantidad=" + getCantidad() ;
    }
    
}
