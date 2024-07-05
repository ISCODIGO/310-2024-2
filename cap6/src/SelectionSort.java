public class SelectionSort {
    public static void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int candidato = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[candidato]) {
                    candidato = j;
                }
            }
            Swap.make(arr, i, candidato);
        }
    }
}
