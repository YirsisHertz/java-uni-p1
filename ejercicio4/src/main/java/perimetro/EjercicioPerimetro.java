package perimetro;

import java.util.Scanner;

import controllers.Perimetro;

public class EjercicioPerimetro {

	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);
		Perimetro perimetro = new Perimetro();
		int select;

		System.out.println("==========Calculadora de Perimetros=========");
		System.out.println("\t1. Perimetro con 1 valor");
		System.out.println("\t2. Perimetro con 4 valores");
		System.out.print("Selecciona una opción: ");
		try {
			select = valor.nextInt();

			switch (select) {
			case 1:

				System.out.print("Ingresa el valor de un lado: ");
				double lado = valor.nextDouble();

				System.out.println("El perimetro es de: " + perimetro.calcularPerimetro(lado));

				break;
			case 2:
				double l1, l2, l3, l4;

				System.out.print("Ingresa el valor del lado 1: ");
				l1 = valor.nextDouble();

				System.out.print("Ingresa el valor del lado 2: ");
				l2 = valor.nextDouble();

				System.out.print("Ingresa el valor del lado 3: ");
				l3 = valor.nextDouble();

				System.out.print("Ingresa el valor del lado 4: ");
				l4 = valor.nextDouble();

				System.out.println("El perimetro es de: " + perimetro.calcularPerimetro(l1, l2, l3, l4));

				break;
			default:
				System.out.println("Opcion Invalida");
				System.exit(0);
				break;
			}

		} catch (Exception e) {
			System.out.println("Opcion Invalida");
			System.exit(0);
		}

	}

}
