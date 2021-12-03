package Modelo;

public class Objeto extends Producto{
    private String tipo;
    private String compania;
    
    public Objeto(String tipo, String compania, String nombre, int ID, double precio, int cantidad){
        super(nombre, ID, precio, cantidad);
        this.tipo= tipo;
        this.compania = compania;
    }
    
    //Metodos

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nTipo=" + getTipo() +
                "\nCompañia=" + getCompania() ;
    }
    
}
