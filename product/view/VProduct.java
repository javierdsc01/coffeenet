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
public class VProduct {
    
    private IRepoProduct repositorio;
    private VProductCrear vProductCrear;
    private VProductLeer vProductLeer;
    private VProductActualizar vProductActualizar;
    private VProductBorrar vProductBorrar;
    private VProductBuscar vProductBuscar;

    public VProduct(IRepoProduct repositorio) {
        this.repositorio = repositorio;
        this.vProductCrear = new VProductCrear(repositorio);
        this.vProductLeer = new VProductLeer(repositorio);
        this.vProductActualizar = new VProductActualizar(repositorio);
        this.vProductBorrar = new VProductBorrar(repositorio);
        this.vProductBuscar = new VProductBuscar(repositorio);
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
                    vProductCrear.crear();
                    break;
                case 2:
                    vProductLeer.leer();
                    break;
                case 3:
                    vProductActualizar.actualizar();
                    break;
                case 4:
                    vProductBorrar.borrar();
                    break;
                case 5:
                    vProductBuscar.buscar();
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
