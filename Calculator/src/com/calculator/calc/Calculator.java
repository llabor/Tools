package com.calculator.calc;

/**
 * @author Ezequiel Llarena Borges
 * @version 1.0
 * @since jan 2018 
 * */

 // Arithmetical calculator
public class Calculator {

	private double memorySize; // Unit: Gigabytes
	private boolean standard; // true = Standard; false = Cientific
	
	/**
	 * @param primer operando 
	 * @param segundo operando
	 * @return suma de operandos
	 */
	public long suma(int oper1, int oper2) {
		long total = oper1 + oper2;
		return total;
	}
	
	/**
	 * @param oper1
	 * @param oper2
	 * @return
	 */
	public long resta(int oper1, int oper2) {
		return oper1 - oper2;
	}
	
	/**
	 * @param oper1
	 * @param oper2
	 * @return
	 */
	public double divide(float oper1, float oper2) {
		return oper1  / oper2;
	}
	
	/**
	 * @param oper1
	 * @param oper2
	 * @return
	 */
	public long producto(int oper1, int oper2) {
		return oper1 * oper2;
	}
}
