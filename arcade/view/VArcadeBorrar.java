/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeNET.arcade.view;

import CoffeeNET.arcade.model.IRepoArcade;
import CoffeeNET.common.view.Utilcmd;

/**
 *
 * @author Javier
 */
public class VArcadeBorrar {
    
    private IRepoArcade repositorio;

    public VArcadeBorrar(IRepoArcade repositorio) {
        this.repositorio = repositorio;
    }

    /**
    * Borra un vehiculo (Delete)
    * @return Boolean
    */  
    public boolean borrar() {
        int posicionArcade = Utilcmd.leerEnteroPositivo("¿De qué arcade quieres borrar los datos?: ");
        if (repositorio.delete(posicionArcade)){
            System.out.println("Se ha borrado el arcade");
            return true;
        } else {
        System.out.println("No se ha borrado el arcade");
        return false;
        }
    }

}
