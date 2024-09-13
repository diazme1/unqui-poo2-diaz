package ar.edu.unq.poo2.tp4;

public class Producto {
	
	protected String nombreProd; 
	protected double precioProd;
	protected boolean preciosCuidados;
	
	public Producto(String nombre, double precio) {
		super();
		
		this.nombreProd = nombre;
		this.precioProd = precio;
		this.preciosCuidados = false;
	}
	
	public Producto(String nombre, double precio, boolean preciosCuidados) {
		super();
		
		this.nombreProd = nombre;
		this.precioProd = precio;
		this.preciosCuidados = preciosCuidados;
	}
	
	public String getNombre() {
		return this.nombreProd;
	}
	
	public double getPrecio() {
		return this.precioProd;
	}
	
	public boolean esPrecioCuidado() {
		return this.preciosCuidados;
	}
	
	public void aumentarPrecio(double aumento) {
		this.precioProd += aumento;
	}
}
