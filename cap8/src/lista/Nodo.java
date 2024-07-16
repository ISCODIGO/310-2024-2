package lista;

public class Nodo<T> {
    private T dato;
    private Nodo<T> enlace;

    public Nodo(T dato) {
        setDato(dato);
        setEnlace(null);
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

    public Nodo<T> getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo<T> enlace) {
        this.enlace = enlace;
    }
}
