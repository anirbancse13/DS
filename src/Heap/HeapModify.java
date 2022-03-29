package Heap;

public class HeapModify {

    public static void main(String[] args) {
        int[] arr = { 10, 5, 3, 2, 4 };
        int size = arr.length;
        size = deleteNode(arr, size);
        CreateHeap.printHeap(arr,size);
    }

    private static int deleteNode(int[] arr, int size) {
        arr[0] = arr[size-1];
        size = size-1;
        CreateHeap.heapify(arr,size,0);
        return size;
    }
}
