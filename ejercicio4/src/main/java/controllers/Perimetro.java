package controllers;

public class Perimetro {

	public double calcularPerimetro(double lado) {
		return lado * 4;
	}

	public double calcularPerimetro(double lado1, double lado2, double lado3, double lado4) {
		return lado1 + lado2 + lado3 + lado4;
	}

}
