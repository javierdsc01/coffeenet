/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeNET.cliente.model;

import CoffeeNET.common.model.FileUtil;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Javier
 */
public class RepoClienteFile implements IRepoCliente{
    private List<Cliente> clientes;
    final String filePath = "data/Clientes.csv";

    /**
    * Constructor
    */
    public RepoClienteFile() {
        initialize();
    }
 
    /**
    * Crea los clientes con sus respectivas características
    */
    public void initialize() {
        clientes = FileUtil.deserializeFromFileToList(filePath);
    if (clientes == null)
        clientes = new Vector();
    }

    /**
    * Coge el cliente del repositorio para VCliente
    * @param c Coge el constructor de cliente
    * @return boolean
    */ 
    public boolean create(Object c){
        try{
            clientes.add((Cliente) c);
            FileUtil.serializeFromListToFile(filePath, clientes);
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
        return clientes;
    }

    /**
    * Actualiza los datos de cliente
    * @param posicion La posición en Vector del cliente
    * @param cliente Los datos de cliente de la clase Cliente.java
    * @return boolean 
    */
    public boolean update(int posicion, Object cliente) {
        try{
            //Este método viene de lista
            clientes.set(posicion, (Cliente) cliente);
            FileUtil.serializeFromListToFile(filePath, clientes);
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
    public boolean delete(int posicionCliente){
        try{
            clientes.remove(posicionCliente);
            FileUtil.serializeFromListToFile(filePath, clientes);
        } catch(Exception e){
            return false;
        }
        return true;
    }

    /**
    * Busca un cliente
    * @param c El cliente del que comprueba los datos
    * @return Cliente el cliente con los datos que tiene igual
    */
    public Cliente search(Object c) {
        Cliente cRet = null;
        for (int i = 0; i < clientes.size(); i++) {        
            if (clientes.get(i).equals(c)){
                cRet = clientes.get(i);
                break;
            }
        }
        return cRet;
    }
    
    /**
    * Busca todos clientes
    * @param c El cliente del que se comprobará los datos
    */
    public List<Cliente> searchAll(Object c) {
        List clientesEncontrados = new Vector();
        for (int i = 0; i < clientes.size(); i++) {        
            if (clientes.get(i).equals(c)){
                clientesEncontrados.add(clientes.get(i));
            }
        }
        return clientesEncontrados;
    }

    public int passwordCheckCliente(Object c) {
        int iRet = -1;
        for (int i = 0; i < clientes.size(); i++) {        
            if (clientes.get(i).equalsPassword(c)){
                iRet = i;
                break;
            }
        }
        return iRet;
    }
}
