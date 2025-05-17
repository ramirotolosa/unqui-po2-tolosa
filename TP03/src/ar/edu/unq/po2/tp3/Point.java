package ar.edu.unq.po2.tp3;

public class Point {
	// Atributos
	int x;
	int y;
	
	// Constructores
	public Point(int x, int y) {
		this.setXY(x, y);
	}
	
	public Point() {
		this.setXY(0, 0);
	}
	
	// Metodos (accessing)
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void setXY(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	// Metodos (Concretos)
	public void moverA(int x, int y) {
		this.setXY(x, y);
	}
	
	public Point sumarPuntos(Point a, Point b) {
		int ax = a.getX();
		int ay = a.getY();
		int bx = b.getX();
		int by = b.getY();
		
		return(new Point((ax+bx),(ay+by)));
	}
}
