package ar.edu.unq.po2.tp3;

public abstract class FiguraGeometrica {
	// Atributos
	private Point origen;
	private int base;
	private int altura;
	
	// Constructores
	public FiguraGeometrica(Point xy, int b, int h) {
		this.setOrigen(xy);
		this.setBase(b);
		this.setAltura(h);
	}
	
	// Metodos (accessing)
	public Point getOrigen() {
		return origen;
	}
	public void setOrigen(Point origen) {
		this.origen = origen;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	// Metodos (Abstractos)
	public abstract int area();
	public abstract int perimetro();
}
