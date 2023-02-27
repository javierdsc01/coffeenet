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
public class VPersonalBuscar {
    
    private IRepoPersonal repositorio;

    public VPersonalBuscar(IRepoPersonal repositorio) {
        this.repositorio = repositorio;
    }

    /**
    * Pide un dato de vehiculo hasta que es correcto
    * (Para String = string.isEmpty(); para cuando está vacío)
    * @return Vehiculo El vehiculo de los que obtenemos los datos.
    */  
    public Personal pedirDatos() {
        int iId = -1;
        while (iId < 0) {
            iId= Utilcmd.leerCodigo("Introduce el Id: ");
        } 

        String sTipo = "";
        try {
        while (sTipo.equals("")){
            sTipo = Utilcmd.leerTexto("Introduce si eres Informático o Jefe: ");
        }   

        String sNombre = "";
        while (sNombre.equals("")){
            sNombre = Utilcmd.leerTexto("Introduce el apodo: ");
        }

        String sPassword = "";
        while (sPassword.equals("")){
            sPassword = Utilcmd.leerTexto("Introduce la contraseña: ");
        } 

            return new Personal(iId, sTipo, sNombre, sPassword);
        } catch (Exception e) {
            return null;
        }
    }

    /**
    * Busca todas las coincidencias (Search)
    */  
    public boolean buscar(){
        Boolean bRet = false;
        Personal personalesBuscados = pedirDatos();
        List<Personal> personalesEncontrados = repositorio.searchAll(personalesBuscados);
        if (personalesEncontrados.isEmpty()){
            System.out.println("No se ha encontrado el personal: " + personalesBuscados);
        } else {
            System.out.println(Utilcmd.imprimirLista(personalesEncontrados, "Personales encontrados"));
            bRet = true;
        }
        return bRet;
    }
}
