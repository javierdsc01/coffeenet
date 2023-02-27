package CoffeeNET.local.model;

import java.io.Serializable;

public class Local implements Serializable{

    String horarios;
    int maquinasDispo;
    String direccion;

    public boolean equalsEvery(Object l) {
       

        Local nL = (Local) l;
        if (this.horarios.equals(nL.getHorarios())
                || this.maquinasDispo == nL.getMaquinasDispo()
                || this.direccion.equals(nL.getDireccion())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equals(Object l) {
        Local nL = (Local) l;
       if (this.horarios.equals(nL.getHorarios())
                && this.maquinasDispo == nL.getMaquinasDispo()
                && this.direccion.equals(nL.getDireccion())) {
            return true;
        } else {
            return false;
        }
    }

    public Local(String horarios, int maquinasDispo, String direccion) {
        this.horarios = horarios;
        this.maquinasDispo = maquinasDispo;
        this.direccion = direccion;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public void setMaquinasDispo(int maquinasDispo) {
        this.maquinasDispo = maquinasDispo;
    }

    public int getMaquinasDispo() {
        return maquinasDispo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String toString() {
        return "Horarios :" + horarios + "\n Maquinas Disponibles " + maquinasDispo
                + "\n Dirección: " + direccion;
    }
}
