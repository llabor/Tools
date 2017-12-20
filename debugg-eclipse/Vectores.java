package vectores_sin_clases;

import java.util.Scanner;

public class Vectores_sin_clases {
    
	public static void main(String[] args) {
		int[] array = new int[5];
		Scanner scanner = new Scanner(System.in);

		insertarDatosArray(array, scanner);
		sumarArray(array);
		int max = maxArray(array);
		System.out.println("Max= " + max);

		double promedio = promedioArray(array);
		System.out.println("Promedio= " + promedio);

	}

	private static void insertarDatosArray(int[] array, Scanner scanner) {
		for (int i = 0; i < array.length; i++) {
			System.out.print("insertar array[" + i + "]:");
			array[i] = scanner.nextInt();
		}

	}

	private static void sumarArray(int[] array) {
		System.out.print("Suma: ");
		int acumulador = 0;
		for (int i = 0; i < array.length; i++) {
			acumulador = acumulador + array[i];
			System.out.print("+" + array[i]);
		}
		System.out.println("= " + acumulador);
	}

	private static int maxArray(int[] array) {
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	private static double promedioArray(int[] array) {
		double promedio = 0;
		for (int i = 0; i < array.length; i++) {
			promedio = promedio + array[i];
		}
		promedio = promedio / array.length;
		return promedio;

	}
    }
