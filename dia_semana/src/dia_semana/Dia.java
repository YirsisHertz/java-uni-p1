package dia_semana;

import javax.swing.JOptionPane;

public class Dia {

	public static void main(String[] args) {
		String[] dias = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };
		String seleccion = JOptionPane.showInputDialog("Selecciona un número entre el 1 y el 7: ");

		try {
			int opcion = Integer.parseInt(seleccion);

			if (opcion <= 0 || opcion > dias.length) {
				JOptionPane.showMessageDialog(null, "Opción Invalida", null, JOptionPane.ERROR_MESSAGE);
				System.exit(0);
			}

			for (int i = 1; i <= opcion; i++) {

				if (i == opcion) {
					JOptionPane.showMessageDialog(null, "El día es: " + dias[i - 1], null,
							JOptionPane.INFORMATION_MESSAGE);

				} else {
					System.gc();
				}
			}

		} catch (NumberFormatException e) {
			System.exit(0);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Opción Invalida", null, JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}

	}

}
