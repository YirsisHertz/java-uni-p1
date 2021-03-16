package com.hzcode.uni.ejercicio1;

public class Ejercicio1 {
	public static void main(String[] args) {

		Datos datos = new Datos();

		datos.setDatos("Introduce la base: ");
		double base = datos.getDatos();

		datos.setDatos("Introduce la altura: ");
		double altura = datos.getDatos();

		final double resultado = new AreaTriangulo(base, altura).areaTriangulo();
		System.out.println("Valor del resultado " + resultado);
	}

}
