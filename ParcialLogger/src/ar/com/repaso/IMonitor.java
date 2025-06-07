package ar.com.repaso;

public interface IMonitor {
	
	String BLUE = "Blue";
	String YELLOW = "Yellow";
	String RED = "Red";
	String GRAY = "Gray";
	
	public void printScreen(String msj, String col);
}
