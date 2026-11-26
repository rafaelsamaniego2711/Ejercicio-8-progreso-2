public class Main {
    public static void main(String[] args) {
        Dispositivo d1 = new Sensor("S01", "Temp Caldera", true, 24.5, "°C");
        Dispositivo d2 = new Sensor("S02", "Presión Línea", false, 0.0, "bar");
        Dispositivo d3 = new Actuador("A01", "Válvula Principal", true, 50.0, 2.5);
        Dispositivo d4 = new Actuador("A02", "Bomba Auxiliar", true, 100.0, 5.0);
        Dispositivo d5 = new Controlador("C01", "PLC Siemens", true, 16);

        EstacionControl estacion = new EstacionControl();
        estacion.agregarDispositivo(d1);
        estacion.agregarDispositivo(d2);
        estacion.agregarDispositivo(d3);
        estacion.agregarDispositivo(d4);
        estacion.agregarDispositivo(d5);

        System.out.println(estacion.mostrarDispositivos());
        System.out.println("Dispositivos activos: " + estacion.contarActivos());

        Dispositivo encontrado = estacion.buscarDispositivo("A01");
        System.out.println("Buscar A01: " + (encontrado != null ? encontrado.mostrarInformacion() : "No encontrado"));
    }
}
