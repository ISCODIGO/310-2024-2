package lista;

public class Main {
    public static void main(String[] args) {
        /*var lista = new ListaEnlazadaOrdenada<>();
        lista.insertarPrimero(10);
        lista.insertarUltimo(30);
        lista.insertar(20, 1);
        // [10, 20, 30]
        System.out.println(lista);

        lista.insertarPrimero(10);
        lista.insertarPrimero(20);
        lista.insertarPrimero(30);
        System.out.println(lista);*/

        //  10, 2, 7, 1, 5, 3
        var listaOrd = new ListaEnlazadaOrdenada<Integer>();
        listaOrd.insertar(10);
        listaOrd.insertar(2);
        listaOrd.insertar(7);
        listaOrd.insertar(1);
        listaOrd.insertar(5);
        System.out.println(listaOrd);


    }
}
