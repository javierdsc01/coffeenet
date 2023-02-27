/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CoffeeNET.product.model;

import java.util.List;

/**
 *
 * @author Javier
 */
public interface IRepoProduct {
     
    /**
    * Crea los clientes con sus respectivas características
    */
    public void initialize();

    /**
    * Coge el cliente del repositorio para VCliente
    * @param c Coge el constructor de cliente (que solo tiene idCliente)
    * @return boolean
    */ 
    public boolean create(Object p);

    /**
    * Lee los clientes desde la lista.
    * @return List devuelve la lista de los clientes.
    */
    public List<Product> read();

    /**
    * Actualiza los datos de cliente
    * @param posicion La posición en Vector del cliente
    * @param cliente Los datos de cliente de la clase Cliente.java
    * @return boolean 
    */
    public boolean update(int posicion, Object product);

    /**
    * Borra un cliente
    * @param posicionCliente Trae un cliente con sus datos
    * @return boolean
    */
    public boolean delete(int posicionProduct);

    /**
    * Busca un cliente
    * @param c El cliente a buscar
    * @return Cliente
    */
    public Product search(Object p);

    /**
    * Busca más de uno
    * @param c El cliente a buscar
    * @return Lista
    */
    public List searchAll(Object p);
}
