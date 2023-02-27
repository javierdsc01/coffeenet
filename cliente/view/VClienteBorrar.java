package CoffeeNET.cliente.view;

import CoffeeNET.cliente.model.IRepoCliente;
import CoffeeNET.common.view.Utilcmd;

/**
 * @author Javier
 */
public class VClienteBorrar {

    private IRepoCliente repositorio;

    public VClienteBorrar(IRepoCliente repositorio) {
        this.repositorio = repositorio;
    }
    
    /**
    * Borra un cliente (Delete)
    * @return Boolean
    */  
    public boolean borrar() {
        int posicionCliente = Utilcmd.leerEnteroPositivo("�De qu� cliente quieres borrar los datos?: ");
        if (repositorio.delete(posicionCliente)){
            System.out.println("Se ha borrado el cliente");
            return true;
        } else {
        System.out.println("No se ha borrado el cliente");
        return false;
        }
    }

}
