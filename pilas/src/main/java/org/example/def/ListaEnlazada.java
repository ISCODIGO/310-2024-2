package org.example.def;

public class ListaEnlazada<T> {
    private Nodo<T> primero;
    private Nodo<T> ultimo;
    private int conteo;

    public ListaEnlazada() {
        limpiar();
    }

    public boolean insertar(T dato, int posicion) {
        /*if (posicion < 0 || posicion >= conteo) {
            throw new IndexOutOfBoundsException("Posición fuera de rango");
        }*/

        if (posicion == 0)
            return insertarPrimero(dato);
        if (posicion == conteo)
            return insertarUltimo(dato);

        // insertar enmedio
        var nuevo = new Nodo<>(dato);
        Nodo<T> previo = getNodo(posicion - 1);
        nuevo.setSiguiente(previo.getSiguiente());
        previo.setSiguiente(nuevo);

        if (previo == ultimo) {
            ultimo = nuevo;
        }
        conteo++;
        return true;
    }

    public boolean insertarPrimero(T dato) {
        var nuevo = new Nodo<T>(dato);
        nuevo.setSiguiente(primero);
        primero = nuevo;
        conteo++;

        // si es el primer nodo de la lista
        if (conteo == 1) {
            ultimo = nuevo;
        }
        return true;
    }

    public boolean insertarUltimo(T dato) {
        var nuevo = new Nodo<T>(dato);
        if (estaVacio()) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
        conteo++;
        return true;
    }

    public int buscar(T dato) {
        int posicion = 0;
        Nodo<T> aux = primero;

        while (aux != null) {
            if (aux.getDato().equals(dato)) {
                return posicion;
            }
            aux = aux.getSiguiente();
            posicion++;
        }
        return -1; // Dato no encontrado
    }

    public T remover(int posicion) {
        if (posicion < 0 || posicion >= conteo) {
            throw new IndexOutOfBoundsException("Posición fuera de rango");
        }

        T aux;

        if (estaVacio()) {
            throw new IndexOutOfBoundsException("La lista está vacía");
        }

        if (posicion == 0) {
            aux = removerPrimero();
        } else if (posicion == conteo - 1) {
            aux = removerUltimo();
        } else {
            var previo = getNodo(posicion - 1);
            aux = previo.getSiguiente().getDato();
            previo.setSiguiente(previo.getSiguiente().getSiguiente());
        }

        conteo--;
        return aux;
    }

    public T removerPrimero() {
        T aux = primero.getDato();
        primero = primero.getSiguiente();
        return aux;
    }

    public T removerUltimo() {
        var penultimo = getNodo(conteo - 2);
        T aux = ultimo.getDato();
        penultimo.setSiguiente(null);
        ultimo = penultimo;
        return aux;
    }

    public void editar(T dato, int posicion) {
        if (posicion < 0 || posicion >= conteo) {
            throw new IndexOutOfBoundsException("Posición fuera de rango");
        }
        Nodo<T> nodo = getNodo(posicion);
        nodo.setDato(dato);
    }

    public void limpiar() {
        primero = null;
        ultimo = null;
        conteo = 0;
    }

    public boolean estaVacio() {
        return primero == null;
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
        if (posicion < 0 || posicion >= conteo) {
            throw new IndexOutOfBoundsException("Posición fuera de rango");
        }

        Nodo<T> aux = primero;
        for (int i = 0; i < posicion; i++) {
            aux = aux.getSiguiente();
        }
        return aux;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // recorrer todos los nodos
        var aux = primero;
        while(aux != null) {
            sb.append(aux.getDato());
            sb.append("-> ");
            aux = aux.getSiguiente();
        }

        return sb.toString().strip();
    }
}
