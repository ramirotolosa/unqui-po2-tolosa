package ar.edu.unq.po2.tp3;
import java.util.List;
import java.util.ArrayList;

public class Multioperador {
	// Atributos
	private List<Integer> lista;
	
	// Constructores
	public Multioperador() {
		this.setLista(new ArrayList<Integer>());
	}
	
	// Metodos (Accessing)
	public List<Integer> getLista() {
		return lista;
	}

	public void setLista(List<Integer> lista) {
		this.lista = lista;
	}
	
	// Metodos (Concretos)
	public void agregarNumero(int x) {
		this.getLista().add(x);
	}
	
	public int sumaTotal() {
		int total = 0;
		List<Integer> lista = this.getLista();
		
		if (lista.isEmpty()) {
			return total;
		} else {
			for (int x : lista){
				total = total + x;
			}
		}
		return total;
	}

	public int restaTotal() { // esto podria ser una "negacion" del resultado de sumaTotal.
		int total = 0;
		List<Integer> lista = this.getLista();
		
		if (lista.isEmpty()) {
			return total;
		} else {
			for (int x : lista){
				total = total - x;
			}
		}
		return total;
	}
	
	public int productoTotal() {
		int neutro = 1;
		List<Integer> lista = this.getLista();
		
		if (lista.isEmpty()) {
			return 0;
		} else {
			for (int x : lista){
				neutro = neutro * x;
			}
		}
		return neutro;
	}
	
	
	

}
