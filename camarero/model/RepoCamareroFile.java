/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeNET.camarero.model;

import CoffeeNET.common.model.FileUtil;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Javier
 */
public class RepoCamareroFile implements IRepoCamarero{
    private List<Camarero> camareros;
    final String filePath = "data/Camarero.csv";

    /**
    * Constructor
    */
    public RepoCamareroFile() {
        initialize();
    }
 
    /**
    * Crea los productos con sus respectivas características
    */
    public void initialize() {
        camareros = FileUtil.deserializeFromFileToList(filePath);
    if (camareros == null)
        camareros = new Vector();
    }

    /**
    * Coge el cliente del repositorio para VCliente
    * @param c Coge el constructor de cliente
    * @return boolean
    */ 
    public boolean create(Object c){
        try{
            camareros.add((Camarero) c);
            FileUtil.serializeFromListToFile(filePath, camareros);
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
        return camareros;
    }

    /**
    * Actualiza los datos de cliente
    * @param posicion La posición en Vector del cliente
    * @param cliente Los datos de cliente de la clase Cliente.java
    * @return boolean 
    */
    public boolean update(int posicion, Object camarero) {
        try{
            //Este método viene de lista
            camareros.set(posicion, (Camarero) camarero);
            FileUtil.serializeFromListToFile(filePath, camareros);
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
    public boolean delete(int posicionProduct){
        try{
            camareros.remove(posicionProduct);
            FileUtil.serializeFromListToFile(filePath, camareros);
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
    public Camarero search(Object c) {
        Camarero cRet = null;
        for (int i = 0; i < camareros.size(); i++) {        
            if (camareros.get(i).equals(c)){
                cRet = camareros.get(i);
                break;
            }
        }
        return cRet;
    }
    
    /**
    * Busca todos clientes
    * @param a El cliente del que se comprobará los datos
    */
    public List<Camarero> searchAll(Object c) {
        List camarerosEncontrados = new Vector();
        for (int i = 0; i < camareros.size(); i++) {        
            if (camareros.get(i).equals(c)){
                camarerosEncontrados.add(camareros.get(i));
            }
        }
        return camarerosEncontrados;
    }

    public Camarero passwordCheckCamarero(Object c) {
        Camarero cRet = null;
        for (int i = 0; i < camareros.size(); i++) {        
            if (camareros.get(i).equalsIniciarSesion(c)){
                cRet = camareros.get(i);
                break;
            }
        }
        return cRet;
    }
}
