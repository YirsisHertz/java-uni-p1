package registro_compra;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Compra {

	private static DecimalFormat decimalFormat = new DecimalFormat("###.##");

	private static void descuentos(double costo, float porcentaje) {
		double descuento = costo * (porcentaje / 100);
		costo -= descuento;

		System.out.println("Descuento del " + Math.round(porcentaje) + "%: $" + decimalFormat.format(descuento));
		System.out.println("Costo Final: $" + decimalFormat.format(costo));
	}

	public static void main(String[] args) {
		String[] productos = { "Manzana", "Pera", "Carne de cerdo", "Carne de res", "Carne de pollo", "Desinfectante",
				"Gel anti-bacterial" };
		double[] precios = { 300.65, 180.15, 650.8, 480.6, 800.1, 150.32, 400.32 };

		int seleccion = 0;
		double costo = 0;

		try {
			do {

				System.out.println("Lista de Productos");
				System.out.println("Costo Actual (sin IVA): $" + decimalFormat.format(costo) + " \n");
				int i = 1;

				for (String producto : productos) {
					System.out.println(i + ". " + producto + ": $" + precios[i - 1]);
					i++;
				}

				System.out.println("0. Finalizar Compra\n");

				System.out.print("Seleccione un producto por su número: ");
				seleccion = new Scanner(System.in).nextInt();

				for (i = 1; i <= seleccion; i++) {
					if (i == seleccion) {
						costo += precios[i - 1];
					} else if (seleccion == 0) {
						break;
					}
				}

			} while (seleccion != 0);

			if (costo == 0) {
				System.err.println("TRANSACCIÓN CANCELADA");
			} else {
				System.out.println("Costo SIN IVA: $" + costo);

				double iva = costo * 0.16;
				System.out.println("IVA (16%): $" + decimalFormat.format(iva));

				costo += iva;
				System.out.println("Costo + IVA: $" + decimalFormat.format(costo));
			}

			if (costo >= 1000 & costo <= 1500) {
				descuentos(costo, 10);
			}

			if (costo > 1500 & costo <= 2000) {
				descuentos(costo, 20);
			}

			if (costo > 2000 & costo <= 2500) {
				descuentos(costo, 30);
			}

		} catch (Exception e) {
			System.err.println("Selección invalida... Intenta nuevamente");
			System.exit(0);
		}

	}

}
