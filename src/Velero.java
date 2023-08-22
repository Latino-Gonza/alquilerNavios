public class Velero extends Embarcacion {
    private int cantidadMastiles;
    public Velero(Capitan capitan, double precioBase, int anioFabricacion, double eslora, int cantidadMastiles) {
        super(capitan, precioBase, anioFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }
    @Override
    public double calcularMontoAlquiler() {
        double montoAlquiler = getPrecioBase() + (getAnioFabricacion() >= 2020 ? 20000 : 0) + getEslora() * 100 + cantidadMastiles * 5000;
        return montoAlquiler;
    }
    @Override
    public String getTipoEmbarcacion() {
        return "Velero";
    }
    @Override
    public String getInformacionAdicional() {
        return "Cantidad de mástiles: " + cantidadMastiles;
    }
}