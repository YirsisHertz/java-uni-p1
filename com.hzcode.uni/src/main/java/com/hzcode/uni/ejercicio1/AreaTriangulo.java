package com.hzcode.uni.ejercicio1;

/**
 * 
 * @author Yirsis Serrano
 * @version 1.0.0
 * 
 */
public class AreaTriangulo {
	private final double base, altura;

	/**
	 * @param base   = Puede recibir números enteros y números decimales
	 * @param altura = Puede recibir números enteros y números decimales
	 */
	public AreaTriangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	/**
	 * @return Área de un Triangulo = Retorna el valor de la operacion (Base *
	 *         Altura) / 2 Valor double
	 */
	public double areaTriangulo() {
		return (base * altura) / 2;
	}
}
