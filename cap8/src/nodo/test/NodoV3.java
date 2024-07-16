package nodo.test;

public class NodoV3<T> {
    public NodoV3(T dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "nodo.test.NovoV3{" +
                "dato=" + dato +
                '}';
    }

    T dato;
    NodoV3<T> puntero;


}
