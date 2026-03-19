public class Main {
    public static void main(String[] args) {
        BitacoraStack bitacora = new BitacoraStack();

        // 1. Registrar los 6 eventos
        bitacora.registrar("Motor de estribor encendido");
        bitacora.registrar("Velocidad warp alcanzada");
        bitacora.registrar("Señal de comunicación estable");
        bitacora.registrar("Anomalía detectada en sector 7");
        bitacora.registrar("Escudos al 40%");
        bitacora.registrar("ERROR CRÍTICO: fallo en sistema de navegación");

        // 2. Consultar e imprimir el último evento
        String ultimo = bitacora.consultarUltimo();
        System.out.println("Último evento registrado: " + ultimo);

        // 3. Si el último evento contiene "ERROR", ejecutar protocolo
        if (ultimo.contains("ERROR")) {
            System.out.println("\n*** Protocolo de revisión activado ***");
            for (int i = 0; i < 3; i++) {
                String eliminado = bitacora.eliminarUltimo();
                System.out.println("Evento eliminado: " + eliminado);
            }
        }

        // 4. Imprimir estado actual de la bitácora
        System.out.println("\n--- Estado actual de la bitácora ---");
        System.out.println("Total de eventos restantes: " + bitacora.totalEventos());
        if (!bitacora.estaVacia()) {
            System.out.println("Evento en la cima: " + bitacora.consultarUltimo());
        } else {
            System.out.println("La bitácora está vacía.");
        }
    }
}
