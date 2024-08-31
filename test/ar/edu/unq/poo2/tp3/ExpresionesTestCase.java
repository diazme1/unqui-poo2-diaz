package ar.edu.unq.poo2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ExpresionesTestCase {
	
	private String a;
    private String s;
    private String t;

	@BeforeEach
	public void setUp() throws Exception {
		//Se crean las variables con expresiones
		a = "abc";
		s = a;
	}
	
	@Test
	void testLenghtS() {
		try {
			assertEquals(3 , s.length());
		} catch (Exception e){
			fail("Excepción resultante: " + e);
		}
		//Rtdo: 3.
	}

	@Test
	void testLenghtT() {
		try {
			assertEquals(0 , t.length());
		} catch (Exception e){
			fail("Excepción resultante: " + e);
		}
		//Rtdo: 0, ¿string vacío?.
	}
	
	@Test
	void testConcatenate1A() {
		try {
			String result = 1 + a;
			assertEquals("1abc" , result);
		} catch (Exception e){
			fail("Excepción resultante: " + e);
		}
		//Rtdo: "1abc", concatena.
	}
	
	@Test
	void testAToUpperCase() {
		try {
			String result = a.toUpperCase();
			assertEquals("ABC" , result);
		} catch (Exception e){
			fail("Excepción resultante: " + e);
		}
		//Rtdo: "ABC".
	}
	
	@Test
	void testIndexOf() {
		try {
			assertEquals(4 , "Libertad".indexOf("r"));
		} catch (Exception e){
			fail("Excepción resultante: " + e);
		}
		//Rtdo: 4.
	}
	
	@Test
	void testLastIndexOf() {
		try {
			assertEquals(7 , "Universidad".lastIndexOf("i"));
		} catch (Exception e){
			fail("Excepción resultante: " + e);
		}
		//Rtdo: 7.
	}
	
	@Test
	void testSubstring() {
		try {
			String result = "Quilmes".substring(2, 4);
			assertEquals("il" , result);
		} catch (Exception e){
			fail("Excepción resultante: " + e);
		}
		//Rtdo: "ilm", sustrae string con begin index y end index (no inclusive).
	}
	
	@Test
	void testStartsWith() {
		try {
			String result = (a.length() + a).startsWith("a");
			assertEquals(false , result);
		} catch (Exception e){
			fail("Excepción resultante: " + e);
		}
		//Rtdo: Type mismatch, cannot convert from boolean to String.
	}
	
	@Test
	void testSEqualsA() {
		try {
			Boolean result = s == a;
			assertEquals(true , result);
		} catch (Exception e){
			fail("Excepción resultante: " + e);
		}
		//Rtdo: True, se evalua igualdad de strings.
	}
	
	@Test
	void testStringEquals() {
		try {
			Boolean result = a.substring(1,3).equals("bc");
			assertEquals(true , result);
		} catch (Exception e){
			fail("Excepción resultante: " + e);
		}
		//Rtdo: True, puede utilizarse tanto == como equals() para comparar strings.
	}
}
