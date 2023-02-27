package CoffeeNET.cliente.view;

import CoffeeNET.cliente.model.IRepoCliente;
import CoffeeNET.common.view.Utilcmd;

/**
 * @author Javier
 */
public class VClienteLeer {

    private IRepoCliente repositorio;

    public VClienteLeer(IRepoCliente repositorio) {
        this.repositorio = repositorio;
    }

    /**
     * Imprime la lista de cliente
     * @return String
     */
    public void leer() {
        System.out.println(Utilcmd.imprimirLista(repositorio.read(), "Clientes"));
    }

}
