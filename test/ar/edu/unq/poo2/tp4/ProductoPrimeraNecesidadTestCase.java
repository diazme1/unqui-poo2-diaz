package ar.edu.unq.poo2.tp4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ProductoPrimeraNecesidadTestCase {

	private ProductoPrimeraNecesidad leche;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 15);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(new Double(6.8), leche.getPrecio());
	}
}
