/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeNET.product.view;

import CoffeeNET.product.model.IRepoProduct;
import CoffeeNET.product.model.Product;
import CoffeeNET.common.view.Utilcmd;

/**
 *
 * @author Javier
 */
public class VProductCrear {
    
    private IRepoProduct repositorio;

    public VProductCrear(IRepoProduct repositorio) {
        this.repositorio = repositorio;
    }

    /**
    * Pide un dato de vehiculo hasta que es correcto
    * (Para String = string.isEmpty(); para cuando está vacío)
    * @return Vehiculo El vehiculo de los que obtenemos los datos.
    */  
    public Product pedirDatos() {

        String sType = "";
        while (sType.equals("")){
            sType = Utilcmd.leerTexto("Introduce el tipo: ");
        }   

        String sName = "";
        while (sName.equals("")){
            sName = Utilcmd.leerTexto("Introduce el nombre: ");
        }       

        int iPrice = -1;
        while (iPrice < 0) {
            iPrice = Utilcmd.leerCodigo("Introduce el precio: ");
        } 

        int iPoints = -1;
        while (iPoints < 0) {
            iPoints = Utilcmd.leerCodigo("Introduce la ganancia de puntos: ");
        } 


        try {
            return new Product (sType, sName, iPrice, iPoints);
        } catch (Exception e) {
            return null;
        }
    }

    /**
    * Crea un vehiculo (Create)
    * @return Boolean
    */  
    public boolean crear() {
        boolean bRet = false;
        Product a = pedirDatos();
        if (a == null) {
            System.out.println("No se ha creado el producto");
        } else {
            repositorio.create(a);
            System.out.println("Se ha creado el producto");
            bRet = true;
        }
        return bRet;
    }

}
