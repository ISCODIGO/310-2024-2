public class Sumatoria {
    /*
    S(1) = 1
    S(2) = 1 + 2 = S(1) + 2
    S(3) = 1 + 2 + 3 = S(2) + 3
    S(n) = 1 + 2 + 3 + ... + n-1 + n = S(n-1) + n

     */

    static int suma;

    static void sumar(int n) {
        if (n == 1) {
            suma += 1;
            return;
        }
        suma += n;
        sumar(--n);
    }

    static int sumar2(int n) {
        if (n == 1) {
            return 1;
        }

        return n + sumar2(n-1);
    }

    public static void main(String[] args) {
        System.out.println(sumar2(3));
    }
}
