package lista;

public class Main {
    public static void main(String[] args) {
        var n1 = new Nodo<Integer>(10);
        Nodo<Integer> n2 = new Nodo<>(20);
        var n3 = new Nodo<Integer>(30);

        n1.setEnlace(n2);  // n1.enlace referencia a n2
        n2.setEnlace(n3);  // n2.enlace referencia a n3

        // n1 -> n2 -> n3 -> null

        System.out.println("Accediendo desde n1 a n2: " + n1.getEnlace().getDato());
        System.out.println("Accediendo desde n1 a n3: " +
                n1.getEnlace().getEnlace().getDato()
        );

        System.out.println(n3.getEnlace());

    }
}
