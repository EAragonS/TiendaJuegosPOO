
package Modelo;

import Aplicacion.IniciaAplicacion;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TablaModeloInventario {
    
     public void eliminarItem(int indice){
        IniciaAplicacion.listaInventario.remove(indice);
    }
     
     public void incializaTabla(JTable tabla ){
        Vector<String> titulos = new Vector<String>();
        Vector<   Vector<Object>   > datos =new Vector<  Vector<Object>  >();
        
        //String tipo, String compania, String nombre, int ID, int precio, int cantidad
        
        titulos.add("ID");
        titulos.add("Nombre");
        titulos.add("Tipo");
        titulos.add("Compañia");
        titulos.add("Precio");
        titulos.add("Cantidad");
        
        for(int i=0; i<IniciaAplicacion.listaInventario.size(); i++){
            Vector<Object> filas = new Vector<Object>();
            
                filas.add( IniciaAplicacion.listaInventario.get(i).getID() );
                filas.add( IniciaAplicacion.listaInventario.get(i).getNombre() );
                filas.add( IniciaAplicacion.listaInventario.get(i).getTipo());  
                filas.add( IniciaAplicacion.listaInventario.get(i).getCompania());  
                filas.add( IniciaAplicacion.listaInventario.get(i).getPrecio());  
                filas.add( IniciaAplicacion.listaInventario.get(i).getCantidad());  
                datos.add(filas);
            }
        
            DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
            tabla.setModel(modelo);
        }     
    }
    

