package controllers;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ValueTest {

	@DisplayName("Debe retornar un valor entre el 0 y 1")
	@Test
	void testGenerarValor() {
		Value valor = new Value();

		for (int i = 0; i < 300; i++) {
			boolean actual = valor.getVolado() == 0 || valor.getVolado() == 1;
			assertTrue(actual);
		}

	}

	@DisplayName("Debe retornar falso si tiene numeros diferentes")
	@Test
	void testGenerarValoresCorrectos() {
		Value valor = new Value();

		for (int i = 0; i < 300; i++) {
			boolean actual = valor.getVolado() != 0 && valor.getVolado() != 1;
			assertFalse(actual);
		}

	}
}
