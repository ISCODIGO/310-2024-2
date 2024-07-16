public class Ackerman {
    static int A(int m, int n) {
        if (m == 0) {
            return n + 1;
        }

        if (m > 0 && n == 0 ) {
            return A(m-1, 1);
        }

        return A(m-1, A(m, n-1));
    }
    public static void main(String[] args) {
        System.out.println(A(1, 1));
    }
}
