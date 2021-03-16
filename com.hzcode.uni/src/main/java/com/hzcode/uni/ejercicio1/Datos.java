package com.hzcode.uni.ejercicio1;

import java.util.Scanner;

/**
 * @author hzcode
 *
 */
public class Datos {
	private final Scanner leer;
	private double valor;

	public Datos() {
		leer = new Scanner(System.in);
	}

	/**
	 * @param msg
	 */
	public void setDatos(String msg) {
		System.out.print(msg);
		try {
			valor = leer.nextDouble();
		} catch (Exception e) {
			System.out.println("Error al introducir datos, favor de intentar más tarde");
			System.exit(0);
		}
	}

	/**
	 * @return
	 */
	public double getDatos() {
		return valor;
	}

}
