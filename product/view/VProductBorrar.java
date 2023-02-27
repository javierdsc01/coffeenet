/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeNET.product.view;

import CoffeeNET.product.model.IRepoProduct;
import CoffeeNET.common.view.Utilcmd;

/**
 *
 * @author Javier
 */
public class VProductBorrar {
    
    private IRepoProduct repositorio;

    public VProductBorrar(IRepoProduct repositorio) {
        this.repositorio = repositorio;
    }

    /**
    * Borra un vehiculo (Delete)
    * @return Boolean
    */  
    public boolean borrar() {
        int posicionProduct = Utilcmd.leerEnteroPositivo("¿De qué producto quieres borrar los datos?: ");
        if (repositorio.delete(posicionProduct)){
            System.out.println("Se ha borrado el producto");
            return true;
        } else {
        System.out.println("No se ha borrado el producto");
        return false;
        }
    }

}
