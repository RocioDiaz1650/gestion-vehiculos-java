package entidades;

public class Moto extends vehiculo {
    private String tipo;
    private int cilindrada;
    private int rodado;
    private int velocidadMaxima;
    private String tipoCombustible;

    public Moto(String marca, String modelo, int anio,
                String tipo, int cilindrada, int rodado,
                int velocidadMaxima, String tipoCombustible) {
        super(marca, modelo, anio);
        this.tipo = tipo;
        this.cilindrada = cilindrada;
        this.rodado = rodado;
        this.velocidadMaxima = velocidadMaxima;
        this.tipoCombustible = tipoCombustible;
    }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getCilindrada() { return cilindrada; }
    public void setCilindrada(int cilindrada) { this.cilindrada = cilindrada; }

    public int getRodado() { return rodado; }
    public void setRodado(int rodado) { this.rodado = rodado; }

    public int getVelocidadMaxima() { return velocidadMaxima; }
    public void setVelocidadMaxima(int velocidadMaxima) { this.velocidadMaxima = velocidadMaxima; }

    public String getTipoCombustible() { return tipoCombustible; }
    public void setTipoCombustible(String tipoCombustible) { this.tipoCombustible = tipoCombustible; }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: Moto " + tipo);
        System.out.println("Cilindrada: " + cilindrada + " cc");
        System.out.println("Rodado: " + rodado + "\"");
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
        System.out.println("Combustible: " + tipoCombustible);
        System.out.println("------------------------");
    }
}