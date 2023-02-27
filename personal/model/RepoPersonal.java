package CoffeeNET.personal.model;

import CoffeeNET.common.model.FileUtil;
import java.util.List;
import java.util.Vector;

public class RepoPersonal implements IRepoPersonal {

    private List<Personal> lista;

    final String filePathPersonal = "data/Personal.csv";

    public RepoPersonal() {
        this.lista = new Vector<>();
        this.init();
    }

    //Inicialización del catalogo de Habitacion
    public void init() {
        lista = FileUtil.deserializeFromFileToList(filePathPersonal);
    if (lista == null)
        lista = new Vector();
    }

    // Reserva una habitacion para un código de cliente
    public boolean create(Object p) {
        try {
            lista.add((Personal) p);
            FileUtil.serializeFromListToFile(filePathPersonal, lista);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List read() {
        return lista;
    }

    public boolean update(int posicion, Object personal) {
        try {
            lista.set(posicion, (Personal) personal);
            FileUtil.serializeFromListToFile(filePathPersonal, lista);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean delete(int posicionPersonal){
        try{
            lista.remove(posicionPersonal);
            FileUtil.serializeFromListToFile(filePathPersonal, lista);
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
    public Personal search(Object p) {
        Personal pRet = null;
        for (int i = 0; i < lista.size(); i++) {        
            if (lista.get(i).equals(p)){
                pRet = lista.get(i);
                break;
            }
        }
        return pRet;
    }
    
    /**
    * Busca todos clientes
    * @param a El cliente del que se comprobará los datos
    */
    public List<Personal> searchAll(Object p) {
        List personalesEncontrados = new Vector();
        for (int i = 0; i < lista.size(); i++) {        
            if (lista.get(i).equals(p)){
                personalesEncontrados.add(lista.get(i));
            }
        }
        return personalesEncontrados;
    }

    public Personal passwordCheckPersonal(Object p) {
        Personal pRet = null;
        for (int i = 0; i < lista.size(); i++) {        
            if (lista.get(i).equalsPassword(p)){
                pRet = lista.get(i);
                break;
            }
        }
        return pRet;
    }
}
