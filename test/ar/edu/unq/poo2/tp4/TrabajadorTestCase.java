package ar.edu.unq.poo2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTestCase {

	private Trabajador trabajador;
	private IngresosPercibidosAnuales ingresoAnualEne;
	private IngresosPercibidosAnuales ingresoAnualFeb;
	private IngresosPorHorasExtras ingresoHoraExtra;
	
	@BeforeEach
	void setUp() throws Exception {
		
		this.ingresoAnualEne = new IngresosPercibidosAnuales("Enero", "XXXX", 250.0);
		this.ingresoAnualFeb = new IngresosPercibidosAnuales("Febrero", "XXXX", 50.0);
		this.ingresoHoraExtra = new IngresosPorHorasExtras("Enero", "XXXX", 100.0, 10);
		this.trabajador = new Trabajador("Pedro");
		this.trabajador.agregarIngreso(this.ingresoAnualEne);
		this.trabajador.agregarIngreso(this.ingresoAnualFeb);
		this.trabajador.agregarIngreso(this.ingresoHoraExtra);
	}

	@Test
	void testGetTotalPercibido() {
		double rtdo = this.trabajador.getTotalPercibido();
		assertEquals(400.0, rtdo);
	}
	
	@Test
	void testGetMontoImponible() {
		double rtdo = this.trabajador.getMontoImponible();
		assertEquals(300.0, rtdo);
	}
	
	@Test
	void testGetImpuestoAPagar() {
		double rtdo = this.trabajador.getImpuestoAPagar();
		assertEquals(6.0, rtdo);
	}

}
