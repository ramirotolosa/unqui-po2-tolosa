package ar.edu.unq.po2.tp2;
import java.time.LocalDate;
import java.util.List;

public class Recibo {
    // Atributos
    private String nombreEmpleado;
    private String direccion;
    private LocalDate fechaEmision;
    private double sueldoBruto;
    private double sueldoNeto;
    private List<Concepto> desgloce;

    // Constructor
    public Recibo() {}

    public Recibo(Empleado empleado) {
        this.nombreEmpleado = empleado.getNombre();
        this.direccion = empleado.getDireccion();
        this.fechaEmision = LocalDate.now();
        this.sueldoBruto = empleado.sueldoBruto();
        this.sueldoNeto = empleado.sueldoNeto();
        this.desgloce = empleado.desgloceDeConceptos();
    }

    //Metodos
    public void imprimirDesgloce() { // borrar desp
        List<Concepto> desgloce = this.desgloce;
        for (Concepto concepto : desgloce) {
            System.out.println(concepto.getDescripcion() + " | " + concepto.getRemuneracion() + " | " + concepto.getDescuento());
        }
    }

    public void imprimirInformacion() { // borrar desp
        System.out.println("##########################################################");
        System.out.println("Nombre: " + this.nombreEmpleado);
        System.out.println("Direccion: " + this.direccion);
        System.out.println("Fecha de emision: " + this.fechaEmision);
        this.imprimirDesgloce();
        System.out.println("Sueldo bruto: " + this.sueldoBruto);
        System.out.println("Sueldo neto: " + this.sueldoNeto);
        System.out.println("##########################################################");
    }



    //Accessors
    public String getNombreEmpleado() {
        return this.nombreEmpleado;
    }
    public void setNombreEmpleado(String nombre) {
        this.nombreEmpleado = nombre;
    }
    public String getDireccion() {
        return this.direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public LocalDate getFechaEmision() {
        return this.fechaEmision;
    }
    public void setFechaEmision(LocalDate fecha) {
        this.fechaEmision = fecha;
    }
    public double getSueldoBruto() {
        return this.sueldoBruto;
    }
    public void setSueldoBruto(double sueldo) {
        this.sueldoBruto = sueldo;
    }
    public double getSueldoNeto() {
        return this.sueldoNeto;
    }
    public void setSueldoNeto(double sueldo) {
        this.sueldoNeto = sueldo;
    }
    public List<Concepto> getDesgloce(){
        return this.desgloce;
    }
    public void setDesgloce(List<Concepto> desgloce) {
        this.desgloce = desgloce;
    }



}

