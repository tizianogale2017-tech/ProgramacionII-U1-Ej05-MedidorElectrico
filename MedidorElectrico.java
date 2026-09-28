package Ejercicio5_medidorElectrico;

public class MedidorElectrico {
    private String numeroMedidor;
    private double lecturaAnterior;
    private double lecturaActual;

    public MedidorElectrico(String numeroMedidor, double lecturaAnterior, double lecturaActual) {
        if (lecturaActual < lecturaAnterior) {
            throw new IllegalArgumentException("La lectura actual no puede ser menor que la anterior");
        }
        this.numeroMedidor = numeroMedidor;
        this.lecturaAnterior = lecturaAnterior;
        this.lecturaActual = lecturaActual;
    }

    public double calcularConsumo() {
        return lecturaActual - lecturaAnterior;
    }

    public void registrarNuevaLectura(double nuevaLectura) {
        if (nuevaLectura < lecturaActual) {
            throw new IllegalArgumentException("La nueva lectura no puede ser menor que la lectura actual");
        }
        lecturaAnterior = lecturaActual;
        lecturaActual = nuevaLectura;
    }

    public String getNumeroMedidor() {
        return numeroMedidor;
    }

    public double getLecturaAnterior() {
        return lecturaAnterior;
    }

    public double getLecturaActual() {
        return lecturaActual;
    }
}
