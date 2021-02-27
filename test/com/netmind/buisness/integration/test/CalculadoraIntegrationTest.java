package com.netmind.buisness.integration.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.netmind.buisness.Calculator;

public class CalculadoraIntegrationTest {

	@Test
	public void testAdd() {
		Calculator calculadora = new Calculator();
		assertEquals(calculadora.add(4, 2), 6);
	}

	@Test
	public void testSubstract() {
		Calculator calculadora = new Calculator();
		assertEquals(calculadora.substract(4, 2), 6);
	}

	@Test
	public void testDivide() {
		Calculator calculadora = new Calculator();
		assertEquals(calculadora.divide(4, 2), 6);
	}

}
