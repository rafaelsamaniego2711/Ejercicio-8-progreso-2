public class Actuador extends Dispositivo {
    private double posicion;
    private double potencia;

    public Actuador(String codigo, String nombre, boolean activo, double posicion, double potencia) {
        super(codigo, nombre, activo);
        this.posicion = posicion;
        this.potencia = potencia;
    }

    @Override
    public String obtenerEstadoOperacion() {
        return isActivo() ? "Ejecutando maniobra al " + posicion + "%" : "Actuador en reposo";
    }

    @Override
    public String mostrarInformacion() {
        return "Actuador " + super.mostrarInformacion() + " | Posición: " + posicion + "% | Potencia: " + potencia + " kW";
    }
}
