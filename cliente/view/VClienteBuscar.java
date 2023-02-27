package CoffeeNET.cliente.view;

import CoffeeNET.cliente.model.Cliente;
import CoffeeNET.cliente.model.IRepoCliente;
import CoffeeNET.common.view.Utilcmd;
import java.util.List;

/**
 * @author Javier
 */
public class VClienteBuscar {

    private IRepoCliente repositorio;

    public VClienteBuscar(IRepoCliente repositorio) {
        this.repositorio = repositorio;
    }

    /**
    * Pide un dato de cliente hasta que es correcto
    * (Para String = string.isEmpty(); para cuando esta vacio)
    */  
    public static Cliente pedirDatosSinPuntoSinPassword() {

        String nombre = "";
        String apellido = "";
        String apodo = "";
        String sexo = "";
        int edad = -1;

        while (nombre.isEmpty() || apodo.isEmpty() ||
            sexo.isEmpty() || edad < 0) {
            nombre = Utilcmd.leerTexto("Introduce tu nombre: ");
            apodo = Utilcmd.leerTexto("Introduce tu apodo: ");
            sexo = Utilcmd.leerTexto("Introduce tu sexo: ");
            edad = Utilcmd.leerCodigo("Introduce tu edad: ");
        }
        try {
            return new Cliente(nombre, apodo, sexo, edad);
        } catch (Exception e) {
            return null;
        }
    }

    /**
    * Busca un cliente (Search)
    */  
    public boolean buscar(){
        Boolean bRet = false;
        Cliente clienteBuscado = pedirDatosSinPuntoSinPassword();
        Cliente clienteEncontrado = repositorio.search(clienteBuscado);
        if (clienteEncontrado == null){
            System.out.println("No se ha encontrado el cliente: " + clienteBuscado);
        } else {
            System.out.println("Coincide con este cliente: " + clienteEncontrado);
            bRet = true;
        }
        return bRet;
    }

    /**
    * Busca todas las coincidencias (Search)
    */  
    public boolean buscarTodo(){
        Boolean bRet = false;
        Cliente clienteBuscado = pedirDatosSinPuntoSinPassword();
        List<Cliente> clientesEncontrados = repositorio.searchAll(clienteBuscado);
        if (clientesEncontrados.isEmpty()){
            System.out.println("No se ha encontrado el cliente: " + clienteBuscado);
        } else {
            System.out.println(Utilcmd.imprimirLista(clientesEncontrados, "Clientes encontrados"));
            bRet = true;
        }
        return bRet;
    }
}
