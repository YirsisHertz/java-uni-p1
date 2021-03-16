package ejercicio5;

import java.util.Scanner;

import controllers.Value;

public class Juego {
	private static final Scanner SCANNER = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Escoge una opción (1: Sol, 2: Aguila): ");
		int select = 0;

		try {

			select = SCANNER.nextInt() - 1;

		} catch (Exception err) {
			System.out.println("Opcion no valida, intenta mas tarde");
			System.exit(0);
		}

		Value valor = new Value();

		int actual = valor.getVolado();

		if (actual == select) {
			System.out.println("Ganaste");
		} else {
			System.out.println("Perdiste");
		}

	}

}
