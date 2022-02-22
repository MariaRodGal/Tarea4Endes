package cuentas;
public class Main {

	/**
	 * main method for look of the actual amount in cuenta1, retirar 2300 and ingresar 695
	 */
    public static void main(String[] args) {
        double saldoActual;
        CCuenta cuenta1 = operativa_cuenta(2500);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

	/**
	 * @return CCuenta with values:
	 * @param nombre  Antonio López
	 * @param cuenta 1000-2365-85-1230456789
	 * @param saldo 2500
	 * @param tipoInterés 0
	 */
	private static CCuenta operativa_cuenta(float cantidad) {
		CCuenta cuenta1;
        cuenta1 = new CCuenta();
        cuenta1.setCuenta("1000-2365-85-1230456789");
        cuenta1.setNombre("Antonio López");
        cuenta1.setSaldo(cantidad);
        cuenta1.setTipoInterés(0);
		return cuenta1;
	}
}
