package ar.edu.unq.po2.tp2;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public abstract class Empleado {
    // Atributos
    private String nombre;
    private String direccion;
    private EstadoCivil estadoCivil;
    private LocalDate fechaNacimiento;
    private double sueldoBasico; 

    
    // Constructor con parametros
    public Empleado(String nom, String dir, EstadoCivil ec, LocalDate fecNac, double sb) {
        this.setNombre(nom);
        this.setDireccion(dir);;
        this.setEstadoCivil(ec);
        this.setFechaNacimiento(fecNac);
        this.setSueldoBasico(sb);
    }

    // Accessing
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public double getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	// Metodos concretos
    public int calcularEdad() {
    	return(Period.between(this.getFechaNacimiento(),LocalDate.now()).getYears());
    }
    
    public double sueldoBruto() {
    	return((this.getSueldoBasico()) + (this.montoTotalBeneficios()));
    }
    
    public double montoTotalRetenciones() {
    	return((this.montoDescuentoObraSocial()) + (this.montoDescuentoAportes()) + (this.montoDescuentoGastosAdministrativos()));
    }
    
    public double sueldoNeto() {
    	return((this.sueldoBruto()) - (this.montoTotalRetenciones())); 
    }
    
    public Concepto generarConcepto(String descripcion, double remuneracion, double descuento) { // como testeo esto??
    	Concepto nuevoConcepto = new Concepto(descripcion, remuneracion, descuento);
    	return(nuevoConcepto);
    }
    
//    public List<Concepto> desgloceSueldoNeto(){  -- Version con FOR
//    	List<Concepto> desgloceSueldoNeto = this.desgloceSueldoBruto(); 
//    	List<Concepto> desgloceRetenciones = this.desgloceRetenciones();
//    	
//    	for (Concepto c : desgloceRetenciones){
//    		desgloceSueldoNeto.add(c);
//    	}
//    	return desgloceSueldoNeto;
//    }
    public List<Concepto> desgloceSueldoNeto() { // verision con addAll()
        List<Concepto> desgloceSueldoNeto = this.desgloceSueldoBruto();
        desgloceSueldoNeto.addAll(this.desgloceRetenciones());
        return desgloceSueldoNeto;
    }
//    public List<Concepto> desgloceSueldoNeto() { -- hace una copia de la lista que resulta de this.desgloceSueldoBruto(), las de arriba no!
//        List<Concepto> resultado = new ArrayList<>(this.desgloceSueldoBruto());
//        resultado.addAll(this.desgloceRetenciones());
//        return resultado;
//    }
	public List<Concepto> desgloceRetenciones(){
		List<Concepto> desgloce = new ArrayList<Concepto>();
		// items que intervienen en el calculo del total de retenciones
		desgloce.add(this.generarConcepto("Descuento Obra Social", 0, this.montoDescuentoObraSocial()));
		desgloce.add(this.generarConcepto("Descuento Aportes Jubilatorios", 0, this.montoDescuentoAportes()));
		desgloce.add(this.generarConcepto("Descuento Gastos Administrativos Contractuales", 0, this.montoDescuentoGastosAdministrativos()));
		
		return desgloce;
	}
    
        
    // Metodos abstractos
    public abstract double montoTotalBeneficios();
    public abstract double montoDescuentoObraSocial();
    public abstract double montoDescuentoAportes();
    public abstract double montoDescuentoGastosAdministrativos();
    public abstract List<Concepto> desgloceSueldoBruto();
    
}




