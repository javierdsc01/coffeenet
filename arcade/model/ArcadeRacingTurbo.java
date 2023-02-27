package CoffeeNET.arcade.model;

import java.io.Serializable;

public class ArcadeRacingTurbo extends Arcade implements Serializable{

    private String coche;

    public ArcadeRacingTurbo(String name, String description, int players, int points, String modeSelect) {
        super(name, description, players, points);
        this.coche = coche;
    }

    public String toString() {
        String sRet = "";
        sRet += "Arcade: "; 
        sRet += "Coches: " + coche;
        return sRet;
    }
}
