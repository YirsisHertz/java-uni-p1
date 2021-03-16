package ejercicio1;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {

		int numeros[] = new int[5];
		float resultado;

		Scanner scanner = new Scanner(System.in);

		try {

			for (int i = 0; i < 5; i++) {
				System.out.print("Ingresa el valor #" + (i + 1) + ": ");
				numeros[i] = scanner.nextInt();
				System.gc();
			}

			resultado = numeros[0] * numeros[1];

			for (int i = 2; i < numeros.length; i++) {

				resultado *= numeros[i];
				System.gc();

			}

			resultado = resultado / 2;
			resultado += 500;
			resultado *= 0.5;

			System.out.println(resultado);

		} catch (Exception e) {
			System.err.println("Opcion invalida, intenta más tarde...");
		}
	}

}
