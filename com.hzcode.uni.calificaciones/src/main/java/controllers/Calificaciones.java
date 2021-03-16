package controllers;

public class Calificaciones {
	private float calificacion;

	public Calificaciones(float calificacion) {
		this.calificacion = calificacion;
	}

	public String getCalificacion() {
		if (calificacion < 0 || calificacion > 10)
			return "No puedes escoger ese valor";
		return calificacion >= 6 ? "Aprobado" : "Reprobado";
	}
}
