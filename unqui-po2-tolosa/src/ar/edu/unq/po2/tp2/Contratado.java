package ar.edu.unq.po2.tp2;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Contratado extends Empleado{
    //Atributos
    private int numeroContrato;
    private String medioDePago;

    // Constructor
    public Contratado() {}

    public Contratado(String nombre, String direccion, Boolean esCasado, LocalDate fechaDeNacimiento, double sueldoBasico, int numeroContrato, String medio) {
        super(nombre,direccion,esCasado,fechaDeNacimiento,sueldoBasico);
        this.numeroContrato = numeroContrato;
        this.medioDePago = medio;
    }

    // Metodos
    public double sueldoBruto() {
        return this.getSueldoBasico();
    }
    public double gastosAdministrativosContractuales() {
        return 50;
    }
    public double retenciones() {
        return this.gastosAdministrativosContractuales();
    }
    public double montoObraSocial() {
        return 0;
    }
    public double montoAportesJubilatorios() {
        return 0;
    }
    public List<Concepto> desgloceDeConceptos() {
        //remuneraciones
        Concepto sueldoBasico = new Concepto("Sueldo basico",this.getSueldoBasico(),0);
        //descuentos
        Concepto gastosAdmin = new Concepto("Gastos administrativos contractuales",0,this.gastosAdministrativosContractuales());

        List<Concepto> conceptos = new ArrayList<>();

        conceptos.add(sueldoBasico);
        conceptos.add(gastosAdmin);

        return conceptos;
    }

    //Accessors
    public int getNumeroContrato() {
        return this.numeroContrato;
    }
    public void setNumeroContrato(int numero) {
        this.numeroContrato = numero;
    }
    public String getMedioDePago() {
        return this.medioDePago;
    }
    public void setMedioDePago(String medio) {
        this.medioDePago = medio;
    }
}

