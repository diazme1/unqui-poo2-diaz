package ar.edu.unq.poo2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {

	private String nombre;
	private List<IngresosPercibidosAnuales> ingresosPercibidos;
	
	public Trabajador(String nombre) {
		this.ingresosPercibidos = new ArrayList<IngresosPercibidosAnuales>();
		this.nombre = nombre;
	}
	
	public void agregarIngreso(IngresosPercibidosAnuales ingreso) {
		this.ingresosPercibidos.add(ingreso);
	}
	
	public double getTotalPercibido() {
		
		double percibidoTotal = 0.0;
		for (IngresosPercibidosAnuales ing : this.ingresosPercibidos) {
			percibidoTotal += ing.getMonto(); 
		}
		return percibidoTotal;
	}
	
	public double getMontoImponible() {
		double imponibleTotal = 0.0;
		for (IngresosPercibidosAnuales ing : this.ingresosPercibidos) {
			if (!ing.esPorHorasExtras()){
				imponibleTotal += ing.getMonto();
			}
		}
		return imponibleTotal;
	}
	
	public double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.02;
	}
	
}
