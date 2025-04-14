package ar.edu.unq.po2.tp2;
import java.util.HashSet;
import java.util.Set;

public class Empresa {
    // Atributos
    private String nombre;
    private int cuit;
    private Set<Empleado> empleados;
    private Set<Recibo> recibos;

    // Constructor
    public Empresa() {}

    public Empresa(String nombre, int cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
        this.empleados = new HashSet<>();
        this.recibos = new HashSet<>();
    }

    //Metodos
    public void contratarEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }
    public double montoTotalSueldosNetos() {
        Set<Empleado> empleados = this.empleados;
        double monto = 0;
        for (Empleado empleado : empleados) {
            monto = monto + empleado.sueldoNeto();
        }
        return monto;
    }
    public double montoTotalSueldosBrutos() {
        Set<Empleado> empleados = this.empleados;
        double monto = 0;
        for (Empleado empleado : empleados) {
            monto = monto + empleado.sueldoBruto();
        }
        return monto;
    }
    public double montoTotalRetenciones() {
        Set<Empleado> empleados = this.empleados;
        double monto = 0;
        for (Empleado empleado : empleados) {
            monto = monto + empleado.retenciones();
        }
        return monto;
    }
    public Recibo liquidarSueldo(Empleado empleado) {
        Recibo recibo = new Recibo(empleado);
        return recibo;
    }
    public void archivarRecibo(Recibo recibo) {
        this.recibos.add(recibo);
    }
    public void liquidarSueldos() {
        for (Empleado empleado : this.empleados) {
            Recibo recibo = this.liquidarSueldo(empleado);
            this.archivarRecibo(recibo);
        }
    }
    public void imprimirRecibos() { // borrar despues
        Set<Recibo> recibos = this.recibos;
        for (Recibo recibo : recibos) {
            recibo.imprimirInformacion();
        }
    }


    // Accessors
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCuit() {
        return this.cuit;
    }
    public void setCuit(int cuit) {
        this.cuit = cuit;
    }
    public Set<Empleado> getEmpleados() {
        return this.empleados;
    }
    public void setEmpleados(Set<Empleado> empleados) {
        this.empleados = empleados;
    }
    public Set<Recibo> getRecibos() {
        return this.recibos;
    }
    public void setRecibos(Set<Recibo> recibos) {
        this.recibos = recibos;
    }



}

