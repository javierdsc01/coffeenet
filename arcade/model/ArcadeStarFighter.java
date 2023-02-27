package CoffeeNET.arcade.model;

import java.io.Serializable;

public class ArcadeStarFighter extends Arcade implements Serializable {

    private String campeon;

    public ArcadeStarFighter(String name, String description, int players, int points, String campeon) {
        super(name, description, players, points);
        this.campeon = campeon;
    }

    public String toString() {
        String sRet = "";
        sRet += "Arcade: "; 
        sRet += "Campeones: " + campeon;
        return sRet;
    }
}
