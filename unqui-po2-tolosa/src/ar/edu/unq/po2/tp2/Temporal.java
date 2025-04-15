package ar.edu.unq.po2.tp2;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Temporal extends Empleado{
    // Atributos
    private LocalDate finDesignacion;
    private int horasExtra;

    // Constructor
    public Temporal() {}

    public Temporal(String nombre, String direccion, Boolean esCasado, LocalDate fechaDeNacimiento, double sueldoBasico, LocalDate finDesignacion, int horasExtra) {
        super(nombre,direccion,esCasado,fechaDeNacimiento,sueldoBasico);
        this.finDesignacion = finDesignacion;
        this.horasExtra = horasExtra;
    }

    // Metodos
    public double montoHorasExtra() {
        int horasExtra = this.horasExtra;
        double monto = horasExtra * 40;
        return monto;
    }
    public double sueldoBruto() {
        double montoSB = this.getSueldoBasico();
        double montoHE = this.montoHorasExtra();
        return (montoSB + montoHE);
    }
    public double montoMayoresCincuentaAnios() {
        if (this.edad() >= 50) {
            return 25;
        } else {
            return 0;
        }
    }
    public double montoObraSocial() {
        double montoSB = this.sueldoBruto() * 0.1;
        double mayorCincuenta = this.montoMayoresCincuentaAnios();
        return (montoSB + mayorCincuenta);
    }
    public double montoAportesJubilatorios() {
        double montoSB = this.sueldoBruto() * 0.1;
        double montoHE = this.horasExtra * 5;
        return (montoSB + montoHE);
    }
    public double retenciones() {
        double montoOS = this.montoObraSocial();
        double montoAJ = this.montoAportesJubilatorios();
        return (montoOS + montoAJ);
    }
    public List<Concepto> desgloceDeConceptos(){
        //remuneraciones
        Concepto sueldoBasico = new Concepto("Sueldo basico", this.getSueldoBasico(),0);
        Concepto horasExtra = new Concepto(this.horasExtra + " horas extra", this.montoHorasExtra(),0);
        //descuentos
        Concepto obraSocial = new Concepto("Obra Social",0,this.montoObraSocial());
        Concepto aportes = new Concepto("Aportes jubilatorios",0,this.montoAportesJubilatorios());

        List<Concepto> conceptos = new ArrayList<>();

        conceptos.add(sueldoBasico);
        conceptos.add(horasExtra);
        conceptos.add(obraSocial);
        conceptos.add(aportes);

        return conceptos;
    }

    // Accessors
    public LocalDate getFinDesignacion() {
        return this.finDesignacion;
    }
    public void setFinDesignacion(LocalDate finDesignacion) {
        this.finDesignacion = finDesignacion;
    }
    public int getHorasExtra() {
        return this.horasExtra;
    }
    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }


}


