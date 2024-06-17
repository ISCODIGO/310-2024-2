public interface FraccionTDA {
    // Establecer el valor de la fracción
    void setNumerador(int numerador);
    void setDenominador(int denominador);

    // Obtener el valor de la fracción
    int getNumerador();
    int getDenominador();

    // Operaciones básicas
    FraccionTDA sumar(FraccionTDA otra);
    FraccionTDA restar(FraccionTDA otra);
    FraccionTDA multiplicar(FraccionTDA otra);
    FraccionTDA dividir(FraccionTDA otra);

    // Simplificar la fracción
    void simplificar();
}
