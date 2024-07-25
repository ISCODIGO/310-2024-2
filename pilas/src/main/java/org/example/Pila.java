package org.example;

public interface Pila<T> {
    void push(T dato);

    T pop();
    T top();
}
