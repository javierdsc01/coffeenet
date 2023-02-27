/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeNET.camarero.view;

import CoffeeNET.camarero.model.Camarero;
import CoffeeNET.camarero.model.IRepoCamarero;
import CoffeeNET.common.view.Utilcmd;

/**
 *
 * @author Javier
 */
public class VCamarero {
    
    private IRepoCamarero repositorio;
    private VCamareroCrear vCamareroCrear;
    private VCamareroLeer vCamareroLeer;
    private VCamareroActualizar vCamareroActualizar;
    private VCamareroBorrar vCamareroBorrar;
    private VCamareroBuscar vCamareroBuscar;

    public VCamarero(IRepoCamarero repositorio) {
        this.repositorio = repositorio;
        this.vCamareroCrear = new VCamareroCrear(repositorio);
        this.vCamareroLeer = new VCamareroLeer(repositorio);
        this.vCamareroActualizar = new VCamareroActualizar(repositorio);
        this.vCamareroBorrar = new VCamareroBorrar(repositorio);
        this.vCamareroBuscar = new VCamareroBuscar(repositorio);
    }

    /**
    * Pide un dato de cliente hasta que es correcto
    * (Para String = string.isEmpty(); para cuando esta vacio)
    */  
    public static Camarero pedirDatosIniciarSesion() {
        String nombre = "";
        String password = "";

        while (nombre.isEmpty() || password.isEmpty()) {
            nombre = Utilcmd.leerTexto("Introduce tu nombre: ");
            password = Utilcmd.leerTexto("Introduce tu password: ");
        }
        try {
            return new Camarero(nombre, password);
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
    	Camarero intento = VCamarero.pedirDatosIniciarSesion();
        Camarero camareroPosible = repositorio.passwordCheckCamarero(intento);
    	if (camareroPosible == null) {
    		System.out.println("Credenciales incorrectas.");
    	} else {
    		System.out.println("Acceso concedido.");
    		bRet = true;
    	}
    	return bRet;
    }

    /**
     * Crea un bucle para que al hacer una opción no se termine ahí
     */
    public void bucle() {
        boolean salir = false;
        int opcion;
        while (!salir) {
            System.out.println("[1] Create.");
            System.out.println("[2] Read ");
            System.out.println("[3] Update");
            System.out.println("[4] Delete");
            System.out.println("[5] Search");
            System.out.println("[0] Return");
            opcion = Utilcmd.leerCodigo("Elige una opción: ");

            switch (opcion) {
                case 1:
                    vCamareroCrear.crear();
                    break;
                case 2:
                    vCamareroLeer.leer();
                    break;
                case 3:
                    vCamareroActualizar.actualizar();
                    break;
                case 4:
                    vCamareroBorrar.borrar();
                    break;
                case 5:
                    vCamareroBuscar.buscar();
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("La opción introducida no existe");
            }
        }
    }
}
