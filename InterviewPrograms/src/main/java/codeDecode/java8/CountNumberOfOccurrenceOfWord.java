package codeDecode.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountNumberOfOccurrenceOfWord {
    public static void main(String[] args) {
        String input = "Welcome to code decode and code decode welcomes you";
        String[] stringArray = input.split(" ");

        Map<String, Long> collect = Arrays.stream(stringArray)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);

    }

}
