package ar.edu.unq.po2.tp2;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public abstract class Empleado {
    // Atributos
    private String nombre;
    private String direccion;
    private Boolean esCasado;
    private LocalDate fechaDeNacimiento;
    private double sueldoBasico;

    // Constructor
    public Empleado() {}

    public Empleado(String nombre, String direccion, Boolean esCasado, LocalDate fechaDeNacimiento, double sueldoBasico) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.esCasado = esCasado;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.sueldoBasico = sueldoBasico;
    }

    // Metodos
    public int edad() {
        LocalDate fecNac = this.fechaDeNacimiento;
        LocalDate fecAct = LocalDate.now();
        Period periodo = Period.between(fecNac,fecAct);
        return periodo.getYears();
    }
    public double sueldoNeto() {
        double sueldoBruto = this.sueldoBruto();
        double retenciones = this.retenciones();
        double sueldoNeto = sueldoBruto - retenciones;
        return sueldoNeto;
    }

    // Metodos abstractos
    public abstract double sueldoBruto();
    public abstract double retenciones();
    public abstract double montoObraSocial();
    public abstract double montoAportesJubilatorios();
    public abstract List<Concepto> desgloceDeConceptos();

    // Accessors
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return this.direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Boolean getEsCasado() {
        return this.esCasado;
    }
    public void setEsCasado(Boolean esCasado) {
        this.esCasado = esCasado;
    }
    public LocalDate getFechaDeNacimiento() {
        return this.fechaDeNacimiento;
    }
    public void setFechaDeNacimiento(LocalDate fecha) {
        this.fechaDeNacimiento = fecha;
    }
    public double getSueldoBasico() {
        return this.sueldoBasico;
    }
    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

}


