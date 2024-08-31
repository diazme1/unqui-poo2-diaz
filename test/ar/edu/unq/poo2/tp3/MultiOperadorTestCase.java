package ar.edu.unq.poo2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiOperadorTestCase {
	
	private MultiOperador multiOperador;
	private int[] numeros; 
	
	@BeforeEach
	public void setUp() throws Exception {
		//Se crea el contador
		multiOperador = new MultiOperador();
		numeros = new int[5];
		numeros[0] = 3;
		numeros[1] = 7;
		numeros[2] = 10;
		numeros[3] = 2;
		numeros[4] = 8;
	}

	@Test
	void testSuma() {
		int resultado = multiOperador.suma(numeros);
		assertEquals(30, resultado);
	}
	
	@Test
	void testResta() {
		int resultado = multiOperador.resta(numeros);
		assertEquals(-30, resultado);
	}

	@Test
	void testMultiplicacion() {
		int resultado = multiOperador.multiplicacion(numeros);
		assertEquals(3360, resultado);
	}
}
