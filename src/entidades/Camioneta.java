package entidades;

import entidades.interfaces.VehiculoDeCarga;

public class Camioneta extends vehiculo implements VehiculoDeCarga {
    private int capacidadCarga;
    private int cantidadRuedas;
    private String traccion;
    private double tanqueLitros;
    private int asientos;
    private String tipoMotor;

    public Camioneta(String marca, String modelo, int anio,
                     int capacidadCarga, int cantidadRuedas,
                     String traccion, double tanqueLitros,
                     int asientos, String tipoMotor) {
        super(marca, modelo, anio);
        this.capacidadCarga = capacidadCarga;
        this.cantidadRuedas = cantidadRuedas;
        this.traccion = traccion;
        this.tanqueLitros = tanqueLitros;
        this.asientos = asientos;
        this.tipoMotor = tipoMotor;
    }

    public int getCapacidadCarga() { return capacidadCarga; }
    public void setCapacidadCarga(int capacidadCarga) { this.capacidadCarga = capacidadCarga; }

    public int getCantidadRuedas() { return cantidadRuedas; }
    public void setCantidadRuedas(int cantidadRuedas) { this.cantidadRuedas = cantidadRuedas; }

    public String getTraccion() { return traccion; }
    public void setTraccion(String traccion) { this.traccion = traccion; }

    public double getTanqueLitros() { return tanqueLitros; }
    public void setTanqueLitros(double tanqueLitros) { this.tanqueLitros = tanqueLitros; }

    public int getAsientos() { return asientos; }
    public void setAsientos(int asientos) { this.asientos = asientos; }

    public String getTipoMotor() { return tipoMotor; }
    public void setTipoMotor(String tipoMotor) { this.tipoMotor = tipoMotor; }

    @Override
    public double calcularCargaPermitida() {
        return capacidadCarga * 0.9;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: Camioneta");
        System.out.println("Capacidad de carga: " + capacidadCarga + " kg");
        System.out.println("Carga permitida: " + calcularCargaPermitida() + " kg");
        System.out.println("Ruedas: " + cantidadRuedas);
        System.out.println("Tracción: " + traccion);
        System.out.println("Tanque: " + tanqueLitros + " L");
        System.out.println("Asientos: " + asientos);
        System.out.println("Motor: " + tipoMotor);
        System.out.println("------------------------");
    }
}