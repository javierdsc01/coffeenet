package CoffeeNET.camarero.model;

import java.io.Serializable;

public class Camarero implements Serializable {

    private int id;
    private String nombre;
    private String rango;
    private String password;

    public Camarero(int id, String nombre, String rango, String password) {
        this.id = id;
        this.nombre = nombre;
        this.rango = rango;
        this.password = password;
    }

    //Constructor iniciar sesion
    public Camarero(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }

    public boolean equals(Object c){
        Camarero nC = (Camarero) c;
        if(this.id == nC.getId() || this.nombre.equals(nC.getNombre()) || 
                this.rango.equals(nC.getRango()) || this.password.equals(nC.getPassword())){
            return true;
        } else { 
            return false;
        }
    }

    public boolean equalsIniciarSesion(Object c){
        Camarero nC = (Camarero) c;
        if(this.nombre.equals(nC.getNombre()) || this.password.equals(nC.getPassword())){
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getPassword() {
        return password;
    }

    public void setContraseña(String password) {
        this.password = password;
    }

    public String toString() {
        String sRet = "";
        sRet += "Camarero: \n";
        sRet += "Id: " + id + ".\n";
        sRet += "Nombre: " + nombre + ".\n";
        sRet += "Rango: " + rango + ".\n";
        sRet += "Contraseña: " + password + ".\n";
        return sRet;
    }
}
