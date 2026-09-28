public class Main {
    public static void main(String[] args) {
        MedidorElectrico medidor = new MedidorElectrico("MED-001", 1200.0, 1350.5);

        System.out.println("Medidor " + medidor.getNumeroMedidor());
        System.out.println("Consumo del mes actual: " + medidor.calcularConsumo() + " kWh");

        System.out.println("\nPasa un mes... se registra una nueva lectura (1520.75 kWh)");
        medidor.registrarNuevaLectura(1520.75);

        System.out.println("Lectura anterior: " + medidor.getLecturaAnterior() + " kWh");
        System.out.println("Lectura actual: " + medidor.getLecturaActual() + " kWh");
        System.out.println("Consumo del nuevo mes: " + medidor.calcularConsumo() + " kWh");
    }
}
