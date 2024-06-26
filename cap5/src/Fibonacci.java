public class Fibonacci {
    static long fibo(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibo(n-1) + fibo(n-2);
    }

    static long fibo2(int n, long[] cache) {
        if (cache == null) {
            cache = new long[n + 1];
            cache[0] = 0;
            cache[1] = 1;
        }

        if (n < 2) {
            return n;
        }

        if (cache[n] > 0) {
            return cache[n];
        }

        cache[n] = fibo2(n-1, cache) + fibo2(n-2, cache);
        return cache[n];
    }

    public static void main(String[] args) {
        int valor = 38;
        long inicio = System.currentTimeMillis();
        System.out.println(fibo(valor));
        long fin = System.currentTimeMillis();
        System.out.printf("Tiempo: %d ms%n", fin-inicio);

        long inicio2 = System.currentTimeMillis();
        System.out.println(fibo2(valor, null));
        long fin2 = System.currentTimeMillis();
        System.out.printf("Tiempo: %d ms%n", fin2-inicio2);


    }
}
