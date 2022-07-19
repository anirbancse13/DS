package misc;

import java.util.Stack;

public class MaxElementToRight {
    public static void main(String[] args) {
        int[] arr = {8,9,5,11,6,1,7,6};
        int length = arr.length;
        int maxToRight = arr[length-1];
        arr[length-1] = -1;

        for(int i= length-2;i>=0;i--){
            int temp = arr[i];
            if(maxToRight>temp){
                arr[i] = maxToRight;
            }else{
                arr[i] = -1;
                maxToRight= temp;
            }
        }

        for(int i : arr){
            System.out.println(i);
        }
    }
}
