package practice;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32,4,8,15);
        List<Integer> list2 = Arrays.asList(1,3,5,7,8,9,2,3,8);
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        List<String> fruits = Arrays.asList("Apple", "Mango", "Grapes", "Banana","pineapple");
        int arr[] = { 99, 55, 203, 99, 4, 91 };
        String string = "GloomySunday";

        Set<Integer> set = new HashSet<>();

        fruits.stream()
                .min(Comparator.comparing(String::length))
                .ifPresent(System.out::println);
    }

}
