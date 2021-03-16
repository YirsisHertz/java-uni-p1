package com.hzcode.uni;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.hzcode.uni.ejercicio1.AreaTriangulo;

class PruebaTest {

	@Test
	@DisplayName("Debe retornar 12.5 al calcular base = 5 y altura = 5")
	void testArea() {
		double resultado = new AreaTriangulo(5, 5).areaTriangulo();
		assertEquals(12.5, resultado);
	}

	@Test
	@DisplayName("Debe retornar 0 al calcular base = 0 y altura = x")
	void testRetornaCeroBase() {
		double resultado = new AreaTriangulo(0, 5).areaTriangulo();
		assertEquals(0, resultado);
	}

	@Test
	@DisplayName("Debe retornar 0 al calcular base = x y altura = 0")
	void testRetornaCeroAltura() {
		double resultado = new AreaTriangulo(5, 0).areaTriangulo();
		assertEquals(0, resultado);
	}

	@Test
	@DisplayName("Debe retornar -25 al calcular base = -5 y altura = 10")
	void testCalculaAreasNegativas() {
		double resultado = new AreaTriangulo(-5, 10).areaTriangulo();
		assertEquals(-25, resultado);
	}

}
