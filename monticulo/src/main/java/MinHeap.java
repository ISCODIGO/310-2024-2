import java.util.Arrays;
import java.util.NoSuchElementException;

public class MinHeap<T extends Comparable<T>> {
    private T[] heap;
    private int size;

    @SuppressWarnings("unchecked")
    public MinHeap(int capacity) {
        heap = (T[]) new Comparable[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insert(T value) {
        if (size >= heap.length) {
            throw new IllegalStateException("Heap is full");
        }
        heap[size] = value;
        siftUp(size);
        size++;
    }

    public T extractMin() {
        if (size == 0) {
            throw new NoSuchElementException("Heap is empty");
        }
        T minValue = heap[0];
        heap[0] = heap[size - 1];
        size--;
        siftDown(0);
        return minValue;
    }

    public T getMin() {
        if (size == 0) {
            throw new NoSuchElementException("Heap is empty");
        }
        return heap[0];
    }

    private void siftUp(int index) {
        int parentIndex = parent(index);
        while (index > 0 && heap[index].compareTo(heap[parentIndex]) < 0) {
            swap(index, parentIndex);
            index = parentIndex;
            parentIndex = parent(index);
        }
    }

    private void siftDown(int index) {
        int leftChildIndex = left(index);
        while (leftChildIndex < size) {
            int rightChildIndex = right(index);
            int smallestChildIndex = leftChildIndex;

            if (rightChildIndex < size &&
                    heap[rightChildIndex].compareTo(heap[leftChildIndex]) < 0) {
                smallestChildIndex = rightChildIndex;
            }

            if (heap[index].compareTo(heap[smallestChildIndex]) <= 0) {
                break;
            }

            swap(index, smallestChildIndex);
            index = smallestChildIndex;
            leftChildIndex = left(index);
        }
    }

    private void swap(int i, int j) {
        T temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Función para obtener el índice del hijo izquierdo
    private int left(int index) {
        return 2 * index + 1;
    }

    // Función para obtener el índice del hijo derecho
    private int right(int index) {
        return 2 * index + 2;
    }

    // Función para obtener el índice del padre
    private int parent(int index) {
        return (index - 1) / 2;
    }

    @Override
    public String toString() {
        return Arrays.toString(heap);
    }

    public static void main(String[] args) {
        MinHeap<Integer> minHeap = new MinHeap<>(10);
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(8);
        minHeap.insert(1);

        System.out.println(minHeap);

        System.out.println("Min value: " + minHeap.getMin()); // 1
        System.out.println("Extract Min: " + minHeap.extractMin()); // 1
        System.out.println("Min value: " + minHeap.getMin()); // 3
    }
}
