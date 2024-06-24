package empleado;

public class EmpleadoComision extends Empleado {
    private double porcentajePorVenta;
    private double ventaProcesada;

    public double getVentaProcesada() {
        return ventaProcesada;
    }

    public void setVentaProcesada(double ventaProcesada) {
        this.ventaProcesada = ventaProcesada;
    }

    public double getPorcentajePorVenta() {
        return porcentajePorVenta;
    }

    public void setPorcentajePorVenta(double porcentajePorVenta) {
        this.porcentajePorVenta = porcentajePorVenta;
    }

    public EmpleadoComision(String nombre, String cargo, String departamento, double ratio) {
        super(nombre, cargo, departamento);
        porcentajePorVenta = ratio / 100;
    }

    @Override
    public void setSalario(double salario) {
        final double SALARIO_BASE_MINIMO = 7500;
        final double SALARIO_BASE_MAXIMO = 12500;

        if (salario < SALARIO_BASE_MINIMO || salario > SALARIO_BASE_MAXIMO) {
            throw new IllegalArgumentException(String.format("El salario base debe estar entre %.2f y %.2f",
                    SALARIO_BASE_MINIMO, SALARIO_BASE_MAXIMO));
        }
        this.salario = salario;
    }

    @Override
    public double pago() {
        return super.pago() + (porcentajePorVenta * ventaProcesada);
    }
}
