package empleado;

public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Jose", "", "", 15000);
        Empleado e2 = new Empleado("Maria", "", "", 15000);

        System.out.println(e1.getId());
        System.out.println(e2.getId());

        //System.out.println(empleado.Empleado.secuencia);


        e1.setSalario(1500);
        e1.setDeducciones(1500);
        System.out.println(e1.getSalarioNeto());

        EmpleadoComision ec1 = new EmpleadoComision("Alberto", "", "", 10000);
    }
}