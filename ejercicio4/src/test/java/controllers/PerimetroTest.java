package controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PerimetroTest {

	@Test
	public void testCalcularPerimetroConUnArgumento() {
		double actual = new Perimetro().calcularPerimetro(5);
		assertEquals(20, actual, 2);
	}

	@Test
	public void testCalcularPerimetroConLos4Argumentos() {
		double actual = new Perimetro().calcularPerimetro(3, 3, 3, 3);
		assertEquals(12, actual, 2);
	}

}
