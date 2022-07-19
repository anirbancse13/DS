package java8.problems;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountValuesInStream {
    public static void main(String[] args) {
        Arrays.asList("Ani", "Mams", "Ani", "Jats", "Mams").stream().
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((k,v)-> System.out.println(k + ", " +v));
    }
}
