import java.util.Stack;

public class BitacoraStack {
    private Stack<String> pilaEventos;

    // Constructor
    public BitacoraStack() {
        pilaEventos = new Stack<>();
    }

    // Agrega un nuevo evento a la cima de la bitácora (push)
    public void registrar(String evento) {
        pilaEventos.push(evento);
    }

    // Devuelve el último evento sin eliminarlo (peek)
    public String consultarUltimo() {
        if (pilaEventos.isEmpty()) {
            throw new IllegalStateException("La bitácora está vacía. No hay eventos para consultar.");
        }
        return pilaEventos.peek();
    }

    // Elimina y devuelve el último evento registrado (pop)
    public String eliminarUltimo() {
        if (pilaEventos.isEmpty()) {
            throw new IllegalStateException("La bitácora está vacía. No hay eventos para eliminar.");
        }
        return pilaEventos.pop();
    }

    // Retorna true si no hay eventos registrados (isEmpty)
    public boolean estaVacia() {
        return pilaEventos.isEmpty();
    }

    // Retorna el número de eventos actuales (size)
    public int totalEventos() {
        return pilaEventos.size();
    }
}
