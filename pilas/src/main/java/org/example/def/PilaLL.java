package org.example.def;

public class PilaLL<T> implements Pila<T> {
    private ListaEnlazada<T> lista;

    public PilaLL() {
        lista = new ListaEnlazada<>();
    }

    @Override
    public void push(T dato) {
        lista.insertarPrimero(dato);
    }

    @Override
    public T pop() {
        return lista.removerPrimero();
    }

    @Override
    public T top() {
        return lista.getPrimero().getDato();
    }
}
