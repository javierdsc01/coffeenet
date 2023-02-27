/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoffeeNET.arcade.view;

import CoffeeNET.arcade.model.Arcade;
import CoffeeNET.arcade.model.ArcadeBlockTower;
import CoffeeNET.arcade.model.ArcadeGoshScape;
import CoffeeNET.arcade.model.ArcadeRacingTurbo;
import CoffeeNET.arcade.model.ArcadeStarFighter;
import CoffeeNET.arcade.model.IRepoArcade;
import CoffeeNET.common.view.Utilcmd;

/**
 *
 * @author Javier
 */
public class VArcadeCrear {
    
    private IRepoArcade repositorio;

    public VArcadeCrear(IRepoArcade repositorio) {
        this.repositorio = repositorio;
    }

    /**
    * Pide un dato de arcade hasta que es correcto
    * (Para String = string.isEmpty(); para cuando está vacío)
    * @return Vehiculo El vehiculo de los que obtenemos los datos.
    */  
    public Arcade pedirDatos() { 

        String sName = "";
        while (sName.equals("")){
            sName = Utilcmd.leerTexto("Introduce el nombre: ");
        }       

        String sDescription = "";
        while (sDescription.equals("")){
            sDescription = Utilcmd.leerTexto("Introduce una breve descripcion: ");
        }  

        int iPlayers = -1;
        while (iPlayers < 0) {
            iPlayers = Utilcmd.leerCodigo("Introduce el número de jugadores: ");
        } 

        int iPoints = -1;
        while (iPoints < 0) {
            iPoints = Utilcmd.leerCodigo("Introduce el coste de puntos: ");
        } 


        try {
            return new Arcade(sName, sDescription, iPlayers, iPoints);
        } catch (Exception e) {
            return null;
        }
    }

    /**
    * BlockTower
    * (Para String = string.isEmpty(); para cuando está vacío)
    * @return Vehiculo El vehiculo de los que obtenemos los datos.
    */  
    public Arcade pedirDatosBlockTower() { 

        String sName = "";
        while (sName.equals("")){
            sName = Utilcmd.leerTexto("Introduce el nombre: ");
        }       

        String sDescription = "";
        while (sDescription.equals("")){
            sDescription = Utilcmd.leerTexto("Introduce una breve descripcion: ");
        }  

        int iPlayers = -1;
        while (iPlayers < 0) {
            iPlayers = Utilcmd.leerCodigo("Introduce el número de jugadores: ");
        } 

        int iPoints = -1;
        while (iPoints < 0) {
            iPoints = Utilcmd.leerCodigo("Introduce el coste de puntos: ");
        } 

        String sModeSelect = "";
        while (sDescription.equals("")){
            sDescription = Utilcmd.leerTexto("Introduce un modo de juego: ");
        }  

        try {
            return new ArcadeBlockTower(sName, sDescription, iPlayers, iPoints, sModeSelect);
        } catch (Exception e) {
            return null;
        }
    }


    /**
    * GoshShape
    * (Para String = string.isEmpty(); para cuando está vacío)
    * @return Vehiculo El vehiculo de los que obtenemos los datos.
    */  
    public Arcade pedirDatosGoshScape() { 

        String sName = "";
        while (sName.equals("")){
            sName = Utilcmd.leerTexto("Introduce el nombre: ");
        }       

        String sDescription = "";
        while (sDescription.equals("")){
            sDescription = Utilcmd.leerTexto("Introduce una breve descripcion: ");
        }  

        int iPlayers = -1;
        while (iPlayers < 0) {
            iPlayers = Utilcmd.leerCodigo("Introduce el número de jugadores: ");
        } 

        int iPoints = -1;
        while (iPoints < 0) {
            iPoints = Utilcmd.leerCodigo("Introduce el coste de puntos: ");
        } 

        String sMap = "";
        while (sDescription.equals("")){
            sDescription = Utilcmd.leerTexto("Introduce un mapa: ");
        }  

        try {
            return new ArcadeGoshScape(sName, sDescription, iPlayers, iPoints, sMap);
        } catch (Exception e) {
            return null;
        }
    }

    /**
    * RacingTurbo
    * (Para String = string.isEmpty(); para cuando está vacío)
    * @return Vehiculo El vehiculo de los que obtenemos los datos.
    */  
    public Arcade pedirDatosRacingTurbo() { 

        String sName = "";
        while (sName.equals("")){
            sName = Utilcmd.leerTexto("Introduce el nombre: ");
        }       

        String sDescription = "";
        while (sDescription.equals("")){
            sDescription = Utilcmd.leerTexto("Introduce una breve descripcion: ");
        }  

        int iPlayers = -1;
        while (iPlayers < 0) {
            iPlayers = Utilcmd.leerCodigo("Introduce el número de jugadores: ");
        } 

        int iPoints = -1;
        while (iPoints < 0) {
            iPoints = Utilcmd.leerCodigo("Introduce el coste de puntos: ");
        } 

        String sCoche = "";
        while (sDescription.equals("")){
            sDescription = Utilcmd.leerTexto("Introduce un coche: ");
        }  

        try {
            return new ArcadeRacingTurbo(sName, sDescription, iPlayers, iPoints, sCoche);
        } catch (Exception e) {
            return null;
        }
    }

