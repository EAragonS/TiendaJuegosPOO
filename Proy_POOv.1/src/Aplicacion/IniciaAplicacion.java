/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import Modelo.Empleado;
import Modelo.Objeto;
import Vista.LogIn;
import java.util.ArrayList;


public class IniciaAplicacion {

    public static ArrayList<Empleado> listaEmpleado = new ArrayList<Empleado>();
    public static ArrayList<Objeto> listaInventario = new ArrayList<Objeto>();
    
    public static void main(String[] args) {
       new LogIn().setVisible(true);
       
       
       
    }
    
}
