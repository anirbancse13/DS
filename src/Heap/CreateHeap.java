package Heap;

public class CreateHeap {

    public static void main(String[] args) {
        // Binary Tree Representation
        // of input array
        //            1
        //         /    \
        //       3       5
        //     /   \    /  \
        //  4       6  13  10
        // / \    /  \
        // 9  8  15   17

        // Binary Tree Representation
        // of output array
        //           17
        //         /    \
        //      15      13
        //     /  \    /  \
        //    9    6  5   10
        //   / \  / \
        // 4  8  3   1
        int[] arr = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};
        int arraySize = arr.length;

        printHeap(arr, arraySize);
        createHeap(arr, arraySize);
        printHeap(arr, arraySize);

    }

    public static void printHeap(int[] arr, int arraySize) {
        for (int i = 0; i<arraySize; ++i){
            System.out.print(arr[i] + " ");

            System.out.println();
        }
    }

    private static void createHeap(int[] arr, int arraySize) {
        // Index of the last non-leaf node (n/2) -1 
        int start = (arraySize / 2) -1 ;

        //Call heapify from the last leaf node in the reverse order
        for (int pos = start; pos >= 0; pos--) {
            heapify(arr, arraySize, pos);
        }

    }

    public static void heapify(int[] arr, int arraySize, int root) {
        int largest = root;
        int left = 2 * root + 1; // formula to find the left child of a node
        int right = 2 * root + 2; // formula to find the right child of a node

        // If left is larger than the root, marking the left node as largest
        if (left < arraySize && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right is larger than whatever is the largest marking the right node as largest
        if (right < arraySize && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not the root
        if (largest != root) {
            int temp = arr[root];
            arr[root] = arr[largest];
            arr[largest] = temp;

            //Recursively call the affected subtree
            heapify(arr, arraySize, largest);
        }
    }

}
