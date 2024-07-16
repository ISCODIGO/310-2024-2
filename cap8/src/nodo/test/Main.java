package nodo.test;

public class Main {
    public static void main(String[] args) {
        Nodo n1 = new Nodo("Hola");
        Nodo n2 = new Nodo(1);
        Nodo n3 = new Nodo(n2);

        NodoV2<Integer> na = new NodoV2<>(4);
        NodoV2<String> nb = new NodoV2<>("Hola");

        String s = "hola";
        String t = "hola";
        String u = new String("hola");

        System.out.println(s == t);
        System.out.println(s == u);

        System.out.println(s.equals(t));
        System.out.println(s.equals(u));

        NodoV2<Integer> nc = na;  // referencia nc -> na (copia superficial)
        System.out.println(nc.dato);

        nc.dato = 444;

        System.out.println(na.dato);

        var v1 = new NodoV3<Integer>(10);
        var v2 = new NodoV3<Integer>(20);

        v1.puntero = v2;  // v1 -> v2

        v1.puntero.dato = 56;
        System.out.println("V1:" + v1);
        System.out.println("V2:" + v2);
        System.out.println("V1.puntero:" + v1.puntero);

    }
}