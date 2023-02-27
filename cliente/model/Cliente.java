package CoffeeNET.cliente.model;

import java.io.Serializable;

/**
* @author Rubén
*/

public class Cliente implements Serializable{

    private String nombre;
    private String apodo;
    private String sexo;
    private int puntos;
    private int edad;
    private String password;
    private boolean premium;
    
    
    /**
     * Constructor
     * @param nombre
     * @param apodo
     * @param sexo
     * @param puntos
     * @param edad
     * @param password
     */ 
    public Cliente(String nombre, String apodo, String sexo, int puntos, int edad, String password) {
        this.nombre = nombre;
        this.apodo = apodo;
        if(comprobarSexo(sexo)){
            this.sexo = sexo;
        } else {
            sexo = "Prefiero no decirlo";
        }
        this.puntos = puntos;
        this.edad = edad;
        this.password = password;
        if(comprobarPremium(puntos)){
            this.premium = true;
        } else {
            this.premium = false;
        }
    }

    /**
     * Constructor sin contraseña
     * @param nombre
     * @param apellido
     * @param apodo
     * @param sexo
     * @param puntos
     * @param edad
     */ 
    public Cliente(String nombre, String apodo, String sexo, int puntos, int edad) {
        this.nombre = nombre;
        this.apodo = apodo;
        if(comprobarSexo(sexo)){
            this.sexo = sexo;
        } else {
            sexo = "Prefiero no decirlo";
        }
        this.puntos = puntos;
        this.edad = edad;
        if(comprobarPremium(puntos)){
            this.premium = true;
        } else {
            this.premium = false;
        }
    }

    /**
     * Constructor sin puntos
     * @param nombre
     * @param apellido
     * @param apodo
     * @param sexo
     * @param edad
     * @param password
     */ 
    public Cliente(String nombre, String apodo, String sexo, int edad, String password) {
        this.nombre = nombre;
        this.apodo = apodo;
        if(comprobarSexo(sexo)){
            this.sexo = sexo;
        } else {
            sexo = "Prefiero no decirlo";
        }
        this.edad = edad;
        this.password = password;
        if(comprobarPremium(puntos)){
            this.premium = true;
        } else {
            this.premium = false;
        }
    }

    /**
     * Constructor sin puntos y sin contraseña
     * @param nombre
     * @param apellido
     * @param apodo
     * @param sexo
     * @param edad
     */
    public Cliente(String nombre, String apodo, String sexo, int edad) {
        this.nombre = nombre;
        this.apodo = apodo;
        if(comprobarSexo(sexo)){
            this.sexo = sexo;
        } else {
            sexo = "Prefiero no decirlo";
        }
        this.edad = edad;
        if(comprobarPremium(puntos)){
            this.premium = true;
        } else {
            this.premium = false;
        }
    }

    /**
     * Constructor para iniciar sesion
     * @param apodo
     * @param contraseña
     */ 
    public Cliente(String apodo, String password) {
        this.apodo = apodo;
        this.password = password;
    }
    
    public boolean equals(Object c){
        Cliente nC = (Cliente) c;
        if (this.nombre.equals(nC.getNombre()) ||
                this.apodo.equals(nC.getApodo()) ||
                this.sexo.equals(nC.getSexo()) ||
                this.puntos == nC.getPuntos() ||
                this.edad == nC.getEdad()){
            return true;
        } else { 
            return false;
        }
    }  
    
    public boolean equalsPassword(Object c) {
        Cliente nC = (Cliente) c;
        if (this.apodo.equals(nC.getApodo()) &&
                this.password.equals(nC.getPassword())){
            return true;
        } else { 
            return false;
        }
    }

    public static boolean comprobarSexo(String sexo) {
		boolean bRet = false;
		if(sexo.equals("M") || sexo.equals("m")){
                    bRet = true;
		}else if (sexo.equals("F") || sexo.equals("f")){
                    bRet = true;
		} else {
                    bRet = false;
            }
        return bRet;
    }

    public static boolean comprobarPremium(int puntos) {
		boolean bRet = false;
		if(puntos > 100){
                    bRet = true;
		} else {
                    bRet = false;
            }
        return bRet;
    }


    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public String getApodo() {
	return apodo;
    }

    public void setApodo(String apodo) {
	this.apodo = apodo;
    }

	public String getSexo() {
		return sexo;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

    /**
     * String toString();
     * @return String Devuelve los datos de cliente
     */
    public String toString() {
        String sRet = " Cliente: ";
        sRet += "\nNombre: " + nombre;
        sRet += "\nApodo: " + apodo;
        sRet += "\nSexo: " + sexo;
        sRet += "\nPuntos: " + puntos;
        sRet += "\nEdad: " + edad;
        sRet += "\nPremium: " + premium;
        return sRet;
    }

    /**
     * String toStringPassword();
     * @return String Devuelve los datos de cliente
     */
    public String toStringPassword() {
        String sRet = " Cliente: ";
        sRet += "\n Nombre: " + nombre;
        sRet += "\n Apodo: " + apodo;
        sRet += "\n Sexo: " + sexo;
        sRet += "\n Puntos: " + puntos;
        sRet += "\n Edad: " + edad;
        sRet += "\n Contraseña: " + password;
        sRet += "\n Premium: " + premium;
        return sRet;
    }
}
