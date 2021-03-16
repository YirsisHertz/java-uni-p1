package controllers;

import java.util.Scanner;

/**
 * @author Yirsis Serrano
 *
 */
public class Datos {

	private String nombre;
	private Integer edad;

	/**
	 * @param datos -> Objeto Scanner para capturar dato
	 * @param i     -> Indice o ID
	 */
	public void setDatos(Scanner datos, int i) {
		try {
			System.out.print("Ingresa el Nombre #" + i + ": ");
			nombre = datos.nextLine();

			System.out.print("Ingresa la Edad #" + i + ": ");
			edad = datos.nextInt();

		} catch (Exception e) {
			System.out.println("Algo salio mal, intentalo mas tarde");
			System.exit(0);
		}
	}

	/**
	 * @return Mensaje -> nombre + " tiene " + edad + " años de edad."
	 */
	public String getDatos() {
		return nombre + " tiene " + edad + " años de edad.";
	}

}
