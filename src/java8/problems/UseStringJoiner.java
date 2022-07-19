package java8.problems;

import java.util.StringJoiner;

public class UseStringJoiner {
    public static void main(String[] args) {
        String input = "Hello World";
        String[] arr = input.split(" ");
        StringJoiner sj = new StringJoiner("-","[","]");
        for (String in : arr){
            sj.add(in);
        }
        System.out.println(sj);
    }
}
