import java.sql.SQLOutput;

public class Fibonacci {
    static long rec1 = 0;
    static long rec2 = 0;

    static long fibo(int n) {
        if (n < 2) {
            rec1++;
            return n;
        }

        rec1++;
        return fibo(n-1) + fibo(n-2);
    }

    static long fibo2(int n, long[] cache) {
        if (cache == null) {
            cache = new long[n + 1];
            cache[0] = 0;
            cache[1] = 1;
        }

        if (n < 2) {
            rec2++;
            return n;
        }

        if (cache[n] > 0) {
            rec2++;
            return cache[n];
        }

        rec2++;
        cache[n] = fibo2(n-1, cache) + fibo2(n-2, cache);
        return cache[n];
    }

    public static void main(String[] args) {
        int valor = 30;
        System.out.println("Fibonacci normal...");
        long inicio = System.currentTimeMillis();
        System.out.println(fibo(valor));
        long fin = System.currentTimeMillis();
        System.out.printf("Tiempo: %d ms%n", fin-inicio);
        System.out.println("Recursiones: " + rec1);

        System.out.println("Fibonacci rapido...");
        long inicio2 = System.currentTimeMillis();
        System.out.println(fibo2(valor, null));
        long fin2 = System.currentTimeMillis();
        System.out.printf("Tiempo: %d ms%n", fin2-inicio2);
        System.out.println("Recursiones: " + rec2);

    }
}
