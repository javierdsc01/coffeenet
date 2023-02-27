package CoffeeNET.arcade.model;

import java.io.Serializable;

public class ArcadeGoshScape extends Arcade implements Serializable{

    private String map;

    public ArcadeGoshScape(String name, String description, int players, int points, String map) {
        super(name, description, players, points);
        if(comprobarMapa(map)){
            this.map = map;
        } else this.map = "Otro";
    }

    public static boolean comprobarMapa(String map) {
        boolean bRet = false;
        if(map == "Espacio" || map == "Jungla" || map == "Templo" || 
            map == "Ciudad"){
            bRet = true;
	}else {
            System.out.println("Error");
	}
            return bRet;
	}

    public String toString() {
        String sRet = "";
        sRet += "Arcade: "; 
        sRet += "Mapa: " + map;
        return sRet;
    }
}
