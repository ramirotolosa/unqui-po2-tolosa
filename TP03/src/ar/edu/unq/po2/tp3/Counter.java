package ar.edu.unq.po2.tp3;
import java.util.List;
import java.util.ArrayList;

public class Counter {
	// Atributos
	private List<Integer> numeros;
	
	// Constructor
	public Counter() { // Por defecto se crea con una ArrayList vacia
		this.setNumeros(new ArrayList<Integer>());
	}
	
	// Metodos (accessing)
	public List<Integer> getNumeros() {
		return numeros;
	}

	public void setNumeros(List<Integer> numeros) {
		this.numeros = numeros;
	}
	
	// Metodos (Concretos)
	public void agregarNumero(int n) {
		this.getNumeros().add(n);
	}
	
	public boolean esPar(int n) { // Indica si n es un numero par
		return((n%2) == 0);
	}
	
	public boolean esImpar(int n) { // Indica si n es un numero impar
		return((n%2) != 0);
	}
	
	public boolean esMultiploDe(int x, int y) { // Indica si x es multiplo de y
		return((x%y) == 0);
	}
	
	public int cantidadDeNumerosPares() {
		int c = 0;
		for (int n : (this.getNumeros())) {
			if (this.esPar(n)) {
				c++;
			}
		}
		return c;
	}
	
	public int cantidadDeNumerosImpares() {
		int c = 0;
		for (int n : (this.getNumeros())) {
			if (this.esImpar(n)) {
				c++;
			}
		}
		return c;
	}
	
	public int cantidadDeMultiplosDe(int y) {
		int c = 0;
		for (int x : (this.getNumeros())) {
			if (this.esMultiploDe(x, y)) {
				c++;
			}
		}
		return c;
	}
	
	public int cantidadDeDigitosPares(int n) {
		int c = 0;
		for (int i=n; i>0; i=i/10) {
			if (this.esPar(i%10)) {
				c++;
			}
		}
		return c;
	}

	public int numeroConMayorCantidadDeDigitosPares() { // la lista de numeros no debe ser vacia
		int m = this.getNumeros().getFirst();
		
		for (int x : (this.getNumeros())) {
			if ((this.cantidadDeDigitosPares(x)) > (this.cantidadDeDigitosPares(m))) {
				m = x;
			}
		}
		return m;			
	}
	
}
