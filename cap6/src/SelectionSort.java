public class SelectionSort {
    public static void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[menor]) {
                    menor = j;
                }
            }
            Swap.make(arr, i, menor);
        }
    }
}
