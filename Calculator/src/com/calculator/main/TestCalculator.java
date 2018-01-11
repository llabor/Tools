/**
 * @author Ezequiel Llarena Borges
 * @version 1.0
 * @since jan 2018 
 * */
package com.calculator.main;

import java.util.Scanner;
import com.calculator.calc.Calculator;

public class TestCalculator {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		double result = 0;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Type an option: ");
		String option = keyboard.next();
		switch (option){
			case "1": result = calc.suma(5, 8);
					  break;
			case "2": result = calc.resta(5, 8);
			  		  break;
			case "3": result = calc.divide(5, 8);
			  		  break;
			case "4": result = calc.producto(5, 8);
			  		  break;
			default: System.out.println("Option not valid!");
		}
		System.out.println("Result = " + result);
	}
}
