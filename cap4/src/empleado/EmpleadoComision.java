package empleado;

public class EmpleadoComision extends Empleado {
    public double getRatioPorVenta() {
        return ratioPorVenta;
    }

    public void setRatioPorVenta(double ratioPorVenta) {
        this.ratioPorVenta = ratioPorVenta;
    }

    private double ratioPorVenta;

    public EmpleadoComision(String nombre, String cargo, String departamento, double salario, double ratio) {
        super(nombre, cargo, departamento, salario);
    }

    @Override
    public void setSalario(double salario) {
        final double SALARIO_BASE_MINIMO = 7500;
        final double SALARIO_BASE_MAXIMO = 12500;

        if (salario < SALARIO_BASE_MINIMO || salario > SALARIO_BASE_MAXIMO) {
            System.out.printf("El salario base debe estar entre %.2f y %.2f",
                    SALARIO_BASE_MINIMO, SALARIO_BASE_MAXIMO);
            return;
        }
        super.setSalario(salario);
    }

    @Override
    public double getSalarioNeto() {
        return super.getSalarioNeto();
    }
}
