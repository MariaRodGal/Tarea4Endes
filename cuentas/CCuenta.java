package cuentas;
public class CCuenta {

	/**
	 * @param nombre  the name of the proprietary of the "cuenta"
	 * @param cuenta the id of the "cuenta"
	 * @param saldo the amount of money in the "cuenta"
	 * @param tipoInterés
	 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
	 * generic constructor
	 */
    public CCuenta()
    {
    }

    /**
	 * @return saldo return the actual saldo in cuenta1
	 */
    public double estado()
    {
        return saldo;
    }

    /**
	 * @param cantidad to be introduced in cuenta1 as saldo
	 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
	 * @param cantidad get the cantidad from cuenta1, being the maximum the estado() result
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
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * @param cuenta the cuenta to set
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the tipoInterés
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * @param tipoInterés the tipoInterés to set
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
    
    
}
