import java.util.Arrays;
import java.util.Random;

public class Main {
    public static int[] randomArr(int size, int maxNumber) {
        Random random = new Random();
        int[] arreglo = new int[size];

        for (int i = 0; i < size; i++) {
            arreglo[i] = random.nextInt(maxNumber);
        }

        return arreglo;
    }

    public static void main(String[] args) {
        int[] data = randomArr(10, 100);

        System.out.println("Datos desordenados: " + Arrays.toString(data));
        SelectionSort.sort(data);
        System.out.println("Datos ordenados: " + Arrays.toString(data));
    }
}