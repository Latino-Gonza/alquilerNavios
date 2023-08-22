public class Principal {
    public static void main(String[] args) {
        Capitan capitan1 = new Capitan("Pedro", "García", "PG1234");
        Capitan capitan2 = new Capitan("María", "López", "ML5678");
        Capitan capitan3 = new Capitan("Juan", "Pérez", "JP9012");
        Capitan capitan4 = new Capitan("Ana", "Sánchez", "AS3456");
        Capitan capitan5 = new Capitan("Jose", "Arevalo", "KH5415");
        Capitan capitan6 = new Capitan("Daniela", "zabala", "HG1245");
        Embarcacion[] embarcaciones = new Embarcacion[6];
        embarcaciones[0] = new Velero(capitan1, 50000, 2019, 15, 2);
        embarcaciones[1] = new Velero(capitan2, 70000, 2021, 20, 3);
        embarcaciones[2] = new Velero(capitan3, 130000, 2023, 30, 5);
        embarcaciones[3] = new Yate(capitan4, 80000, 2015, 10, 2);
        embarcaciones[4] = new Yate(capitan5, 100000, 2018, 25, 6);
        embarcaciones[5] = new Yate(capitan6, 120000, 2020, 30, 8);
        for (Embarcacion e : embarcaciones) {
            System.out.println("Tipo de embarcación: " + e.getTipoEmbarcacion());
            System.out.println("Capitán: " + e.getCapitan());
            System.out.println("Año de fabricación: " + e.getAnioFabricacion());
            System.out.println("Eslora: " + e.getEslora() + " metros");
            System.out.println(e.getInformacionAdicional());
            System.out.println("Monto de alquiler: $" + e.calcularMontoAlquiler());
            if (e instanceof Yate) {
                Yate yate = (Yate) e;
                System.out.println("Valor de compra del yate: $" + yate.calcularValorCompra());
            }
            System.out.println();
        }
    }
}