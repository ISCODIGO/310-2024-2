package org.example.def;

public interface Queue<T> {
    // insercion
    void enqueue(T dato);

    // remocion
    T dequeue();

    // limpiar
    void clear();

    // esta vacia
    boolean isEmpty();

    // obtener frente
    T front();
}
