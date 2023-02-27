package CoffeeNET.cliente.view;

import CoffeeNET.cliente.model.Cliente;
import CoffeeNET.cliente.model.IRepoCliente;
import CoffeeNET.common.view.Utilcmd;

/**
 * @author Javier
 */
public class VClienteCrear {

    private IRepoCliente repositorio;

    public VClienteCrear(IRepoCliente repositorio) {
        this.repositorio = repositorio;
    }
    
    /**
    * Pide un dato de cliente hasta que es correcto
    * (Para String = string.isEmpty(); para cuando esta vacio)
    */  
    public static Cliente pedirDatos() {
        String nombre = "";
        String apodo = "";
        String sexo = "";
        int puntos = -1;
        int edad = -1;
        String password = "";

        while (nombre.isEmpty() || apodo.isEmpty() ||
                sexo.isEmpty() || puntos <0 || edad < 0 || password.isEmpty()) {
            nombre = Utilcmd.leerTexto("Introduce nombre: ");
            apodo = Utilcmd.leerTexto("Introduce apodo: ");
            sexo = Utilcmd.leerTexto("Introduce sexo: ");
            puntos = Utilcmd.leerCodigo("Introduce los puntos: ");
            edad = Utilcmd.leerCodigo("Introduce edad: ");
            password = Utilcmd.leerTexto("Introduce password: ");
        }
        try {
            return new Cliente(nombre, apodo, sexo, puntos, edad, password);
        } catch (Exception e) {
            return null;
        }
    }


    /**
    * Pide un dato de cliente hasta que es correcto
    * (Para String = string.isEmpty(); para cuando esta vacio)
    */  
    public static Cliente pedirDatosSinPunto() {

        String nombre = "";
        String apodo = "";
        String sexo = "";
        int edad = -1;
        String password = "";

        while (nombre.isEmpty() || apodo.isEmpty() ||
            sexo.isEmpty() || edad < 0 || password.isEmpty()) {
            nombre = Utilcmd.leerTexto("Introduce tu nombre: ");
            apodo = Utilcmd.leerTexto("Introduce tu apodo: ");
            sexo = Utilcmd.leerTexto("Introduce tu sexo: ");
            edad = Utilcmd.leerCodigo("Introduce tu edad: ");
            password = Utilcmd.leerTexto("Introduce contraseña: ");
        }
        try {
            return new Cliente(nombre, apodo, sexo, edad, password);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Metodo para crear el cliente para el cliente.
     * @return boolean Devuelve que se haya hecho correctamente.
     */
    public boolean crearForCliente() {
        boolean bRet = false;
        Cliente c = pedirDatosSinPunto();
        if (c == null) {
            System.out.println("No se ha creado el cliente");
        } else {
            repositorio.create(c);
            System.out.println("Se ha creado el cliente");
            bRet = true;
        }
        return bRet;
    }
    
    /**
     * Metodo para crear el cliente para el personal
     * @return boolean Devuelve que se haya hecho correctamente.
     */
    public boolean crearForPersonal() {
        boolean bRet = false;
        Cliente c = pedirDatos();
        if (c == null) {
            System.out.println("No se ha creado el cliente");
        } else {
            repositorio.create(c);
            System.out.println("Se ha creado el cliente");
            bRet = true;
        }
        return bRet;
    }
}
