/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CoffeeNET.common.view;

import CoffeeNET.arcade.model.RepoArcadeFile;
import CoffeeNET.arcade.model.IRepoArcade;
import CoffeeNET.arcade.view.VArcade;

import CoffeeNET.camarero.model.IRepoCamarero;
import CoffeeNET.camarero.model.RepoCamareroFile;
import CoffeeNET.camarero.view.VCamarero;

import CoffeeNET.cliente.model.IRepoCliente;
import CoffeeNET.cliente.model.RepoClienteFile;
import CoffeeNET.cliente.view.VCliente;

import CoffeeNET.local.model.RepoLocal;
import CoffeeNET.local.model.IRepoLocal;
import CoffeeNET.local.view.VLocal;

import CoffeeNET.personal.model.RepoPersonal;
import CoffeeNET.personal.model.IRepoPersonal;
import CoffeeNET.personal.view.VPersonal;

import CoffeeNET.product.model.RepoProductFile;
import CoffeeNET.product.model.IRepoProduct;
import CoffeeNET.product.view.VProduct;

/**
 *
 * @author Javier
 */
public class Main {

    private IRepoArcade repoArcade;
    private VArcade vArcade;

    private IRepoCamarero repoCamarero;
    private VCamarero vCamarero;

    private IRepoCliente repoCliente;
    private VCliente vCliente;
    
    private IRepoLocal repoLocal;
    private VLocal vLocal;

    private IRepoPersonal repoPersonal;
    private VPersonal vPersonal;

    private IRepoProduct repoProduct;
    private VProduct vProduct;

    private String passwordMain;

    public String getPasswordMain() {
        return passwordMain;
    }

    public void setPasswordMain(String passwordMain) {
        this.passwordMain = passwordMain;
    }

    public boolean coincidirPasswordMain(){
        boolean bRet = false;
        passwordMain = "password2022";
        if(passwordMain.equals(Utilcmd.leerTexto("Introduce la contraseña: "))){
            System.out.println("Has entrado con exito");
            bRet = true;
        }
        return bRet;
    }

    /** 
    * Constructor
    */
    public Main() {
        repoArcade = new RepoArcadeFile();
        vArcade = new VArcade(repoArcade);

        repoCamarero = new RepoCamareroFile();
        vCamarero = new VCamarero(repoCamarero);

        repoCliente = new RepoClienteFile();
        vCliente = new VCliente(repoCliente);

        repoLocal = new RepoLocal();
        vLocal = new VLocal(repoLocal);

        repoPersonal = new RepoPersonal();
        vPersonal = new VPersonal(repoPersonal);

        repoProduct = new RepoProductFile();
        vProduct = new VProduct(repoProduct);
    }

    /** 
     * Menú general
     */
    public void buclePrincipal(){
    System.out.println("¡Bienvenido a la demo de CoffeeNET!");
    if(coincidirPasswordMain()){
        boolean salir = false;
        int opcion;
        while (!salir) {
            System.out.println("[1] Menu de Arcade");
            System.out.println("[2] Menu de Camarero");
            System.out.println("[3] Menu de Cliente");
            System.out.println("[4] Menu de Local");
            System.out.println("[5] Menu de Personal");
            System.out.println("[6] Menu de Productos (Carta)");
            System.out.println("[0] Salir.");
            opcion = Utilcmd.leerCodigo("Elige una opcion: ");

            switch(opcion) {
                case 1:
                    vArcade.bucle();
                    break;
                case 2:
                    vCamarero.bucle();
                    break;
                case 3:
                    vCliente.bucle();
                    break;
                case 4:
                    vLocal.bucle();
                    break;
                case 5:
                    vPersonal.bucle();
                    break;
                case 6:
                    vProduct.bucle();
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("La opción introducida no existe");
            }
        }
    } else {
      System.out.println("Error. Inténtalo de nuevo");
    } 
    }
    

    /** 
    * Metodo main
    * @param arg Metodo main
    */
    public static void main(String[] arg){
        Main main = new Main();
        main.buclePrincipal();
    }
}
