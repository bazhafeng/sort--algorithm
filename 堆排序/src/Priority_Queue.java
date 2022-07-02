import java.util.Comparator;
import java.util.PriorityQueue;

public class Priority_Queue {
    //小根堆排序
    public static void heapSort(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = pq.poll();
        }
    }
    //大根堆排序
    public static void heapSort2(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = pq.poll();
        }
    }
}
