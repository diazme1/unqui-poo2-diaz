package ar.edu.unq.poo2.tp3;


public class MultiOperador {
	
	public MultiOperador() {
		
	}
	
	public int suma(int[] numeros) {
		int sumaTotal = 0;
		for (int x : numeros) {
			sumaTotal += x;
		}
		return sumaTotal;
	}
	
	public int resta(int[] numeros) {
		int restaTotal = 0;
		for (int x : numeros) {
			restaTotal -= x;
		}
		return restaTotal;
	}
	
	public int multiplicacion(int[] numeros) {
		int productoTotal = 1;
		for (int x : numeros) {
			productoTotal *= x;
		}
		return productoTotal;
	}
}
