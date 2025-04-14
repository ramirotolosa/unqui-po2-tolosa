package ar.edu.unq.po2.tp2;

public class Concepto {
    // Atributos
    private String descripcion;
    private double remuneracion;
    private double descuento;

    // Constructores
    public Concepto() {}

    public Concepto(String descripcion, double remuneracion, double descuento) {
        this.descripcion = descripcion;
        this.remuneracion = remuneracion;
        this.descuento = descuento;
    }

    // Metodos


    // Accessors
    public String getDescripcion() {
        return this.descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getRemuneracion() {
        return this.remuneracion;
    }
    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }
    public double getDescuento() {
        return this.descuento;
    }
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

}

