package java8.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestNumber {

    public static void main(String[] args) {
        int[] arr = {45,3,67,5,39,21,2,47,990};
        int secondHighestElement = Arrays.stream(arr)
                .distinct() //remove all duplicates
                .sorted() // second highest element in the second last position
                .skip(arr.length - 2) // skip the second last element
                .findFirst().getAsInt();
        System.out.println(secondHighestElement);

    }
}
