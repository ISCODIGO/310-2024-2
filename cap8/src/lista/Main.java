package lista;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada<Integer> lista = new ListaEnlazada<>();
        lista.insertarPrimero(10);
        lista.insertarUltimo(30);
        lista.insertar(20, 1);
        // [10, 20, 30]
        System.out.println(lista);

        lista.insertarPrimero(10);
        lista.insertarPrimero(20);
        lista.insertarPrimero(30);
        System.out.println(lista);

    }
}
