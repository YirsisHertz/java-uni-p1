package adivina_quien;

import java.util.Scanner;

public class AdivinaQuien {

	public static void main(String[] args) {
		final String message = "Tu personaje es ";

		Scanner scan = new Scanner(System.in);
		String option1, option2, option3;

		System.out.print("El personaje tiene cabello? (S/N): ");

		try {

			option1 = scan.nextLine();
			if (option1.equalsIgnoreCase("n")) {
				System.out.println(message + "Oscar");
				System.exit(0);
			} else if (option1.equalsIgnoreCase("s")) {
				System.out.println("El personaje tiene cabello de color... \n");
				System.out.println("1. Amarillo");
				System.out.println("2. Blanco");
				System.out.println("3. Naranja");
				System.out.println("4. Negro");
				System.out.println("5. Cafe");
				System.out.println("6. Rojo");

				System.out.print("\n(Ingresa el numero de tu selección): ");

				int cabello = scan.nextInt();

				switch (cabello) {
				case 1:
					System.out.print("Tu personaje usa lentes? (S/N): ");
					option2 = scan.next();

					if (option2.equalsIgnoreCase("n")) {
						System.out.println(message + "Lucia");
						System.exit(0);
					} else if (option2.equalsIgnoreCase("s")) {

						System.out.print("Tu personaje es Hombre? (S/N): ");
						option3 = scan.next();

						if (option3.equalsIgnoreCase("s")) {
							System.out.println(message + "Alfredo");
							System.exit(0);

						} else if (option3.equalsIgnoreCase("n")) {

							System.out.println(message + "Lola");
						} else {

							System.err.println("Opcion Invalida...");
						}

					} else {
						System.err.println("Opcion Invalida...");
					}

					break;
				case 2:
					System.out.print("Tu personaje usa lentes? (S/N): ");
					option2 = scan.next();

					if (option2.equalsIgnoreCase("s")) {
						System.out.println(message + "Soledad");
						System.exit(0);
					} else if (option2.equalsIgnoreCase("n")) {

						System.out.println(message + "Mario");
					} else {
						System.err.println("Opcion Invalida...");
					}
					break;
				case 3:
					System.out.print("Tu personaje es Hombre? (S/N): ");
					option2 = scan.next();

					if (option2.equalsIgnoreCase("n")) {
						System.out.println(message + "Úrsula");
						System.exit(0);
					} else if (option2.equalsIgnoreCase("s")) {

						System.out.print("Tu personaje tiene barba? (S/N): ");
						option3 = scan.next();

						if (option3.equalsIgnoreCase("s")) {
							System.out.println(message + "Eugenio");
							System.exit(0);

						} else if (option3.equalsIgnoreCase("n")) {

							System.out.println(message + "Eduardo");
						} else {

							System.err.println("Opcion Invalida...");
						}

					} else {
						System.err.println("Opcion Invalida...");
					}

					break;
				case 4:
					System.out.print("Tu personaje usa lentes? (S/N): ");
					option2 = scan.next();

					if (option2.equalsIgnoreCase("s")) {
						System.out.println(message + "Victor");
						System.exit(0);
					} else if (option2.equalsIgnoreCase("n")) {

						System.out.print("Tu personaje es Hombre? (S/N): ");
						option3 = scan.next();

						if (option3.equalsIgnoreCase("s")) {
							System.out.println(message + "Julio");
							System.exit(0);

						} else if (option3.equalsIgnoreCase("n")) {

							System.out.println(message + "Leonora");
						} else {

							System.err.println("Opcion Invalida...");
						}

					} else {
						System.err.println("Opcion Invalida...");
					}

					break;
				case 5:
					System.out.print("Tu personaje es Hombre? (S/N): ");
					option2 = scan.next();

					if (option2.equalsIgnoreCase("n")) {
						System.out.println(message + "Adela");
						System.exit(0);
					} else if (option2.equalsIgnoreCase("s")) {

						System.out.print("Tu personaje es de tes Blanca? (S/N): ");
						option3 = scan.next();

						if (option3.equalsIgnoreCase("s")) {
							System.out.println(message + "Lucas");
							System.exit(0);

						} else if (option3.equalsIgnoreCase("n")) {

							System.out.println(message + "Ernesto");
						} else {

							System.err.println("Opcion Invalida...");
						}

					} else {
						System.err.println("Opcion Invalida...");
					}

					break;
				case 6:
					System.out.print("Tu personaje es Hombre? (S/N): ");
					option2 = scan.next();

					if (option2.equalsIgnoreCase("s")) {
						System.out.println(message + "Fernando");
						System.exit(0);
					} else if (option2.equalsIgnoreCase("n")) {

						System.out.print("Tu personaje tiene cabello largo? (S/N): ");
						option3 = scan.next();

						if (option3.equalsIgnoreCase("s")) {
							System.out.println(message + "Irma");
							System.exit(0);

						} else if (option3.equalsIgnoreCase("n")) {

							System.out.println(message + "Margarita");
						} else {

							System.err.println("Opcion Invalida...");
						}

					} else {
						System.err.println("Opcion Invalida...");
					}

					break;

				default:
					System.err.println("Opcion Invalida...");
					System.exit(0);
					break;
				}

			} else {

				System.err.println("Opcion Invalida...");
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.exit(0);
		}

	}

}
