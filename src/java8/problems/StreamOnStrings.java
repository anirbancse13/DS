package java8.problems;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamOnStrings {
    public static void main(String[] args) {
        String s = "hello hello";

       //Find count of vowels
        System.out.println(s.chars().filter(x-> x=='a' || x=='e' || x=='i' || x=='o' || x=='u').count());

        //Find duplicate chars

        Map<String, Long> opMap = s.chars().mapToObj(x->(char) x).collect(
                    Collectors.groupingBy(Object::toString,Collectors.counting()));

        opMap.forEach((k,v) -> System.out.println("Character: " + k + " Count: " + v));
    }
}
