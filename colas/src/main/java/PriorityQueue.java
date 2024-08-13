import java.util.Arrays;

@SuppressWarnings("unchecked")
public class PriorityQueue<T> {
    private final int prioridadMax;
    private QueueLL<T>[] colas;
    private int conteo;

    public PriorityQueue(int prioridadMaxima) {
        if (prioridadMaxima < 0) {
            throw new IllegalArgumentException("La prioridad máxima debe ser no negativa");
        }
        this.prioridadMax = prioridadMaxima;
        this.clear();
    }

    public void enqueue(T dato, int prioridad) {
        if (prioridad < 0 || prioridad > prioridadMax) {
            throw new IllegalArgumentException("Prioridad inválida");
        }

        colas[prioridad].enqueue(dato);
        conteo++;
    }

    public T dequeue() {
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("La cola está vacía");
        }

        for (QueueLL<T> cola : this.colas) {
            if (!cola.isEmpty()) {
                conteo--;
                return cola.dequeue();
            }
        }
        throw new IllegalStateException("Este punto no debería alcanzarse");
    }

    public void clear() {
        conteo = 0;
        this.colas = new QueueLL[this.prioridadMax + 1];
        for (int i = 0; i < this.colas.length; i++) {
            this.colas[i] = new QueueLL<>();
        }
    }

    public boolean isEmpty() {
        return conteo == 0;
    }

    public T front() {
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("La cola está vacía");
        }

        for (QueueLL<T> cola : this.colas) {
            if (!cola.isEmpty()) {
                return cola.front();
            }
        }
        throw new IllegalStateException("Este punto no debería alcanzarse");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.colas.length; i++) {
            sb.append(i);
            sb.append(" -> ");
            sb.append(this.colas[i]);
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> cola = new PriorityQueue<>(5);
        cola.enqueue(10, 3);
        cola.enqueue(20, 1);
        cola.enqueue(30, 0);
        cola.enqueue(40, 2);
        cola.enqueue(50, 0);
        System.out.println(cola);
        System.out.println("Eliminado: " + cola.dequeue());
        System.out.println(cola);
        System.out.println("Eliminado: " + cola.dequeue());
        System.out.println(cola);
        System.out.println("Eliminado: " + cola.dequeue());
        System.out.println(cola);
    }
}