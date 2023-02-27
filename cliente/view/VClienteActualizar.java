package CoffeeNET.cliente.view;

import CoffeeNET.cliente.model.Cliente;
import CoffeeNET.cliente.model.IRepoCliente;
import CoffeeNET.common.view.Utilcmd;

/**
 * @author Javier
 */
public class VClienteActualizar {

    private IRepoCliente repositorio;

    public VClienteActualizar(IRepoCliente repositorio) {
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
    * Pide un dato de cliente hasta que es correcto
    * (Para String = string.isEmpty(); para cuando esta vacio)
    */  
    public static Cliente pedirDatosSinPuntoSinPassword() {

        String nombre = "";
        String apellido = "";
        String apodo = "";
        String sexo = "";
        int edad = -1;

        while (nombre.isEmpty() || apellido.isEmpty() || apodo.isEmpty() ||
            sexo.isEmpty() || edad < 0) {
            nombre = Utilcmd.leerTexto("Introduce tu nombre: ");
            apellido = Utilcmd.leerTexto("Introduce tu apellido: ");
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
     * Actualiza los datos de un cliente desde una posicion de lista
     * @return boolean
     */
    public boolean actualizar() {
        int posicionNueva = Utilcmd.leerEnteroPositivo("¿De que cliente quieres cambiar los datos?: ");
        boolean bRet = false;
        Cliente c = pedirDatosSinPunto();
        if (c == null) {
            System.out.println("No se ha actualizado el cliente");
        } else {
            repositorio.update(posicionNueva, c);
            System.out.println("Se ha creado el cliente");
            bRet = true;
        }
        return bRet;
    }
 }