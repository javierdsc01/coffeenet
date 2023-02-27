/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeNET.camarero.view;

import CoffeeNET.camarero.model.Camarero;
import CoffeeNET.camarero.model.IRepoCamarero;
import CoffeeNET.common.view.Utilcmd;
import java.util.List;

/**
 *
 * @author Javier
 */
public class VCamareroBorrar {
    
    private IRepoCamarero repositorio;

    public VCamareroBorrar(IRepoCamarero repositorio) {
        this.repositorio = repositorio;
    }

    /**
    * Borra un vehiculo (Delete)
    * @return Boolean
    */  
    public boolean borrar() {
        int posicionCamarero = Utilcmd.leerEnteroPositivo("¿De qué camarero quieres borrar los datos?: ");
        if (repositorio.delete(posicionCamarero)){
            System.out.println("Se ha borrado el arcade");
            return true;
        } else {
        System.out.println("No se ha borrado el arcade");
        return false;
        }
    }
}
