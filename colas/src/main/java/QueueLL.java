public class QueueLL<T> {
    private ListaEnlazada<T> lista;

    public QueueLL() {
        lista = new ListaEnlazada<>();
    }

    public void enqueue(T dato) {
        lista.insertarUltimo(dato);
    }

    public T dequeue() {
        return lista.removerPrimero();
    }

    public void clear() {
        lista.limpiar();
    }

    public boolean isEmpty() {
        return lista.estaVacio();
    }

    public T front() {
        return lista.getPrimero().getDato();
    }

    @Override
    public String toString() {
        return "{" + lista + "}";
    }

    public static void main(String[] args) {
        QueueLL<Integer> cola = new QueueLL<>();
        cola.enqueue(10);
        cola.enqueue(20);
        System.out.println(cola.front());

        System.out.println(cola.dequeue());
        System.out.println(cola.front());
    }
}
