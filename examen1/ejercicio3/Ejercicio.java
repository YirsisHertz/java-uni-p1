package ejercicio3;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {

		try {
			float opcion[] = new float[2];
			Scanner scanner = new Scanner(System.in);

			for (int i = 0; i < 2; i++) {
				System.out.print("Ingresa el valor #" + (i + 1) + ": ");
				opcion[i] = scanner.nextFloat();
			}

			float mayor = (opcion[0] > opcion[1]) ? opcion[0] : opcion[1];
			System.out.println("El valor mayor es " + mayor);

		} catch (Exception e) {
			System.err.println("Valor invalido, intenta más tarde...");
		}

	}

}
