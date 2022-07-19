package java8.problems;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class ReuseStream {
    public static void main(String[] args) {
        String[] inputArray = {"anirban", "ball", "chandrika", "doll", "elephant", "anirban"};

        // this supplier can be used to get stream as many times as we want
        Supplier<Stream<String>> streamInput = ()-> Stream.of(inputArray);

        streamInput.get().forEach(System.out::println);
        long c = streamInput.get().filter(x -> "anirban".equals(x)).count();
        System.out.println(c);
    }
}
