package java8;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirstNonRepeatChar {
    public static void main(String[] args) {
        String msg = "good morning";

        Stream.of(msg.split(""))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue()==1)
                .map(m->m.getKey())
                .findFirst()
                .ifPresent(System.out::println);

    }
}
