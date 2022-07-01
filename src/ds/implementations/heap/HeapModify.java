package ds.implementations.heap;

import ds.implementations.heap.CreateHeap;

public class HeapModify {

    public static void main(String[] args) {
        int[] arr = { 10, 5, 3, 2, 4 };
        int size = arr.length;
        size = deleteNode(arr, size);
        CreateHeap.printHeap(arr,size);

        //Insert a node with value 1 in the existing heap

        int key = 10;
        int[] result = insertNode(arr, key, size);
        CreateHeap.printHeap(result,size +1);
    }

    private static int[] insertNode(int[] arr, int key, int size) {
        size = size+1;
        int[] newArr = new int[size];
        newArr = arr.clone();
        newArr[size-1] = key;
        placeNode(newArr, size, size-1);
        return newArr;
    }

    private static void placeNode(int[] newArr, int size, int pos) {
        int parent = (pos - 1)/2;
        if (newArr[parent] > 0){
            if (newArr[pos] > newArr[parent]){
                int temp = newArr[parent];
                newArr[parent] = newArr[pos];
                newArr[pos] = temp;
                placeNode(newArr,size,parent);
            }
        }
    }

    private static int deleteNode(int[] arr, int size) {
        arr[0] = arr[size-1];
        size = size-1;
        CreateHeap.heapify(arr,size,0);
        return size;
    }
}
