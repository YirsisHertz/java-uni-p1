package views;

import java.util.Scanner;

import controllers.Calificaciones;

public class Calificar {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa tu calificación por favor: ");

		float nota = 0;

		try {
			nota = scanner.nextFloat();
		} catch (Exception e) {
			System.err.println("Seleccion invalida, intente más tarde");
			System.exit(0);
		}

		Calificaciones cal = new Calificaciones(nota);
		String aprobar = cal.getCalificacion();

		System.out.println(aprobar);

	}

}
