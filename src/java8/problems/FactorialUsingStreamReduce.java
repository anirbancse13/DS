package java8.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FactorialUsingStreamReduce {

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        Optional<Integer> factorial = Arrays.stream(arr).reduce((x, y) -> x*y);

        factorial.ifPresent(System.out::println);
    }
}
