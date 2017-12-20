package exc_definida_por_usuario;
/*
 * Excepción definida y lanzada por el programador
 * La clase NumerosRojos hereda de la clase Exception
 * y permite lanzarla desde cualquier otra clase
 */
public class NumerosRojos extends Exception {
	
	private double cantidad;
	
	public NumerosRojos(double c) {
		this.cantidad = c;
	}
	
	public double getCantidad() {
		return cantidad;
	}
}
