public abstract class Embarcacion {
    private Capitan capitan;
    private double precioBase;
    private int anioFabricacion;
    private double eslora;
    public Embarcacion(Capitan capitan, double precioBase, int anioFabricacion, double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }
    // Métodos protegidos para acceder a los atributos privados
    protected double getPrecioBase() {
        return precioBase;
    }
    protected int getAnioFabricacion() {
        return anioFabricacion;
    }
    protected double getEslora() {
        return eslora;
    }
    public abstract double calcularMontoAlquiler();
    public abstract String getTipoEmbarcacion();
    public abstract String getInformacionAdicional(); // Método abstracto para obtener información específica de cada tipo de embarcación
    public String getCapitan() {
        return capitan.toString();
    }
}
