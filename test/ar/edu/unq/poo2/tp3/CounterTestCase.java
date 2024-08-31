package ar.edu.unq.poo2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class CounterTestCase {
	private Counter counter;
	
	@BeforeEach
	public void setUp() throws Exception {
		//Se crea el contador
		counter = new Counter();
		//Se agregan los numeros. Un solo par y nueve impares
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(6);
	}

	@Test
	public void testAddNumber() {
		// Getting the counter lenght
		int amount = counter.lenght();
		// I check the amount is the expected one
		assertEquals(amount, 4);
	}
	
	@Test
	public void testEvenNumbers() {
		// Getting the even occurrences
		int amount = counter.getEvenNumbers();
		// I check the amount is the expected one
		assertEquals(amount, 1);
	}
	
	@Test
	public void testOddNumbers() {
		// Getting the odd occurrences
		int amount = counter.getOddNumbers();
		// I check the amount is the expected one
		assertEquals(amount, 3);
	}
	
	@Test
	public void testMultiplesNumbers() {
		// Getting the multiples occurrences of n:
		int amount = counter.getMultiplesOf(3);
		// I check the amount is the expected one
		assertEquals(amount, 2);
	}
	
	@Test
	public void testDesarmarNumero() {
		//Definimos array ejemplo:
		List<Integer> numeros = new ArrayList<>();
        numeros.add(123);
        numeros.add(456);
        numeros.add(789);
        numeros.add(2468);
        numeros.add(1357);
		int amount = counter.getNumberWithMoreEvenDigits(numeros);
		// I check the amount is the expected one
		assertEquals(2468, amount);
	}
	
	@Test
	public void testMaxMultiploEntre() {
		// Getting the multiples occurrences of n:
		int amount = counter.maxMultiploEntre(3, 9);
		// I check the amount is the expected one
		assertEquals(amount, 999);
	}
}
