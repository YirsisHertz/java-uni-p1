package ejercicio3;

import java.util.Scanner;

import controllers.Datos;

/**
 * @author Yirsis Serrano
 *
 */
public class EjercicioPersonas {
	public static void main(String[] args) {
		Datos datos = new Datos();

		for (int i = 1; i <= 10; i++) {
			datos.setDatos(new Scanner(System.in), i);
			System.out.println(datos.getDatos());
			System.gc();

		}

		System.out.println("Fin del programa...");
	}
}
