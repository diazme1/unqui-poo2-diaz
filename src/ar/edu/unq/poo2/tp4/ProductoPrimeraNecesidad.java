package ar.edu.unq.poo2.tp4;

public class ProductoPrimeraNecesidad extends Producto{
	
	private double descuento;

	public ProductoPrimeraNecesidad(String nombre, double precio, int desc) {
		super(nombre, precio);
		this.descuento = desc / 100.0;
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado, int desc) {
		super(nombre, precio, esPrecioCuidado);
		this.descuento = desc / 100.0;
	}
	
	public double getPrecio() {
		return this.precioProd * (1-this.descuento);
	}
}
