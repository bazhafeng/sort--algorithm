public class HeapSort {
    //堆排序
    public static void heapSort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int i, int i1) {
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int largest = i;
        if (l < i1 && arr[l] > arr[largest]) {
            largest = l;
        }
        if (r < i1 && arr[r] > arr[largest]) {
            largest = r;
        }
        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, largest, i1);
        }
    }
    //swap
    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}
