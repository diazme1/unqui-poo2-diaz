package ar.edu.unq.poo2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	
	private List<Integer> elementos;
	
	public Counter() {
		this.elementos = new ArrayList<Integer>();
	}
	
	public List<Integer> getElementos(){
		return this.elementos;
	}
	
	public void addNumber(int x) {
		this.elementos.add(x);
	}
	
	public int lenght() {
		return this.elementos.size();
	}
	
	public int getEvenNumbers() {
		int contador = 0;
		for (int n : this.elementos) {
			if (n % 2 == 0) {
				contador = contador+1;
			}
		}
		return contador;
	}
	
	public int getOddNumbers() {
		int contador = 0;
		for (int n : this.elementos) {
			if (n % 2 != 0) {
				contador = contador+1;
			}
		}
		return contador; 
	}
	
	public int getMultiplesOf(int x) {
		int contador = 0;
		for (int n : this.elementos) {
			if (n % x == 0) {
				contador ++;
			}
		}
		return contador; 
	}
	
	public int getNumberWithMoreEvenDigits(List<Integer> listaNumeros) {
		int numeroMaxPares = listaNumeros.get(0);
		for (int n : listaNumeros) {
			if (this.cantDigitosPares(n) > this.cantDigitosPares(numeroMaxPares)) {
				numeroMaxPares = n;
			}
		}
		return numeroMaxPares;
	}
	
	public int cantDigitosPares(int n) {
		List<Integer> digitosPares = new ArrayList<Integer>();
		int ultimoDigito = 0;
		while (n != 0) {
			ultimoDigito = n % 10;
			if (ultimoDigito % 2 ==0) {
				digitosPares.add(ultimoDigito);
			}
			n = n / 10;
		}
		return digitosPares.size();
	}
	
	public int maxMultiploEntre(int x, int y) {
		int num = 1000;
		while (num != 0 && num%x != 0 && num%y != 0) {
			num --;
		}
		return num;
	}
}
