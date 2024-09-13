package ar.edu.unq.poo2.tp4;

public class IngresosPorHorasExtras extends IngresosPercibidosAnuales{

	private int cantHorasExtras;
	
	public IngresosPorHorasExtras(String mes, String concepto, double monto, int horasExtras) {
		super(mes, concepto, monto);
		this.cantHorasExtras = horasExtras;
	}
	
	public boolean esPorHorasExtras() {
		return true;
	}
		
}
