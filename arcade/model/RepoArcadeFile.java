/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeNET.arcade.model;

import CoffeeNET.common.model.FileUtil;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Javier
 */
public class RepoArcadeFile implements IRepoArcade{
    private List<Arcade> arcades;
    final String filePath = "data/Arcades.json";

    /**
    * Constructor
    */
    public RepoArcadeFile() {
        initialize();
    }
 
    /**
    * Crea los arcades con sus respectivas características
    */
    public void initialize() {
        arcades = FileUtil.deserializeFromFileToList(filePath);
    if (arcades == null)
        arcades = new Vector();
    }

    /**
    * Coge el cliente del repositorio para VCliente
    * @param a Coge el constructor de cliente
    * @return boolean
    */ 
    public boolean create(Object a){
        try{
            arcades.add((Arcade) a);
            FileUtil.serializeFromListToFile(filePath, arcades);
        } catch(Exception e){
            return false;
        }
        return true;
    }

    /**
    * Devuelve la lista de clientes
    * @return List
    */
    public List read() {
        return arcades;
    }

    /**
    * Actualiza los datos de cliente
    * @param posicion La posición en Vector del cliente
    * @param cliente Los datos de cliente de la clase Cliente.java
    * @return boolean 
    */
    public boolean update(int posicion, Object arcade) {
        try{
            //Este método viene de lista
            arcades.set(posicion, (Arcade) arcade);
            FileUtil.serializeFromListToFile(filePath, arcades);
            return true;
        } catch (Exception e) { 
            return false;
        }
    }
    
    /**
    * Borra un cliente
    * @param posicionCliente posicion del cliente
    * @return boolean
    */
    public boolean delete(int posicionArcade){
        try{
            arcades.remove(posicionArcade);
            FileUtil.serializeFromListToFile(filePath, arcades);
        } catch(Exception e){
            return false;
        }
        return true;
    }

    /**
    * Busca un cliente
    * @param a El cliente del que comprueba los datos
    * @return Cliente el cliente con los datos que tiene igual
    */
    public Arcade search(Object a) {
        Arcade aRet = null;
        for (int i = 0; i < arcades.size(); i++) {        
            if (arcades.get(i).equals(a)){
                aRet = arcades.get(i);
                break;
            }
        }
        return aRet;
    }
    
    /**
    * Busca todos clientes
    * @param a El cliente del que se comprobará los datos
    */
    public List<Arcade> searchAll(Object a) {
        List arcadesEncontrados = new Vector();
        for (int i = 0; i < arcades.size(); i++) {        
            if (arcades.get(i).equals(a)){
                arcadesEncontrados.add(arcades.get(i));
            }
        }
        return arcadesEncontrados;
    }
}
