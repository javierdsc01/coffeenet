package CoffeeNET.common.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * @author Javier
 */
public class Utilcmd {
	
    /**
    * Lee el mensaje que mandamos y lo transforma a texto
    * @param mensaje Imprime el motivo por el que queremos meter texto
    * @return String Devuelve el c�digo con el int ya cambiado
    */
	public static String leerTexto(String mensaje) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sRet = null;
		try {
            System.out.print(mensaje);
			String entrada = br.readLine();
			sRet = entrada;
		} catch (IOException e) {
			System.out.println("Error de IO");
        } catch (NumberFormatException e) {
            System.out.println("Error de formato de número");
		}
		return sRet;
	}
	

    /**
    * Lee el mensaje que mandamos y lo introduce como c�digo (transforma el int a String) pero positivo
    * @param mensaje Lo necesitamos para introducir el mensaje, si no no hace nada
    * @return String Devuelve el c�digo con el int ya cambiado
    */
    public static int leerEnteroPositivo(String mensaje) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iRet = -1;
        try {
            System.out.print(mensaje);
            String entrada = br.readLine();
            iRet = Integer.parseUnsignedInt(entrada);
        } catch (IOException e) {
            System.out.println("Error de IO");
        } catch (NumberFormatException e) {
            System.out.println("Error de formato de n�mero");
        }
        return iRet;
    }


    /**
    * Lee el mensaje que mandamos y lo introduce como c�digo (transforma el int a String)
    * @param mensaje Lo necesitamos para introducir el mensaje, si no no hace nada
    * @return String Devuelve el código con el int ya cambiado
    */
    public static int leerCodigo(String mensaje) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iRet = -1;
        try {
            System.out.print(mensaje);
            String entrada = br.readLine();
            iRet = Integer.parseInt(entrada);
        } catch (IOException e) {
            System.out.println("Error de IO");
        } catch (NumberFormatException e) {
            System.out.println("Error de formato de número");
        }
        return iRet;
    }

    /** 
    * Imprime una lista
    * @param l Elegimos una de las listas disponibles que acabaran siendo impresas
    * @return String Devuelve los elementos disponibles
    */
    public static String imprimirLista(List l, String mensaje) {
        String listado = "--------- " + mensaje + " ---------\n";
        for (int i = 0; i < l.size(); ++i) {
            listado += i + ".\n";
            listado += l.get(i);
            listado += "\n";
        }
        listado += "\n------- Fin " + mensaje + " -------\n";
        return listado;
    }
}
