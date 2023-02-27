/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CoffeeNET.personal.model;

import java.util.List;

/**
 *
 * @author Javier
 */
public interface IRepoPersonal {

    /**
     * Crea los vehiculos con sus respectivas características
     */
    public void init();

    /**
     * Coge el vehiculo del repositorio para VVehiculo
     *
     * @param v Coge el constructor de vehiculo
     * @return boolean
     */
    public boolean create(Object p);

    /**
     * Lee los vehiculos desde la lista.
     *
     * @return List devuelve la lista de los vehiculos.
     */
    public List<Personal> read();

    /**
     * Actualiza los datos de vehiculo
     *
     * @param posicion La posición en Vector del vehiculo
     * @param vehiculo Los datos de vehiculo de la clase Vehiculo.java
     * @return boolean
     */
    public boolean update(int posicion, Object personal);

    /**
     * Borra un vehiculo
     *
     * @param posicionVehiculo Trae un vehiculo con sus datos
     * @return boolean
     */
    public boolean delete(int posicionPersonal);

    /**
     * Busca más de uno
     *
     * @param v El vehiculo a buscar
     * @return Lista
     */
    public List searchAll(Object p);

    public Personal passwordCheckPersonal(Object p);
}
