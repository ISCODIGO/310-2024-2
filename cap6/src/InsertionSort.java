public class InsertionSort {
    public static void sort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; ++i) {
            int right = arr[i];
            int left = i - 1;

            while (left >= 0 && arr[left] > right) {
                arr[left + 1] = arr[left];
                left = left - 1;
            }
            arr[left + 1] = right;
        }
    }
}
