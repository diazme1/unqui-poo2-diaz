package ar.edu.unq.poo2.tp4;

public class IngresosPercibidosAnuales {
	
	protected String mes;
	protected String concepto;
	protected double monto;
	
	public IngresosPercibidosAnuales(String mes, String concepto, double monto) {
		super();
		this.mes = mes;
		this.concepto = concepto;
		this.monto = monto;
	}
	
	public double getMonto() {
		return this.monto;
	}
	
	public boolean esPorHorasExtras() {
		return false;
	}
}
