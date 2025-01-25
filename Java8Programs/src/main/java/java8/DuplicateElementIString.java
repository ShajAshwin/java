package java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElementIString {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2,3,4,5,7,8,5,3,134,6,7,7,8);
        Set<Integer> set = new HashSet<>();

//        integerList.stream()
//                .filter(x->!set.add(x))
//                .collect(Collectors.toSet())
//                .forEach(System.out::println);

//        integerList.stream()
//                .distinct()
//                .forEach(System.out::println);

        //Find First
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList.stream()
                .findFirst()
                .ifPresent(System.out::println);
    }

}
