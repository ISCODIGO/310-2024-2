public class Main {
    public static void main(String[] args) {
        ArbolBinario<Integer> arbolBinario = new ArbolBinario<>(10);
        // System.out.println(arbolBinario.getRaiz().getDato());
        var n1 = arbolBinario.setIzq(20);
        var n2 = arbolBinario.setDer(30);
        var n3 = arbolBinario.setIzq(40, n1);
        var n4 = arbolBinario.setDer(50, n2);

        System.out.println(arbolBinario.largo());

        System.out.println(40 == arbolBinario.getRaiz().getIzquierdo().getIzquierdo().getDato());
        System.out.println(50 == arbolBinario.getRaiz().getDerecho().getDerecho().getDato());

        arbolBinario.recorrerPreorden(arbolBinario.getRaiz());

        //arbolBinario.removerIzq(arbolBinario.getRaiz());
        //System.out.println(arbolBinario.getRaiz().getIzquierdo() == null);
        //System.out.println(3 == arbolBinario.getCantidad());
    }
}
