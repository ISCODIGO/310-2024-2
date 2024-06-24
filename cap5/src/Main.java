public class Main {
    static void a() {
        b();
        System.out.println("Ejecutando A...");
    }

    static void b() {
        c();
        System.out.println("Ejecutando B...");
    }

    static void c() {
        System.out.println("Ejecutando C...");
    }


    public static void main(String[] args) {
        a();
    }
}