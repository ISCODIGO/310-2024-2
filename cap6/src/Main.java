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
        int[] data = randomArr(1000, 100);
        //int[] data = {59, 32, 84, 80, 60, 6, 44, 42, 75, 22};

        System.out.println("Datos desordenados: " + Arrays.toString(data));
        BubbleSort.sort2(data);
        System.out.println("Datos ordenados: " + Arrays.toString(data));
        System.out.println(BubbleSort.instrucciones);
    }
}