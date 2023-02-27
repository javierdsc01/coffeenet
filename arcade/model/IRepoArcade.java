/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CoffeeNET.arcade.model;

import java.util.List;

/**
 *
 * @author Javier
 */
public interface IRepoArcade {
     
    /**
    * Crea los clientes con sus respectivas características
    */
    public void initialize();

    /**
    * Coge el cliente del repositorio para VCliente
    * @param a Coge el constructor de cliente (que solo tiene idCliente)
    * @return boolean
    */ 
    public boolean create(Object a);

    /**
    * Lee los clientes desde la lista.
    * @return List devuelve la lista de los clientes.
    */
    public List<Arcade> read();

    /**
    * Actualiza los datos de cliente
    * @param posicion La posición en Vector del cliente
    * @param arcade Los datos de cliente de la clase Cliente.java
    * @return boolean 
    */
    public boolean update(int posicion, Object arcade);

    /**
    * Borra un cliente
    * @param posicionArcade Trae un cliente con sus datos
    * @return boolean
    */
    public boolean delete(int posicionArcade);

    /**
    * Busca un cliente
    * @param c El cliente a buscar
    * @return Cliente
    */
    public Arcade search(Object a);

    /**
    * Busca más de uno
    * @param c El cliente a buscar
    * @return Lista
    */
    public List searchAll(Object a);
}
