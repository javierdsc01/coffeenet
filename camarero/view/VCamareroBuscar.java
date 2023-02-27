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
public class VCamareroBuscar {
    
    private IRepoCamarero repositorio;

    public VCamareroBuscar(IRepoCamarero repositorio) {
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
    * Busca todas las coincidencias (Search)
    */  
    public boolean buscar(){
        Boolean bRet = false;
        Camarero camareroBuscado = pedirDatos();
        List<Camarero> camarerosEncontrados = repositorio.searchAll(camareroBuscado);
        if (camarerosEncontrados.isEmpty()){
            System.out.println("No se ha encontrado el camarero: " + camareroBuscado);
        } else {
            System.out.println(Utilcmd.imprimirLista(camarerosEncontrados, "Camareros encontrados"));
            bRet = true;
        }
        return bRet;
    }
}
