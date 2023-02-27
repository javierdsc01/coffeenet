package CoffeeNET.arcade.model;

import java.io.Serializable;

public class ArcadeBlockTower extends Arcade implements Serializable{

    private String modeSelect;

    public ArcadeBlockTower(String name, String description, int players, int points, String modeSelect) {
        super(name, description, players, points);
        if(comprobarModo(modeSelect)){
            this.modeSelect = modeSelect;
        } else this.modeSelect = "Otro";
    }

    public static boolean comprobarModo(String modeSelect) {
        boolean bRet = false;
        if(modeSelect == "Battle Royale" || modeSelect == "Fast & Furious" || 
            modeSelect == "2 Players" || modeSelect == "Wild Rift"){
            bRet = true;
	}
            return bRet;
	}

    public String toString() {
        String sRet = "";
        sRet += "Arcade: "; 
        sRet += "Modo elegido: " + modeSelect;
        return sRet;
    }
}
