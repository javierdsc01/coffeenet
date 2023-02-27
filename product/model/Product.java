package CoffeeNET.product.model;

import java.io.Serializable;

public class Product implements Serializable{

    private String type;
    private String name;
    private double price;
    private int points;

    public Product(String type, String name, double price, int points) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.points = points;
    }

public boolean equals(Object a){

        Product nC = (Product) a;
        if (this.type.equals(nC.getType())|| this.name.equals(nC.getName())|| 
            this.price == nC.getPrice() ||this.points == nC.getPoints()){
            return true;
        } else { 
            return false;
        }
}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String toString() {
        String sRet = "Productos: ";
        sRet += " \nTipo: " + type;
        sRet += " \nNombre: " + name;
        sRet += " \nPrecio: " + price;
        sRet += " \nPuntos: " + points;
        return sRet;
    }
}
