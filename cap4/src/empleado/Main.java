package empleado;

public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Jose", "", "");
        e1.setSalario(12000);
        Empleado e2 = new Empleado("Maria", "", "");
        e2.setSalario(13000);

        EmpleadoComision ec1 = new EmpleadoComision("Alberto", "", "", 10);
        ec1.setSalario(8000);
        ec1.setVentaProcesada(100_000);
        System.out.println("Pagar a comisionista:" + ec1.pago());

        Empleado[] colaboradores = new Empleado[5];
        colaboradores[0] = e1;
        colaboradores[1] = e2;
        colaboradores[2] = ec1;

        for(Empleado elemento : colaboradores) {
            if (elemento == null)
                continue;
            System.out.println("El empleado " + elemento.getNombre() + " se le pagara: " + elemento.pago());
        }

    }
}