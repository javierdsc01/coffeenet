package CoffeeNET.local.model;

import CoffeeNET.common.model.FileUtil;
import java.util.List;
import java.util.Vector;


public class RepoLocal implements IRepoLocal {

    
    private List<Local> locales;
    final String filePath = "data/Locales.csv";

    public RepoLocal() {
        locales = new Vector();
        inicializar();
    }

    
    public void inicializar() {
        locales = FileUtil.deserializeFromFileToList(filePath);
    if (locales == null)
        locales = new Vector();
    }

    
    public boolean create(Object l) {
        try {
            locales.add((Local) l);
            FileUtil.serializeFromListToFile(filePath, locales);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    
    public List<Local> read() {
        return locales;
    }

    public boolean update(int posicion, Object local) {
        try {
            locales.set(posicion, (Local) local);
            FileUtil.serializeFromListToFile(filePath, locales);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

  
    public boolean delete(int posicionLocal) {
        try {
            locales.remove(posicionLocal);
            FileUtil.serializeFromListToFile(filePath, locales);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    
    public Local search(Object l) {
        Local cRet = null;
        for (int i = 0; i < locales.size(); i++) {
            if (locales.get(i).equals(l)) {
                cRet = locales.get(i);
                break;
            }
        }
        return cRet;
    }

   
    public List<Local> searchAll(Object l) {
        List localesEncontrados = new Vector();
        for (int i = 0; i < locales.size(); i++) {
            if (locales.get(i).equals(l)) {
               localesEncontrados.add(locales.get(i));
            }
        }
        return localesEncontrados;
    }
}


 

