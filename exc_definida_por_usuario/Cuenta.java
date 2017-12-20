package exc_definida_por_usuario;

public class Cuenta {

	private double saldo;
	private int numeroCuenta;
	
	public Cuenta(int num, double saldo){
		this.numeroCuenta = num;
		this.saldo = saldo;
	}
	
	public void ingresar(double cantidad){
		this.saldo += cantidad;
	}
	
	// Método que lanza la excepción NumerosRojos si el 
	// saldo es menor que la cantidad que se intenta retirar
	public void retirar(double cantidad) throws NumerosRojos {
		if(cantidad > this.saldo){
			double rojos = cantidad - this.saldo;
			throw new NumerosRojos(rojos);
		} else {
			this.saldo -= cantidad;
		}
	}
	
	public int getNumeroCuenta(){
		return numeroCuenta;
	}
}
