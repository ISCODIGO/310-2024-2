import org.jetbrains.annotations.NotNull;

public class Fraccion implements FraccionTDA, Comparable<Fraccion> {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }

    @Override
    public void setNumerador(int numerador) {
        this.numerador = numerador;
        simplificar();
    }

    @Override
    public void setDenominador(int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }
        this.denominador = denominador;
        simplificar();
    }

    @Override
    public int getNumerador() {
        return numerador;
    }

    @Override
    public int getDenominador() {
        return denominador;
    }

    @Override
    public FraccionTDA sumar(FraccionTDA otra) {
        int nuevoNumerador = this.numerador * otra.getDenominador() + otra.getNumerador() * this.denominador;
        int nuevoDenominador = this.denominador * otra.getDenominador();
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    @Override
    public FraccionTDA restar(FraccionTDA otra) {
        int nuevoNumerador = this.numerador * otra.getDenominador() - otra.getNumerador() * this.denominador;
        int nuevoDenominador = this.denominador * otra.getDenominador();
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    @Override
    public FraccionTDA multiplicar(FraccionTDA otra) {
        int nuevoNumerador = this.numerador * otra.getNumerador();
        int nuevoDenominador = this.denominador * otra.getDenominador();
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    @Override
    public FraccionTDA dividir(FraccionTDA otra) {
        if (otra.getNumerador() == 0) {
            throw new IllegalArgumentException("No se puede dividir por una fracción con numerador cero.");
        }
        int nuevoNumerador = this.numerador * otra.getDenominador();
        int nuevoDenominador = this.denominador * otra.getNumerador();
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    @Override
    public void simplificar() {
        int valor = gcd(numerador, denominador);
        numerador /= valor;
        denominador /= valor;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    @Override
    public int compareTo(@NotNull Fraccion o) {
        double res1 = (double) this.numerador / this.denominador;
        double res2 = (double) o.numerador / o.denominador;

        return Double.compare(res1, res2);
    }
}
