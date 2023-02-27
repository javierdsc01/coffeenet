package CoffeeNET.personal.model;

import java.io.Serializable;

/**
 *
 * @author mario
 */
public class Personal implements Serializable {

    private int id;
    private String tipo;
    private String nombre;
    private String password;

    //Constructor con contraseña
    public Personal(int id, String tipo, String nombre, String password) {
        this.id = id;
        this.tipo = tipo;
        this.nombre = nombre;
        this.password = password;
    }

    //Constructor sin contraseña
    public Personal( int id, String tipo, String nombre) {
        this.id = id;
        this.tipo = tipo;
        this.nombre = nombre;
    }

    //Contructor iniciar sesión
    public Personal(String tipo, String nombre, String password) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.password = password;
    }

    public boolean equals(Object p){
        Personal nP = (Personal) p;
        if (this.id == nP.getId() || this.tipo.equals(nP.getTipo()) 
        || this.nombre.equals(nP.getNombre())
        || this.password.equals(nP.getPassword())){
            return true;
        } else { 
            return false;
        }
    }  
    
    public boolean equalsPassword(Object p) {
        Personal nP = (Personal) p;
        if (this.id == nP.getId() && this.tipo.equals(nP.getTipo()) 
        && this.nombre.equals(nP.getNombre())){
            return true;
        } else { 
            return false;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setContraseña(String contraseña) {
        this.password = password;
    }

//Otorga un tipo y nombre al personal
    public String toString() {
        String sRet = "Personal: ";
        sRet += "Id: " + id + "\n";
        sRet += "Tipo: " + tipo + "\n";
        sRet += "Nombre: " + nombre + "\n";
        return sRet;
    }

//Otorga un tipo y nombre al personal
    public String toStringPassword() {
        String sRet = "Personal: ";
        sRet += "Id: " + id + "\n";
        sRet += "Tipo: " + tipo + "\n";
        sRet += "Nombre: " + nombre + "\n";
        sRet += "Contraseña: " + password + "\n";
        return sRet;
    }
}
