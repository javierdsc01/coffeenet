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
public class VCamareroCrear {
    
    private IRepoCamarero repositorio;

    public VCamareroCrear(IRepoCamarero repositorio) {
        this.repositorio = repositorio;
    }

    /**
    * Pide un dato de camarero hasta que es correcto
    * (Para String = string.isEmpty(); para cuando está vacío)
    * @return camarero El camarero de los que obtenemos los datos.
    */  
    public Camarero pedirDatos() {
        int iId = -1;
        while (iId < 0) {
            iId = Utilcmd.leerCodigo("Introduce el id: ");
        } 

        String sNombre = "";
        try {
        while (sNombre.equals("")){
            sNombre = Utilcmd.leerTexto("Introduce el nombre: ");
        }   

        String sRango = "";
        while (sRango.equals("")){
            sRango = Utilcmd.leerTexto("Introduce el rango: ");
        }

        String sPassword = "";
        while (sPassword.equals("")){
            sPassword = Utilcmd.leerTexto("Introduce la contraseña: ");
        }

            return new Camarero(iId, sNombre, sRango, sPassword);
        } catch (Exception e) {
            return null;
        }
    }

    /**
    * Crea un camarero (Create)
    * @return Boolean
    */  
    public boolean crear() {
        boolean bRet = false;
        Camarero c = pedirDatos();
        if (c == null) {
            System.out.println("No se ha creado el camarero");
        } else {
            repositorio.create(c);
            System.out.println("Se ha creado el camarero");
            bRet = true;
        }
        return bRet;
    }
}
