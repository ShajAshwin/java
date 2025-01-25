package core;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindRepeatingChar {
    public static void main(String[] args) {

        String str = "bestsincedayone";

        String[] chars = str.split("");

        List<String> entries = Arrays.stream(chars)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(s->s.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());


        System.out.println(entries);

    }
}
