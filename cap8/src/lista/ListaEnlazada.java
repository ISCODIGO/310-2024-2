package lista;


public class ListaEnlazada<T> implements Lista<T> {
    private Nodo<T> primero;
    private Nodo<T> ultimo;
    private int conteo;

    public ListaEnlazada() {
        limpiar();
    }

    @Override
    public boolean insertar(T dato, int posAnterior) {
        if (estaVacio()) return insertarInicio(dato);
        Nodo<T> previo = getNodo(posAnterior);
    }

    @Override
    public boolean insertarInicio(T dato) {
        var nuevo = new Nodo<T>(dato);

        if (estaVacio()) {
            this.primero = nuevo;
            this.ultimo = nuevo;
        } else {
            nuevo.setEnlace(primero);
            primero = nuevo;
        }
        conteo++;
        return true;
    }

    @Override
    public int buscar(T dato) {
        return 0;
    }

    @Override
    public T remover(int posicion) {
        return null;
    }

    @Override
    public void editar(T dato, int posicion) {

    }

    @Override
    public void limpiar() {
        primero = null;
        ultimo = null;
        conteo = 0;
    }

    @Override
    public boolean estaVacio() {
        return this.primero == null;
    }

    public Nodo<T> getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo<T> primero) {
        this.primero = primero;
    }

    public Nodo<T> getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo<T> ultimo) {
        this.ultimo = ultimo;
    }

    public int length() {
        return conteo;
    }

    public Nodo<T> getNodo(int posicion) {
        if (posicion == 0) return primero;
        if (posicion == this.length() - 1) return ultimo;
        Nodo<T> aux = primero;
        for(int i = 1; i <= posicion; i++) {
            aux = aux.getEnlace();
        }
        return aux;
    }
}
