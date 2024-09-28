public class ArbolBinario<T> {
    public class Nodo<T>  {
        private T dato;
        private Nodo<T> izquierdo;
        private Nodo<T> derecho;

        public Nodo(T dato, Nodo<T> izq, Nodo<T> der) {
            this.dato = dato;
            this.izquierdo = izq;
            this.derecho = der;
        }

        public Nodo(T dato){
            this(dato, null, null);
        }

        public T getDato() {
            return dato;
        }

        public void setDato(T dato) {
            this.dato = dato;
        }

        public Nodo<T> getIzquierdo() {
            return izquierdo;
        }

        public void setIzquierdo(Nodo<T> izquierdo) {
            this.izquierdo = izquierdo;
        }

        public Nodo<T> getDerecho() {
            return derecho;
        }

        public void setDerecho(Nodo<T> derecho) {
            this.derecho = derecho;
        }

        @Override
        public String toString() {
            return dato.toString();
        }

        public boolean esHoja() {
            return this.izquierdo == null && this.derecho == null;
        }
    }  // Fin declaracion de Nodo

    // Declaracion del Arbol binario
    private Nodo<T> raiz;
    private int cantidad;

    //  construir un arbol con la raiz
    public ArbolBinario(T datoInicial) {
        this.raiz = new Nodo<>(datoInicial);
        this.cantidad = 1;
    }

    // construir un arbol binario vacio
    public ArbolBinario() {
        this.raiz = null;
        this.cantidad = 0;
    }

    public Nodo<T> getRaiz() {
        return raiz;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Nodo<T> setIzq(T dato, Nodo<T> padre) {
        padre.izquierdo = new Nodo<>(dato);
        cantidad++;
        return padre.izquierdo;
    }

    public Nodo<T> setIzq(T dato) {
        return setIzq(dato, this.getRaiz());
    }

    public Nodo<T> setDer(T dato, Nodo<T> padre) {
        padre.derecho = new Nodo<>(dato);
        cantidad++;
        return padre.derecho;
    }

    public Nodo<T> setDer(T dato) {
        return setDer(dato, getRaiz());
    }

    public int largo() {
        return this.cantidad;
    }

    public T removerIzq(Nodo<T> padre) {
        if (padre.izquierdo == null) {
            throw new RuntimeException("No existe el nodo");
        }

        T aux = padre.getIzquierdo().getDato();
        padre.izquierdo = null;
        cantidad--;  // TODO: Debe contar los nodos que hay debajo en lugar de marcar solo 1
        return aux;
    }

    public T removerDer(Nodo<T> padre) {
        if (padre.derecho == null) {
            throw new RuntimeException("No existe el nodo");
        }

        T aux = padre.derecho.dato;
        padre.derecho = null;
        cantidad--;    // TODO: Debe contar los nodos que hay debajo en lugar de marcar solo 1
        return aux;
    }

    public void recorrerPreorden(Nodo<T> nodo) {
        if (nodo == null) {
            return;
        }

        System.out.println(nodo.getDato());  // visitar el nodo
        recorrerPreorden(nodo.izquierdo);  // I
        recorrerPreorden(nodo.derecho);  // D
    }

}
