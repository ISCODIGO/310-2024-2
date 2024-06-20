import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Fraccion f1 = new Fraccion(2, 3);
        Fraccion f2 = new Fraccion(1, 2);

        FraccionTDA suma = f1.sumar(f2);
        System.out.printf("%s + %s = %s%n", f1, f2, suma);

        FraccionTDA simpl = new Fraccion(22, 4);
        System.out.println("22/4 simplificado es: " + simpl);

        FraccionTDA[] fracciones = {
                new Fraccion(5, 6),
                new Fraccion(2, 3),
                new Fraccion(6, 7),
                new Fraccion(3, 4)
        };

        Arrays.sort(fracciones);

        System.out.println(Arrays.toString(fracciones));
    }
}
