package lista;

import java.util.Comparator;

/*

<T extends Comparable<T>> Esto restringe el tipo generico para
aquellos tipos que puedan compararse entre si.

La clase podria leerse:
ListaEnlazadaOrdenada es una subclase de ListaEnlazada. Donde T sera un tipo comparable y
se implementar por medio de Comparator una forma de realizar dicha comparacion por medio
de la funcion compareTo().
 */
public class ListaEnlazadaOrdenada<T extends Comparable<T>> extends ListaEnlazada<T> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return o1.compareTo(o2);
    }

    public int insertar(T dato) {
        return insertarRecursivo(dato, this.getPrimero(), 0);
    }

    public int insertarRecursivo(T dato, Nodo<T> otro, int posicion) {
        if (otro == null || compare(dato, otro.getDato()) < 0) {
            this.insertar(dato, posicion);
            return posicion;
        }
        return insertarRecursivo(dato, otro.getSiguiente(), posicion + 1);
    }
}

/*

Insertar en la lista: 10, 2, 7, 1, 5, 3

10->
2-> 10->
2-> 7-> 10->
1-> 2-> 7-> 10->
1-> 2-> 5-> 7-> 10->

 */