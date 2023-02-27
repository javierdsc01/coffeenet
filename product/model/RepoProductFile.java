/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeNET.product.model;

import CoffeeNET.common.model.FileUtil;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Javier
 */
public class RepoProductFile implements IRepoProduct{
    private List<Product> products;
    final String filePath = "data/Products.csv";

    /**
    * Constructor
    */
    public RepoProductFile() {
        initialize();
    }
 
    /**
    * Crea los productos con sus respectivas características
    */
    public void initialize() {
        products = FileUtil.deserializeFromFileToList(filePath);
    if (products == null)
        products = new Vector();
    }

    /**
    * Coge el cliente del repositorio para VCliente
    * @param a Coge el constructor de cliente
    * @return boolean
    */ 
    public boolean create(Object a){
        try{
            products.add((Product) a);
            FileUtil.serializeFromListToFile(filePath, products);
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
        return products;
    }

    /**
    * Actualiza los datos de cliente
    * @param posicion La posición en Vector del cliente
    * @param cliente Los datos de cliente de la clase Cliente.java
    * @return boolean 
    */
    public boolean update(int posicion, Object product) {
        try{
            //Este método viene de lista
            products.set(posicion, (Product) product);
            FileUtil.serializeFromListToFile(filePath, products);
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
            products.remove(posicionProduct);
            FileUtil.serializeFromListToFile(filePath, products);
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
    public Product search(Object a) {
        Product aRet = null;
        for (int i = 0; i < products.size(); i++) {        
            if (products.get(i).equals(a)){
                aRet = products.get(i);
                break;
            }
        }
        return aRet;
    }
    
    /**
    * Busca todos clientes
    * @param a El cliente del que se comprobará los datos
    */
    public List<Product> searchAll(Object a) {
        List productsEncontrados = new Vector();
        for (int i = 0; i < products.size(); i++) {        
            if (products.get(i).equals(a)){
                productsEncontrados.add(products.get(i));
            }
        }
        return productsEncontrados;
    }
}