    /**
    * StarFighter
    * (Para String = string.isEmpty(); para cuando está vacío)
    * @return Vehiculo El vehiculo de los que obtenemos los datos.
    */  
    public Arcade pedirDatosStarFighter() { 

        String sName = "";
        while (sName.equals("")){
            sName = Utilcmd.leerTexto("Introduce el nombre: ");
        }       

        String sDescription = "";
        while (sDescription.equals("")){
            sDescription = Utilcmd.leerTexto("Introduce una breve descripcion: ");
        }  

        int iPlayers = -1;
        while (iPlayers < 0) {
            iPlayers = Utilcmd.leerCodigo("Introduce el número de jugadores: ");
        } 

        int iPoints = -1;
        while (iPoints < 0) {
            iPoints = Utilcmd.leerCodigo("Introduce el coste de puntos: ");
        } 

        String sCampeon = "";
        while (sDescription.equals("")){
            sDescription = Utilcmd.leerTexto("Introduce un coche: ");
        }  

        try {
            return new ArcadeStarFighter(sName, sDescription, iPlayers, iPoints, sCampeon);
        } catch (Exception e) {
            return null;
        }
    }

    /**
    * Crea un vehiculo (Create)
    * @return Boolean
    */  
    public boolean crear() {
        boolean bRet = false;
        Arcade a = pedirDatos();
        if (a == null) {
            System.out.println("No se ha creado el arcade");
        } else {
            repositorio.create(a);
            System.out.println("Se ha creado el arcade");
            bRet = true;
        }
        return bRet;
    }

    /**
    * Crea un vehiculo (Create)
    * @return Boolean
    */  
    public boolean crearBlockTower() {
        boolean bRet = false;
        Arcade a = pedirDatosBlockTower();
        if (a == null) {
            System.out.println("No se ha creado el arcade");
        } else {
            repositorio.create(a);
            System.out.println("Se ha creado el arcade");
            bRet = true;
        }
        return bRet;
    }

    /**
    * Crea un vehiculo (Create)
    * @return Boolean
    */  
    public boolean crearGoshScape() {
        boolean bRet = false;
        Arcade a = pedirDatosGoshScape();
        if (a == null) {
            System.out.println("No se ha creado el arcade");
        } else {
            repositorio.create(a);
            System.out.println("Se ha creado el arcade");
            bRet = true;
        }
        return bRet;
    }

    /**
    * Crea un vehiculo (Create)
    * @return Boolean
    */  
    public boolean crearRacingTurbo() {
        boolean bRet = false;
        Arcade a = pedirDatosRacingTurbo();
        if (a == null) {
            System.out.println("No se ha creado el arcade");
        } else {
            repositorio.create(a);
            System.out.println("Se ha creado el arcade");
            bRet = true;
        }
        return bRet;
    }

    /**
    * Crea un vehiculo (Create)
    * @return Boolean
    */  
    public boolean crearStarFighter() {
        boolean bRet = false;
        Arcade a = pedirDatosStarFighter();
        if (a == null) {
            System.out.println("No se ha creado el arcade");
        } else {
            repositorio.create(a);
            System.out.println("Se ha creado el arcade");
            bRet = true;
        }
        return bRet;
    }

    /**
     * Crea un bucle para que al hacer una opción no se termine ahí
     */
    public void bucleCrear() {
        boolean salir = false;
        int opcion;
        while (!salir) {
            System.out.println("¿Qué tipo de Arcade quieres crear?");
            System.out.println("[1] Arcade general");
            System.out.println("[2] Arcade Block Tower");
            System.out.println("[3] Arcade Gosh Scape");
            System.out.println("[4] Arcade Racing Turbo");
            System.out.println("[5] Arcade Star Fighter");
            System.out.println("[0] Return");
            opcion = Utilcmd.leerCodigo("Elige una opción: ");

            switch (opcion) {
                case 1:
                    crear();
                    break;
                case 2:
                    crearBlockTower();
                    break;
                case 3:
                    crearGoshScape();
                    break;
                case 4:
                    crearRacingTurbo();
                    break;
                case 5:
                    crearStarFighter();
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("La opción introducida no existe");
            }
        }
    }
}
