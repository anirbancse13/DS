package dsasheet.slidingwindow;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (k == 1){
            return nums;
        }

        // For storing the maxium values from all sub arrays of window k
        int[] result = new int[nums.length-k+1];
        int resultIndex = 0;

        // Using DQ to find the index of the max value from the subarray of window k
        Deque<Integer> q = new LinkedList<>();

        int i;

        //This loop is only for the first subarray of size k
        for(i=0;i<k;++i){

            // Before inserting an element, ensure that any smaller element than nums[i] needs to be removed from the dequeue, since they are useless.
            while(!q.isEmpty() && nums[i]>nums[q.peekLast()]){
                //Removing from rear
                q.removeLast();
            }

            q.addLast(i);
        }

        //This loop is for the rest of the subarrays of size k exccept the first one.
        for (;i<nums.length;++i){
            // Store the element of the index at the head of the queue as it will be largest element of the previous sub array
            result[resultIndex] = nums[q.peekFirst()];
            resultIndex++;

            // Remove all indexes from the queue that are smaller than the least index of the current window
            while(!q.isEmpty() && q.peekFirst() <= i-k){
                q.removeFirst();
            }

            //Remove all indexes from the queue whose array value is less than a[i]
            while(!q.isEmpty() && nums[q.peekLast()] <= nums[i]){
                q.removeLast();
            }

            //Add current index to the rear
            q.addLast(i);
        }

        //Store the max value of the last subarray
        result[resultIndex] = nums[q.peekFirst()];

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {7,2,4};
        int k = 2;
        int[] result = maxSlidingWindow(arr,k);

        for (int j : result) {
            System.out.println(j);
        }
    }
}
