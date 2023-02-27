/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeNET.arcade.view;


import CoffeeNET.arcade.model.IRepoArcade;
import CoffeeNET.common.view.Utilcmd;

/**
 *
 * @author Javier
 */
public class VArcade {
    
    private IRepoArcade repositorio;
    private VArcadeCrear vArcadeCrear;
    private VArcadeLeer vArcadeLeer;
    private VArcadeActualizar vArcadeActualizar;
    private VArcadeBorrar vArcadeBorrar;
    private VArcadeBuscar vArcadeBuscar;

    public VArcade(IRepoArcade repositorio) {
        this.repositorio = repositorio;
        this.vArcadeCrear = new VArcadeCrear(repositorio);
        this.vArcadeLeer = new VArcadeLeer(repositorio);
        this.vArcadeActualizar = new VArcadeActualizar(repositorio);
        this.vArcadeBorrar = new VArcadeBorrar(repositorio);
        this.vArcadeBuscar = new VArcadeBuscar(repositorio);
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
                    vArcadeCrear.bucleCrear();
                    break;
                case 2:
                    vArcadeLeer.leer();
                    break;
                case 3:
                    vArcadeActualizar.bucleActualizar();
                    break;
                case 4:
                    vArcadeBorrar.borrar();
                    break;
                case 5:
                    vArcadeBuscar.bucleBuscar();
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
