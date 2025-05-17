package ar.edu.unq.po2.tp3;

public class Rectangulo extends FiguraGeometrica {
	// Constructor
	public Rectangulo(Point xy, int b, int h) { // constructor que define todos los atributos
		super(xy,b,h);
	}
	
	public Rectangulo(int b, int h) { // crea el rectangulo en el origen (0,0)
		super(new Point(), b, h);
	}
	
	// Metodos
	@Override
	public int area() {
		int b = this.getBase();
		int h = this.getAltura();
		int a = b*h;
		
		return a;
	}

	@Override
	public int perimetro() {
		int b = this.getBase();
		int h = this.getAltura();
		int p = (b*2) + (h*2);
		
		return p;
	}
	
	public boolean estaHorizontal() {
		int b = this.getBase();
		int h = this.getAltura();
		
		return(b>h);
	}
	
	public boolean estaVertical() {
		int b = this.getBase();
		int h = this.getAltura();
		
		return(b<h);
	}

}
