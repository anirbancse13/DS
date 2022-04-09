package dsasheet.slidingwindow;

public class MaxConsequtive1s {
    public static int longestOnes(int[] nums, int k) {
        int i =0; //Pointer pointing the front of the window
        int j =0; //Pointer pointing to the rear of the window

        //Front pointer goes till the end of the array
        while(i<nums.length){
            if(nums[i] == 0){
                k--; // decrementing k if the front pointer encounters an 0.
            }
            if ( k < 0){
                // If the k value is in negetive it means we have replenished the number of 0's that can be flipped to 1 in a given window, hence that sub-array in that window is not valid anymore. We increment the rear pointer to create a new window. Before incrementing the rear pointer we check if the rear pointer is pointing a 0. Since that 0 will not be used to filp anmore we increment the k.
                if (nums[j] == 0){
                    k++;
                }
                j++;
            }

            i++;
        }
        //The distance between i and j will be length of the sub-array which will have max 1's. k will definately have a positive value.
        return i-j;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(longestOnes(nums,k));
    }
}
