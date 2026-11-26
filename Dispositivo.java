public class Dispositivo {
    private String codigo;
    private String nombre;
    private boolean activo;

    public Dispositivo(String codigo, String nombre, boolean activo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.activo = activo;
    }

    public String getCodigo() {
        return codigo;
    }

    public boolean isActivo() {
        return activo;
    }

    public String obtenerEstadoOperacion() {
        return activo ? "Operativo" : "Fuera de servicio";
    }

    public String mostrarInformacion() {
        return "[" + codigo + "] " + nombre + " - Estado: " + obtenerEstadoOperacion();
    }
}
