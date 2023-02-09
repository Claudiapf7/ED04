package cuentas;

/**
 * clase CCuenta con atributos privados, metodos funcionales y setters/getters
 * los metodos de esta clase se usan des de la clase main de este proyecto
 * @author Claudia Pol Ferrer
 *
 */


public class CCuenta {

/**
 * atributos de la clase CCuenta
 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * constructor sin parámetros
     */
    public CCuenta()
    {
    	
    }
    
   /**
    * constructor con 4 parametros, se inicializan 3 de ellos
    * @param nom, introducimos el nombre
    * @param cue, cuenta
    * @param sal, el saldo de la cuenta
    * @param tipo, tipo de interes
    */
     

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        
    }
   
    /**
     * nos devuelve el saldo de la cuenta
     * @return saldo de la cuenta
     */
    public double estado()
    {
        return saldo;
       
    }
  /**
   * metodo para ingresar una cantidad a la cuenta
   * @param cantidad
   * @throws Exception en caso de ingresar una cantidad negativa
   */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    /**
     * metodo para retirar una cantidad de la cuenta
     * @param cantidad
     * @throws Exception si no hay suficiente saldo o se quiere retirar 
     * una cantidad negativa
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
   
    /**
     * getter de nombre
     * @return nombre
     */

	public String getNombre() {
		return nombre;
	}
	/**
	 * setter para nombre
	 * @param nombre
	 */

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * getter de cuenta
	 * @return cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * setter de cuenta
	 * @param cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/**
	 * getter de saldo
	 * @return saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * setter de saldo
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 * getter de tipo de interes
	 * @return tipo de interés
	 * 
	 */

	public double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * setter de tipo de interes
	 * @param tipoInterés
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
