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
public class VPersonalLeer {
    
    private IRepoPersonal repositorio;

    public VPersonalLeer(IRepoPersonal repositorio) {
        this.repositorio = repositorio;
    }

    /**
    * Imprime la lista de vehiculos (Read)
    */
    public void leer() {
        System.out.println(Utilcmd.imprimirLista(repositorio.read(), "Personal"));
    }
}
