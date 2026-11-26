public class Sensor extends Dispositivo {
    private double lectura;
    private String unidad;

    public Sensor(String codigo, String nombre, boolean activo, double lectura, String unidad) {
        super(codigo, nombre, activo);
        this.lectura = lectura;
        this.unidad = unidad;
    }

    @Override
    public String obtenerEstadoOperacion() {
        return isActivo() ? "Midiendo (" + lectura + " " + unidad + ")" : "Sensor detenido";
    }

    @Override
    public String mostrarInformacion() {
        return "Sensor " + super.mostrarInformacion() + " | Lectura: " + lectura + " " + unidad;
    }
}
