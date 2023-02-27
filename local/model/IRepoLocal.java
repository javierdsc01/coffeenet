package CoffeeNET.local.model;

import java.util.List;

public interface IRepoLocal {

    public void inicializar();

    public boolean create(Object l);

    public List<Local> read();

    public boolean update(int posicion, Object local);

    public boolean delete(int posicionLocal);

    public Local search(Object l);

    public List<Local> searchAll(Object l);
}
