package ar.edu.unq.po2.tp3;

public class Cuadrado extends FiguraGeometrica {
	// Constructor
	public Cuadrado(Point xy, int l) { // constructor que define todos los atributos
		super(xy,l,l);
	}
	
	public Cuadrado(int l) { // crea el cuadrado en el origen (0,0)
		super(new Point(), l, l);
	}
	
	// Metodos
	@Override
	public int area() {
		int l = this.getBase();
		int a = l*l;
		
		return a;
	}

	@Override
	public int perimetro() {
		int l = this.getBase();
		int p = l*4;
		
		return p;
	}

}
