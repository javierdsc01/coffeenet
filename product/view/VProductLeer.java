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
public class VProductLeer {
    
    private IRepoProduct repositorio;

    public VProductLeer(IRepoProduct repositorio) {
        this.repositorio = repositorio;
    }

    public void leer() {
        System.out.println(Utilcmd.imprimirLista(repositorio.read(), "Productos"));
    }

}
