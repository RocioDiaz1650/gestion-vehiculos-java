package entidades;

public class Auto extends vehiculo {
    private int cantidadPuertas;
    private int cantidadRuedas;
    private String motor;
    private double tanqueLitros;
    private int asientos;

    public Auto(String marca, String modelo, int anio,
                int cantidadPuertas, int cantidadRuedas,
                String motor, double tanqueLitros, int asientos) {
        super(marca, modelo, anio);
        this.cantidadPuertas = cantidadPuertas;
        this.cantidadRuedas = cantidadRuedas;
        this.motor = motor;
        this.tanqueLitros = tanqueLitros;
        this.asientos = asientos;
    }

    public int getCantidadPuertas() { return cantidadPuertas; }
    public void setCantidadPuertas(int cantidadPuertas) { this.cantidadPuertas = cantidadPuertas; }

    public int getCantidadRuedas() { return cantidadRuedas; }
    public void setCantidadRuedas(int cantidadRuedas) { this.cantidadRuedas = cantidadRuedas; }

    public String getMotor() { return motor; }
    public void setMotor(String motor) { this.motor = motor; }

    public double getTanqueLitros() { return tanqueLitros; }
    public void setTanqueLitros(double tanqueLitros) { this.tanqueLitros = tanqueLitros; }

    public int getAsientos() { return asientos; }
    public void setAsientos(int asientos) { this.asientos = asientos; }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: Auto");
        System.out.println("Puertas: " + cantidadPuertas);
        System.out.println("Ruedas: " + cantidadRuedas);
        System.out.println("Motor: " + motor);
        System.out.println("Tanque: " + tanqueLitros + " L");
        System.out.println("Asientos: " + asientos);
        System.out.println("------------------------");
    }
}