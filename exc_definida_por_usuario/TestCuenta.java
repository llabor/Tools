package exc_definida_por_usuario;

public class TestCuenta {

	public static void main(String[] args) {
		
		Cuenta c = new Cuenta(123456, 100);
		
		try {
			c.retirar(120);
		} catch(NumerosRojos e) {
			System.out.println("Saldo insuficiente. Exceso: " + e.getCantidad() + "€");
		}
		System.out.println("La ejecución del programa continua...");
	}
}
