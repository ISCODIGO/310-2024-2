package org.example.def;

public class Nodo<T> {
    private T dato;
    private Nodo<T> siguiente;

    public Nodo(T dato) {
        setDato(dato);
        setSiguiente(null);
    }

    @Override
    public String toString() {
        return dato.toString();
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
}
