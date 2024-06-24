public class Contador {
    static void contar(int c) {
        if (c < 1000) {
            System.out.println(c);
            contar(++c);
        }
    }
    public static void main(String[] args) {
        contar(0);
    }
}
