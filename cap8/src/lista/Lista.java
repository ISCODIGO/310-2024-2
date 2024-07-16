package lista;

public interface Lista<T> {
    boolean insertar(T dato, int posAnterior);
    boolean insertarInicio(T dato);
    int buscar(T dato);  // -1 si no encuentra
    T remover(int posicion);  // null si no encuentra
    void editar(T dato, int posicion);
    void limpiar();
    boolean estaVacio();
}
