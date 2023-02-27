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
public class VPersonal {
    
    private IRepoPersonal repositorio;
    private VPersonalCrear vPersonalCrear;
    private VPersonalLeer vPersonalLeer;
    private VPersonalBuscar vPersonalBuscar;
    private VPersonalActualizar vPersonalActualizar;
    private VPersonalBorrar vPersonalBorrar;

    public VPersonal(IRepoPersonal repositorio) {
        this.repositorio = repositorio;
        this.vPersonalCrear = new VPersonalCrear(repositorio);
        this.vPersonalLeer = new VPersonalLeer(repositorio);
        this.vPersonalActualizar = new VPersonalActualizar(repositorio);
        this.vPersonalBorrar = new VPersonalBorrar(repositorio);
        this.vPersonalBuscar = new VPersonalBuscar(repositorio);
    }

    /**
    * Pide un dato de vehiculo hasta que es correcto
    * (Para String = string.isEmpty(); para cuando está vacío)
    * @return Vehiculo El vehiculo de los que obtenemos los datos.
    */  
    public static Personal pedirDatosIniciarSesion() {
        int iId = -1;
        while (iId < 0) {
            iId= Utilcmd.leerCodigo("Introduce el Id: ");
        } 


        String sNombre = "";
        while (sNombre.equals("")){
            sNombre = Utilcmd.leerTexto("Introduce el apodo: ");
        }

        String sPassword = "";
        while (sPassword.equals("")){
            sPassword = Utilcmd.leerTexto("Introduce el apodo: ");
        } 
        try {
            return new Personal(iId, sNombre, sPassword);
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
    	Personal intento = VPersonal.pedirDatosIniciarSesion();
        Personal personalPosible = repositorio.passwordCheckPersonal(intento);
    	if (personalPosible == null) {
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
                    vPersonalCrear.crear();
                    break;
                case 2:
                    vPersonalLeer.leer();
                    break;
                case 3:
                    vPersonalActualizar.actualizar();
                    break;
                case 4:
                    vPersonalBorrar.borrar();
                    break;
                case 5:
                    vPersonalBuscar.buscar();
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
