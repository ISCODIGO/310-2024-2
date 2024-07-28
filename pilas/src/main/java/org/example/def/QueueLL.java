package org.example.def;

public class QueueLL<T> implements Queue<T> {
    private ListaEnlazada<T> lista;

    @Override
    public void enqueue(T dato) {
        lista.insertarUltimo(dato);
    }

    @Override
    public T dequeue() {
        return lista.removerPrimero();
    }

    @Override
    public void clear() {
        lista.limpiar();
    }

    @Override
    public boolean isEmpty() {
        return lista.estaVacio();
    }

    @Override
    public T front() {
        return lista.getPrimero().getDato();
    }
}
