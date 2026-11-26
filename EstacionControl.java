import java.util.ArrayList;

public class EstacionControl {
    private ArrayList<Dispositivo> dispositivos;

    public EstacionControl() {
        dispositivos = new ArrayList<>();
    }

    public void agregarDispositivo(Dispositivo dispositivo) {
        if (dispositivo != null) {
            dispositivos.add(dispositivo);
        }
    }

    public Dispositivo buscarDispositivo(String codigo) {
        if (codigo == null) {
            return null;
        }
        for (Dispositivo d : dispositivos) {
            if (codigo.equals(d.getCodigo())) {
                return d;
            }
        }
        return null;
    }

    public int contarActivos() {
        int contador = 0;
        for (Dispositivo d : dispositivos) {
            if (d.isActivo()) {
                contador++;
            }
        }
        return contador;
    }

    public String mostrarDispositivos() {
        if (dispositivos.isEmpty()) {
            return "No hay dispositivos en la estación.";
        }
        String listado = "";
        for (Dispositivo d : dispositivos) {
            listado += d.mostrarInformacion() + "\n";
        }
        return listado;
    }
}
