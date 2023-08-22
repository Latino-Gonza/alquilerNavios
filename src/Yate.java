public class Yate extends Embarcacion {
    private int cantidadCamarotes;
    public Yate(Capitan capitan, double precioBase, int anioFabricacion, double eslora, int cantidadCamarotes) {
        super(capitan, precioBase, anioFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }
    @Override
    public double calcularMontoAlquiler() {
        double montoAlquiler = getPrecioBase() + (getAnioFabricacion() >= 2020 ? 20000 : 0) + getEslora() * 150 + cantidadCamarotes * 2000;
        return montoAlquiler;
    }
    @Override
    public String getTipoEmbarcacion() {
        return "Yate";
    }
    @Override
    public String getInformacionAdicional() {
        return "Cantidad de camarotes: " + cantidadCamarotes;
    }
    public double calcularValorCompra() {
        double valorAlquiler = calcularMontoAlquiler();
        double valorCompra = getPrecioBase() * 2; // Por defecto, el doble del precio base

        if (tieneMayorLujo() && valorCompra <= valorAlquiler) {
            valorCompra = valorAlquiler * 0.9; // Establecer valor de compra como 90% del valor de alquiler
        }

        return valorCompra;
    }
    private boolean tieneMayorLujo() {
        return cantidadCamarotes > 7;
    }
}