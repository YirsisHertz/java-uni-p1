package controllers;

public class Value {
	private int valor;

	public Value() {
		valor = (int) Math.round(Math.random() * 1);
	}

	public int getVolado() {
		return valor;
	}

}
