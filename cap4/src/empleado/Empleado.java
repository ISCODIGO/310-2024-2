package empleado;

public class Empleado {
    // datos / atributos
    public static int secuencia = 0;

    private int id;
    protected String nombre;
    String cargo;
    protected double salario;
    private String departamento;
    private double deducciones;

    // metodos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public double pago() {
        // Este es el salario que se le paga al empleado
        return salario - deducciones;
    }

    public void setSalario(double salario) {
        final double SALARIO_MINIMO_PROPIO = 10_000;
        if (salario < SALARIO_MINIMO_PROPIO) {
            throw new IllegalArgumentException("El salario no puede ser menor a: " + SALARIO_MINIMO_PROPIO);
        }
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(double deducciones) {
        this.deducciones = deducciones;
    }

    // constructor
    public Empleado(String nombre, String cargo, String departamento) {
        this.cargo = cargo;
        this.departamento = departamento;
        this.nombre = nombre;
        this.id = ++secuencia;
    }

    @Override
    public String toString() {
        return "Empleado: " + getId() + " - " + getNombre();
    }
}
