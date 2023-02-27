package CoffeeNET.local.view;

import java.util.List;
import CoffeeNET.local.model.IRepoLocal;
import CoffeeNET.local.model.Local;
import CoffeeNET.common.view.Utilcmd;

public class VLocal {

    private IRepoLocal repositorio;

    public VLocal(IRepoLocal repositorio) {
        this.repositorio = repositorio;
    }

    
    public static Local pedirDatos() {
        String horario = "";
        int maquinasDispo = -1;
        String direccion = "";

        while (maquinasDispo < 0 || horario.isEmpty() || direccion.isEmpty()) {
            horario = Utilcmd.leerTexto("Introduce el horario: ");
            maquinasDispo = Utilcmd.leerCodigo("Introduce las maquinas disponibles:  ");
            direccion = Utilcmd.leerTexto("Introduce direccion: ");
        }
        try {
            return new Local(horario, maquinasDispo, direccion);
        } catch (Exception e) {
            return null;
        }
    }

    public boolean crear() {
        boolean bRet = false;
        Local l = pedirDatos();
        if (l == null) {
            System.out.println("No se ha creado el Local");
        } else {
            repositorio.create(l);
            System.out.println("Se ha creado el Local");
            bRet = true;
        }
        return bRet;
    }

    public void leer() {
        System.out.println(Utilcmd.imprimirLista(repositorio.read(), "Locales"));
    }

    
    public boolean actualizar() {
        int posicionNueva = Utilcmd.leerEnteroPositivo("¿De qué local quieres cambiar los datos?: ");
        boolean bRet = false;
        Local l = pedirDatos();
        if (l == null) {
            System.out.println("No se ha creado el local");
        } else {
            repositorio.update(posicionNueva, l);
            System.out.println("Se ha creado el local");
            bRet = true;
        }
        return bRet;
    }

   
    public boolean borrar() {
        int posicionLocal = Utilcmd.leerEnteroPositivo("¿De qué local quieres borrar los datos?: ");
        if (repositorio.delete(posicionLocal)) {
            System.out.println("Se ha borrado el local");
            return true;
        } else {
            System.out.println("No se ha borrado el local");
            return false;
        }
    }

   
    public boolean buscar() {
        Boolean bRet = false;
        Local localBuscado = pedirDatos();
        Local localEncontrado = repositorio.search(localBuscado);
        if (localEncontrado == null) {
            System.out.println("No se ha encontrado el local: " + localBuscado);
        } else {
            System.out.println("Coincide con este local: " + localEncontrado);
            bRet = true;
        }
        return bRet;
    }

   
    public boolean buscarTodo() {
        Boolean bRet = false;
        Local localBuscado = pedirDatos();
        List<Local> localEncontrados = repositorio.searchAll(localBuscado);
        if (localEncontrados.isEmpty()) {
            System.out.println("No se ha encontrado el local: " + localBuscado);
        } else {
            System.out.println(Utilcmd.imprimirLista(localEncontrados, "Locales encontrados"));
            bRet = true;
        }
        return bRet;
    }

   
    public void bucle() {
        boolean salir = false;

        int opcion;
        while (!salir) { 
            System.out.println("[1] Create local.");
            System.out.println("[2] Read local list.");
            System.out.println("[3] Update local list.");
            System.out.println("[4] Delete local.");
            System.out.println("[5] Search local (first one that appears).");
            System.out.println("[6] Search local (List with all of them).");
            System.out.println("[0] Return to menu");
            opcion = Utilcmd.leerCodigo("Choose an option: ");

            switch (opcion) {
                case 1:
                    crear();
                    break;
                case 2:
                    leer();
                    break;
                case 3:
                    actualizar();
                    break;
                case 4:
                    borrar();
                    break;
                case 5:
                    buscar();
                    break;
                case 6:
                    buscarTodo();
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("La opción introducida no existe");
            }
        }

    }
}
