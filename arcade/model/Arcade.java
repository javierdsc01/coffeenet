package CoffeeNET.arcade.model;

import java.io.Serializable;

public class Arcade implements Serializable {

    protected String name;
    protected String description;
    protected int players;
    protected int points;

    public Arcade(String name, String description, int players, int points) {
        this.name = name;
        this.description = description;
        this.players = players;
        this.points = points;
    }

    public boolean equals(Object a){
        Arcade nC = (Arcade) a;
        if (this.name.equals(nC.getName())|| 
            this.description.equals(nC.getDescription()) || 
            this.players == nC.getPlayers() ||this.points == nC.getPoints()){
            return true;
        } else { 
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String toString() {
        String sRet = "";
        sRet += "Arcade: \n";
        sRet += "Nombre: " + name + ".\n";
        sRet += "Descripción: " + description + ".\n";
        sRet += "Nº de jugadores: " + players + ".\n";
        sRet += "Puntos que vas a gastar: " + points + ".\n";
        return sRet;
    }
}
