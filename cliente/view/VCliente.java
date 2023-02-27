package CoffeeNET.cliente.view;

import CoffeeNET.cliente.model.Cliente;
import CoffeeNET.cliente.model.IRepoCliente;
import CoffeeNET.common.view.Utilcmd;

/**
 * @author Javier
 */
public class VCliente {

    private IRepoCliente repositorio;
    private VClienteCrear vClienteCrear;
    private VClienteLeer vClienteLeer;
    private VClienteActualizar vClienteActualizar;
    private VClienteBorrar vClienteBorrar;
    private VClienteBuscar vClienteBuscar;

    public VCliente(IRepoCliente repositorio) {
        this.repositorio = repositorio;
        this.vClienteCrear = new VClienteCrear(repositorio);
        this.vClienteLeer = new VClienteLeer(repositorio);
        this.vClienteActualizar = new VClienteActualizar(repositorio);
        this.vClienteBorrar = new VClienteBorrar(repositorio);
        this.vClienteBuscar = new VClienteBuscar(repositorio);
    }

    /**
    * Pide un dato de cliente hasta que es correcto
    * (Para String = string.isEmpty(); para cuando esta vacio)
    */  
    public static Cliente pedirDatosIniciarSesion() {
        String apodo = "";
        String password = "";

        while (apodo.isEmpty() ||password.isEmpty()) {
            apodo = Utilcmd.leerTexto("Introduce tu apodo: ");
            password = Utilcmd.leerTexto("Introduce tu password: ");
        }
        try {
            return new Cliente(apodo, password);
        } catch (Exception e) {
            return null;
        }
    }
    
    /**
     * Comprueba que existe un cliente con esas credenciales
     * @return Boolean si es verdadero o no
     */
    public boolean coincidirPassword() {
    	Boolean bRet = false;
    	Cliente intento = VCliente.pedirDatosIniciarSesion();
        int clientePosible = repositorio.passwordCheckCliente(intento);
    	if (clientePosible == -1) {
    		System.out.println("Credenciales incorrectas.");
    	} else {
    		System.out.println("Acceso concedido.");
    		bRet = true;
    	}
    	return bRet;
    }

    /**
     * Crea un bucle para que al hacer una opcion no se termine ahi
     */
    public void bucle() {
    	boolean salir = false;
        int opcion;
        while (!salir) {
            System.out.println("[1] Create user.");
            System.out.println("[2] Read user list.");
            System.out.println("[3] Update user list.");
            System.out.println("[4] Delete user.");
            System.out.println("[5] Search user (first one that appears).");
            System.out.println("[6] Search users (List with all of them).");
            System.out.println("[0] Return to menu");
            opcion = Utilcmd.leerCodigo("Choose an option: ");

            switch (opcion) {
                case 1:
                    vClienteCrear.crearForPersonal();
                    break;
                case 2:
                    vClienteLeer.leer();
                    break;
                case 3:
                    vClienteActualizar.actualizar();
                    break;
                case 4:
                    vClienteBorrar.borrar();
                    break;
                case 5:
                    vClienteBuscar.buscar();
                    break;
                case 6:
                    vClienteBuscar.buscarTodo();
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("La opcion introducida no existe");
            	}
        }
    }
}
