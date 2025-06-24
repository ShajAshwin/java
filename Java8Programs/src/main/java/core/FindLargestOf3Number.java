package core;

import java.util.Comparator;
import java.util.stream.Stream;

public class FindLargestOf3Number {
    public static void main(String[] args) {



        Stream.of(10,12,5)
                .min(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }
}
