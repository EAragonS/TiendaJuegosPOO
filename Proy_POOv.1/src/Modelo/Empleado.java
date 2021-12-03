package Modelo;

/**
 *
 * @author Nailea
 */
public class Empleado {
    
    String id;
    String Nombre;
    String usuario;
    String contra;

    public Empleado(String id, String Nombre, String usuario, String contra) {
        this.id = id;
        this.Nombre = Nombre;
        this.usuario = usuario;
        this.contra = contra;
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + getId() + ", Nombre=" + getNombre() + ", usuario=" + getUsuario() + ", contra=" + getContra() + '}';
    }
}
