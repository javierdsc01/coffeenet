/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeNET.camarero.view;

import CoffeeNET.camarero.model.Camarero;
import CoffeeNET.camarero.model.IRepoCamarero;
import CoffeeNET.common.view.Utilcmd;
import java.util.List;

/**
 *
 * @author Javier
 */
public class VCamareroLeer {
    
    private IRepoCamarero repositorio;

    public VCamareroLeer(IRepoCamarero repositorio) {
        this.repositorio = repositorio;
    }

    /**
    * Imprime la lista de camareros (Read)
    */
    public void leer() {
        System.out.println(Utilcmd.imprimirLista(repositorio.read(), "camareros"));
    }
}
