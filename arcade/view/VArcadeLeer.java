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
public class VArcadeLeer {
    
    private IRepoArcade repositorio;

    public VArcadeLeer(IRepoArcade repositorio) {
        this.repositorio = repositorio;
    }

    /**
    * Imprime la lista de vehiculos (Read)
    */
    public void leer() {
        System.out.println(Utilcmd.imprimirLista(repositorio.read(), "Arcades"));
    }
}
