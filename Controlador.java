public class Controlador extends Dispositivo {
    private int numeroEntradas;

    public Controlador(String codigo, String nombre, boolean activo, int numeroEntradas) {
        super(codigo, nombre, activo);
        this.numeroEntradas = numeroEntradas;
    }

    @Override
    public String obtenerEstadoOperacion() {
        return isActivo() ? "Procesando lógica en " + numeroEntradas + " entradas" : "Controlador apagado";
    }

    @Override
    public String mostrarInformacion() {
        return "Controlador " + super.mostrarInformacion() + " | Entradas: " + numeroEntradas;
    }
}
