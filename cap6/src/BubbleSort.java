import java.util.Arrays;

public class BubbleSort {
    public static int instrucciones = 0;
    public static void sort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                instrucciones++;
                if (arr[i] > arr[j]) {
                    Swap.make(arr, i, j);
                }
                //System.out.println("i: " + i + " j: " + j);
                //System.out.println(Arrays.toString(arr));
            }
        }
    }

    public static void sort2(int[] arr) {
        boolean swapped = false;
        do {
            swapped = false;
            for(int i = 1; i < arr.length; i++) {
                int left = i - 1;
                int right = i;

                instrucciones++;

                if (arr[left] > arr[right]) {
                    Swap.make(arr, left, right);
                    swapped = true;
                }

                //System.out.println("i=" + i + Arrays.toString(arr));
            }
        } while (swapped);
    }
}
