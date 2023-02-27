/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeNET.personal.view;

import CoffeeNET.personal.model.IRepoPersonal;
import CoffeeNET.personal.model.Personal;
import CoffeeNET.common.view.Utilcmd;
import java.util.List;

/**
 *
 * @author Javier
 */
public class VPersonalBorrar {
    
    private IRepoPersonal repositorio;

    public VPersonalBorrar(IRepoPersonal repositorio) {
        this.repositorio = repositorio;
    }

    /**
    * Borra un vehiculo (Delete)
    * @return Boolean
    */  
    public boolean borrar() {
        int posicionPersonal = Utilcmd.leerEnteroPositivo("¿De qué personal quieres borrar los datos?: ");
        if (repositorio.delete(posicionPersonal)){
            System.out.println("Se ha borrado el personal");
            return true;
        } else {
        System.out.println("No se ha borrado el personal");
        return false;
        }
    }
}
